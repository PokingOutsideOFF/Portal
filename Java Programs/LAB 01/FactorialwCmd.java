
public class FactorialwCmd
{	public static void main(String args[])
	{
	  int a;
 	  a=Integer.parseInt(args[0]);
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