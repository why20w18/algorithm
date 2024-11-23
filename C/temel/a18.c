#include <stdio.h>
#include <stdlib.h>

int stringLen(const char *str) {
  if (str == NULL)
    return -1;

  int len = 0;
  for (int i = 0; str[i] != '\0'; i++) {
    len++;
  }
  return len;
}

int *analyzeLetterWord(const char *str) {
  if (str == NULL)
    return NULL;

  int ln = stringLen(str);
  if (ln == -1) {
    printf("girdi bostur !\n");
    return NULL;
  }

  int wordCounter = 1;
  int letterCounter = 0;

  for (int i = 0; i < ln; i++) {
    if (str[i] == ' ')
      wordCounter++;
    else if (str[i] != '\n' && str[i] != ' ')
      letterCounter++;
  }

  int *resArr = (int *)malloc(sizeof(int) * 2);
  resArr[0] = letterCounter;
  resArr[1] = wordCounter;

  return resArr;
}

int main() {
  char str[100];

  printf("str >>>");
  fgets(str, sizeof(str), stdin);

  int *resArr = analyzeLetterWord(str);
  printf("letterCounter : %d\nwordCounter : %d\n", resArr[0], resArr[1]);

  free(resArr);
  return 0x0;
}
