#include <stdio.h>
#include <conio.h>
#include  <stdlib.h>
struct Node
{
    int data;
    struct Node *next;
};
struct Node *head,*tail=NULL,*ptr,*temp;

void insAtBegin(int val)
{
    ptr =(struct Node *)malloc(sizeof(struct Node *));
    if(ptr == NULL)
        printf("\nOVERFLOW\n");
    else
    {   ptr->data=val;
        ptr->next = head;
        head=ptr;
        printf("\nNode inserted\n");
    }
}
void insAtEnd(int a)
{   ptr =(struct Node *)malloc(sizeof(struct Node *));
    temp=head;

    if(temp == NULL)
    {   head=ptr;
        ptr->data=a;
    ptr->next=NULL;
printf("\nNode inserted\n");
        return;
    }

        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        ptr->data=a;
        ptr->next=NULL;
        temp->next=ptr;

       printf("\nNode inserted\n");


}

void insAfter(int a,int b)
{   int k=0;
    ptr =(struct Node *)malloc(sizeof(struct Node *));
    temp =head;
    if(temp==NULL)
    {
        printf("\nEMPTY\n");return;
    }
    while(temp->next!=NULL)
    {
        if(temp->data==b)
        {
            k=1;break;
        }
        temp=temp->next;
    }

    if(k)
    {
        ptr->next=temp->next;
        ptr->data=a;
        temp->next=ptr;
        printf("\nNode inserted\n");
    }
    else
        printf("\nNOT FOUND\n");
}
void insBefore(int a,int b)
{   struct Node *pretemp;
    temp=head;
    ptr =(struct Node *)malloc(sizeof(struct Node *));
    pretemp =(struct Node *)malloc(sizeof(struct Node *));
    if(temp==NULL)
    {
        printf("\nEmpty\n");return;
    }
    ptr->data=a;

    while(temp->data!=b)
    {   pretemp=temp;
        temp=temp->next;
    }

    ptr->next=temp;
    pretemp->next=ptr;
    printf("\nNode Inserted\n");
    return;


}
void delBegin()
{temp=head;
    if(temp==NULL)
        {printf("\nEMPTY\n");return;}
    head=temp->next;
    temp->next=NULL;

    printf("\%d deleted\n",temp->data);
    free(temp);
}
void delEnd()
{ ptr =(struct Node *)malloc(sizeof(struct Node *));
    temp=head;

    if(temp==NULL)
        {printf("\nEmpty\n");return;}
    else if(head->next==NULL)
    {
        head=NULL;
        free(head);
        printf("Only Node deleted");
        return;
    }
    while(temp->next!=NULL)
    {   ptr=temp;
        temp=temp->next;
    }
    ptr->next=NULL;
    printf("\n%d Deleted\n",temp->data);
   free(temp);

}
void delAfter(int a)
{

    temp=head;

    if(temp==NULL)
       {

        printf("\nEmpty\n");return;}

    while(temp->data!=a)
    {
        temp=temp->next;
    }
    ptr=temp->next;
    temp->next=ptr->next;

    ptr->next=NULL;
    printf("\nNode deleted\n");
    free(ptr);
}
void deletelist()
{
    temp=head;
    if(temp==NULL)
    {
        printf("\nEmpty\n");return;
    }
    while(head->next!=NULL)
    {
        head=head->next;
        //head=head->next;
        temp->next=NULL;
    }head=NULL;
    printf("Deleted the whole list");return;
}
void sort()
{int k;printf("\n");
    temp=head;
    while(temp->next!=NULL)
    {
        ptr=temp->next;
        while(ptr!=NULL)
        {
            if(temp->data>ptr->data)
            {
                k=temp->data;
                temp->data=ptr->data;
                ptr->data=k;
            }ptr=ptr->next;
        }temp=temp->next;
    }
printf("\n");
}
void listsearch(int a)
{   ptr =(struct Node *)malloc(sizeof(struct Node *));
    temp=head;
    while(temp->next!=NULL)
    { ptr=temp->next;
        if(ptr->data==a||temp->data==a)
            {printf("\nFOUND\n");
            return;}
        else
            temp=temp->next;
    }
printf("\nNOT FOUND\n");
}
void display()
{ temp =head;
    if(temp==NULL)
    {
        printf("\nThe elements are:\nEMPTY\n");
    }
    else
    {   printf("\nThe elements are:\n");
        while(temp!=NULL)
        {printf("%d ",temp->data);
            temp=temp->next;
        }

    }printf("\n");
}

int main()
{
    int choice,item,k=0;
    do
    {   printf("\n1.Insert At Beginning or Create\n2.Insert At End\n3.Insert Node after:\n4.Insert Node before:\n5.Delete From Beginning\n6.Delete From End\n7.Delete Node After:\n8.Delete entire list\n9.Search\n10 Sort\n11.Display\nEnter choice:\n");
        int c;scanf("%d",&c);
        switch(c)
        {
            case 1:
        {   if(k==0)
                printf("\nEnter Node to create List\n");
            else
            printf("\nEnter the item which you want to insert?\n");
            scanf("%d",&item);k++;
            insAtBegin(item);break;
        }
            case 2:
                {
                    printf("\nEnter the item which you want to insert?\n");
                    scanf("%d",&item);
                    insAtEnd(item);break;
                }
            case 3:
                {   int n;
                    printf("\nEnter the item which you want to insert?\n");
                    scanf("%d",&item);
                    printf("\nEnter the Node after which it is to be inserted\n");
                    scanf("%d",&n);
                    insAfter(item,n);break;

                }
            case 4:
                {   int n;
                    printf("\nEnter the item which you want to insert?\n");
                    scanf("%d",&item);
                    printf("\nEnter the Node before which it is to be inserted\n");
                    scanf("%d",&n);
                    insBefore(item,n);break;
                }
            case 5:
                {
                    delBegin();break;

                }
            case 6:
                {
                    delEnd();break;
                }
            case 7:
                {int n;

                    printf("\nEnter the Node after which it is to be deleted\n");
                    scanf("%d",&n);
                    delAfter(n);break;
                }
            case 8:
                {
                    deletelist();break;
                }
            case 9:
                {   int n;
                    printf("\nEnter the Node to be searched\n");
                    scanf("%d",&n);
                    listsearch(n);break;
                }
            case 10:
                {
                    sort();

                }
            case 11:
                {
                    display();break;
                }
                default:printf("\nInvalid choice\n");
        }
        printf("\nPress 0 to execute again ?\n");
        scanf("%d",&choice);
    }while(choice == 0);

}
