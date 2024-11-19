// struct kullanarak matris deklerasyonu
#include <stdio.h>
#include <stdlib.h>

typedef struct {
  int **matrisData;
  int row;
  int col;
} Matrix;

Matrix createMatrix(int row, int col) {
  Matrix m1;
  m1.row = row;
  m1.col = col;

  m1.matrisData = (int **)malloc(sizeof(int) * row);

  // satirlar icinde sutunlari ayirma
  for (int i = 0; i < row; i++) {
    m1.matrisData[i] = (int *)malloc(sizeof(int) * col);
  }

  // sifirlama
  for (int i = 0; i < row; i++)
    for (int j = 0; j < col; j++)
      m1.matrisData[i][j] = 0;

  return m1;
}

void freeMatrixMemory(Matrix *m) {
  for (int i = 0; i < m->row; i++)
    free(m->matrisData[i]);
  free(m->matrisData);
}

void printMatrix(Matrix *m, char *msg) {
  printf("%s\n", msg);
  for (int i = 0; i < m->row; i++) {
    for (int j = 0; j < m->col; j++) {
      printf("%d ", m->matrisData[i][j]);
    }
    printf("\n\n");
  }
}

void setMatrix(Matrix *m) {
  for (int i = 0; i < m->row; i++) {
    for (int j = 0; j < m->col; j++) {
      printf("matris[%d][%d] = ", i, j);
      scanf("%d", &m->matrisData[i][j]);
    }
  }
}

Matrix sumMatrix(Matrix *m1, Matrix *m2) {
  if (m1->row != m2->row && m1->col != m2->col) {
    printf("MATRIS SATIR VE SUTUNLARI UYUSMUYOR TOPLAMA YAPILAMAZ !\n");
    return *m1;
  }

  Matrix sumMatris;
  sumMatris = createMatrix(m1->row, m1->col);

  for (int i = 0; i < m1->row; i++) {
    for (int j = 0; j < m1->col; j++) {
      sumMatris.matrisData[i][j] = m1->matrisData[i][j] + m2->matrisData[i][j];
    }
  }

  return sumMatris;
}

int *matrixAttributes(Matrix *m1) {
  int *matrisAttr = (int *)malloc(sizeof(int) * 2);

  matrisAttr[0] = m1->row;
  matrisAttr[1] = m1->col;

  return matrisAttr;
}

int main() {
  int r = 3, c = 3;

  Matrix m1 = createMatrix(r, c);
  Matrix m2 = createMatrix(r, c);

  Matrix *m1_addr = &m1, *m2_addr = &m2;

  printMatrix(m1_addr, "MATRIS-1");
  printMatrix(m2_addr, "MATRIS-2");

  setMatrix(m1_addr);
  setMatrix(m2_addr);

  Matrix sumMatris = sumMatrix(m1_addr, m2_addr);

  printMatrix(&sumMatris, "GIRDI SONRASI TOPLAM MATRISI");
  printMatrix(m1_addr, "GIRDI SONRASI MATRIS-1");
  printMatrix(m2_addr, "GIRDI SONRASI MATRIS-2");
  printMatrix(&sumMatris, "GIRDI SONRASI TOPLAM MATRISI");

  int *matrisAttr = matrixAttributes(m1_addr);
  printf("M1 => Matris Attr ROW=%d | COL=%d\n", matrisAttr[0], matrisAttr[1]);

  freeMatrixMemory(m1_addr);
  freeMatrixMemory(m2_addr);
  freeMatrixMemory(&sumMatris);
  free(matrisAttr);

  return 0x0;
}
