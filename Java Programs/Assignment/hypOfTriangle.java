import java.util.Scanner;
class hypOfTriangle
{	public static void main(String args[])
	{	
		double a,b,h;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sides of right angled triangle");
		a=s.nextDouble();
		b=s.nextDouble();
		h=Math.sqrt(a*a+b*b);
		System.out.println("\nHypotenuse: "+h);
	}
}							