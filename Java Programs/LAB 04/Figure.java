import java.util.Scanner;
class Figure
{ static public void main(String args[])
	{	Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of side of square:");
		int a=s.nextInt();
		System.out.println("Enter the height and base of triangle:");
		double h=s.nextDouble();
		double bs=s.nextDouble();
		
		System.out.println("Enter the length and breadth of rectangle:");
		float l=s.nextFloat();
		float b=s.nextFloat();
		System.out.println("Enter the radius of circle:");
		double r1=s.nextDouble();
		System.out.println("Area of square: "+ area(a));
		System.out.println("Area of triangle: "+ area(h,bs));
		System.out.println("Area of rectangle: "+ area(l,b));
		System.out.println("Area of circle: "+ area(r1));
	}
	
	static double area(int s)
	{ double ar=s*s;
		return ar;
	}
	static double area(double h,double b)
	{	double ar=0.5*h*b;
		return ar;
	}
	static double area(float l,float b)
	{	double ar=l*b;
		return ar;
	}
	static double area(double r)
	{	double ar=3.14*r*r;
		return ar;
	}
}
		

		