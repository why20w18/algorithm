// linkedlist implementasyonu #3
#include <stdio.h>
#include <stdlib.h>

#define true 1
#define false 0

struct Node {
  int data;
  struct Node *next;
};

struct Node *head = NULL;
struct Node *tail = NULL;

struct Node *createNode(int data) {
  struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));

  newNode->data = data;
  newNode->next = NULL;

  // listem bossa
  if (head == NULL) {
    head = newNode;
    tail = newNode;
  }
  // listem  bos degilse
  else {
    tail->next = newNode;
    tail = newNode;
  }

  return newNode;
}

void printList() {
  static int count = 0;
  count++;
  printf("%d.PRINTLIST:\n", count);

  if (head == NULL) {
    printf("LISTE BOSTUR!\n");
    return;
  }

  struct Node *tempHead = head;
  while (tempHead != tail->next) {
    printf("%d->", tempHead->data);
    tempHead = tempHead->next;
  }
  printf("NULL\n\n");
}

void freeList() {
  if (head == NULL) {
    printf("LISTE BOSTUR!\n");
    return;
  }
  struct Node *tempHead;
  while (head != NULL) {
    tempHead = head;
    head = head->next;
    free(tempHead);
  }
}

void rPrintList() {
  struct Node *tempTail = tail;

  printf("NULL<-");
  while (tempTail >= head) {
    printf("%d<-", tempTail->data);
    tempTail -= 2;
  }
  printf("\n");
}

int isBlank() {
  if (head == NULL)
    return true;
  else
    return false;
}

int searchInNode();

int main() {

  for (int i = 0; i < 15; i++)
    createNode(i);

  printList();
  printf("isBlank = %d\n\n", isBlank());

  rPrintList();
  printf("isBlank = %d\n\n", isBlank());

  freeList();
  printList();

  printf("isBlank = %d\n\n", isBlank());
  return 0x0;
}
