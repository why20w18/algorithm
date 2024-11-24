// string basindaki ve sonundaki bosluklari kaldirma ptr
#include <stdio.h>

int slen(char *str) {
  int i = 0;
  while (str[i++] != '\0') {
  }
  return i - 1;
}

char *delSpace(char *str) {
  int len = slen(str);

  // pointerla son karakteri bulacagiz
  char *end = str + (len - 1);
  while (*end == ' ')
    end--;

  *(end + 1) = '\0';

  while (*str == ' ')
    str++;

  return str;
}

int main() {
  char str[] = "     Hello World  ";
  printf("|%s|\n%d\n", str, slen(str));

  char *isDeleted = delSpace(str);
  printf("|%s|\n%d\n", isDeleted, slen(isDeleted));

  return 0x0;
}
