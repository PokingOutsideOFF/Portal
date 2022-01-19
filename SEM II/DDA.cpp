//SHREYAS SAWANT D7A 55
#include "graphics.h"
#include "conio.h"
#include <math.h>
int main()
{
    int x0,y0,xn,yn;
    printf("Enter initial coordinates ");
    scanf("%d %d",&x0,&y0);
    printf("Enter final coordinates ");
    scanf("%d %d",&xn,&yn);
    printf("\n1.Thick\n2.Dashed\n3.Dotted\n");
    int a;
    scanf("%d",&a);
    int x_,y_,step;
    x_=xn-x0;y_=yn-y0;

    int gd=DETECT,gm;
    initgraph(&gd,&gm,(char*)"");
    if(abs(y_)>abs(x_))
        step=abs(y_);
    else
        step=abs(x_);

    float xinc=x_/(float)step;
    float yinc=y_/(float)step;
    float x=x0;
    float y=y0;int k=0;
    switch(a)
    {   case 1:
        {   for(int i=0;i<step;i++)
            {putpixel(round(x),round(y),MAGENTA);
            x+=xinc;
            y+=yinc;}
            break;
        }
        case 2:
       {for(int i=0;i<step;i++)
        {  if(k>20&&k<25)
            {k++;
            x+=xinc;
            y+=yinc;
            if(k==25)
                k=0;
            }
            else
            {putpixel(round(x),round(y),MAGENTA);
            x+=xinc;
            y+=yinc;
            k++;
            }

        }break;
       }
        case 3:
        {
            for(int i=0;i<step;i++)
            {
                    if(k==2)
                    {k=0;
                     x+=xinc;
                     y+=yinc;
                    }
                    else
                    {putpixel(round(x),round(y),MAGENTA);
                     x+=xinc;
                     y+=yinc;
                     k++;
                    }
            }
                break;
        }
        default:printf("INVALID");
        }
    getch();
    closegraph();
    restorecrtmode();
}
