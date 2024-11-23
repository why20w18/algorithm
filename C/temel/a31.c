// 2 stringi dinamik olarak concat etme
#include <stdio.h>
#include <stdlib.h>

int s_len(char *str) {
  int i = 0;
  while (str[i++] != '\0') {
  }

  return i - 1;
}

char *s_concat(char *str1, char *str2) {
  int len1 = s_len(str1);
  int len2 = s_len(str2);

  char *newStr = (char *)malloc(sizeof(char) * (len1 + len2 + 1));

  for (int i = 0; i < len1; i++) {
    newStr[i] = str1[i];
  }

  for (int j = 0; j < len2; j++)
    newStr[len1 + j] = str2[j];

  newStr[len1 + len2] = '\0';
  return newStr;
}

int main() {
  char arr1[] = "helllo";
  char arr2[] = "world!";

  char *arr1_2 = s_concat(arr1, arr2);
  printf("%s\n", arr1_2);

  printf("%d\n", s_len(arr1_2));

  free(arr1_2);
  return 0x0;
}
