#include "graphics.h"

#include "conio.h"
#include <math.h>
#define pi 3.14

int main()

{

int gd=DETECT,gm;

initgraph(&gd,&gm,(char*)"");

int i=2;int s=0,y1,y2,x1,x2,x3,r=0;
//BOTTOM
while(i!=0)
{
     x1=330;x2=330+200*cos(pi/6);x3=330+200*cos(5*pi/6);
    y1=s+300;y2=s+300+200*sin(-pi/6);
    if(i<2)
    {line(x1,y1,x2,y2);
    line(x1,y1,x3,y2);
    line(x3,y2,x3,y2-s);
    line(x1,y1,x1,y1-s);
    int arr[]={x1,y1-s,x1,y1,x3,y2,x3,y2-s,x1,y1-s};
    setfillstyle(8,9);
    fillpoly(5,arr);
    }
    else
    {s=150;
    line(x1,y1,x2,y2);
    line(x1,y1,x3,y2);
    line(x2,y2,x2,y2+s);
    setfillstyle(5,4);
    int arr[]={x1,y1,x2,y2,x2,y2+s,x1,y1+s,x1,y1};
    fillpoly(5,arr);
    }
--i;}
//ROOF

r=0;i=0;
int r1=y1-s,r2=y2-s;
int m=(x1+x2)/2;
int n=150;
line(m,n,m+200*cos(5*pi/6),n+200*sin(-pi/6));
int arr[]={m,n,(int)(m+200*cos(5*pi/6)),(int)(n+200*sin(-pi/6)),x3,y2-s,x1,y1-s,m,n};
setfillstyle(9,3);
fillpoly(5,arr);
line(x1,y1-s,m,n);
line(x3,y2-s,m+200*cos(5*pi/6),n+200*sin(-pi/6));
line(x2,y2-s,m,n);
int ar[]={x1,y1-s,m,n,x2,y2-s,x1,y1-s};
setfillstyle(7,8);
fillpoly(4,ar);

//DOOR}

int d1=y1-tan(pi/6)*(m-10-x1);
int d2;
line(m-10,d1,m-10,d1-50);
d2=tan(-pi/6)*(50)+(d1-50);
line(m-10,d1-50,m+40,d2);
int d3=y1-tan(pi/6)*(m+40-x1);
line(m+40,d2,m+40,d3);
int a[]={m-10,d1,m-10,d1-50,m+40,d2,m+40,d3,m-10,d1};
setfillstyle(10,13);

fillpoly(5,a);

getch();

closegraph();

restorecrtmode();

}
