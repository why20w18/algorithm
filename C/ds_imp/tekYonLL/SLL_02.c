// tek yonlu linkedlist implementasyonu #2
#include <stdio.h>
#include <stdlib.h>

struct Node {
  int data;
  struct Node *next;
};

// listenin ilk dugumunu ve son dugumunu gosteren pointerlar
struct Node *head = NULL;
// struct Node *tail = NULL;

struct Node *createNode(int data) {
  struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
  if (newNode == NULL) {
    printf("\nBELLEK TAHSIS HATA!\n");
    return NULL;
  }

  newNode->data = data;
  newNode->next = NULL;

  // ilk dugum
  if (head == NULL) {
    head = newNode;
    // tail = newNode; // tail sadece liste sonunu tutacak time complexity
    // dusurmek icin
  }
  // ilk dugum degilse sona kadar git ve ekle
  else {
    struct Node *tempHead = head;
    while (tempHead->next != NULL)
      tempHead = tempHead->next;
    tempHead->next = newNode;
  }

  return newNode;
}

void printList() {
  if (head == NULL) {
    printf("\nLISTE BOSTUR\n");
    return;
  }
  struct Node *tempHead = head;
  while (tempHead != NULL) {
    printf("%d->", tempHead->data);
    tempHead = tempHead->next;
  }
  printf("NULL\n");
}

void freeList() {
  struct Node *tempHead;
  if (head == NULL) {
    printf("\nLISTE BOSTUR!\n");
    return;
  }
  while (head != NULL) {
    tempHead = head;
    head = head->next;
    free(tempHead);
  }
}

void initFast(struct Node **arrNodeAddr, int *arr, int s) {
  for (int i = 0; i < s; i++) {
    arrNodeAddr[i] = createNode(arr[i]);
  }
}

int main() {
  int arr[] = {10, 20, 30, 60, 80, 150, 900, 1800, 76, 1337};
  int s = sizeof(arr) / sizeof(arr[0]);
  printf("s  = %d\n", s);

  struct Node *arrNodeAddr[s];

  initFast(arrNodeAddr, arr, s);
  printList();

  printf("3.DUGUME ERISIM : %d\n", arrNodeAddr[2]->data);
  printf("4.DUGUME ERISIM : %d\n", (*(arrNodeAddr + 3))->data);

  freeList();

  return 0x0;
}
