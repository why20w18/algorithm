#include <stdbool.h>
#include <stdio.h>

int isPalindrome(int x) {
  int tx = x;
  long rev = 0;

  while (x > 0) {
    rev = rev * 10 + (x % 10);
    x /= 10;
  }

  if (tx == rev)
    return true;

  return false;
}

int main() {
  int x1 = 121, x2 = -121, x3 = 10;
  printf("%d , %d , %d\n", isPalindrome(x1), isPalindrome(x2),
         isPalindrome(x3));

  return 0x0;
}
