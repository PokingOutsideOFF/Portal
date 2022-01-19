//SHREYAS SAWANT 55 D7A
//To perform Restoring Division Algorithm

#include<conio.h>
#include<stdio.h>
#include<math.h>
#define size 5


int A[size];//Accumulator
int Ad[size];
int M[size];//Divisor
int Q[4];//Dividend
int n=size-1,C[size];//Complement of Divisor
int a,b,t;

void lbs()  //To perform Left Bit Shift
{
    for(int i=0;i<size;i++)
    {
        A[i]=A[i+1];
    }
    A[n]=Q[n-1];
    for(int i=n-1;i>0;i--)
    {
        Q[i]=Q[i-1];
    }
    printf("\n\n\nIteration %d",n-t+1);
    printf("\nAfter left shift");
    printf("\nA: ");
    for(int i=0;i<size;i++)
        printf("%d ",A[i]);
     printf("\nQ: ");
    for(int i=n-1;i>0;i--)
        printf("%d ",Q[i]);
}

void bitcoin()  //To convert to binary
{
    int t=size,i=0,j=0,r1,r2;
    while(t!=0)
    {
        r1=b%2;
        r2=a%2;
        Q[i]=r1;
        M[j]=r2;

        a/=2;
        b/=2;
        if(i<n)
            i++;
        j++;
        t--;
    }
}
void complement()   //To get 2's complement of M
{   int c=1;
    for(int i=n;i>-1;i--)
    {
        if(M[i]==1)
            C[i]=0;
        else
            C[i]=1;
    }

    for(int i=0;i<size;i++)
    {
        if(C[i]+c==2)
        {
            C[i]=0,c=1;
        }
        else
        {
            C[i]=1;break;
        }
    }
    printf("\n2's Complement of Divisor: ");
    for(int i=n;i>-1;i--)
    printf("%d ",C[i]);
    printf("\n\n");
}

void recover()  //To store copy of A,later to be used in recovering A
{
    for(int i=0;i<size;i++)
    {
        A[i]=Ad[i];
    }
    printf("Since MSB of A is 1");
    printf("\nRestored A: ");
    for(int i=0;i<size;i++)
        {printf("%d ",A[i]);}
    printf("\nNew Q: ");
    for(int i=n-1;i>-1;i--)
        {printf("%d ",Q[i]);}
        printf("\n\n");
}
void add()      //To perform A-M
{
    int c=0;
    for(int i=0;i<size;i++)
    {
        Ad[i]=A[i];
    }
    for(int i=0;i<size;i++)
    {
        if(C[i]+A[n-i]+c==2)
        {
            A[n-i]=0;c=1;
        }
        else if(C[i]+A[n-i]+c==3)
        {
            A[n-i]=1;c=1;
        }
        else if(C[i]+A[n-i]+c==1)
        {
            A[n-i]=1;c=0;
        }
        else
        {
            A[n-i]=0;c=0;
        }
    }
    printf("\n\nPerforming A-M");
    printf("\nA-M= ");
    for(int i=0;i<size;i++)
        printf("%d ",A[i]);
    printf("\n\n");
}


void rda()  //To iterate and perform the algorithm
{   t=n;
    lbs();
    while(t!=0)
    {
        add();
        if(A[0]==1)
         {
             Q[0]=0;
             recover();
         }
         else
         {  printf("Since MSB of A is 0");
            printf("\nA: ");
            for(int i=0;i<size;i++)
            {
                printf("%d ",A[i]);
            }
             Q[0]=1;
             printf("\nNew Q: ");
            for(int i=n-1;i>-1;i--)
            {printf("%d ",Q[i]);}
            printf("\n\n");
         }
        t--;
        if(t!=0)
            lbs();
    }

}
int main()
{
    printf("Enter positive numbers less than 16");

    printf("\nEnter dividend ");
    scanf("%d",&b);
    printf("Enter divisor ");
    scanf("%d",&a);
    if(a==0)
    {
        printf("\nINVALID\n");return 0;
    }
    bitcoin();

    printf("\nDividend (Q) in binary is: ");
    for(int i=n-1;i>=0;i--)
        printf("%d ",Q[i]);

    printf("\n\nDivisor (M) in binary is: ");
    for(int i=n;i>=0;i--)
        printf("%d ",M[i]);

    printf("\n\nAccumulator (A) : ");
    for(int i=0;i<size;i++)
        printf("%d ",A[i]);

    printf("\n");
    complement();
    rda();
    int c=0;
    printf("\n\nQUOTIENT:  ");
    for(int i=n-1;i>=0;i--)
    {
        printf("%d ",Q[i]);
        c+=(int)pow(2,n-1-i)*Q[n-1-i];
    }
    printf("= %d",c);
    c=0;
    printf("\nREMAINDER: ");
    for(int i=0;i<size;i++)
    {
        printf("%d ",A[i]);
        c+=(int)(pow(2,i)*A[n-i]);
    }
    printf("= %d",c);
    printf("\n\n");

}




