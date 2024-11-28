#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int *randomArr() {
  int *arr = (int *)calloc(10, sizeof(int));
  for (int i = 0; i < 10; i++)
    arr[i] = 1 + rand() % 100;

  return arr;
}

void print(int *arr) {
  for (int i = 0; i < 10; i++)
    printf("%d ", arr[i]);
  printf("\n");
}

void bubbleSort(int *arr) {
  int len = 10;
  for (int i = 0; i < len; i++)
    for (int j = 0; j < len - i - 1; j++)
      if (arr[j] > arr[j + 1]) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
}

int main() {
  srand(time(NULL));
  int *arr = randomArr();
  print(arr);

  bubbleSort(arr);
  print(arr);

  free(arr);
  return 0x0;
}
