import java.awt.*;
import java.applet.*;
/*
<applet code="House" width=700 height=500>
</applet>
*/
public class House extends Applet{
	public void paint(Graphics g)
	{	
		Color c1=new Color(210,105,30);		//Color for roof
		Color c2=new Color(150,75,0);		//Color for door
		Color c3=new Color(135, 206, 235);	//Color for sky
		Color c4=new Color(0, 154, 23);		//Color for grass

		int x[]={400,200,200,400};
		int y[]={450,334,234,350};
		
		int x1[]={400,500,500,400};
		int y1[]={450,392,292,350}; 
		
		int x2[]={400,443,243,200};
		int y2[]={350,250,134,234};
		
		int x3[]={400,500,443};
		int y3[]={350,292,250};

		int x4[]={443,443,468,468};
		int y4[]={425,375,361,411};
		
		//Sky
		g.setColor(c3);
		g.fillRect(0,0,700,300);
		
		//Grass
		g.setColor(c4);
		g.fillRect(0, 300, 700, 200); 
		
		//Roof
		g.setColor(c1);
		g.fillPolygon(x2,y2,x2.length);
		g.fillPolygon(x3,y3,y3.length);
		
		//Left Wall
		g.setColor(Color.orange);
		g.fillPolygon(x,y,x.length);
		
		//Right Wall
		g.setColor(Color.cyan);
		g.fillPolygon(x1, y1,x.length);
		
		//Door
		g.setColor(c2);
		g.fillPolygon(x4,y4,x4.length);
		
		//Border  
		g.setColor(Color.black);
		g.drawPolygon(x,y,x.length);
		g.drawPolygon(x1,y1,x1.length);
		g.drawPolygon(x2,y2,x2.length);
		g.drawPolygon(x3,y3,x3.length);
		g.drawPolygon(x4,y4,x4.length);
		
	}
}	