// 1'den N'ye kadar giden dizi olusturma ve eksik elemani bulma
#include <stdio.h>
#include <stdlib.h>

int *initArray(int stop) {
  int *arr = (int *)malloc(sizeof(int) * stop);

  for (int i = 1; i <= stop; i++) {
    arr[i - 1] = i;
  }

  return arr;
}

void printArr(int *arr, int size) {
  for (int i = 0; i < size; i++)
    printf("%d ", arr[i]);
  printf("\n");
}

int find_NaN_index(int *arr, int stop, int artisMiktari) {
  for (int i = 1; i <= stop; i += artisMiktari) {
    if (arr[i - 1] != i) {
      return i - 1;
    }
  }
  return -1;
}

int main() {
  int stop = 0;
  printf("stop >>>");
  scanf("%d", &stop);

  int *testArr = initArray(stop);

  testArr[45] = -1;
  printArr(testArr, stop);

  int nanIndex = find_NaN_index(testArr, stop, 1);
  printf("eksik index : %d\n", nanIndex);
  printf("eksik deger : %d\n", nanIndex + 1);

  free(testArr);
  return 0x0;
}
