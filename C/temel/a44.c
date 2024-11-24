// string icinde kelime ara ve indexleri geri cevir
#include <stdio.h>
#include <stdlib.h>

int slen(char *str) {
  int i = 0;
  while (str[i++] != '\0') {
  }
  return i - 1;
}

int *findWordIndex(char *str, char *searched) {
  int *findArr = (int *)malloc(sizeof(int) * 2);
  int currentLen = 0;
  int searchedLen = slen(searched);
  char *startAddr = NULL;
  char *tempStr = str;

  while (*str != '\0') {
    // karakterse
    if (*str != ' ') {
      if (currentLen == 0) {
        startAddr = str;
      }
      currentLen++;
    }
    // bosluksa
    else {
      if (currentLen == searchedLen) {
        // baslangic adresini sakladik
        char *tempWordStart = startAddr;
        int boolEqual = 1;

        for (int i = 0; i < currentLen; i++) {
          if (*tempWordStart != searched[i]) {
            boolEqual = 0;
            break;
          }
          tempWordStart++;
        }

        if (boolEqual) {
          findArr[0] = startAddr - tempStr;
          findArr[1] = (startAddr - tempStr) + currentLen - 1;
          return findArr;
        }
      }
      currentLen = 0;
    }

    str++;
  }

  return NULL;
}

int main() {
  char str[] = "Lorem Ipsum is simply dummy text of the printing and "
               "typesetting industry";
  char searched[(sizeof(str) / sizeof(char))];

  printf("%s\n", str);
  printf("searched >>>");

  scanf("%s", searched);
  int *findArr = findWordIndex(str, searched);

  if (findArr != NULL)
    printf("%d.INDEX ILE %d.INDEX ARASINDA\n", findArr[0], findArr[1]);
  else
    printf("NULL PTR\n");

  free(findArr);
  return 0x0;
}
