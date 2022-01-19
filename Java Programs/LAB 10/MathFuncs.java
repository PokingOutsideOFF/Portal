class Prime implements Runnable
{
	public void run()
	{	System.out.println("Prime Numbers: ");
		int k=0;int i=2;
		while(k!=20)
		{
			if(prime(i))
			{ System.out.println(i);
				k++;
			}
			i++;
		}
	}
	
	boolean prime(int a)
	{	int k=0;
		for(int i=1;i<a;i++)
		{	if(a%i==0)
				k++;
		}
		if(k==1)
			return true;
		else
			return false;
	}
}
class Fibs implements Runnable
{
	public void run()
	{	
		System.out.println("Fibonacci Series: ");
		int a=0,b=1,c,k=0;
		System.out.println(a+b);
		while(k!=14)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			k++;
		}
	}
}
class MathFuncs
{
	public static void main(String args[])
	{
		Prime runnable=new Prime();
		Fibs runnable1=new Fibs();
		new Thread(new Prime()).start();
		new Thread(new Fibs()).start();
	}
}	
			