#include<graphics.h>


using namespace std;

void DrawCar(int x, int y, int DrawColor,int CarColor)
{

    int points[20]={x,y, x+20,y, x+20,y-20, x+60,y-20, x+60,y,
                         x+80,y, x+80,y+20, x,y+20, x,y};
    setcolor(DrawColor);

    setlinestyle(0,0,3);

    drawpoly(9,points);

    circle(x+20,y+20,10);
    circle(x+60,y+20,10);


    setfillstyle(1,CarColor);


    floodfill(x+5,y+5,DrawColor);
 }

int main( )
{
    initwindow(700, 550, "Shapes");
    int i=-80;
    bool forward=true;

  while(i<700)
  {



      DrawCar(i+50,100,15,3);

      DrawCar(i+150,100,15,3);

      delay(4);


      cleardevice();


  }

   getch();
   closegraph();

}
