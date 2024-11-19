// random array ters cevirme
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define SIZE 25

int getRandom(int min, int max) { return min + rand() % (max - min + 1); }

void initArray(int *arr) {
  for (int i = 0; i < SIZE; i++) {
    arr[i] = getRandom(0, 100);
  }
}

void reversedArray(int *arr, int *revarr) {
  for (int i = 0; i < SIZE; i++) {
    revarr[i] = arr[SIZE - i - 1];
  }
}

void printArray(int *arr, char *msg) {
  printf("%s\n", msg);

  for (int i = 0; i < SIZE; i++)
    printf("%d ", arr[i]);
  printf("\n");
}

int main() {
  srand(time(NULL));

  int arr[SIZE];
  int revarr[SIZE];

  initArray(arr);
  printArray(arr, "ILK ARRAY");
  reversedArray(arr, revarr);

  printArray(revarr, "REVARR");

  return 0x0;
}
