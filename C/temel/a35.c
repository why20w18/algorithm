#include <stdio.h>
#include <stdlib.h>

int slen(char *str) {
  int i = 0;
  while (str[i++] != '\0') {
  }
  return i - 1;
}

char mostFrequencyString(char *str) {
  int len = slen(str);

  int tempArr[256] = {0}; // ascii

  for (int i = 0; i < len; i++) {
    tempArr[(unsigned char)str[i]]++;
  }

  char maxChar;
  int maxFreq = tempArr[0];

  for (int i = 0; i < 256; i++) {
    if (tempArr[i] != 0 && i != '!' - 1)
      printf("%c karakteri %d kere tekrar etti !\n", (char)i, tempArr[i]);

    if (tempArr[i] > maxFreq) {
      maxFreq = tempArr[i];
      maxChar = i;
    }
  }

  return maxChar;
}

int main() {
  char arr[] = "alican ve ahmet";
  printf("%s\n", arr);

  char maxChar = mostFrequencyString(arr);
  printf("\nen fazla tekrar eden karakter %c\n", maxChar);

  return 0x0;
}
