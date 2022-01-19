//CODEBLOCKS
//SHREYAS SAWANT D7A 55
//Implement Graph Traversal-BFS and DFS


#include<stdio.h>
#include<stdlib.h>
#define max 7
int a[max][max],visited[max];

void DFS()
{
    int stack[max];
    int top=0,i,start;
    printf("Enter start node: ");
    scanf("%d",&start);
    printf("\nDepth-First Search: ");
    printf("%d ",start);
    visited[start]=1;
    stack[top]=start;

    while(top!=-1)
     {
         start=stack[top];
         for(i=0;i<max;i++)
            if(a[start][i] && !visited[i])
            {
                stack[++top]=i;
                printf("%d ",i);
                visited[i]=1;
                break;
            }
            if(i==max)
                top--;
     }
     printf("\n");
}
void BFS()
{
    int queue[max];
    int f=-1,r=-1,i,start;
    printf("Enter start node: ");
    scanf("%d",&start);
    queue[++r]=start;
    visited[start]=f;
    printf("\nBreadth-First Search: ");
    while(r!=f)
    {
        start=queue[++f];
        printf("%d ",start);
        for(i=0;i<max;i++)
        {
            if(a[start][i] && !visited[i])
            {
                queue[++r]=i;
                visited[i]=1;
            }
        }
    }
    printf("\n");
}


int main(){
    int choice;
    printf("\nEnter Adjacency Matrix is: \n");
    for(int i=0;i<max;i++)
    {
        for(int j=0;j<max;j++)
          {
              scanf("%d",&a[i][j]);
          }
    }
    printf("\n1.Breadth First Search\n2.Depth First Search\n\nEnter your choice: ");
    scanf("%d",&choice);

    switch(choice)
    {
        case 1:
            BFS();
            break;
        case 2:
            DFS();
            break;
        default:
            printf("INVALID");

    }
    return 0;
}

