// decimal sayiyi binary octal hexa cevirme
#include <stdio.h>
#include <stdlib.h>

int powxy(int x, int y) {
  int r = 1, i = 0;
  while (i < y) {
    r *= x;
    i++;
  }

  return r;
}

int toBinaryOctal(int base10, int targetBase) {
  int i = 0;
  int bit = 8;
  int newBase[bit];

  while (i < bit) {
    // ters yerlestirme
    newBase[bit - 1 - i] = base10 % targetBase;
    base10 /= targetBase;
    i++;
  }

  int num = 0;
  i = 0;
  while (i < bit) {
    num += newBase[i] * powxy(10, bit - 1 - i);
    i++;
  }

  return num;
}

// basamak sayisi bulma
int baseDigitCount(int num, int targetBase) {
  int i = 0;
  while (num > 0) {
    num /= targetBase;
    i++;
  }
  return i;
}

char *toHexa(int base10) {
  int hexaCount = baseDigitCount(base10, 16);
  char *hexa = (char *)malloc(sizeof(char) * (hexaCount + 1));

  int i = 0;
  unsigned char digit;

  while (i < hexaCount) {
    digit = base10 % 16;

    if (digit >= 10)
      digit = 'A' + (digit % 10);
    else
      digit = '0' + digit;

    hexa[hexaCount - 1 - i] = (char)digit;
    base10 /= 16;
    i++;
  }
  hexa[hexaCount] = '\0';

  return hexa;
}

int main() {
  int base10 = 0;
  printf("base10 >>>");
  scanf("%d", &base10);

  int binary = toBinaryOctal(base10, 2);
  int octal = toBinaryOctal(base10, 8);

  printf("binary    : %d\n", binary);
  printf("octal     : %d\n", octal);

  char *hexa = toHexa(base10);
  printf("hexa      : %s\n", hexa);

  free(hexa);
  return 0x0;
}
