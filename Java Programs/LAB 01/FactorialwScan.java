import java.util.*;
public class FactorialwScan
{	public static void main(String args[])
	{ System.out.println("\nEnter number to find factorial");
 	  Scanner s=new Scanner(System.in);
	  int a=s.nextInt();
	  long k=fact(a);
	  System.out.println("Factorial of "+a+" is "+k); 
	}
	
	static long fact(int f)
	{ if(f<1)
	  return 1;
	  else
	  return f*fact(--f);
	}
}