// girdinin asal carpanlari
#include <stdio.h>

#define true 1
#define false 0

int isPrime(int n) {
  if (n <= 1)
    return false;
  if (n == 2)
    return true;
  if (n % 2 == 0)
    return false;

  for (int i = 3; i * i <= n; i++)
    if (n % i == 0)
      return false;

  return true;
}

void prime(int n) {
  for (int i = 2; i <= n; i++) {
    if (isPrime(i) == 1 && n % i == 0)
      printf("%d ", i);
  }
  printf("\n");
}

int main() {
  int n = 0;
  printf("num >>>");
  scanf("%d", &n);

  printf("is prime : %d\n", isPrime(n));
  prime(n);

  return 0x0;
}
