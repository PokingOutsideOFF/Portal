#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
/*/struct Node
{
    Node f*,r*;
};*/
int arr[],i=0,j=0,k,max;
void enqueue(int a)
{   if(i==max)
     {
        printf("\nOVERFLOW\n");
    }
    else
    {arr[i]=a;
    i=i+1;
    printf("\nElement inserted\n");
}
}
void dequeue()
{   if(j==i+1||i==0)
       {
            printf("\nUNDERFLOW\n");
       }
    else
    printf("\nElement removed\n");j++;
}
void display()
{
    printf("\nThe queue is:\n");
     printf("%d %d\n",j,i);
    if(i==0||i==j)
        printf("\nEMPTY\n");

    else
    {

    for(k=j;k<i;k++)
    {
        printf("%d ",arr[k]);
    }}printf("\n");
}
void main()
{   int c;
    printf("Enter size of queue ");
    scanf("%d",&max);
    while(1<2)
{printf("\n1.Add element to queue\n2.Delete element from queue\n3.Display queue\n4.Exit");
    printf("\nEnter choice: ");
    scanf("%d",&c);

    switch(c)
    {
    case 1:
        printf("Enter element to be inserted ");
        int kl;
        scanf("%d",&kl);
        enqueue(kl);
        break;
    case 2:
        dequeue();
        break;
    case 3:
        display();
        break;
    case 4:
        exit(0);
    default:
        printf("Invalid choice");
    }}
}
