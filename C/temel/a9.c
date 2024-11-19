// girdiye gore sola yasli saga yasli , ici bos sola yasli ucgen ve piramit
// cizdiren
#include <stdio.h>

void solUcgen(int h) {
  for (int i = 1; i <= h; i++) {
    for (int j = 1; j <= i; j++) { // kacinci satirdaysa o kadar yildiz
      printf("* ");
    }
    printf("\n");
  }
}

// karesel dusunup bosluk+yildiz
void sagUcgen(int h) {
  for (int i = 1; i <= h; i++) {
    for (int j = 1; j <= h - i; j++) {
      printf("  ");
    }

    for (int z = 1; z <= i; z++)
      printf("* ");
    printf("\n");
  }
}

// burada tepe , taban ve kenarlar disinda her yere yildiz , kalana bosluk
void iciBosUcgen(int h) {
  for (int i = 1; i <= h; i++) {
    for (int j = 1; j <= i; j++) {
      if (i == h || i == j || j == 1)
        printf("* ");
      else
        printf("  ");
    }
    printf("\n");
  }
}

void piramit(int h) {
  // saga yasli ucgeni tam yaslamayacagiz
  for (int i = 1; i <= h; i++) {
    for (int j = 1; j <= h - i; j++) {
      printf(" ");
    }

    for (int z = 1; z <= i; z++)
      printf("* ");

    printf("\n");
  }
}

int main() {
  int h = 0;
  printf(">>>");
  scanf("%d", &h);

  solUcgen(h);
  printf("\n");
  sagUcgen(h);
  printf("\n");
  iciBosUcgen(h);
  printf("\n");
  piramit(h);
}
