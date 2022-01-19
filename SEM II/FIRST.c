#include<graphics.h>

#include<conio.h>

void main()

{

int gd=DETECT,gm;

initgraph(&gd, &gm, “c:/tc/bgi “);

circle(330,180,100);
getch();

closegraph();

restorecrtmode();

}
