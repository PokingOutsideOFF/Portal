//SHREYAS SAWANT D7A 55
//Implement Booth's Algorithm

#include <stdio.h>
#include <math.h>

int a = 0,b = 0, c = 0, a1 = 0, b1 = 0, com[5] = { 1, 0, 0, 0, 0};
int Q[5] = {0}, Q1[5] = {0}, M[5] = {0},M1[5] = {0};
int acomp[5] = {0}, pro[5] = {0}, res[5] = {0},k=5;

void binary()
{
     a1 = fabs(a);
     b1 = fabs(b);
     int r, r2, i, temp;
     for (i = 0; i < 5; i++){
           r = a1 % 2;
           a1 = a1 / 2;
           r2 = b1 % 2;
           b1 = b1 / 2;
           Q[i] = r;
           Q1[i] = r;
           M[i] = r2;
           if(r2 == 0){
                M1[i] = 1;
           }
           if(r == 0){
                acomp[i] =1;
           }
     }

   c = 0;
   for ( i = 0; i < 5; i++){
           res[i] = com[i]+ M1[i] + c;
           if(res[i] >= 2)
            {
                c = 1;
           }
           else
                c = 0;
           res[i] = res[i] % 2;
     }
   for (i = 4; i >= 0; i--){
     M1[i] = res[i];
   }

   if (a < 0){
      c = 0;
     for (i = 4; i >= 0; i--){
           res[i] = 0;
     }
     for ( i = 0; i < 5; i++){
           res[i] = com[i] + acomp[i] + c;
           if (res[i] >= 2){
                c = 1;
           }
           else
                c = 0;
           res[i] = res[i]%2;
     }
     for (i = 4; i >= 0; i--){
           Q[i] = res[i];
           Q1[i] = res[i];
     }

   }
   if(b < 0){
     for (i = 0; i < 5; i++){
           temp = M[i];
           M[i] = M1[i];
           M1[i] = temp;
     }
   }
}
void add(int num[]){
    int i;
    c = 0;
    for ( i = 0; i < 5; i++){
           res[i] = pro[i] + num[i] + c;
           if (res[i] >= 2){
                c = 1;
           }
           else{
                c = 0;
           }
           res[i] = res[i]%2;
     }
     for (i = 4; i >= 0; i--){
         pro[i] = res[i];

     }


}
void arshift(){
    int temp = pro[4], temp2 = pro[0], i;
    for (i = 1; i < 5  ; i++){
       pro[i-1] = pro[i];
    }
    pro[4] = temp;
    for (i = 1; i < 5  ; i++){
        Q1[i-1] = Q1[i];
    }
    Q1[4] = temp2;
    printf("\nAfter pass %d\nA: ",k);
    for (i = 4; i >= 0; i--){
        printf("%d",pro[i]);
    }
    printf("\nQ: ");
    for(i = 4; i >= 0; i--){
        printf("%d", Q1[i]);
    }

    k--;
}

void main(){
   int i, q = 0;
   printf("\nEnter two numbers to multiply: ");

   do{
        printf("\nEnter Multiplier: ");
        scanf("%d",&a);
        printf("Enter Multiplicand: ");
        scanf("%d", &b);
     }while(a >=16 || b >=16);

    printf("\nExpected product = %d", a * b);
    binary();
    printf("\n\nBinary Equivalents are: ");
    printf("\nMultiplier = ");
    for (i = 4; i >= 0; i--){
        printf("%d", Q[i]);
    }
    printf("\nMultiplicand = ");
    for (i = 4; i >= 0; i--){
        printf("%d", M[i]);
    }
    printf("\n2's complement of Multiplicand = ");
    for (i = 4; i >= 0; i--){
        printf("%d", M1[i]);
    }
    for (i = 0;i < 5; i++){
           if (Q[i] == q){
               printf("\n");
               arshift();
               q = Q[i];
           }
           else if(Q[i] == 1 && q == 0)
            {
              printf("\n");
              add(M1);
              arshift();
              q = Q[i];
           }
           else{
              printf("\n");
              add(M);
              arshift();
              q = Q[i];
           }
     }

     printf("\n\nProduct is = ");
     for (i = 4; i >= 0; i--){
           printf("%d", pro[i]);
     }
     for (i = 4; i >= 0; i--){
           printf("%d", Q1[i]);
     }
     printf("\n");
}
