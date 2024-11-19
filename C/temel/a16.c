// random dizide istenen elemani bulup indexi geri cevirme
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void print(int *arr, int n, char *msg) {
  printf("%s\n", msg);
  int i = 0;
  while (i < n)
    printf("%d ", arr[i++]);
  printf("\n");
}

int getRand(int mi, int ma) { return mi + rand() % (ma - mi + 1); }

void initRandomArr(int *arr, int size) {
  for (int i = 0; i < size; i++)
    arr[i] = getRand(0, 100);
}

int findIndexInteger(int *arr, int size, int search) {
  for (int i = 0; i < size; i++) {
    if (search == arr[i]) {
      return i;
    }
  }
  return -1;
}

int s_len(char *arr) {
  int r = 0;
  while (arr[r] != '\0') {
    r++;
  }
  return r;
}

int findIndexString(char *arr, char search) {
  int len = s_len(arr);

  for (int i = 0; i < len; i++) {
    if (arr[i] == search)
      return i;
  }

  return -1;
}

int main() {
  srand(time(NULL));
  short size = 15;

  int arr[15];
  char s_arr[50];

  initRandomArr(arr, size);
  print(arr, size, "ARRAY:");
  int search = 0;
  printf("int search >>");
  scanf("%d", &search);
  printf("index = %d\n", findIndexInteger(arr, size, search));

  printf("\ninput str >>>");
  scanf("%s", s_arr);
  printf("\nS_ARRAY:\n%s", s_arr);
  char search_s;
  printf("\nsearch_s >>>");
  scanf(" %c", &search_s); // usttekinin \n okudu enter karakteri
  printf("\nindex = %d\n", findIndexString(s_arr, search_s));

  return 0x0;
}
