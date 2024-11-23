// girilen stringi dinamik olarak ters cevirme
#include <stdio.h>
#include <stdlib.h>

int slen(char *m) {
  int i = 0;
  while (m[i++] != '\0') {
  }
  return i - 1;
}

char *s_rev(char *str) {
  if (str == NULL || slen(str) <= 0)
    return NULL;

  int len = slen(str);
  char *rev_str = (char *)malloc(sizeof(char) * len);

  for (int i = 0; i < len; i++) {
    rev_str[i] = str[len - i - 1];
  }
  return rev_str;
}

int main() {
  char arr[] = "why20w18";
  char *rev_arr = s_rev(arr);

  printf("%s\n", arr);
  if (rev_arr != NULL)
    printf("%s\n", rev_arr);

  free(rev_arr);
  return 0x0;
}
