// array shifting
#include <stdio.h>
#include <stdlib.h>

int *iCpy(int *arr, int arr_size) {
  int *arr_n = (int *)malloc(sizeof(int) * arr_size);

  for (int i = 0; i < arr_size; i++)
    arr_n[i] = arr[i];

  return arr_n;
}

void shiftArray(int *arr, int arr_size, int shift) {
  int *arr_temp = iCpy(arr, arr_size);

  for (int i = 0; i < arr_size; i++) {
    arr[(i + shift) % arr_size] = arr_temp[i];
  }

  free(arr_temp);
}

void print(int *arr, int n, char *msg) {
  printf("%s\n", msg);
  int i = 0;
  while (i < n) {
    printf("%d ", arr[i]);
    i++;
  }
  printf("\n");
}

int main() {
  int arr[] = {1, 2, 3, 4, 5, 6};
  int arr_size = sizeof(arr) / sizeof(arr[0]);
  int shift = 0;
  print(arr, arr_size, "ARRAY:");

  printf("shift >>");
  scanf("%d", &shift);

  shiftArray(arr, arr_size, shift);
  print(arr, arr_size, "SHIFTED");

  return 0x0;
}
