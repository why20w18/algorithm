// tek yonlu linkedlist implementasyonu #5
#include <stdio.h>
#include <stdlib.h>

#define SIZE 20
#define true 1
#define false 0

struct Node {
  unsigned int year;
  char name[SIZE];
  struct Node *next;
};

int s_len(char *str) {
  int i = 0;
  while (str[i++] != '\0') {
  }
  return i - 1;
}

void s_cpy(char *str1, char *str2) {
  int i, len = s_len(str1);
  for (i = 0; i < len; i++) {
    str2[i] = str1[i];
  }
  str2[i] = '\0';
}

// sadece dugum olusturup atama yapacagim
struct Node *createNode(char *name, unsigned int year) {

  struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));

  s_cpy(name, newNode->name);
  newNode->year = year;
  newNode->next = NULL;
  return newNode;
}

void appendNode(struct Node **head, struct Node **tail, char *name,
                unsigned int year) {
  struct Node *newNode = createNode(name, year);
  // liste bossa
  if (*head == NULL) {
    *head = newNode;
    *tail = newNode;
  }
  // liste bos degilse
  else {
    (*tail)->next = newNode;
    *tail = newNode;
  }
}

void printNodes(struct Node *head, int isYear) {
  struct Node *tempHead = head;

  if (isYear == true) {
    while (tempHead != NULL) {
      printf("%d->", tempHead->year);
      tempHead = tempHead->next;
    }
    printf("NULL\n");
  } else if (isYear == false) {
    while (tempHead != NULL) {
      printf("%s->", tempHead->name);
      tempHead = tempHead->next;
    }
    printf("NULL\n");
  }
}

void freeNodes(struct Node *head) {
  struct Node *tempHead = NULL;

  while (head != NULL) {
    tempHead = head;
    head = head->next;
    free(tempHead);
  }
}

int main() {
  struct Node *head_1 = NULL, *tail_1 = NULL;
  struct Node *head_2 = NULL, *tail_2 = NULL;

  appendNode(&head_1, &tail_1, "Ahmet", 2002);
  appendNode(&head_1, &tail_1, "Mehmet", 1998);
  appendNode(&head_1, &tail_1, "Cafer", 1978);

  printNodes(head_1, true);
  printNodes(head_1, false);

  appendNode(&head_2, &tail_2, "Ronaldo", 1980);
  appendNode(&head_2, &tail_2, "Messi", 1985);
  appendNode(&head_2, &tail_2, "Quaresma", 1974);
  appendNode(&head_2, &tail_2, "Dybala", 1996);
  appendNode(&head_2, &tail_2, "Sabri", 1948);

  printNodes(head_2, true);
  printNodes(head_2, false);

  freeNodes(head_1);
  freeNodes(head_2);

  return 0x0;
}
