// linked list stack implementasyonu #1
#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
  int data;
  struct Node *next;
} node;

void push(node **head, int data) {
  node *newNode = (node *)malloc(sizeof(node));

  newNode->data = data;
  newNode->next = *head;
  *head = newNode;
}

int pop(node **head) {
  if (*head == NULL)
    return -1;

  node *tempHead = *head;
  int delVal = tempHead->data;

  *head = (*head)->next;
  free(tempHead);

  return delVal;
}

int peek(node *head) {
  if (head == NULL)
    return -1;
  return head->data;
}

void printStack(node *head) {
  if (head == NULL)
    return;

  while (head != NULL) {
    printf("|%d", head->data);
    head = head->next;
  }
  printf("|\n");
}

void freeNodes(node *head) {
  node *tempHead = NULL;
  while (head != NULL) {
    tempHead = head;
    head = head->next;
    free(tempHead);
  }
}

int main() {
  node *stackHead = NULL;
  push(&stackHead, 10);
  push(&stackHead, 20);
  push(&stackHead, 30);
  push(&stackHead, 40);
  push(&stackHead, 50);

  printStack(stackHead);
  printf("\n");

  int del_val = pop(&stackHead);
  printStack(stackHead);

  printf("\n\npop : %d\npeek : %d\n", del_val, peek(stackHead));

  freeNodes(stackHead);
  return 0x0;
}
