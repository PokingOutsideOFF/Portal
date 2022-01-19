class evenOdd
{ 	public static void main(String args[])
	{	
		
		int n=Integer.parseInt(args[0]),e=0,o=0;
		System.out.print("Even Integers: ");
		while(e!=n)
		{ 
			if(o%2==0)
			{	
				System.out.print(o+ " ");
				e++;
			}
			o++;
		}
		e=0;o=0;

		System.out.print("\n \nOdd Integers: ");
		while(e!=n)
		{ 
			if(o%2!=0)
			{	
				System.out.print(o+ " ");
				e++;
			}
			o++;
		}
		System.out.println(); } }
