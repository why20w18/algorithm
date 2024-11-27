#include <stdio.h>

int slen(char *str) {
  int i = 0;
  while (str[i++] != '\0') {
  }
  return i - 1;
}

void encryptSezarASCII(char *str, int shift) {
  int len = slen(str);
  for (int i = 0; i < len; i++) {
    str[i] = str[i] + shift;
  }
}

void encryptSezarAlph(char *str, int shift) {

  int len = slen(str);
  for (int i = 0; i < len; i++) {
    if ('a' <= str[i] && str[i] <= 'z') {
      str[i] = ((str[i] - 'a' + shift) % 26) + 'a';
    }

    else if ('A' <= str[i] && str[i] <= 'Z') {
      str[i] = ((str[i] - 'A' + shift) % 26) + 'A';
    }

    else if ('0' <= str[i] && str[i] <= '9') {
      str[i] = ((str[i] - '0' + shift) % 10) + '0';
    }
  }
}

int main() {
  char str[20] = "abcdefgzABCDEFGZ123";
  printf("%s\n", str);

  encryptSezarASCII(str, 15);
  printf("%s\n", str);

  char str1[20] = "abcdefgzABCDEFGZ123";
  encryptSezarAlph(str1, 15);
  printf("%s\n", str1);

  return 0x0;
}
