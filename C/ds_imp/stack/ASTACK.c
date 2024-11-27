// stack implementasyonu array ile
#include <stdio.h>

#define SIZE 8

typedef struct STACK {
  int data[SIZE];
  int top;
} stack;

void initStack(stack *s) { s->top = -1; }
int isEmpty(stack *s) { return s->top == -1; }
int isFull(stack *s) { return s->top == SIZE - 1; }

void push(stack *s, int d) {
  if (isFull(s) == 1) {
    printf("stack is full !\n");
    return;
  }
  s->data[++s->top] = d;
}

int pop(stack *s) {
  if (isEmpty(s) == 1) {
    printf("stack is empty !\n");
    return -1;
  }

  return s->data[s->top--];
}

int peek(stack *s) {
  if (isEmpty(s)) {
    printf("stack is empty !\n");
    return -1;
  }
  return s->data[s->top];
}

void printStack(stack *s) {
  if (isEmpty(s)) {
    printf("stack is empty !\n");
    return;
  }

  for (int i = 0; i <= s->top; i++) {
    printf("|%d", s->data[i]);
  }
  printf("|\n");
}

int main() {
  stack Stack_1;
  stack *s = &Stack_1;
  initStack(s);

  push(s, 10);
  push(s, 20);
  push(s, 30);
  push(s, 40);
  push(s, 50);
  printStack(s);
  int del_1 = pop(s);
  printStack(s);

  printf("peek : %d\npop val : %d\n", peek(s), del_1);

  return 0x0;
}
