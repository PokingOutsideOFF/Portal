import java.util.Scanner;
class chkTriangle
{ public static void main(String args[])
{	Scanner s=new Scanner(System.in);
	System.out.println("Enter the length of three sides of triangle");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	
	if(a+b>c && b+c>a && c+a>b)
	{System.out.println("Triangle can be formed");
	 if(a==b&&b==c&&a==c)
	 System.out.println("Triangle formed is equilateral");
	 else if(a==b || b==c || c==a)
	 System.out.println("Triangle formed is isoceles");
	 else
	 System.out.println("Triangle formed is scalene");
	}
	else
	System.out.println("Triangle cannot be formed");
	
}
}	