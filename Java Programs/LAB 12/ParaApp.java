import java.awt.*;
import java.applet.*;
/*<applet code=ParaApp width=400 height=400>
<param name=String value=1>
<param name=sea value=ocean></applet>*/

public class ParaApp extends Applet
{
	String str,str1;
	public void init()
	{
		str=getParameter("String");
		str1=getParameter("sea");
		int a=Integer.parseInt(str);
		if(a<3)
		{	str=getParameter("String");
			str1+=str;}
		str=2+a+" ";
	}

	public void paint(Graphics g)
		{
		Font f1=new Font("Arial",Font.BOLD,18);
		g.setFont(f1);
		g.drawString("Addition: "+str,30,30);
		g.drawString("Concatenation: "+str1,30,50);	
	}
}