import java.io.*;
public class Armstrong
{ public static void main(String args[])throws IOException
	{ BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	  int a;
	  System.out.println("Enter a number to check armstrong or not");
	  a= Integer.parseInt(in.readLine());
	  int k=0,s=0;
	  int t=a;
	 while(t!=0)
	{ t/=10;
	  k++;}t=a;
	 while(t!=0)
	{ int r=t%10;
	  s=s+(int)(Math.pow(r,k));
	  t/=10;
	}
	if(s==a)
	{ System.out.println("Armstrong");
	}
	else
	System.out.println("Not Armstrong");
	}
}