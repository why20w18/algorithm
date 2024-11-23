// sadece sayilardan olusan stringi sayiya cevirme
#include <stdio.h>
#include <stdlib.h>

int s_len(char *str) {
  int i = 0;
  while (str[i++] != '\0') {
  }
  return i - 1;
}

int powxy(int x, int y) {
  int r = 1;
  int i = 0;
  while (i < y) {
    r *= x;
    i++;
  }
  return r;
}

int toInt(char *str) {
  int digitNum = s_len(str);
  int num[digitNum];

  int i = -1;
  while (i++ < digitNum)
    num[i] = str[i] - '0';

  i = 0;
  int intNum = 0;
  while (i < digitNum) {
    intNum += num[i] * powxy(10, digitNum - 1 - i);
    i++;
  }
  return intNum;
}

int main() {
  char n1[] = "12";
  char n2[] = "36";
  int total = toInt(n1) + toInt(n2);
  printf("total : %d\n", total);

  return 0x0;
}
