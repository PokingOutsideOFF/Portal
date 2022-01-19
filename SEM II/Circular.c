//SHREYAS SAWANT D7A 55
//Implement Circular Linked List using ADT

#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct Node *next;
};
struct node *head,*ptr,*temp;

void beginsert()
{
    struct node *ptr,*temp;
    int item;
    ptr = (struct node *)malloc(sizeof(struct node));
    if(ptr == NULL)
    {
        printf("\nOVERFLOW\n");
    }
    else
    {
        printf("\nEnter the node data\n");
        scanf("%d",&item);
        ptr -> data = item;
        if(head == NULL)
        {
            head = ptr;
            ptr -> next = head;
        }
        else
        {
            temp = head;
            while(temp->next != head)
                temp = temp->next;
            ptr->next = head;
            temp -> next = ptr;
            head = ptr;
        }
        printf("\nNode inserted\n");
    }

}
void lastinsert()
{
    struct node *ptr,*temp;
    int item;
    ptr = (struct node *)malloc(sizeof(struct node));
    if(ptr == NULL)
    {
        printf("\nOVERFLOW\n");
    }
    else
    {
        printf("\nEnter Data\n");
        scanf("%d",&item);
        ptr->data = item;
        if(head == NULL)
        {
            head = ptr;
            ptr -> next = head;
        }
        else
        {
            temp = head;
            while(temp -> next != head)
            {
                temp = temp -> next;
            }
            temp -> next = ptr;
            ptr -> next = head;
        }

        printf("\nNode inserted\n");
    }

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

void begin_delete()
{
    struct node *ptr;
    if(head == NULL)
    {
        printf("\nUNDERFLOW\n");
    }
    else if(head->next == head)
    {
        head = NULL;
        free(head);
        printf("\nNode deleted\n");
    }

    else
    {   ptr = head;
        while(ptr -> next != head)
            ptr = ptr -> next;
        ptr->next = head->next;
        free(head);
        head = ptr->next;
        printf("\nNode deleted\n");

    }
}
void last_delete()
{
    struct node *ptr, *preptr;
    if(head==NULL)
    {
        printf("\nUNDERFLOW\n");
    }
    else if (head ->next == head)
    {
        head = NULL;
        free(head);
        printf("\nNode deleted\n");

    }
    else
    {
        ptr = head;
        while(ptr ->next != head)
        {
            preptr=ptr;
            ptr = ptr->next;
        }
        preptr->next = ptr -> next;
        free(ptr);
        printf("\nNode deleted\n");

    }
}

void search()
{
    struct node *ptr;
    int item,i=0,flag=1;
    ptr = head;temp=ptr->next;
    if(ptr == NULL)
    {
        printf("\nEmpty List\n");
    }
    else
    {
        printf("\nEnter item which you want to search\n");
        scanf("%d",&item);
        if(head ->data == item)
        {
        printf("\nItem found at location %d\n",i+1);
        flag=0;
        }
        else
        {
        while (ptr->next != head)
        {
            if(ptr->data == item)
            {
                printf("\nItem found at location %d\n ",i+1);
                flag=0;
                break;
            }
            else
            {
                flag=1;
            }
            i++;
            ptr = ptr -> next;

        }
        }
        if(ptr->data==item)
        {
             printf("\nItem found at location %d\n ",i+1);flag=0;
        }
        if(flag != 0)
        {
            printf("Item not found\n");
        }
    }

}

void display()
{
    struct node *ptr;
    ptr=head;
    if(head == NULL)
    {
        printf("\nEMPTY");return;
    }
    else
    {
        printf("\nElements of list \n");

        while(ptr->next!= head)
        {

            printf("%d ", ptr -> data);
            ptr = ptr -> next;
        }
        printf("%d ", ptr -> data);
    }printf("\n");

}


void main ()
{
    int choice =0,item;
    while(choice != 7)
    {

        printf("\n1.Insert in beginning or Create List\n2.Insert at last\n3.Insert after a Node\n4.Delete from Beginning\n5.Delete from last\n6.Search for an element\n7.Show\n8.Exit\n");
        printf("\nEnter your choice?\n");
        scanf("\n%d",&choice);
        switch(choice)
        {
            case 1:
            beginsert();
            break;
            case 2:
            lastinsert();
            break;
            case 3:
            {

            int n;
            printf("\nEnter the item which you want to insert?\n");
            scanf("%d",&item);
            printf("\nEnter the Node after which it is to be inserted\n");
            scanf("%d",&n);
            insAfter(item,n);break;
            }
            case 4:
            begin_delete();
            break;
            case 5:
            last_delete();
            break;
            case 6:
            search();
            break;
            case 7:
            {display();
            break;}
            case 8:
            exit(0);
            break;
            default:
            printf("Please enter valid choice..");
        }
    }
}
