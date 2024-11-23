// string icindeki her kelimenin uzunlugunu array olarak cevirme
#include <stdio.h>
#include <stdlib.h>

int s_len(char *str) {
  if (str == NULL)
    return -1;
  int len = 0;
  for (int i = 0; str[i] != '\0'; i++)
    len++;
  return len;
}

// word counter
int s_wc(char *str) {
  if (str == NULL)
    return -1;
  int len = s_len(str);
  int wc = 1;

  for (int i = 0; i < len; i++) {
    if (str[i] == ' ')
      wc++;
  }

  return wc;
}

int *s_slen(char *str) {
  if (str == NULL)
    return NULL;

  int len = s_len(str);
  int wc = s_wc(str);
  int j = 0;

  int *arr = (int *)malloc(sizeof(int) * wc);
  int len_str = 0;

  for (int i = 0; i < len; i++) {
    if (str[i] != ' ') {
      len_str++;
    } else {
      arr[j] = len_str;
      len_str = 0;
      j++;
    }
  }
  arr[j] = len_str;

  return arr;
}

int main() { // 7 5 5 6
  char arr[100] = "Merhaba Dunya Hello World!";
  int *sslen = s_slen(arr);

  printf("%s\n", arr);

  for (int i = 0; i < s_wc(arr); i++)
    printf("%d ", sslen[i]);

  printf("\n");

  return 0x0;
}
