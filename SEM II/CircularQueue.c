//CODEBLOCKS
//SHREYAS SAWANT D7A 55
//Implement circular queue using array


#include <stdio.h>
#include <stdlib.h>

int max;
int qrray[1000];
int front=-1;
int rear=-1;

void enqueue(int a)
{
    if(front==-1 && rear==-1)
    {
        front=0;
        rear=0;
        qrray[rear]=a;
    }
    else if((rear+1)%max==front)
    {
        printf("\nQueue Overflow\n");
    }
    else
    {
        rear=(rear+1)%max;
        qrray[rear]=a;
    }
}

int dequeue()
{
    if((front==-1)&&(rear==-1)
    {
        printf("\nQueue Underflow\n");
    }
    else if(front==rear)
    {
        printf("\nThe dequeued element is %d", qrray[front]);
        front=-1;
        rear=-1;
    }
    else
    {
        printf("\nThe dequeued element is %d\n", qrray[front]);
        front=(front+1)%max;
    }
}

void display()
{
    int i=front;
    if(front==-1 && rear==-1)
    {
        printf("\nQueue is empty\n");
    }
    else
    {
        printf("\nElements in a Queue are: ");
         for (i=front; i!=rear;i=(i+1)%max)
        {
            printf("%d ", qrray[i]);
        }
         printf("%d \n", qrray[rear]);

    }
}
int main()
{
    int choice=1,x;
    printf("Enter size of circular array ");
    scanf("%d",&max);
    int qrray[max];
    while(1)
    {
        printf("\n1.Insert element to queue \n2.Delete element from queue \n3.Display all elements of queue \n4.Quit\nEnter your choice: ");
        scanf("%d", &choice);

        switch(choice)
        {
            case 1:
                printf("\nEnter the element which is to be inserted ");
                scanf("%d", &x);
                enqueue(x);
                break;
            case 2:
                dequeue();
                break;
            case 3:
                display();
                break;
            case 4:
                exit(1);
            default:
                printf("\nINVALID\n");
        }
    }
    return 0;
}
