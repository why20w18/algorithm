// fibonacciyi istenen terime kadar yazdiran
#include <stdio.h>

// 0 1 1 2 3 5 8
void fibo(int n) {
  int n1 = 0, n2 = 1, next = 0;

  for (int i = 0; i < n; i++) {
    next = n1 + n2;
    n1 = n2;
    n2 = next;
    printf("%d ", next);
  }
  printf("\n");
}

int main() {
  int n = 10;
  fibo(n);

  return 0x0;
}
