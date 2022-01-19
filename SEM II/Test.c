#include "graphics.h"

#include "conio.h"
int main()

{

int gd=DETECT,gm;

initgraph(&gd,&gm," ");

circle(330,180,100);
getch();

closegraph();

restorecrtmode();

}
