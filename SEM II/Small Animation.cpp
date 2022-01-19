//SHREYAS SAWANT D7A 55
//Presenting Simple Animation of a ball travelling

#include <graphics.h>
#include <stdlib.h>

int i=0;//flag for x axis paths
int start=0;//start coordinate
float k=0;//flag for y axis slopes
int j=0;//flag for the plunger
int l=0;//counter for if else conditions
int t=0;//flag for moving the ball
int exiting=0;//exiting loop

void plunger()
{
    if(480+j>400)
    j--;

    line(10,480+j,30,480+j);
    line(10,480+j,10,490+j);
    line(30,480+j,30,490+j);
    line(10,490+j,17,490+j);
    line(23,490+j,30,490+j);
    line(17,490+j,17,520+j);
    line(23,490+j,23,520+j);
    line(17,520+j,23,520+j);

    delay(10);

}

void scene()
{
        if(l<220)
        {
            circle(20,240,10);          //Start Path
        }
         else if(l>=220&&l<370)
        {
            circle(20,246-k,10);         //First Slope
            k++;
        }
        else if(l>=370&&l<640)
        { circle(20,90,10);k=0;}        //Upper Path
        else if(l>=640&&l<790)
        { circle(20,100+k,10);k+=1.333;}//Second Slope
        else if(l>=790&&l<840)
        { circle(20,290,10);k=0;}       //Down Path
        else if(l>=840&&l<865)
        {circle(20,290+k,10);k+=4;}     //Pit Fall
        else if(480+j==400&&390+k>55)
        {   plunger();
            circle(20,390+k,10);k-=6;   //Upper Push and Plunger static
        }
        else if(390+k<55 && 55+t<140)
        {
            plunger();                  //Rebound
            circle(20+t,55+t,10);t+=3;
        }
        else if(55+t>=140&&20+t<650)
        {   plunger();                  //Speeding on the upper path
            circle(20+t,140,10);t+=4;
        }
        else if(20+t>644)
        {   exiting=1;        //Stopping the loop
        }

        else
        {k=0;circle(20,390,10);        //Static Ball in Pit and Plunger Push
            plunger();
        }


        if(i<840)
        {
            line(start,250,250-i,250);     //Start Path
            line(250-i,250,400-i,100);      //First Slope
            line(400-i,100,650-i,100);      //Upper Path after first slope
            line(650-i,100,800-i,300);      //Second  Slope
            line(800-i,300,850-i,300);i++; //Down Path after second slope
        }

        else
            line(840-i,300,850-i,300);  //Static down path

        //Pit Creation
        line(850-i,300,850-i,400);
        line(850-i,400,870-i,400);
        line(870-i,400,870-i,150);

        //Top Path after Pit
        line(870-i,150,1540-i,150);

        //Upper Obstacle
        line(840-i,0,840-i,70);
        line(840-i,70,870-i,0);

        l++;

        delay(10);

}

int main()
{
    int gd=DETECT,gm;
    initgraph(&gd,&gm," ");
    int page=0;
    while(i<=1500)
    {       if(exiting ==0)
            {setactivepage(page);
            setvisualpage(1-page);
            cleardevice();
            scene();

            page=1-page;}
            if(exiting==1)
                break;
    }
    closegraph();
    initgraph(&gd,&gm," ");
    outtextxy(100,210,"THANKS FOR WATCHING THE BALL MARATHON");
    getch();


}

