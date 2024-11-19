// carpimlarini bulan
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int getRandom(int min, int max) { return min + rand() % (max - min + 1); }

void npCarpan(int n) {

  for (int i = 1; i <= n; i++) {
    if (n % i == 0)
      printf("[%d,%d]", i, -i);
  }
  printf("\n");
}

int main() {
  srand(time(NULL));
  int n = getRandom(0, 100);
  printf("num : %d\n", n);
  npCarpan(n);

  return 0x0;
}
