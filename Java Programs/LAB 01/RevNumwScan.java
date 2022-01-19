import java.util.*;
public class RevNumwScan
{ public static void main(String args[])
	{ Scanner sc=new Scanner(System.in);
	  System.out.println("\nEnter a number to reverse it");
	  int a= sc.nextInt();
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