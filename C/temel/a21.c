// girilenin tam bolenleri
#include <stdio.h>

void tam(int n) {
  for (int i = 1; i < n; i++)
    if (n % i == 0)
      printf("%d ", i);

  printf("girilen : %d\n", n);
}

int main() {
  int n = 24;
  tam(n);

  return 0x0;
}
