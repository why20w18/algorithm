// sayinin tersini cevirme
#include <stdio.h>

int reversed(int n) {
  int rev = 0;

  while (n > 0) {
    rev = rev * 10 + (n % 10);
    n /= 10;
  }

  return rev;
}

int main() {
  int n = 1337;
  printf("%d\n%d\n", n, reversed(n));

  return 0x0;
}
