#include "graphics.h"
#include "conio.h"
int main()
{   int gm,gd=DETECT,x1,y1,x2,y2,a;
    printf("Enter initial x and y coordinates: ");
    scanf("%d%d",&x1,&y1);
    printf("Enter final x and y coordinates: ");
    scanf("%d%d",&x2,&y2);
    printf("\n1.Thick\n2.Dashed\n3.Dotted\n");
    scanf("%d",&a);
    int xn=x2-x1,yn=y2-y1;
    int p=2*yn-xn;int i=0,x,y;
    initgraph(&gd,&gm,(char*)"");int m=xn-1;


    switch(a)
    { case 1:
    { if(xn==0)
    {for(int i=0;i<abs(yn-1);i++)
    {
        if(p<0)
        {
            p=p+2*xn;
            y1++;
            putpixel(x1,y1,15);
        }
        else
        {
            p=p+2*xn-2*yn;
            x1++;if(y2<y1)
                y1--;
            else
            y1++;
            putpixel(x1,y1,15);
        }
    }
    }
       else
    {
    for(int i=0;i<abs(xn-1);i++)
    {
        if(p<0)
        {
            p=p+2*yn;
            x1++;
            putpixel(x1,y1,15);
        }
        else
        {
            p=p+2*yn-2*xn;
            x1++;
            if(y2<y1)
                y1--;
            else
            y1++;
            putpixel(x1,y1,15);
        }
    }
    }break;
    }
    case 2:
    { if(xn==0)
    {for(int i=0;i<abs(yn-1);i++)
     {
        if(p<0)
        {
            p=p+2*xn;
            y1+=3;
            putpixel(x1,y1,RED);
        }
        else
        {
            p=p+2*xn-2*yn;
            x1+=3;
            y1+=3;
            putpixel(x1,y1,RED);
        }
    }
    }
       else
    {
    for(int i=0;i<abs(xn-1);i++)
    {
        if(p<0)
        {
            p=p+2*yn;
            x1+=3;
            putpixel(x1,y1,RED);
        }
        else
        {
            p=p+2*yn-2*xn;
            x1+=3;
            y1+=3;
            putpixel(x1,y1,RED);
        }
    }
    }
        break;
    }
    }
    getch();
    closegraph();
    restorecrtmode();
}
