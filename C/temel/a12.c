// aaaabbc => a4b2c1
#include <stdio.h>

// string uzunlugu
int s_len(char *arr) {
  int i = 0;
  while (arr[i] != '\0')
    i++;
  return i;
}

// 1 tane karakteri tutarim sonraki karakterle ayniysa saymaya baslarim
void zippedCharNum(char *arr) {
  int len = s_len(arr);
  int count = 0;
  char currentChar;

  for (int i = 0; i < len; i++) {
    currentChar = arr[i];
    count = 1; // her karakter icin count 1 olur

    while (currentChar == arr[i + 1] && i + 1 < len) {
      count++;
      i++; // i artar cunku i string karakterlerini gezmek icindi
    }
    printf("%c%d", currentChar, count);
  }
  printf("\n");
}

int main() {
  int size = 100;
  char msg[size];

  printf("input >>");
  scanf("%s", msg);

  printf("msg : %s\ns_len : %d\n", msg, s_len(msg));
  zippedCharNum(msg);

  return 0x0;
}
