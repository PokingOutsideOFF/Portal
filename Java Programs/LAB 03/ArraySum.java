import java.util.*;
public class ArraySum
{ public static void main(String args[])
	{ Scanner s=new Scanner(System.in);
	  System.out.println("Enter size of array");
	  int n=s.nextInt();
	  int a[]=new int[n];
	  System.out.println("Enter elements of array");
	  for(int i=0;i<a.length;i++)
	  { a[i]=s.nextInt();
	  }
	  int sum=0;
	  System.out.print("Sum of elements of array: ");
	  for(int i=0;i<a.length;i++)
	  { sum+=a[i];
	  }
	  System.out.println(sum);
  	 }
}