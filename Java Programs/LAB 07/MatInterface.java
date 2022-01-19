import java.util.Scanner;

interface Matrix
{	
	int c[][]=new int[3][3];
	void calcmat();
}

class Addition implements Matrix
{	int a[][],b[][];
	Addition(int arr1[][],int arr2[][])
	{	a=arr1;	
		b=arr2;
	}
	public void calcmat()
	{	
		for(



int i=0;i<3;i++)
		{	 for(int j=0;j<3;j++)
			{	c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+ " ");
			}System.out.println();
		}
	}
}
class Subtraction implements Matrix
{	int a[][],b[][];
	Subtraction(int arr1[][],int arr2[][])
	{	 a=arr1;	
		 b=arr2;
	}
	public void calcmat()
	{	
		for(int i=0;i<3;i++)
		{	 for(int j=0;j<3;j++)
			{	c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+ " ");
			}System.out.println();
		}
	}
}



class MatInterface 
{	public static void main(String args[])
	{	Scanner s=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];

		System.out.println("\nEnter the elements of matrix 'A' ");
		for(int i=0;i<3;i++)
		{	 for(int j=0;j<3;j++)
			{	a[i][j]=s.nextInt();}
		}

		System.out.println("\nMatrix A: ");
		for(int i=0;i<3;i++)
		{	 for(int j=0;j<3;j++)
			{	
				System.out.print(a[i][j]+ " ");
			}System.out.println();
		}

		System.out.println("\nEnter the elements of matrix 'B' ");
		for(int i=0;i<3;i++)
		{	 for(int j=0;j<3;j++)
			{	b[i][j]=s.nextInt();}
		}

		System.out.println("\nMatrix B: ");
		for(int i=0;i<3;i++)
		{	 for(int j=0;j<3;j++)
			{	
				System.out.print(b[i][j]+ " ");
			}System.out.println();
		}	
		Matrix ob1=new Addition(a,b);
		System.out.println("\nA + B: ");
		ob1.calcmat();	
		Matrix ob2=new Subtraction(a,b);
		System.out.println("\nA - B: ");
		ob2.calcmat();
}
}	
	  	  