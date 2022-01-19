#include "graphics.h"
#include "conio.h"
#include<math.h>
int main()
{

int gd=DETECT,gm;

initgraph(&gd,&gm,(char*)"");
//WINDOW WALL
rectangle(150,250,380,400);
setfillstyle(1,3);
floodfill(151,251,15);

//WINDOWS
setfillstyle(11,10);
circle(190,325,25);
circle(260,325,25);
circle(330,325,25);
floodfill(190,325,15);
floodfill(260,325,15);
floodfill(330,325,15);

//DOOR WALL
rectangle(380,250,500,400);
setfillstyle(9,1);
floodfill(381,251,15);

//UPPER FLOOR
rectangle(150,100,380,250);//WINDOW UPPER
setfillstyle(3,10);
floodfill(151,101,15);

rectangle(380,100,480,250);//DOOR UPPER
setfillstyle(9,2);
floodfill(381,101,15);
rectangle(405,130,465,190);//WINDOW
setfillstyle(1,9);
floodfill(406,131,15);

//ROOF
int r[]={380,100,430,50,480,100,380,100};
drawpoly(4,r);
int l[]={380,100,430,50,200,50,150,100,380,100};
drawpoly(5,l);
setfillstyle(5,13);
fillpoly(5,l);
setfillstyle(4,5);
fillpoly(4,r);


//DOOR ROOF
setfillstyle(1,6);
int d[]={380,250,430,280,550,280,500,250,380,250};
line(430,280,380,280);
int rd[]={430,280,380,280,380,250,430,280};
fillpoly(5,rd);
drawpoly(5,d);
fillpoly(5,d);

//DOOR
rectangle(425,320,475,400);
setfillstyle(1,6);
floodfill(426,321,15);
circle(468,365,5);//DOOR HANDLE
setfillstyle(1,4);
floodfill(468,365,15);
getch();
closegraph();
restorecrtmode();
}
