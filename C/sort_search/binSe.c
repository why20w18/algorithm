// binary search
#include <stdio.h>

int binarySearch(int *arr, int size, int searching) {
  int left = 0;
  int right = size - 1;
  int mid = 0;

  while (left <= right) {
    mid = left + (right - left) / 2;

    if (arr[mid] == searching)
      return mid;

    else if (arr[mid] > searching)
      right = mid - 1;

    else if (arr[mid] < searching)
      left = mid + 1;
  }
  return -1;
}

int main() {
  int arr[] = {2,  4,  6,  7,  8,  14, 16, 18, 22, 23, 29, 32, 33,
               43, 45, 50, 54, 55, 60, 63, 68, 72, 75, 76, 79};

  int size = sizeof(arr) / sizeof(int);

  int searching = 54;
  int index = binarySearch(arr, size, searching);
  printf("value   : %d\n", searching);
  printf("index   : %d\n", index);

  return 0x0;
}
