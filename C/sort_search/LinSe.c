// lineer search
#include <stdio.h>

int lineerSearch(int *arr, int size, int searching) {
  for (int i = 0; i < size; i++) {
    if (arr[i] == searching)
      return i;
  }
  return -1;
}

int main() {
  int arr[] = {2,  4,  6,  7,  8,  14, 16, 18, 22, 23, 29, 32, 33,
               43, 45, 50, 54, 55, 60, 63, 68, 72, 75, 76, 79};

  int size = sizeof(arr) / sizeof(int);

  int searching = 54;
  int index = lineerSearch(arr, size, searching);
  printf("searching : %d\nindex  : %d\n", searching, index);

  return 0x0;
}
