#include <stdio.h>
#include <stdlib.h>

int s_len(char *msg) {
  int i = 0;
  while (msg[i++] != '\0') {
  }

  return i - 1;
}

char *longestWord(char *str) {
  if (s_len(str) <= 0 || str == NULL)
    return NULL;

  int currentLen = 0, maxLen = 0;
  char *startAddr = NULL;
  char *resultStr = NULL;

  while (*str) {
    if (*str != ' ') {
      if (currentLen == 0)
        startAddr = str;
      currentLen++;
    }

    else {
      if (currentLen > maxLen && currentLen > 0) {
        maxLen = currentLen;
        free(resultStr);
        resultStr = (char *)malloc(sizeof(char) * (currentLen + 1));
        for (int i = 0; i < currentLen; i++)
          resultStr[i] = startAddr[i];
        resultStr[currentLen] = '\0';
      }

      currentLen = 0;
    }
    str++;
  }

  if (currentLen > maxLen && currentLen > 0) {
    free(resultStr);
    resultStr = (char *)malloc(sizeof(char) * (currentLen + 1));
    for (int i = 0; i < currentLen; i++)
      resultStr[i] = startAddr[i];
    resultStr[currentLen] = '\0';
  }

  return resultStr;
}

char *shortestWord(char *str) {
  if (str == NULL || s_len(str) <= 0)
    return NULL;

  int minLen = 999999; // minLen sifirsa kimse sifirdan kucuk olamaz
  int currentLen = 0;
  char *resultStr = NULL;
  char *startAddr = NULL;

  while (*str) {
    if (*str != ' ') {
      if (currentLen == 0)
        startAddr = str;
      currentLen++;

    }

    else {
      if (currentLen > 0 && currentLen < minLen) {
        minLen = currentLen;
        free(resultStr);

        resultStr = (char *)malloc(sizeof(char) * (currentLen + 1));
        for (int i = 0; i < currentLen; i++)
          resultStr[i] = startAddr[i];
        resultStr[currentLen] = '\0';
      }
      currentLen = 0;
    }
    str++;
  }

  if (currentLen > 0 && currentLen < minLen) {
    free(resultStr);
    resultStr = (char *)malloc(sizeof(char) * (currentLen + 1));
    for (int i = 0; i < currentLen; i++)
      resultStr[i] = startAddr[i];
    resultStr[currentLen] = '\0';
  }
  return resultStr;
}

int main() {
  char arr[] = "merhaba Dunya HelloWorlds!";

  char *longest = longestWord(arr);
  if (longest != NULL)
    printf("%s\n", longest);

  char *shortest = shortestWord(arr);
  if (shortest != NULL)
    printf("%s\n", shortest);

  free(longest);
  free(shortest);
  return 0x0;
}
