// dizideki tekrarli sayilar kac kere tekrar ediyor cikti veren
// ve max tekrar edeni geri ceviren
#include <stdio.h>
#include <stdlib.h>

void printArr(int *arr, int s);

void zerosArr(int *arr, int s) {
  for (int i = 0; i < s; i++)
    arr[i] = 0;
}

int analyzeArr(int *arr, int size) {
  if (arr == NULL)
    return -1;

  int tempArr[size];
  zerosArr(tempArr, size);

  for (int i = 0; i < size; i++) {
    tempArr[arr[i]]++;
  }

  printf("\nFREKANSLAR:\n");
  printArr(tempArr, size);

  int max = tempArr[0];
  for (int i = 0; i < size; i++) {
    max = (tempArr[i] > max) ? tempArr[i] : max;
    if (tempArr[i] != 0)
      printf("%d sayisi %d kere tekrar ediyor !\n", i, tempArr[i]);
  }

  return max;
}

void printArr(int *arr, int s) {
  for (int i = 0; i < s; i++)
    printf("%d ", arr[i]);
  printf("\n");
}

int main() {
  int arr[] = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 5, 5, 5, 6, 7, 8};
  int size = sizeof(arr) / sizeof(arr[0]);

  printArr(arr, size);

  int max = analyzeArr(arr, size);
  printf("en fazla tekrar eden sayi %d\n", max);

  return 0x0;
}
