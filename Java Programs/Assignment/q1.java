class Cylinder
{	
	final double pi=3.14;
	double SurfaceArea(int r,int h)
	{
		return 2*pi*r*(r+h);
	}
	
	double Volume(int r,int h)
	{ 
		return pi*r*r*h;
	}
}

class q1
{	public static void main(String args[])
	{	Cylinder o=new Cylinder();
		
		System.out.println("\nVolume of cylinder with height 20 and radius 4: "+o.Volume(4,20));
		System.out.println("Total surface area of cylinder with height 20 and radius 4: "+o.SurfaceArea(4,20));
	}
}
