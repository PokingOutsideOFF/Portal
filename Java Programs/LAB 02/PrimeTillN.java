import java.util.Scanner;
class PrimeTillN
{public static void main(String args[])
{Scanner s=new Scanner(System.in);
	System.out.println("\nEnter n till which prime numbers are to be printed: ");
	int n=s.nextInt();
	System.out.println("The prime numbers till "+n+" are: ");
	for(int i=2;i<=n;i++)
	{if(isPrime(i))
	 {System.out.print(i+" ");}
	}System.out.println();
}
static boolean isPrime(int a)
{int k=0; 
for(int i=2;i<a;i++)
{if(a%i==0)
	{k=1;break;}
}
if(k==0)
return true;
else
return false;
}
}

	