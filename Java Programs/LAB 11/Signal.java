import java.awt.*;
import java.applet.*;
/*
<applet code="Signal" width=700 height=500>
</applet>
*/
public class Signal extends Applet 
{	public void paint(Graphics g) 
{
		Color c1=new Color(187, 30, 16);	//Red Color
		Color c2=new Color(239, 183, 0);	//Yellow Color
		Color c3=new Color(135, 206, 235);	//Color for sky
		Color c4=new Color(128,128,128);	//Color for road
		Color c5=new Color(0, 154, 23);		//Color for grass

		//Signal coordinates
		int x[]={352, 500, 500, 525, 525, 500, 500, 352, 352, 480, 480, 352};
		int y[]={75, 122, 50, 50, 475, 475, 140, 185, 175, 135, 125, 85};
	
		//Road 1 coordinates
		int x1[]={375, 325, 200, 500};
		int y1[]={300, 300, 499, 499};
		
		//Road 2 coordinates
		int x2[]={0, 700, 700, 0};
		int y2[]={400, 400, 450 ,450};	
		
		//Sky
		g.setColor(c3);
		g.fillRect(0,0,700,300);
		
		//Grass	
		g.setColor(c5);
		g.fillRect(0, 300, 700, 200); 

		//Road
		g.setColor(c4);
		g.fillPolygon(x1,y1,x1.length);
		g.fillPolygon(x2,y2,x2.length);
	
		//Signal Stand
		g.setColor(Color.black);
		g.fillPolygon(x, y, x.length);
		g.fillRoundRect(300, 50, 52, 160, 15, 15);
	
		//Signal
		g.setColor(c1);
		g.fillOval(313,75,30,30);
		g.setColor(c2);
		g.fillOval(313,115,30,30);
		g.setColor(Color.green);
		g.fillOval(313,155,30,30);
	}
}