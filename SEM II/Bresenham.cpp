//SHREYAS SAWANT D7A 55
//Implement Bresenham Line Drawing Algorithm(Thick/Dashed/Dotted)

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
    int xn=abs(x2-x1),yn=abs(y2-y1);
    int p=2*yn-xn;int i=0,x,y;
    initgraph(&gd,&gm,(char*)"");int m=xn-1;


    switch(a)
    { case 1:
     {
        int sx= x2<x1?-1:1;
        int sy=y2<y1?-1:1;
        if(xn==0)
        {
            for(int i=0;i<abs(yn-1);i++)
            {
                if(p<0)
                {
                    p=p+2*xn;
                    y1+=sy;
                    putpixel(x1,y1,15);
                }
                else
                {
                    p=p+2*xn-2*yn;
                    x1+=sx;
                    y1+=sy;
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
                    x1+=sx;
                    putpixel(x1,y1,15);
                }
                else
                {
                    p=p+2*yn-2*xn;
                    x1+=sx;
                    y1+=sy;
                    putpixel(x1,y1,15);
                }
            }
        }
            break;
     }


    case 2:
        {int k=0;
         int sx= x2<x1?-1:1;
         int sy=y2<y1?-1:1;
         if(xn==0)
            {while(y1!=y2)
                { k++;
                if(k>20&&k<=25)
                {    if(k==25)
                        k=0;
                     if(p<0)
                     {
                        p=p+2*xn;
                     }
                    else
                     {
                        p=p+2*xn-2*yn;
                        x1+=sx;
                     }
                    y1+=sy;
                    putpixel(x1,y1,0);
                }
                else
                {
                    if(p<0)
                    {
                        p=p+2*xn;
                    }
                    else
                    {
                        p=p+2*xn-2*yn;
                        x1+=sx;
                    }
                    y1+=sy;

                    putpixel(x1,y1,15);
                }

                }
              }

        else
        {
            while(x1!=x2)
            {   k++;
                if(k>20&&k<=25)
                { if(k==25)
                    k=0;
                  if(p<0)
                  {
                    p=p+2*yn;
                  }
                  else
                {
                    p=p+2*yn-2*xn;
                    y1+=sy;
                }
                    x1+=sx;
                    putpixel(x1,y1,0);
                }
                else
                {   if(p<0)
                    {
                        p=p+2*yn;
                    }
                    else
                    {
                        p=p+2*yn-2*xn;
                        y1+=sy;
                    }
                        x1+=sx;
                        putpixel(x1,y1,15);
                }
            }
        }

                break;
        }


    case 3:
    {   int sx= x2<x1?-2:2;
        int sy=y2<y1?-2:2;
        int k=0;
        if(xn==0)
        {while(y1!=y2)
            {
                if(p<0)
                {
                    p=p+2*xn;
                }
                else
                {
                    p=p+2*xn-2*yn;
                    x1+=sx;}
                    y1+=sy;
                    putpixel(x1,y1,15);
            }
        }
       else
        {
            while(x1!=x2)
            {
                if(p<0)
                {
                    p=p+2*yn;
                }
                else
                {
                    p=p+2*yn-2*xn;
                    y1+=sy;}
                    x1+=sx;
                    putpixel(x1,y1,15);
                }
        }
            break;
    }

    }
    getch();
    closegraph();
    restorecrtmode();
}
