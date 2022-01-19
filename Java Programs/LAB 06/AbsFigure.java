import java.util.*;
abstract class Figure
{ 	double dim_1,dim_2,r;
	Figure(double a,double b)
	{ dim_1=a;
	  dim_2=b;
	}
	
	Figure(double c)
	{ r=c; }
	
	abstract double area();
}
class Circle extends Figure
{ 	
	Circle(double a)
	{super(a);
	}
	double area()
	{
		return r*r*3.14;
	}
	
}
class Rectangle extends Figure
{ 	
	Rectangle(double a,double b)
	{super(a,b);
	}
	double area()
	{
		return dim_1*dim_2;
	}
	
}
class Triangle extends Figure
{ 	
	Triangle(double a,double b)
	{  super(a,b);
	}
	double area()
	{
		return dim_2*dim_1/2;
	}
	
}
class AbsFigure
{	public static void main(String args[])
	{	Scanner s=new Scanner(System.in);
		double l,br,b,h,r;

		System.out.println("Enter length and breath of rectangle: ");
		l=s.nextDouble();
		br=s.nextDouble();
		Rectangle ob1=new Rectangle(l,br);

		System.out.println("\nEnter height and base of triangle: ");
		h=s.nextDouble();
		b=s.nextDouble();
		Triangle ob2=new Triangle(h,b);

		System.out.println("\nEnter radius of circle: ");
		r=s.nextDouble();
		Circle ob3=new Circle(r);

		System.out.println("\nArea of Rectangle: "+ob1.area()+" sq units");
		System.out.println("\nArea of Triangle: "+ob2.area()+" sq units");
		System.out.println("\nArea of Circle: "+ob3.area()+" sq units"); 	
	}
}	
	