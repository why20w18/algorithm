// palindrom kontrolu
#include <stdio.h>
#define true 1
#define false 0

int isPali(int n) {
  int tempN = n;
  int digit = 0;
  int revn = 0;

  while (n > 0) {
    digit = n % 10;
    revn = revn * 10 + digit;
    n /= 10;
  }

  if (revn == tempN)
    return true;
  else
    return false;
}

int main() {
  int n = 0;
  printf(">>>");
  scanf("%d", &n);

  if (isPali(n)) {
    printf("is palindrom !\n");
  } else
    printf("not palindrom !\n");

  return 0x0;
}
