import java.io.*;
public class Factorial
{	public static void main(String args[])throws IOException
	{ BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	  int a;System.out.println("\nEnter number to find factorial");
 	  a=Integer.parseInt(in.readLine());
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