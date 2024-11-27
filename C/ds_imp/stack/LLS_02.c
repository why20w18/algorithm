// stack implementasyonu linkedlist #2
#include <stdio.h>
#include <stdlib.h>

typedef struct Nodes {
  int argc;
  char funcName[25];
  struct Nodes *next;
} node;

void push(node **head, int argc, char *funcName) {
  node *newNode = (node *)malloc(sizeof(node));
  if (newNode == NULL) {
    printf("memory allocate err!\n");
    return;
  }

  if (funcName == NULL || argc < 0)
    return;
  newNode->argc = argc;

  int i;
  for (i = 0; i < 10; i++)
    newNode->funcName[i] = funcName[i];
  newNode->funcName[i] = '\0';

  newNode->next = *head;
  *head = newNode;
}

int pop(node **head) {
  if (*head == NULL)
    return -1;

  node *tempHead = *head;
  int delVal = tempHead->argc;
  *head = (*head)->next;
  free(tempHead);
  return delVal;
}

int peekArgc(node *head) {
  if (head == NULL)
    return -1;
  return head->argc;
}

char *peekFuncName(node *head) {
  if (head == NULL)
    return NULL;
  return head->funcName;
}

void printStack(node *head) {
  while (head != NULL) {
    printf("%d-%s\n", head->argc, head->funcName);
    head = head->next;
  }
  printf("\n");
}

void freeStack(node *head) {
  node *tempHead = NULL;
  while (head != NULL) {
    tempHead = head;
    head = head->next;
    free(tempHead);
  }
}

int main() {
  node *stack_1 = NULL;
  push(&stack_1, 3, "qud22.exe");
  push(&stack_1, 8, "qud24.exe");
  push(&stack_1, 12, "qud28.exe");
  push(&stack_1, 10, "qud29.exe");

  printStack(stack_1);
  pop(&stack_1);
  printStack(stack_1);
  printf("peek_argc : %d\n", peekArgc(stack_1));
  printf("peek_func : %s\n", peekFuncName(stack_1));

  freeStack(stack_1);
  return 0x0;
}
