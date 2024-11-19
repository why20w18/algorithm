// 5 tane random sayinin basamak toplami
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <unistd.h>

int getRandom(int min, int max) { return min + rand() % (max - min + 1); }

int getDigitSum(int n) {
  int sum = 0;

  while (n > 0) {
    sum += n % 10;
    n /= 10;
  }

  return sum;
}

int main() {
  srand(time(NULL));
  int i = 0;
  int totalSum = 0;
  int n = 0;
  int sum = 0;
  while (i < 5) {
    sleep(1);
    n = getRandom(0, 100);
    sum = getDigitSum(n);
    totalSum += sum;
    printf("random number : %d --- sum : %d\n", n, sum);
    i++;
  }

  printf("\ntotal sum : %d\n", totalSum);

  return 0x0;
}
