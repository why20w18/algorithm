// statik ve dinamik olarak safe string kopyalama
#include <stdio.h>
#include <stdlib.h>

int s_len(char *str) {
  int i = 0;
  while (str[i++] != '\0') {
  }
  return i - 1;
}

// str1 , str2'ye kopyalanacaktir
void s_cpy(char *str1, char *str2, unsigned int sizeofStr2) {
  if (str1 == NULL || str2 == NULL)
    return;

  int len = s_len(str1);
  int copyLen = (len < (sizeofStr2 - 1)) ? len : (sizeofStr2 - 1);

  for (int i = 0; i < copyLen; i++)
    str2[i] = str1[i];

  str2[copyLen] = '\0';
}

char *sd_cpy(char *str1) {
  if (str1 == NULL)
    return NULL;

  // tam str1 uzunlugunda bir array
  int len = s_len(str1);

  char *str2 = (char *)malloc(sizeof(char) * (len + 1));
  s_cpy(str1, str2, sizeof(char) * (len + 1));

  return str2;
}

int main() {
  char arr1[10] = "Merhaba";
  char arr2[6] = "";

  s_cpy(arr1, arr2, sizeof(arr2));
  printf("%s\n", arr2);

  char *arr3 = sd_cpy(arr1);
  printf("%s\n", arr3);

  free(arr3);
  return 0x0;
}
