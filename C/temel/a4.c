// 2 random arrayi concat etme islemi
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int getRandom(int min, int max) { return min + rand() % (max - min + 1); }

int *createArray(int n) {
  int *arr = (int *)malloc(sizeof(int) * n);

  for (int i = 0; i < n; i++)
    arr[i] = getRandom(0, 100);

  return arr;
}

void printArray(int *arr, int n, char *msg) {
  printf("%s\n", msg);

  for (int i = 0; i < n; i++)
    printf("%2d ", arr[i]);

  printf("\n");
}

int *concatArray(int *arr1, int n1, int *arr2, int n2, int cst1, int cst2) {
  int *concatArr = (int *)malloc(sizeof(int) * ((n1 + n2) - (cst1 + cst2)));

  for (int i = 0; i < n1 - cst1; i++) {
    concatArr[i] = arr1[i];
  }

  for (int i = 0; i < n2 - cst2; i++) {
    concatArr[n1 - cst1 + i] = arr2[i];
  }

  return concatArr;
}

int main() {
  srand(time(NULL));

  int n1 = 15, n2 = 17, cst1 = 5, cst2 = 7;
  int csize = (n1 + n2 - cst1 - cst2);

  int *arr1 = createArray(n1);
  int *arr2 = createArray(n2);
  printArray(arr1, n1, "arr1:");
  printArray(arr2, n2, "arr2:");

  int *concatArr = concatArray(arr1, n1, arr2, n2, 5, 7);
  // arrayin belirli kismini slice etmek icin bastan

  printArray(concatArr, csize, "concatarr:");

  free(arr1);
  free(arr2);
  free(concatArr);

  return 0x0;
}
