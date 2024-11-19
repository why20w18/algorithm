// faktoriyel hesaplama
#include <stdio.h>

void factorial(int n) {
  if (n < 0) {
    printf("hatali sayi!\n");
    return;
  }
  int r = 1;
  for (int i = 1; i <= n; i++) {
    r *= i;
  }

  printf("result : %d\n", r);
}

int main() {
  int n = 0;
  printf(">>");
  scanf("%d", &n);
  factorial(n);

  return 0x0;
}
