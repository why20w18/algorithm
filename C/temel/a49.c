// verilen stringin basindaki ve sonundaki bosluklari silme
#include <stdio.h>
#include <stdlib.h>

int slen(char *arr) {
  int i = 0;
  while (arr[i++] != '\0') {
  }
  return i - 1;
}

void delSpace(char *arr) {
  int len = slen(arr);

  // bastaki bosluklar
  for (int i = 0; i < len; i++) {
    if (arr[i] == ' ')
      arr[i] = '\b';
    else
      break;
  }

  // sondaki bosluklar
  for (int i = len - 1; i >= 0; i--) {
    if (arr[i] == ' ') {
      arr[i] = '\b';
    } else
      break;
  }
}

int main() {
  char arr[] = "    Hello World  ";
  printf("%s\n", arr);
  printf("arr_len before : %d\n", slen(arr)); // 17

  delSpace(arr);
  printf("%s\n", arr);
  printf("arr_len after : %d\n", slen(arr)); // 17
  return 0x0;
}
