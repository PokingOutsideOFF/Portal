import java.util.*;
public class ArraySearch
{ public static void main(String args[])
	{ Scanner s=new Scanner(System.in);
	  System.out.println("Enter size of array");
	  int n=s.nextInt();
	  int a[]=new int[n];
	  System.out.println("Enter elements of array");
	  for(int i=0;i<a.length;i++)
	  { a[i]=s.nextInt();
	  }
	  System.out.println("Enter element to be searched");	
	  int f=s.nextInt();int k=0;
	  for(int i=0;i<a.length;i++)
	  { if(f==a[i])
	     {k++;break;}
	  }
	  if(k==0)
	   System.out.println("Not found");
	  else
	   System.out.println("Found");
	}
}