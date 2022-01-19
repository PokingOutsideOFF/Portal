//CODEBLOCKS
//SHREYAS SAWANT D7A 55
//Implement linear queue using array

#include <stdio.h>
#include <stdlib.h>


void insert();
void del();
void display();
void peek();
int MAX;
int qrray[1000];
int rear=-1;
int front=-1;
int main()
{
    int choice;
    printf("Enter size of queue: ");
    scanf("%d",&MAX);
    int qrray[MAX];

    while (1)
    {
        printf("\n1.Insert element to queue \n2.Delete element from queue \n3.Peek\n4.Display all elements of queue \n5.Quit\nEnter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
            case 1:
                insert();
                break;
            case 2:
                del();
                break;
            case 3:
                peek();
                break;
            case 4:
                display();
                break;
            case 5:
                exit(1);
            default:
                printf("Wrong choice \n");
        }
    }
}

void insert()
{
    int a;
    if (rear==MAX-1)
        printf("\nQueue Overflow\n ");
    else
    {
        if (front==-1)
            front=0;
        printf("\nInsert the element in queue : ");
        scanf("%d",&a);
        rear=rear+1;
        qrray[rear]=a;
    }
}

void del()
{
    if (front==-1||front>rear)
    {
        printf("\nQueue Underflow\n ");
        return ;
    }
    else
    {
        printf("\nElement deleted from queue is : %d\n",qrray[front]);
        front=front+1;
    }
}

void peek()
{
    printf("\nThe front element of queue is: %d\n",qrray[front]);
}
void display()
{
    int i;
    if (front==-1)
        printf("\nQueue is empty\n ");
    else
    {
        printf("\nQueue is : \n");
        for (i=front;i<=rear;i++)
            printf("%d ",qrray[i]);
        printf("\n");
    }
}
