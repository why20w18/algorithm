// 2 kelime anagram mi frekans kiyaslamasi ile cozme
#include <stdio.h>
#include <stdlib.h>

#define true 1
#define false 0

int slen(char *str) {
  int len = 0;
  for (int i = 0; str[i] != '\0'; i++)
    len++;
  return len;
}

int isAnagramStr(char *str1, char *str2) {
  if (str1 == NULL || str2 == NULL)
    return false;

  int len1 = slen(str1);
  int len2 = slen(str2);

  if (len1 != len2)
    return false;

  int freqArr_1[256] = {0};
  int freqArr_2[256] = {0};

  for (int i = 0; i < len1; i++) {
    freqArr_1[(unsigned char)str1[i]]++;
  }

  for (int i = 0; i < len2; i++) {
    freqArr_2[(unsigned char)str2[i]]++;
  }

  for (int i = 0; i < 256; i++) {
    if (freqArr_1[i] != freqArr_2[i])
      return false;
  }

  return true;
}

int main() {
  char str1[20], str2[20];
  puts("str1 >>>");
  fgets(str1, sizeof(str1), stdin);

  puts("str2 >>>");
  fgets(str2, sizeof(str2), stdin);

  int isAnagram = isAnagramStr(str1, str2);

  char *result = (isAnagram == true) ? "true" : "false";

  printf("is anagram : %s\n", result);

  return 0x0;
}
