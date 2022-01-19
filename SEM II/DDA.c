#include "graphics.h"
#include "conio.h"
void main()
{
    int x0,y0,xn,yn;
    printf("Enter initial coordinates");
    scanf("%d %d",&x0,&y0);
    printf("Enter final coordinates");
    scanf("%d %d",&xn,&yn);
    int x_,y_;
    x_=xn-x0;yn=yn-y0;
    float m=y_/x_;

}
