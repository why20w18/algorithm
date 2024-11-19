// carpim tablosu olusturma
#include <stdio.h>

void carpim() {
  for (int i = 1; i < 11; i++) {
    for (int j = 1; j < 11; j++) {
      printf("%dx%d=%d\t", i, j, i * j);
    }
    printf("\n");
  }
}

int main() {
  carpim();
  return 0x0;
}
