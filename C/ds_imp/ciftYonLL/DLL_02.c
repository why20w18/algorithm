// doubly ll imp #2
#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
  int productID;
  char productName[25];

  struct Node *next;
  struct Node *prev;
} node;

int s_len(char *name) {
  int i = 0;
  while (name[i++] != '\0') {
  }
  return i - 1;
}

node *createNode(int productID, char *productName) {
  node *newNode = (node *)malloc(sizeof(node));
  if (newNode == NULL)
    return NULL;

  newNode->next = NULL;
  newNode->prev = NULL;

  int len = s_len(productName);
  for (int i = 0; i < len; i++)
    newNode->productName[i] = productName[i];

  newNode->productID = productID;

  return newNode;
}

void add_head(node **head, int productID, char *productName) {
  node *newNode = createNode(productID, productName);
  if (newNode == NULL)
    return;

  if (*head == NULL) {
    *head = newNode;
    return;
  }

  newNode->next = *head;
  (*head)->prev = newNode;
  *head = newNode;
}

void add_tail(node **head, int productID, char *productName) {
  node *newNode = createNode(productID, productName);
  if (newNode == NULL)
    return;

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

void print_flat(node *head, int isName) {
  if (head == NULL)
    return;

  node *tempHead = head;

  if (isName) {
    while (tempHead != NULL) {
      printf("%s->", tempHead->productName);
      tempHead = tempHead->next;
    }
    printf("NULL\n");
  }

  else {
    while (tempHead != NULL) {
      printf("%d->", tempHead->productID);
      tempHead = tempHead->next;
    }
    printf("NULL\n");
  }
}

void print_reve(node *head, int isName) {
  if (head == NULL)
    return;

  node *tempHead = head;

  while (tempHead->next != NULL)
    tempHead = tempHead->next;

  if (isName) {
    printf("NULL");
    while (tempHead != head->prev) {
      printf("<-%s", tempHead->productName);
      tempHead = tempHead->prev;
    }
    printf("\n");
  }

  else {
    printf("NULL");
    while (tempHead != head->prev) {
      printf("<-%d", tempHead->productID);
      tempHead = tempHead->prev;
    }
    printf("\n");
  }
}

void free_nodes(node *head) {
  if (head == NULL)
    return;
  node *tempHead = NULL;
  while (head != NULL) {
    tempHead = head;
    head = head->next;
    free(tempHead);
  }
}

void delete_head(node **head) {
  if (*head == NULL) {
    printf("delete_head : LISTE BOSTUR !\n");
    return;
  }

  node *tempHead = *head;

  if ((*head)->next == NULL) {
    *head = NULL;
    free(tempHead);
    return;
  }

  *head = (*head)->next;
  (*head)->prev = NULL;
  free(tempHead);
}

void delete_tail(node **head) {
  if (*head == NULL) {
    printf("delete_tail : LISTE BOSTUR !\n");
    return;
  }

  node *tempHead = *head;

  if ((*head)->next == NULL) {
    *head = NULL;
    free(tempHead);
    return;
  }

  while (tempHead->next != NULL)
    tempHead = tempHead->next;

  tempHead->prev->next = NULL;
  tempHead->prev = NULL;
  free(tempHead);
}

void printFlat(node *head) {
  static int cx = 0;
  cx++;
  printf("\nPRINT FLAT : %d\n", cx);
  print_flat(head, 1);
  print_flat(head, 0);
}

void printRev(node *head) {
  static int cx = 0;
  cx++;
  printf("\nPRINT REV : %d\n", cx);
  print_reve(head, 1);
  print_reve(head, 0);
}

int main() {
  node *head = NULL;

  add_head(&head, 1, "Chair");
  add_head(&head, 2, "Computer");
  add_head(&head, 6, "Disk");
  add_tail(&head, 8, "CPU");

  print_flat(head, 1);
  /*
  Disk->Computer->Chair->CPU->NULL
  */

  print_reve(head, 1);
  /*
NULL<-CPU<-Chair<-Computer<-Disk
  */

  delete_head(&head);
  printFlat(head);

  delete_head(&head);
  printFlat(head);

  delete_tail(&head);
  printFlat(head);

  // delete_tail(&head);
  delete_head(&head);
  printRev(head);

  free_nodes(head);
  return 0x0;
}
