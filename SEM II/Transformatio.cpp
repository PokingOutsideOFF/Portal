#include "graphics.h"
#include <conio.h>
#include <math.h>
#include <stdlib.h>
int x1i,x2i,y1i,y2i;
void translate()
{
    int t1,t2,xt1,xt2,yt1,yt2;
    printf("Enter the translation distances for x and y respectively\n");
    scanf("%d%d",&t1,&t2);
    cleardevice();
    setcolor(15);
    outtextxy(300,100,"TRANSLATION");
    xt1=x1i+t1;
    xt2=x2i+t1;
    yt1=y1i+t2;
    yt2=y2i+t2;


    line(xt1,yt1,xt2,yt2);
    setcolor(1);
    line(x1i,y1i,x2i,y2i);
    getch();
}

void scale()
{
    float s1,s2;
    int xs1,xs2,ys1,ys2;
    printf("Enter the scaling factor for x and y respectively\n");
    scanf("%f%f",&s1,&s2);
    cleardevice();
    setcolor(15);
    outtextxy(300,100,"SCALING");
    xs1=x1i*s1;
    xs2=x2i*s1;
    ys1=y1i*s2;
    ys2=y2i*s2;

    line(xs1,ys1,xs2,ys2);
    setcolor(1);
    line(x1i,y1i,x2i,y2i);
    getch();
}

void rotation()
{
    int r,xr1,xr2,yr1,yr2;
    float rd;
    printf("\nEnter the angle of rotation\n");
    scanf("%d",&r);
    cleardevice();
    setcolor(15);
    outtextxy(300,100,"ROTATION");
    rd=(r*3.14)/180;
    xr1=abs(x1i*cos(rd)-y1i*sin(rd));
    xr2=abs(x2i*cos(rd)-y2i*sin(rd));
    yr1=abs(y1i*cos(rd)+x1i*sin(rd));
    yr2=abs(y2i*cos(rd)+x2i*sin(rd));
    line(xr1,yr1,xr2,yr2);
    setcolor(1);
     line(x1i,y1i,x2i,y2i);
    getch();
}

void shear()
{
    float s;int xs1,xs2,ys1,ys2;
    printf("\nEnter the value for shearing\n");
    scanf("%f",&s);
    cleardevice();
    setcolor(15);
    outtextxy(300,100,"SHEARING");
    xs1=abs(x1i+s*y1i);
    xs2=abs(x2i+s*y2i);
    ys1=y1i;
    ys2=y2i;
    line(xs1,ys1,xs2,ys2);
    setcolor(1);
     line(x1i,y1i,x2i,y2i);
    getch();
}

void reflection()
{
    int xr1,xr2,yr1,yr2;
    cleardevice();
    setcolor(15);
    outtextxy(300,100,"REFLECTION");

        xr1=x2i+(x2i-x1i);
        xr2=x2i;
        yr1=y1i;
        yr2=y2i;

    line(xr1,yr1,xr2,yr2);
    setcolor(1);
     line(x1i,y1i,x2i,y2i);
    getch();

}


int main()
{
   int gm;
            int gd=DETECT;
            int x1,x2,x3,y1,y2,y3,nx1,nx2,nx3,ny1,ny2,ny3,c;
            int sx,sy,xt,yt,r;
            float t;
            initgraph(&gd,&gm,"c:\tc\bg:");
            printf("\n\t Enter the points of line\n");
            setcolor(1);
            scanf("%d%d%d%d",&x1i,&y1i,&x2i,&y2i);
            line(x1i,y1i,x2i,y2i);
            outtextxy(300,100,"ORIGINAL");
            getch();
            printf("\n1.Transaction\n2.Scaling\n3.Rotation\n4.Shearing\n5.Reflection\n");
            printf("Enter your choice:\n");
            scanf("%d",&c);



        switch(c)
        {
        case 1:
           {
            translate();
            break;}
        case 2:
            {scale();
            break;}
        case 3:
            {rotation();
            break;}
        case 4:
            {shear();
            break;}
        case 5:
            {reflection();
            break;}
        default:
            {printf("Invalid choice");break;}

        }

    closegraph();
    restorecrtmode();
    return 0;
}
