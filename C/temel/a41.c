// recursive sekilde permutasyon hesaplama
#include <stdio.h>

void printArr(int *arr, int size) {
  for (int i = 0; i < size; i++)
    printf("%d ", arr[i]);
  printf("\n");
}

void swap(int *x, int *y) {
  int s = *x;
  *x = *y;
  *y = s;
}

void permuteArr(int *arr, int startIndex, int stopIndex) {
  if (startIndex == stopIndex) {
    printArr(arr, stopIndex + 1);
  }

  for (int i = startIndex; i <= stopIndex; i++) {
    swap(&arr[startIndex], &arr[i]);
    permuteArr(arr, startIndex + 1, stopIndex);
    swap(&arr[i], &arr[startIndex]);
  }
}

int main() {
  int arr[] = {1, 2, 3, 4, 5};
  int size = sizeof(arr) / sizeof(int);

  permuteArr(arr, 0, 3);

  return 0x0;
}
