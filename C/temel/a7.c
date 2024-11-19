// arraydeki tek ve cift sayilari ayri bir array olarak geri cevime
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define true 1
#define false 0

// array
int getRandom(int min, int max) { return min + rand() % (max - min + 1); }

void printArray(int *arr, int n, char *msg) {
  printf("%s\n", msg);
  for (int i = 0; i < n; i++)
    printf("%d ", arr[i]);
  printf("\n");
}

int *creatArray(int n, int isRandom) {
  int *arr = (int *)malloc(sizeof(int) * n);

  if (isRandom)
    for (int i = 0; i < n; i++)
      arr[i] = getRandom(0, 100);

  return arr;
}

// algoritma
int **getTekCiftArray(int *arr, int n) {

  // tekler,ciftler,tekSize,ciftSize
  int **tekCiftArray = (int **)malloc(sizeof(int *) * 3);

  int tekCount = 0, ciftCount = 0;
  for (int i = 0; i < n; i++) {
    if (arr[i] % 2 == 0)
      ciftCount++;
    else
      tekCount++;
  }

  int *tekArray = creatArray(tekCount, false);
  int *ciftArray = creatArray(ciftCount, false);

  for (int i = 0, j = 0, z = 0; i < n; i++) {
    if (arr[i] % 2 == 0)
      ciftArray[j++] = arr[i];
    else
      tekArray[z++] = arr[i];
  }

  tekCiftArray[0] = tekArray;
  tekCiftArray[1] = ciftArray;

  // countlari tutacagiz
  tekCiftArray[2] = creatArray(2, false);

  tekCiftArray[2][0] = tekCount;
  tekCiftArray[2][1] = ciftCount;

  return tekCiftArray;
}

int main() {
  srand(time(NULL));

  int n = 22;
  int *arr = creatArray(n, true);
  printArray(arr, n, "RANDOM ARRAY:");

  int **tekCiftArr = getTekCiftArray(arr, n);

  printArray(tekCiftArr[0], tekCiftArr[2][0], "TEKLER:");
  printArray(tekCiftArr[1], tekCiftArr[2][1], "CIFTLER");

  free(arr);
  free(tekCiftArr[0]);
  free(tekCiftArr[1]);
  free(tekCiftArr[2]);
  free(tekCiftArr);

  return 0x0;
}
