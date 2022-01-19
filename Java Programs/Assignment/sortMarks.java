import java.util.Scanner;
class sortMarks
{	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);	
		String a[][]={{"Gopal","60"},{"Jordan","50"},{"Krishna","55"},{"Laurel","78"},{"Sara","80"},{"Polis","99"},{"Lopez","12"}};
		System.out.println("Original Sheet\n");	
		for(int i=0;i<a.length;i++)
		{ 	for(int j=0;j<2;j++)
			{ 
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		for(int i=0;i<a.length-1;i++)
		{ 	
			for(int k=0;k<a.length-i-1;k++)
			{	
				if(Integer.parseInt(a[k][1])>Integer.parseInt(a[k+1][1]))
				{	
					String t=a[k][1];
					a[k][1]=a[k+1][1];
					a[k+1][1]=t;
					
					t=a[k][0];
					a[k][0]=a[k+1][0];
					a[k+1][0]=t;
				}	

			}
		}
		System.out.println("\nSorted Sheet\n");		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<2;j++)
			{	
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	} }

																																																							

		




