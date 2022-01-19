//SHREYAS SAWANT D7A 55
//Postfix Expression using Stack ADT

#include <stdio.h>
#include <ctype.h>
#include <math.h>
#define Size 100

int stack[Size];
int top = -1;

void push(int item)
{
    if (top == Size - 1) {
        printf("Stack over flow");
        return;
    }
    else {
        top++;
        stack[top] = item;
    }
}

int pop()
{
    int item;
    if (top < 0) {
        printf("Stack under flow");
    }
    else {
        item = stack[top];
        top--;
        return item;
    }
}

void EvalPostfix(char postfix[])
{

    int i;
    char ch;
    int val;
    int A, B;


    for (i = 0; postfix[i] != ')'; i++) {
        ch = postfix[i];
        if (isdigit(ch)) {
            push(ch - '0');
        }
        else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            A = pop();
            B = pop();
            switch (ch)
            {
            case '*':
                val = B * A;
                break;

            case '/':
                val = B / A;
                break;

            case '+':
                val = B + A;
                break;

            case '-':
                val = B - A;
                break;
            }
            push(val);
        }
    }
    printf("\nResult of expression evaluation : %d \n", pop());
}
int main()
{

    int i;


    char postfix[Size];
    printf(" \nEnter postfix expression,\nPress right parenthesis ')' for end expression : ");



    for (i = 0; i <= Size-1; i++) {
        scanf("%c", &postfix[i]);

        if (postfix[i] == ')')
        {
            break;
        }
    }
    EvalPostfix(postfix);

    return 0;
}
