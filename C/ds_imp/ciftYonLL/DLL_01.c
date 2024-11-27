// doubly linkedlist implementasyonu #2
#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
  int data;
  struct Node *next;
  struct Node *prev;
} node;

node *createNode(int data) {
  node *newNode = (node *)malloc(sizeof(node));
  newNode->data = data;
  newNode->next = NULL;
  newNode->prev = NULL;
  return newNode;
}

void add_head(node **head, int data) {
  node *newNode = createNode(data);

  if (*head == NULL) {
    *head = newNode;
    return;
  }

  node *tempHead = *head;

  newNode->next = tempHead;
  tempHead->prev = newNode;
  *head = newNode;
}

void add_tail(node **head, int data) {
  node *newNode = createNode(data);

  if (*head == NULL) {
    *head = newNode;
    return;
  }

  node *tempHead = *head;

  while (tempHead->next != NULL)
    tempHead = tempHead->next;

  tempHead->next = newNode;
  newNode->prev = tempHead;
}

void print_flat(node *head) {
  if (head == NULL) {
    printf("print_flat : LISTE BOSTUR\n");
    return;
  }

  node *tempHead = head;
  while (tempHead != NULL) {
    printf("%d->", tempHead->data);
    tempHead = tempHead->next;
  }
  printf("NULL\n");
}

void print_rev(node *head) {
  if (head == NULL) {
    printf("print_rev : LISTE BOSTUR\n");
    return;
  }

  node *tempHead = head;

  while (tempHead->next != NULL)
    tempHead = tempHead->next;

  printf("NULL");
  while (tempHead != head->prev) {
    printf("<-%d", tempHead->data);
    tempHead = tempHead->prev;
  }
  printf("\n");
}

void freeNodes(node *head) {
  if (head == NULL) {
    printf("<freeNodes : LISTE BOSTUR !\n");
    return;
  }
  node *tempHead = NULL;
  while (head != NULL) {
    tempHead = head;
    head = head->next;
    free(tempHead);
  }
}

void delete_head(node **head) {
  if (*head == NULL) {
    printf(">>delete_head : LISTE BOSTUR!\n");
    return;
  }

  node *tempHead = *head;

  if (tempHead->next == NULL) {
    *head = NULL;
    printf(">>delete_head : SILINEN %d\n", tempHead->data);
    free(tempHead);
    return;
  }

  (*head) = (*head)->next;
  (*head)->prev = NULL;

  printf(">>delete_head : SILINEN %d\n", tempHead->data);
  free(tempHead);
}

void delete_tail(node **head) {
  if (*head == NULL) {
    printf(">delete_tail : LISTE BOSTUR!\n");
    return;
  }

  node *tempHead = *head;

  if (tempHead->next == NULL) {
    *head = NULL;
    printf(">delete_tail : SILINEN %d\n", tempHead->data);
    free(tempHead);
    return;
  }

  while (tempHead->next != NULL)
    tempHead = tempHead->next;

  tempHead->prev->next = NULL;
  tempHead->prev = NULL;

  printf(">delete_tail : SILINEN %d\n", tempHead->data);
  free(tempHead);
}

int main() {
  node *head = NULL;

  add_head(&head, 40);
  add_head(&head, 30);
  add_head(&head, 20);
  add_head(&head, 10);
  add_tail(&head, 50);

  print_flat(head);
  print_rev(head);

  delete_head(&head);
  print_flat(head);

  delete_head(&head);
  print_flat(head);

  delete_tail(&head);
  print_flat(head);

  delete_tail(&head);
  print_flat(head);

  delete_head(&head);
  print_flat(head);
  print_rev(head);

  freeNodes(head);
  return 0x0;
}
