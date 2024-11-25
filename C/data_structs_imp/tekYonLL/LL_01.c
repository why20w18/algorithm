// tek yonlu linkedlist implementasyonu #1
#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
  int data;
  struct Node *next;
} node;

node *createNode(int data);
void addNode(node **head, int data);
void printList(node *head);
void freeList(node *head);

int main() {
  node *head = NULL;
  node **p_head = &head;

  printList(*p_head);

  addNode(p_head, 10);
  addNode(p_head, 20);
  addNode(p_head, 30);
  addNode(p_head, 40);
  addNode(p_head, 50);
  addNode(p_head, 60);

  printList(*p_head);
  freeList(*p_head);

  return 0x0;
}

node *createNode(int data) {
  node *newNode = (node *)malloc(sizeof(node));
  newNode->data = data;
  newNode->next = NULL;
  return newNode;
}

void addNode(node **p_head, int data) {
  node *newNode = createNode(data);
  // linkedlist bossa
  if (*p_head == NULL) {
    *p_head = newNode;
    return;
  }

  // bos degilse sona kadar git ekle
  node *tempHead = *p_head;

  while (tempHead->next != NULL)
    tempHead = tempHead->next;

  tempHead->next = newNode;
}

void printList(node *head) {
  static int count = 0;
  count++;
  printf("\n%d.PRINTLIST:\n", count);
  if (head == NULL) {
    printf("linkedlist BOSTUR!\n");
    return;
  }
  node *tempHead = head;
  while (tempHead->next != NULL) {
    printf("%d->", tempHead->data);
    tempHead = tempHead->next;
  }
  printf("NULL\n");
}

void freeList(node *head) {
  node *tempHead;
  // son nodeyide almasi icin
  while (head != NULL) {
    tempHead = head;
    head = head->next;
    free(tempHead);
  }
}
