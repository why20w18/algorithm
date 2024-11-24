// girilen sayidaki farkli rakamalari array olarak cevirme
#include <stdio.h>
#include <stdlib.h>

int *diffFreq(int num, int *uniq) {
  int arr[10] = {0};

  int digit = 0;
  while (num > 0) {
    digit = num % 10;
    arr[digit]++;
    num /= 10;
  }
  // diziyi gez ve sadece 1 olanlarin adedini hesapla
  for (int i = 0; i < 10; i++) {
    if (arr[i] == 1)
      (*uniq)++;
  }

  int *diffArr = (int *)malloc(sizeof(int) * (*uniq));

  int k = 0;
  for (int i = 0; i < 10; i++) {
    if (arr[i] == 1) {
      diffArr[k++] = i;
    }
  }

  return diffArr;
}

void pa(int *arr, int size) {
  for (int i = 0; i < size; i++) {
    printf("%d ", arr[i]);
  }
  printf("\n");
}

int main() {
  int num = 0, uniq = 0;
  printf("num >>>");
  scanf("%d", &num);

  int *farkliRakamlar = diffFreq(num, &uniq);
  pa(farkliRakamlar, uniq);
  printf("\nfarkli rakam sayisi : %d\n", uniq);

  free(farkliRakamlar);
  return 0x0;
}
