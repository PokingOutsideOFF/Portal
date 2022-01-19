import java.util.Scanner;
class Sign
{ public static void main(String args[])
{	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int a=s.nextInt();
	if(a<0)
	System.out.println("Negative ");
	else if(a>0)
	System.out.println("Positive ");
	else
	System.out.println("Zero ");
}
}	