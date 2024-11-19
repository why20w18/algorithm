// matris olusturma islemi
#include <stdio.h>
#include <stdlib.h>

/*
{
{1,2,3},
{4,5,6}
}
*/

int **createMatrixZero(int row, int col) {
  // array icindeki array sayisi
  int **matris = (int **)malloc(sizeof(int *) * row);

  for (int i = 0; i < row; i++) {
    matris[i] = (int *)malloc(sizeof(int) * col);
  }

  // matrisi sifirlama islemi
  for (int i = 0; i < row; i++) {
    for (int j = 0; j < col; j++) {
      matris[i][j] = 0;
    }
  }

  return matris;
}

// matris output on screen
void printMatrix(int **matris, int row, int col, char *msg) {
  printf("%s\n", msg);

  for (int i = 0; i < row; i++) {
    for (int j = 0; j < col; j++)
      printf("%d ", matris[i][j]);
    printf("\n\n");
  }
}

void freeMatrixMemory(int **matris, int row, int col) {
  for (int i = 0; i < row; i++)
    matris[i];

  free(matris);
}

// matrisleri toplama | m1 mxn boyut => m2 mxn boyut olmak zorundadir
int **sumMatrix(int **matris1, int **matris2, int row, int col) {
  int **sumMatris = createMatrixZero(row, col);

  for (int i = 0; i < row; i++)
    for (int j = 0; j < col; j++)
      sumMatris[i][j] = matris1[i][j] + matris2[i][j];

  return sumMatris;
}

void setMatrix(int **matris, int row, int col) {
  for (int i = 0; i < row; i++)
    for (int j = 0; j < col; j++) {
      printf("matrix[%d][%d] = ", i, j);
      scanf("%d", &matris[i][j]);
    }
  printf("\n");
}

int main(int argc, char *argv[]) {

  int r3 = 3, c3 = 3;

  int **matris1 = createMatrixZero(r3, c3);
  int **matris2 = createMatrixZero(r3, c3);

  printMatrix(matris1, r3, c3, "ILK MATRIS-1:");
  printMatrix(matris2, r3, c3, "ILK MATRIS-2:");

  setMatrix(matris1, r3, c3);
  setMatrix(matris2, r3, c3);

  int **toplamMatris = sumMatrix(matris1, matris2, r3, c3);
  printMatrix(toplamMatris, r3, c3, "MATRIS-1 + MATRIS-2");
  printMatrix(matris1, r3, c3, "ILK MATRIS-1:");
  printMatrix(matris2, r3, c3, "ILK MATRIS-2:");

  freeMatrixMemory(matris1, r3, c3);
  freeMatrixMemory(matris2, r3, c3);
  freeMatrixMemory(toplamMatris, r3, c3);

  return 0x0;
}
