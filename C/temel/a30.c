// stringi belirli indexlerde kesme islemi
#include <stdio.h>
#include <stdlib.h>

int s_len(char *str) {
  int i = 0;
  while (str[i++] != '\0') {
  }

  return i - 1;
}

char *s_slice(char *str, int start, int stop) {
  if (str == NULL)
    return NULL;

  int len = s_len(str);
  if (start > stop || start < -1 || stop >= len)
    return NULL;

  int newLength = (stop - start + 1);
  char *newStr = (char *)malloc(sizeof(char) * (newLength + 1)); // null
                                                                 // karakter
  int j = 0;
  for (int i = start; i <= stop; i++) {
    newStr[j++] = str[i];
  }
  newStr[j] = '\0';

  return newStr;
}

int main() {
  char arr[] = "Hello World!";
  char *sliced_arr = s_slice(arr, 6, 10);
  printf("%s\n", sliced_arr);

  free(sliced_arr);
  return 0x0;
}
