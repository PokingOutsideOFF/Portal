import java.util.Scanner;
class MultiEntry
{ public static void main(String args[])
	{ Scanner s=new Scanner(System.in);
	  System.out.println("Enter size of array: ");
	  int n=s.nextInt();int i,j,k;
          int a[]=new int[n];
	  System.out.println("Enter the elements: ");
	  for(i=0;i<n;i++)
	   	a[i]=s.nextInt();
  	  
	  for(i=0;i<n;i++)
	{	 for(j=i+1; j<n; j++) 
 			{ if(a[i] == a[j]) 
				 { for(k=j; k < n - 1; k++) 
					 { a[k] = a[k + 1]; 
					 }  
				 n--;  
				 j--; 
			 	} 
 			} 
 	} 
System.out.print("Array without duplicates: "); 
 for(i=0; i<n; i++) 
 { System.out.print(a[i]+" "); 
 } 
}
}