// matrisin transpozesini bulan algoritma
#include <stdio.h>

void printMatrix(int r, int c, int (*arr)[c]) {
  for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
      printf("%3d ", arr[i][j]);
    }
    printf("\n");
  }
  printf("\n\n");
}

void transposed(int r, int c, int (*matris)[c], int (*transArr)[r]) {
  for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
      transArr[j][i] = matris[i][j];
    }
  }
}

int main() {

  int r = 4, c = 3;
  int matris[4][3] = {{1, 2, 3}, {5, 6, 7}, {8, 9, 10}, {11, 12, 13}};
  int transArr[c][r];

  printMatrix(r, c, matris);
  transposed(r, c, matris, transArr);
  printMatrix(c, r, transArr);

  return 0x0;
}
