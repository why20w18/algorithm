// baslangic ve bitisi verilen bu araligi geri cevirsin array olarak
#include <stdio.h>
#include <stdlib.h>
// 1,2,3,4,5,6,7
int *rangeArr(int start, int stop) {
  int length = (stop - start + 1);
  int *arr = (int *)malloc(sizeof(int) * length);

  for (int j = 0, i = start; i <= stop; i++)
    arr[j++] = i;

  return arr;
}

int main() {
  int *arr = rangeArr(10, 85);
  for (int i = 0; i < (85 - 10 + 1); i++)
    printf("%d ", arr[i]);
  printf("\n");

  free(arr);
  return 0x0;
}
