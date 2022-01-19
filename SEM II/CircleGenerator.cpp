//SHREYAS SAWANT D7A 55
//Implement midpoint circle algorithm
#include "graphics.h"
#include "conio.h"
int x0,y0,r,p0;
void drawCircle(int x1,int y1)
{   int c=9;
    //FIRST QUAD
     putpixel(x1+x0,y0-y1,c);
     putpixel(x0+y1,y0-x1,c);

     //SECOND QUAD
     putpixel(x0-x1,y0-y1,c);
     putpixel(x0-y1,y0-x1,c);

     //THIRD QUAD
     putpixel(x0-x1,y1+y0,c);
     putpixel(x0-y1,y0+x1,c);

     //FOURTH QUAD
     putpixel(x1+x0,y1+y0,c);
     putpixel(x0+y1,y0+x1,c);
}
int main()
{
     printf("Enter the x and y coordinates of circle: ");
     scanf("%d%d",&x0,&y0);
     printf("Enter the radius of circle: ");
     scanf("%d",&r);
      int gd=DETECT,gm;
    initgraph(&gd,&gm,(char*)"");
     int xk=0;int yk=r;
     p0=1-r;
     while(xk<=yk)
     {if(p0<0)
       {
         xk++;
         p0=p0+2*xk+1;
        }
       else
       {
           xk++;
           yk--;
           p0=p0-2*yk+2*xk+1;

       }
       drawCircle(xk,yk);
}
    getch();
    closegraph();
    restorecrtmode();
}
