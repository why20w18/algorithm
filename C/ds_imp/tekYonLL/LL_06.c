// tek yonlu linkedlist implementasyonu #6
#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
  int productID;
  char *productName;
  struct Node *next;
} node;

int s_len(char *str) {
  int i = 0;
  while (str[i++] != '\0') {
  }
  return i - 1;
}

node *createNode(int productID, char *productName) {
  node *newNode = (node *)malloc(sizeof(node));
  newNode->productID = productID;

  int len = s_len(productName);
  newNode->productName = (char *)malloc(sizeof(char) * (len + 1));

  for (int i = 0; i < len; i++)
    newNode->productName[i] = productName[i];

  newNode->productName[len] = '\0';
  newNode->next = NULL;

  return newNode;
}

void addNodeAtHead(node **head, int productID, char *productName) {
  node *newNode = createNode(productID, productName);

  // liste bossa
  if (*head == NULL) {
    *head = newNode;
    return;
  }

  // liste bos degilse
  newNode->next = *head;
  *head = newNode;
}

void addNodeAtTail(node **head, int productID, char *productName) {
  node *newNode = createNode(productID, productName);

  // liste bossa
  if (*head == NULL) {
    *head = newNode;
    return;
  }

  // liste bos degilse
  node *tempHead = *head;

  while (tempHead->next != NULL) {
    tempHead = tempHead->next;
  }

  tempHead->next = newNode;
}

void deleteHead(node **head) {
  if (*head == NULL)
    return;

  node *tempHead = *head;
  *head = (*head)->next;

  printf("DELHEAD:%d , %s\n", tempHead->productID, tempHead->productName);

  free(tempHead->productName);
  free(tempHead);
}

void deleteTail(node *head) {
  if (head == NULL)
    return;

  node *tempHead = head;
  node *tempPrev = NULL;

  while (tempHead->next != NULL) {
    tempPrev = tempHead;
    tempHead = tempHead->next;
  }

  tempPrev->next = NULL;

  printf("DELTAIL:%d , %s\n", tempHead->productID, tempHead->productName);

  free(tempHead->productName);
  free(tempHead);
}

void printNodes(node *head) {
  node *tempHead = head;

  while (tempHead != NULL) {
    printf("%d-%s->", tempHead->productID, tempHead->productName);
    tempHead = tempHead->next;
  }
  printf("NULL\n");
}

void freeNodes(node *head) {
  node *tempHead = NULL;

  while (head != NULL) {
    tempHead = head;
    head = head->next;
    free(tempHead->productName);
    free(tempHead);
  }
}

int main() {
  node *head = NULL;
  node **head_1_addr = &head;

  addNodeAtHead(head_1_addr, 13, "CPU");
  addNodeAtHead(head_1_addr, 14, "GPU");
  addNodeAtHead(head_1_addr, 15, "TPU");
  addNodeAtTail(head_1_addr, 37, "PSU");

  deleteHead(&head);
  deleteTail(head);

  printNodes(head);
  freeNodes(head);

  return 0x0;
}
