import java.util.Scanner;
class Calculator
{public static void main(String args[])
{ 	Scanner s=new Scanner(System.in);char ch;
	do{System.out.println("\nEnter two numbers on which the operations are to be performed: ");
	double a=s.nextDouble();
	double b=s.nextDouble();
	System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division ");
 	System.out.println("Enter choice that is to be performed on the numbers from above list from the list: ");
	int c=s.nextInt();
	switch(c)
	{case 1:
		{System.out.println("\n"+a+" + "+b+" = " +a+b);
			break;}
	
	 case 2:
		{System.out.println("\n"+a+" - "+b+" = " +(a-b));
			break;}
	 case 3:
		{System.out.println("\n"+a+" * "+b+" = " +a*b);
			break;}
	 case 4:
		{//System.out.println(a+" / "+b);
		 System.out.println("\nQuotient= "+a/b);
		 System.out.println("Remainder= "+a%b);
			break;}
	 default:
	 System.out.println("Invalid Choice");
	 }
	 System.out.println("Enter y to continue: ");
	 ch=s.next().charAt(0);
	}while(ch=='y');
}
}