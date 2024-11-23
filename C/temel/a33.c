// string icindeki her kelimeyi ayri array olarak 2D olarak cevirme
#include <stdio.h>
#include <stdlib.h>

int slen(char *arr) {
  int i = 0;
  while (arr[i++] != '\0') {
  }
  return i - 1;
}

int swc(char *arr) {
  int len = slen(arr);
  int wc = 1;
  for (int i = 0; i < len; i++)
    if (arr[i] == ' ')
      wc++;

  return wc;
}

int *sslen(char *arr) {
  int len = slen(arr);
  int wc = swc(arr);

  int *arr_sslen = (int *)malloc(sizeof(int) * wc);
  int cx = 0;
  int j = 0;

  for (int i = 0; i < len; i++) {
    if (arr[i] != ' ')
      cx++;
    else {
      arr_sslen[j++] = cx;
      cx = 0;
    }
  }

  arr_sslen[j] = cx;
  return arr_sslen;
}

char **to2D(char *arr) {
  if (arr == NULL || slen(arr) <= 0)
    return NULL;

  int totalLen = slen(arr);
  int wc = swc(arr);
  int *sslen_arr = sslen(arr);

  char **Dim2_arr = (char **)malloc(sizeof(char *) * wc);

  int i = 0;
  while (i < wc) {
    Dim2_arr[i] = (char *)malloc(sizeof(char) * sslen_arr[i]);
    i++;
  }
  free(sslen_arr);

  i = 0;
  int j = 0, k = 0;

  while (i < totalLen) {
    if (arr[i] != ' ') {
      Dim2_arr[k][j++] = arr[i];
    } else {
      Dim2_arr[k][j] = '\0';
      k++;
      j = 0;
    }
    i++;
  }

  return Dim2_arr;
}

void freeto2D(char *arr, char **dim2d) {
  for (int i = 0; i < swc(arr); i++) {
    free(dim2d[i]);
  }
  free(dim2d);
}

int main() {
  char arr[] = "Ahmet Mehmet Mustafa Irfan";
  int *arrlen = sslen(arr);

  printf("%s\n\n", arr);

  for (int i = 0; i < swc(arr); i++)
    printf("%d ", arrlen[i]);

  printf("\n");
  char **dim2d = to2D(arr);
  if (dim2d == NULL)
    return 0x1;

  for (int i = 0; i < swc(arr); i++) {
    printf("%s\n", dim2d[i]);
  }

  freeto2D(arr, dim2d);
  free(arrlen);
  return 0x0;
}
