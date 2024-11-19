// random array stddev , sum , mean bulma fakat bunu struct icine gomme ,
// fonksiyon pointerlarini
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

struct arrMath {
  int (*sum)(int *, int);
  double (*mean)(int *, int);
  double (*stddev)(int *, int);
} typedef arr_m;

///////////////////////////

int sumArray(int *arr, int n) {
  int sum = 0;
  for (int i = 0; i < n; i++)
    sum += arr[i];

  return sum;
}

double meanArray(int *arr, int n) {
  double mean = (double)sumArray(arr, n) / (double)n;
  return mean;
}

double stddevArray(int *arr, int n) {
  double x_bar = meanArray(arr, n);
  double sumSquare = 0.0;

  for (int i = 0; i < n; i++) {
    sumSquare = (x_bar - arr[i]) * (x_bar - arr[i]);
  }

  double variance = sumSquare / (double)n;
  double stddev = sqrt(variance);

  return stddev;
}
///////////////////////////
int getRandom(int min, int max) { return min + rand() % (max - min + 1); }

int *createArray(int n) {
  int *arr = (int *)malloc(sizeof(int) * n);

  for (int i = 0; i < n; i++) {
    arr[i] = getRandom(0, 100);
  }

  return arr;
}

void printArray(int *arr, int n, char *msg) {
  printf("%s\n", msg);

  for (int i = 0; i < n; i++)
    printf("%d ", arr[i]);

  printf("\n");
}
///////////////////////////
int main() {
  srand(time(NULL));

  int n1 = 10, n2 = 15, n3 = 20;
  int *arr1 = createArray(n1);
  printArray(arr1, n1, "ARRAY1:");

  arr_m m1;
  m1.mean = meanArray;
  m1.stddev = stddevArray;
  m1.sum = sumArray;

  printf("arr1 sum   : %d\n", m1.sum(arr1, n1));
  printf("arr1 mean  : %3.2lf\n", m1.mean(arr1, n1));
  printf("arr1 stddev: %3.2lf\n", m1.stddev(arr1, n1));
  printf("arr1 stddev: %lf\n", m1.stddev(arr1, n1));

  free(arr1);
  return 0x0;
}
