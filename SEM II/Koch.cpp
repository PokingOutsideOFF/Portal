//CODEBLOCKS
//SHREYAS SAWANT D7A 55
//Implement Fractal Generation Method-Koch Curve

#include "graphics.h"
#include<conio.h>
#include<math.h>

void koch(int x1, int y1, int x2, int y2, int t)
{
 float angle = 60*3.14/180;
 int x3 = (2*x1+x2)/3;
 int y3 = (2*y1+y2)/3;

 int x4 = (x1+2*x2)/3;
 int y4 = (y1+2*y2)/3;

 int x = x3 + (x4-x3)*cos(angle)+(y4-y3)*sin(angle);
 int y = y3 - (x4-x3)*sin(angle)+(y4-y3)*cos(angle);

 if(t > 0)
 {
    setcolor(CYAN);
  koch(x1, y1, x3, y3, t-1);
  setcolor(MAGENTA);
  koch(x3, y3, x, y, t-1);
  setcolor(BLUE);
  koch(x, y, x4, y4, t-1);
  setcolor(YELLOW);
  koch(x4, y4, x2, y2, t-1);
 }
 else
 {

  line(x1, y1, x3, y3);
  line(x3, y3, x, y);
  line(x, y, x4, y4);
  line(x4, y4, x2, y2);
 }
}

int main()
{

 int gd = DETECT, gm;
 initgraph(&gd, &gm, "");

 int x1 = 100, y1 = 250, x2 = 400, y2 = 250;
 outtextxy(250,100,"KOCH CURVE");
 koch(x1, y1, x2, y2, 4);
 getch();
 return 0;
}
