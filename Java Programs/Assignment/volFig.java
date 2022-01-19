interface FigVol
{	
	double pi=3.14;
	public double volume();
	
}
class Cube implements FigVol
{	
	double a;
	Cube(double s)
	{	
		a=s;
	}
	public double volume()
	{
		return pi*a*a*a;
	}
}
class Cuboid implements FigVol
{	
	double l,b,h;
	Cuboid(double x,double y,double z)
	{	
		l=x;b=y;h=z;
	}
	public double volume()
	{ 
		return l*b*h;
	}
}
class Sphere implements FigVol
{
	double r;
	Sphere(double radius)
	{	
		r=radius;
	}
	public double volume()
	{
		return 4/3*pi*r*r*r;
	}
}
class volFig
{ 	public static void main(String args[])
	{	Cube ob=new Cube(5);
		Cuboid ob1=new Cuboid(2.3,5,10.03);
		Sphere ob2=new Sphere(4.5);	
		System.out.println("\nVolume of Cube with side 5 units= "+ob.volume()+" cubic units");
		System.out.println("Volume of Cuboid with dimensions 2.3 5 10.03 units= "+ob1.volume()+" cubic units");
		System.out.println("Volume of Cube with side 4.5 units= "+ob2.volume()+" cubic units");
	}
}