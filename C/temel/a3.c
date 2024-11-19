// random arraydeki max ve min sayiyi bulup array olarak cevirme islemi
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int getRandom(int min, int max) { return min + rand() % (max - min + 1); }

int *initArray(int length) {
  int *arr = (int *)malloc(sizeof(int) * length);

  for (int i = 0; i < length; i++) {
    arr[i] = getRandom(0, 100);
  }

  return arr;
}

void printArray(int *arr, int length, char *msg) {
  printf("%s\n", msg);
  for (int i = 0; i < length; i++) {
    printf("%d ", arr[i]);
  }
  printf(" \n");
}

int *getMaxMinArray(int *arr, int length) {
  int *minMaxArray = (int *)malloc(sizeof(int) * 2);

  int min = arr[0], max = arr[0];

  for (int i = 0; i < length; i++) {
    min = (arr[i] < min) ? arr[i] : min;
    max = (arr[i] > max) ? arr[i] : max;
  }

  minMaxArray[0] = min;
  minMaxArray[1] = max;

  return minMaxArray;
}

int main() {
  srand(time(NULL));

  int length = 10;

  int *arr1 = initArray(length);
  printArray(arr1, length, "RANDOM ARR");

  int *minMaxArray = getMaxMinArray(arr1, length);
  printArray(minMaxArray, 2, "MIN VE MAX ARRAY");

  free(minMaxArray);
  free(arr1);

  return 0x0;
}
