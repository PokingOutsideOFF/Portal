//SHREYAS SAWANT 55  D7A
//To implement character generation (i)Bitmap Method (ii)Stroke Method

#include<stdio.h>
#include<conio.h>
#include<graphics.h>
int main()
{
int gd=DETECT,gm,i,j;

int c;
printf("Enter your choice for character generation\n1.Bitmap Method\n2.Stroke Method\n");
scanf("%d",&c);



initgraph(&gd,&gm,"");
switch(c)
{
    case 1:
    {   int a[11][19]=
        {
        {1,1,1,0,0,0,1,1,1,1,1,0,1,1,1,1,1,1,1},
        {1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0},
        {1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0},
        {1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0},
        {1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0},
        {1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0},
        {1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0},
        {1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0},
        {1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0},
        {1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0},
        {1,1,1,0,0,0,1,1,1,1,1,0,0,0,0,1,0,0,0},
        };
        outtextxy(150,100,"CHARACTER GENERATION USING BITMAP METHOD");
        for(i=0;i<11;i++)
        {
            for(j=0;j<19;j++)
            {
                if(a[i][j]==1)
                    putpixel(300+j,200+i,WHITE);
            }
        }
        break;
    }
    case 2:
        outtextxy(150,100,"CHARACTER GENERATION USING STROKE METHOD");
        line(300,200,300,214);
        line(300,207,310,207);
        line(310,200,310,214);
        line(313,200,321,200);
        line(317,200,317,214);
        line(313,214,321,214);
        line(324,200,334,200);
        line(329,200,329,214);
        break;
    default:
        printf("\nINVALID");
}
getch();
return 0;
}
