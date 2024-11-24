// 2D arrayi 1D hale getirme
#include <stdio.h>
#include <stdlib.h>

int **init2D(int row, int col) {
  int **arr2d = (int **)malloc(sizeof(int *) * row);
  int i = 0;
  while (i < row) {
    arr2d[i++] = (int *)malloc(sizeof(int) * col);
  }

  int t = 1;
  for (int i = 0; i < row; i++)
    for (int k = 0; k < col; k++)
      arr2d[i][k] = t++;

  return arr2d;
}

void free2D(int **arr, int row, int col) {
  for (int i = 0; i < row; i++)
    free(arr[i]);
  free(arr);
}

void pa(int **arr, int row, int col) {
  printf("\n2D ARR:\n");
  for (int i = 0; i < row; i++) {
    for (int j = 0; j < col; j++) {
      printf("%d ", arr[i][j]);
    }
    printf("\n");
  }
  printf("\n");
}

int *flatLine(int **arr, int row, int col) {
  int *arr_flat = (int *)malloc(sizeof(int) * (row * col));
  int k = 0;
  for (int i = 0; i < row; i++)
    for (int j = 0; j < col; j++)
      arr_flat[k++] = arr[i][j];

  return arr_flat;
}

void pa1D(int *arr, int size) {
  printf("\n1D ARR:\n");
  for (int i = 0; i < size; i++)
    printf("%d ", arr[i]);
  printf("\n");
}

int main() {
  int row = 3, col = 2;
  int **arr = init2D(row, col);
  pa(arr, row, col);

  int *arr_flat = flatLine(arr, row, col);
  pa1D(arr_flat, (row * col));

  free2D(arr, row, col);
  free(arr_flat);
  return 0x0;
}
