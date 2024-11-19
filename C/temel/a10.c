// 2 girdinin ebob ve ekoklarini bulma
#include <stdio.h>

// minimum sayidan geriye
int ebob(int a, int b) {
  int min = (a > b) ? b : a;

  // ortak bolen yoksa 1'dir
  for (int i = min; i >= 1; i--)
    if (a % i == 0 && b % i == 0)
      return i;

  return 1;
}

int ebobGCD(int a, int b) {
  if (b == 0)
    return a;

  return ebobGCD(b, a % b);
}

// maxi arttirarak ortak kat bulma
int ekok(int a, int b) {
  int max = (a > b) ? a : b;
  while (1) {
    if (max % a == 0 && max % b == 0)
      return max;

    max++;
  }
}

int main() {
  int a = 0, b = 0;
  printf(">>>");
  scanf("%d %d", &a, &b);

  printf("ebob      : %d\n", ebob(a, b));
  printf("ebobGCD   : %d\n", ebobGCD(a, b));
  printf("ekok      : %d\n", ekok(a, b));

  return 0x0;
}
