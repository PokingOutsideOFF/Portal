import java.util.Scanner;
class sumAndAverage
{	public static void main(String args[])
	{	
		Scanner k=new Scanner(System.in);
		int n,a[],eve[],odd[];
		System.out.println("Enter the size of array");
		n=k.nextInt();
		a=new int[n];
		System.out.println("Enter elements of array");	
		for(int i=0;i<n;i++)
		{	
			a[i]=k.nextInt();
		}
		int s=0,s1=0,k1=0,k2=0;
		
		for(int i=0;i<n;i++)
		{		
			if(i%2==0)					 
			{	
				s=s+a[i];k1++;
			}
			else
			{
				s1=s1+a[i];k2++;
			}
		}
		System.out.println("\nSum of odd indexes "+s);	
		System.out.println("Average of even indexes "+(double)s/k1);
		
		System.out.println("\nSum of even indexes "+s1);	
		System.out.println("Average of even indexes "+(double)s1/k2);
	}
		
}
			
						
		
			
		
		
		
									
