//CODEBLOCKS
//SHREYAS SAWANT D7A 55
//Implement Bezier Curve

#include "graphics.h"
#include<math.h>
#include<conio.h>
#include<stdio.h>
int main()
{
    int x[4],y[4]; //To store control points
    double x1,y1,t;
    int gd=DETECT,gm;
    printf("\nPlease enter x and y coordinates for Cubic Bezier Curve \n");

    for(int i=0;i<4;i++)
    {
        scanf("%d%d",&x[i],&y[i]);

    }
     initgraph(&gd,&gm," ");
     outtextxy(250,50,"CUBIC BEZIER CURVE");
     setcolor(BLUE);
     for(int i=0;i<3;i++)
     {
            line(x[i],y[i],x[i+1],y[i+1]);
     }

    for(t=0.0;t<=1.0;t+=0.001)
    {
        x1 = pow(1-t,3)*x[0] + 3*t*pow(1-t,2)*x[1] + 3*t*t*(1-t)*x[2] + pow(t,3)*x[3];
        y1 =  pow(1-t,3)*y[0] + 3*t*pow(1-t,2)*y[1] + 3*t*t*(1-t)*y[2] + pow(t,3)*y[3];
        putpixel(x1,y1, WHITE);
    }
    getch();
    closegraph();
}
