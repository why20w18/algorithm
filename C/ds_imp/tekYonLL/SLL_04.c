// tek yonlu linkedList implementasyonu #4
#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
  char name[15];
  int age;
  struct Node *next;
} node;

node *head = NULL;

int s_len(char *str) {
  int i = 0;
  while (str[i++] != '\0') {
  }
  return i - 1;
}

void s_cpy(char *str1_s, char *str2) {
  int len2 = s_len(str2);
  int i;

  for (i = 0; i < len2; i++) {
    str1_s[i] = str2[i];
  }
  str1_s[i] = '\0';
}

node *createNode(char *name, int age) {
  node *newNode = (node *)malloc(sizeof(node));

  s_cpy(newNode->name, name);
  newNode->age = age;
  newNode->next = NULL;

  if (head == NULL) {
    head = newNode;
  } else {
    node *tempHead = head;
    while (tempHead->next != NULL)
      tempHead = tempHead->next;
    tempHead->next = newNode;
  }

  return newNode;
}

void printList(int isAge) {
  if (head == NULL)
    return;

  node *tempHead = head;
  if (isAge) {
    while (tempHead != NULL) {
      printf("%d->", tempHead->age);
      tempHead = tempHead->next;
    }
    printf("NULL\n");
  }
  if (!isAge) {
    while (tempHead != NULL) {
      printf("%s->", tempHead->name);
      tempHead = tempHead->next;
    }
    printf("NULL\n");
  }
}

int isBlank() {
  if (head == NULL)
    return 1;
  else
    return 0;
}

void freeList() {
  if (head == NULL)
    return;

  node *tempHead = NULL;
  while (head != NULL) {
    tempHead = head;
    head = head->next;
    free(tempHead);
  }
}

int main() {
  createNode("Alican", 12);
  createNode("Velican", 15);
  createNode("Mehmet", 13);
  createNode("Mustafa", 37);

  printList(1);
  printList(0);

  freeList();
  printf("isBlank %d\n", isBlank());

  return 0x0;
}
