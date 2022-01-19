//SHREYAS SAWANT D7A 55
//Implement Line Clipping Algorithm- Cohen Sutherland

#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<graphics.h>


typedef struct coordinate
{
int x,y;
char code[4];
}Point;

void drawwindow();
void drawline(Point p1,Point p2);
Point setcode(Point p);
int visibility(Point p1,Point p2);
Point newendpt(Point p1,Point p2);
int x1i,x2e,y1i,y2e;

int main()
{
int gd=DETECT,v,gm;
Point p1,p2,p3,p4,ptemp;

printf("Enter the top left corner and bottom right corner of clipping window\n");
scanf("%d%d%d%d",&x1i,&y1i,&x2e,&y2e);
printf("\nEnter x1 and y1\n");
scanf("%d %d",&p1.x,&p1.y);
printf("\nEnter x2 and y2\n");
scanf("%d %d",&p2.x,&p2.y);

initgraph(&gd,&gm,"");
drawwindow();
drawline(p1,p2);
outtextxy(250,50,"ORIGINAL LINE");
getch();

cleardevice();
p1=setcode(p1);
p2=setcode(p2);
v=visibility(p1,p2);
outtextxy(250,50,"LINE AFTER CLIPPING");
switch(v)
{
    case 0:
        drawwindow();
        delay(500);
        drawline(p1,p2);
        break;
    case 1:
        drawwindow();
        delay(500);
        break;
    case 2:
        p3=newendpt(p1,p2);
        p4=newendpt(p2,p1);
        drawwindow();
        drawline(p3,p4);
        getch();
        break;
}
restorecrtmode();
closegraph();
}

void drawwindow()
{setcolor(9);
rectangle(x1i,y1i,x2e,y2e);
}

void drawline(Point p1,Point p2)
{setcolor(15);
line(p1.x,p1.y,p2.x,p2.y);
}

Point setcode(Point p)
{
Point ptemp;
if(p.y<y1i)
ptemp.code[0]='1'; //Top
else
ptemp.code[0]='0';
if(p.y>y2e)
ptemp.code[1]='1'; //Bottom
else
ptemp.code[1]='0';
if(p.x>x2e)
ptemp.code[2]='1'; //Right
else
ptemp.code[2]='0';
if(p.x<x1i)
ptemp.code[3]='1'; //Left
else
ptemp.code[3]='0';
ptemp.x=p.x;
ptemp.y=p.y;
return(ptemp);
}

int visibility(Point p1,Point p2)//To get coordinates Code
{
int i,flag=0;
for(i=0;i<4;i++)
{
if((p1.code[i]!='0') || (p2.code[i]!='0'))
flag=1;
}
if(flag==0)
return(0);
for(i=0;i<4;i++)
{
if((p1.code[i]==p2.code[i]) && (p1.code[i]=='1'))
flag='0';
}
if(flag==0)
return(1);
return(2);
}

Point newendpt(Point p1,Point p2)//To reset endpoint of line by finding intersection point
{
Point temp;
int x,y,i;
float m,k;

if(p1.code[3]=='1')
x=x1i;
if(p1.code[2]=='1')
x=x2e;

if((p1.code[3]=='1') || (p1.code[2]=='1'))
{
m=(float)(p2.y-p1.y)/(p2.x-p1.x);
k=(p1.y+(m*(x-p1.x)));
temp.y=k;
temp.x=x;

for(i=0;i<4;i++)
temp.code[i]=p1.code[i];
if(temp.y<=y2e && temp.y>=y1i)
return (temp);
}

if(p1.code[0]=='1')
y=y1i;
if(p1.code[1]=='1')
y=y2e;

if((p1.code[0]=='1') || (p1.code[1]=='1'))
{
m=(float)(p2.y-p1.y)/(p2.x-p1.x);
k=(float)p1.x+(float)(y-p1.y)/m;
temp.x=k;
temp.y=y;

for(i=0;i<4;i++)
temp.code[i]=p1.code[i];
return(temp);
}

else
return(p1);
}
