//SHREYAS SAWANT D7A 55
//Implement Area Filling Algorithm:Boundary Fill & Flood Fill

#include "graphics.h"
#include "conio.h"
void boundaryFill(int x, int y, int fcolor,int bcolor)
{
    if((getpixel(x, y) != bcolor) && (getpixel(x, y) != fcolor))
    {
        putpixel(x, y, fcolor);
        boundaryFill(x + 1, y, fcolor, bcolor);
        boundaryFill(x, y + 1, fcolor, bcolor);
        boundaryFill(x - 1, y, fcolor, bcolor);
        boundaryFill(x, y - 1, fcolor, bcolor);
        boundaryFill(x - 1, y - 1, fcolor, bcolor);
        boundaryFill(x - 1, y + 1, fcolor, bcolor);
        boundaryFill(x + 1, y - 1, fcolor, bcolor);
        boundaryFill(x + 1, y + 1, fcolor, bcolor);

    }
}
void floodfill(int x,int y,int old,int newcol)
{
        int current;
        current=getpixel(x,y);
        if(current==old)
        {
            putpixel(x,y,newcol);
            floodfill(x+1,y,old,newcol);
            floodfill(x-1,y,old,newcol);
            floodfill(x,y+1,old,newcol);
            floodfill(x,y-1,old,newcol);
            floodfill(x+1,y+1,old,newcol);
            floodfill(x-1,y+1,old,newcol);
            floodfill(x+1,y-1,old,newcol);
            floodfill(x-1,y-1,old,newcol);
        }
}


int main()
{   int c;
    printf("1.Boundary Fill\n2.Flood Fill\nEnter Choice\n");
    scanf("%d",&c);
    int gd = DETECT, gm;
    initgraph(&gd, &gm, (char*)"");

    int x = 250, y = 200, radius = 50;


    switch(c)
    {
        case 1:
            {   rectangle(x, y,450,300);
                outtextxy(300, 150,"BOUNDARY FILL");
                boundaryFill(350, 250, 9, 15);
                break;
            }

        case 2:
            {   rectangle(x, y,450,300);
                outtextxy(300, 150,"FLOOD FILL");
                floodfill(300,250,0,4);
                break;
            }
        default:
        {   printf("Wrong choice\n");
            exit(0);
            break;
        }
    }
    getch();
    closegraph();
    restorecrtmode();

    return 0;
}
