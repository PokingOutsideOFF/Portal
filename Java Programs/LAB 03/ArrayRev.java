import java.util.*;
class ArrayRev
{ public static void main(String args[])
	{ Scanner s=new Scanner(System.in);
	  System.out.println("Enter size of array");
	  int n=s.nextInt();
	  int a[]=new int[n];int temp;
	  System.out.println("Enter elements of array");
	  for(int i=0;i<a.length;i++)
	    a[i]=s.nextInt();
	  for(int i=0;i<n/2;i++)
	   { temp=a[i];
	    a[i]=a[n-1-i];
	    a[n-1-i]=temp;}
	  System.out.println("Elements in reverse order");
	  for(int i=0;i<n;i++)
	    System.out.print(a[i]+" ");
	  System.out.println();
	}
}