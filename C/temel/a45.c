// palindromik array kontrol
#include <stdio.h>

#define true 1
#define false 0

int powxy(int x, int y) {
  int i = 0, r = 1;
  while (i < y) {
    r *= x;
    i++;
  }
  return r;
}

int isPalindromArr(int *arr, int size) {
  int num = 0;
  for (int i = 0; i < size; i++) {
    num += arr[i] * powxy(10, size - i - 1);
  }

  int tempNum = num;
  int rev = 0;
  int digit = 0;
  // 52
  while (tempNum > 0) {
    digit = tempNum % 10;
    rev = rev * 10 + digit;
    tempNum /= 10;
  }

  if (num == rev)
    return true;

  else
    return false;
}

void pa(int *arr, int s) {
  for (int i = 0; i < s; i++)
    printf("%d ", arr[i]);
  printf("\n");
}

int main() {
  int arr1[] = {1, 3, 3, 1};
  int n1 = sizeof(arr1) / sizeof(int);

  int arr2[] = {1, 3, 3, 7};
  int n2 = sizeof(arr2) / sizeof(int);

  pa(arr1, n1);
  pa(arr2, n2);

  printf("arr1 : %d\narr2 : %d\n", isPalindromArr(arr1, n1),
         isPalindromArr(arr2, n2));

  return 0x0;
}
