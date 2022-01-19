import java.io.*;
public class RevNum
{ public static void main(String args[])throws IOException
	{ BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	  int a;
	  System.out.println("\nEnter a number to reverse it");
	  a= Integer.parseInt(in.readLine());
	  int t=a,s=0,k=0;
	 while(t!=0)
	{ t/=10;
	  ++k;}t=a;
	 while(t!=0)
	{ int r=t%10;
	  s=s+r*(int)(Math.pow(10,--k));
	  t/=10;
	}
	System.out.println(s);
}
}