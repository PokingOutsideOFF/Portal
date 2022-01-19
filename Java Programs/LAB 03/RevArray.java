import java.util.*;
class RevArray
{ public static void main(String args[])
	{ Scanner s=new Scanner(System.in);
	  System.out.println("Enter size of array");
	  int n=s.nextInt();
	  int a[]=new int[n];
	  System.out.println("Enter elements of array");
	  for(int i=0;i<n;i++)
	    a[i]=s.nextInt();
	 
	    
	  System.out.println("Elements in reverse order");
	  for(int i=n-1;i>-1;i--)
	    System.out.print(a[i]+" ");
	  System.out.println();
	}
}