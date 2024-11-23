// 2 sayi araligindaki tam kare sayilari array olarak cevirme
#include <stdio.h>
#include <stdlib.h>

double newtonRalphsonSquareRoot(double n2) {
  double epsilon = 0.00001;
  double predictRoot = n2 / 2;
  double newPredictRoot = 0.0;
  double diff = 0.0;

  while (1) {
    newPredictRoot = (predictRoot + (n2 / predictRoot)) / 2;
    diff = predictRoot - newPredictRoot;

    // abs
    if (diff < epsilon && diff > -epsilon) {
      break;
    }

    predictRoot = newPredictRoot;
  }

  return predictRoot;
}

int powxy(int x, int y) {
  int r = 1;
  for (int i = 0; i < y; i++)
    r = r * x;
  return r;
}

int *sumSquareArr(int start, int end) {
  int start_square = newtonRalphsonSquareRoot(start);
  int end_square = newtonRalphsonSquareRoot(end);

  int length = (end_square - start_square) + 1;
  int i = 0;
  int *arr = (int *)malloc(sizeof(int) * length);

  // sqrt(17) => 4.2 => 4 alir , sqrt(16) => 4 alir
  if (start_square * start_square < start)
    start_square++;

  while (start_square <= end_square) {
    arr[i] = (int)(start_square * start_square);
    i++;
    start_square++;
  }
  return arr;
}

int main() {
  int start = 0, end = 0;
  printf("start , end >>");
  scanf("%d %d", &start, &end);

  int *arr = sumSquareArr(start, end);

  int start_square = newtonRalphsonSquareRoot(start);
  int end_square = newtonRalphsonSquareRoot(end);
  int length = end_square - start_square + 1;

  for (int i = 0; i < length; i++) {
    printf("%d ", arr[i]);
  }

  printf("\n");
  free(arr);
  return 0x0;
}
