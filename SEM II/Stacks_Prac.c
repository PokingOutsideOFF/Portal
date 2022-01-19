#include <stdio.h>
#include <stdlib.h>
int top=-1,a;
int s[1000];
void push(int c)
{
    if(top==a-1)
    {
        printf("OVERFLOW\n");
    }
    else
    {
        top++;s[top]=c;
    }
}
void pop()
{
    if(top==-1)
    {
        printf("UNDERFLOW\n");
    }
    else
    {

        printf("Popped element is: %d\n",s[top]);top--;

    }
}
void peek()
{
    if(top==-1)
    {
        printf("NO ELEMENTS\n");
    }
    else
        printf("The top element is: %d\n",s[top]);
}

void display()
{   if(top==-1)
    {
        printf("STACK IS EMPTY\n");
    }
    else
    {printf("Stack elements are:\n");
    for(int i=top;i>-1;i--)
    {
        printf("%d\n",s[i]);
    }}
}
void main()
{
    printf("Enter size of stack ");

    scanf("%d",&a); int s[a];
    while(1){
    printf("\n1.Push\n2.Pop\n3.Peek\n4.Display elements of stack\n5.Exit\n\n");
    int n;
    scanf("%d",&n);


    switch(n)
     {


     case 1:
         {
            printf("Enter element to be pushed ");
            int t;
            scanf("%d",&t);
            push(t);break;
         }
     case 2: pop();break;
     case 3: peek();break;
     case 4: display();break;
     case 5: exit(1);
     default: printf("Incorrect choice\n");
     }
    }
 }

