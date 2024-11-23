#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

int getRand(int x, int y) { return x + rand() % (y - x + 1); }

int *initRandomArray(int size) {
  int *arr = (int *)malloc(sizeof(int) * size);
  for (int i = 0; i < size; i++)
    arr[i] = getRand(1, 10);

  return arr;
}

int mulAllArr(int *arr, int size) {
  int result = 1;
  for (int i = 0; i < size; i++)
    result *= arr[i];

  return result;
}

int main() {
  srand(time(NULL));
  int size = 5;
  int *arr = initRandomArray(size);
  int mul = mulAllArr(arr, size);

  for (int i = 0; i < size; i++)
    printf("%d ", arr[i]);

  printf("MUL : %d\n", mul);

  free(arr);
  return 0x0;
}
