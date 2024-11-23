// araliktaki tek ve cift sayilari 2D array olarak cevirme
#include <stdio.h>
#include <stdlib.h>

int **ardisik(int start, int end) {
  int **arr = (int **)malloc(sizeof(int *) * 2);

  int length = (end - start + 1);
  int evenCount = length / 2;      // cift
  int oddCount = (length + 1) / 2; // tek

  arr[0] = (int *)malloc(sizeof(int) * oddCount);
  arr[1] = (int *)malloc(sizeof(int) * evenCount);

  int evenIndex = 0;
  int oddIndex = 0;

  int i = start;
  while (i <= end) {
    if (i % 2 == 0)
      arr[1][evenIndex++] = i;
    else
      arr[0][oddIndex++] = i;
    i++;
  }
  return arr;
}

void printArr(int *arr, int s, char *msg) {
  printf("%s\n", msg);
  for (int i = 0; i < s; i++)
    printf("%d ", arr[i]);
  printf("\n\n");
}

int main() {
  int start = 0, end = 0;
  printf("range >>>");
  scanf("%d %d", &start, &end);

  int length = (end - start + 1);
  int oddCount = (length + 1) / 2;
  int evenCount = length / 2;

  int **arr = ardisik(start, end);

  printArr(arr[0], oddCount, "TEKLER:");
  printArr(arr[1], evenCount, "CIFTLER:");

  free(arr[0]);
  free(arr[1]);
  free(arr);
  return 0x0;
}
