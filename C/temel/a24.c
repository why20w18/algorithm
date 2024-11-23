// dizideki en buyuk 2. ve en kucuk 2. elemanin tespiti
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int *initArr(int s) {
  int *rarr = (int *)malloc(sizeof(int) * s);

  for (int i = 0; i < s; i++)
    rarr[i] = (1 + rand() % 100);

  return rarr;
}

void printArr(int *arr, int s) {
  for (int i = 0; i < s; i++)
    printf("%d ", arr[i]);
  printf("\n");
}

int *secondMinMax(int *arr, int s) {
  int min = arr[0];
  int max = arr[0];
  int sMin = -1;
  int sMax = -1;

  for (int i = 0; i < s; i++) {
    if (arr[i] < min) {
      sMin = min;
      min = arr[i];
    } else if (arr[i] < sMin && arr[i] != min || sMin == -1) {
      sMin = arr[i];
    }
  }
  for (int i = 0; i < s; i++) {
    if (arr[i] > max) {
      sMax = max;
      max = arr[i];
    } else if (arr[i] != max && arr[i] > sMax || sMax == -1)
      sMax = arr[i];
  }

  int *arr_smm = (int *)malloc(sizeof(int) * 4);
  arr_smm[0] = min;
  arr_smm[1] = sMin;
  arr_smm[2] = sMax;
  arr_smm[3] = max;

  return arr_smm;
}

int main() {
  srand(time(NULL));

  int s = 10;
  int *arr = initArr(s);
  printArr(arr, s);

  int *arr_smm = secondMinMax(arr, s);
  printArr(arr_smm, 4);

  free(arr);
  free(arr_smm);
  return 0x0;
}
