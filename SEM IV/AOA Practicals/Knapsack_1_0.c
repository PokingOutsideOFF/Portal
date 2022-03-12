#include <stdio.h>
#include <stdlib.h>
int maxi(int a, int b){
    return (a > b) ? a : b;
}
void knap(int n, int m, int p[], int w[]){
    int v[n + 1][m + 1], selected[n], i, j, s = 0, c = 0;
    
    //Inserting 0 when i=0 or j=0
    for(i = 0; i < n + 1; i++)
        v[i][0] = 0;
    for(int i = 0; i < m + 1; i++)
        v[0][i] = 0;

    //Inserting values when w[i]>j or w[i]<=j    
    for(i = 1; i < n + 1; i++){
        for(j = 0; j < m + 1; j++){
            if(w[i - 1] <= j)
                v[i][j] = maxi(v[i - 1][j], p[i - 1] + v[i - 1][j - w[i - 1]]);
            else
                v[i][j] = v[i - 1][j];
        }
    }
    
    //Displaying the Knapsack Table
    printf("\nItem  Profit  Weight  \t");
    for(i = 0; i < m + 1; i++)
        printf("%d\t ", i);
    printf("\n   \t   \t   \t");    
    for(i = 0; i < m + 1;  i++)
        printf("%d\t ", v[0][i]);
    for(i = 1; i < n + 1; i++){
        printf("\n%d\t%d\t%d\t", i, p[i-1], w[i-1]);
        for(j = 0; j < m + 1; j++){  
            printf("%d\t ", v[i][j]);
        }
    }printf("\n");

    //Displaying Selected Items
    i = n; j = m;
    while(j > 0){
        if(v[i][j] == v[i - 1][j])
            i--;
        else{
            v[i][j] -= p[i-1];
            j -= w[i-1] ;
            selected[c] = i;
            c++;
            s += p[i-1]; 
        }    
    }
    printf("\nItems included: ");
    for(i = c - 1; i > -1; i--)
        printf("%d, ", selected[i]);
    printf("\nMaximum Profit: %d\n", s);    
}

void main(){
    int n;
    printf("\nEnter number of items: ");
    scanf("%d", &n);
    int m, p[n], w[n];
    printf("Enter the weights of items: ");
    for(int i = 0; i < n; i++){
        scanf("%d", &w[i]);
    }
    printf("Enter the profits of items: ");
    for(int i = 0; i < n; i++){
        scanf("%d", &p[i]);
    }
    printf("Enter size of knapsack: ");
    scanf("%d", &m);
    
    knap(n, m, p, w);
}