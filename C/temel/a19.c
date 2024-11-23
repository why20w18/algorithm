// dizide birden fazla tekrar eden sayilari ayri array olarak cevir
#include <stdio.h>
#include <stdlib.h>

void zerosArray(int *arr, int arr_size) {
  for (int i = 0; i < arr_size; i++)
    arr[i] = 0;
}

int *analyzeFrequency(int *arr, int arr_size) {
  if (arr == NULL)
    return NULL;

  // hic tekrar olmayabilir o yuzden birebir ayni boyutta
  int *resArr = (int *)malloc(sizeof(int) * arr_size);

  // garbage degerleri temizleme
  zerosArray(resArr, arr_size);

  for (int i = 0; i < arr_size; i++)
    resArr[arr[i]]++;

  return resArr;
}

int main() {
  int arr[] = {0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 7};
  int arr_size = sizeof(arr) / sizeof(arr[0]);

  int *freqArr = analyzeFrequency(arr, arr_size);

  for (int i = 0; i < arr_size; i++)
    printf("%d ", arr[i]);

  printf("\n");

  for (int i = 0; i < arr_size; i++)
    printf("%d ", freqArr[i]);

  printf("\n");

  free(freqArr);
  return 0x0;
}
