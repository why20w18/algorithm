// asal sayilar ve araliktaki asal sayilari tespit etme
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

  for (int i = 3; i * i <= n; i += 2) {
    if (n % i == 0)
      return false;
  }

  return true;
}

void rangePrime(int min, int max) {
  int count = 0;
  for (int i = min; i <= max; i++) {
    if (isPrime(i) == true) {
      printf("%d ", i);
      count++;
    }
  }

  printf("\n\nTOTAL PRIME COUNT : %d\n", count);
}

int main() {
  int min = 0, max = 0;
  printf(">>");
  scanf("%d %d", &min, &max);

  rangePrime(min, max);

  return 0x0;
}
