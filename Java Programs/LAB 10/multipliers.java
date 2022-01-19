class table5 extends Thread
{
	public void run()
	{
		for(int i=1;i<11;i++)
		{
			System.out.println("5 x "+i+" = "+5*i+"\n");
		}
	}
}
class table7 extends Thread
{
	public void run()
	{
		for(int i=1;i<11;i++)
		{
			System.out.println("7 x "+i+" = "+7*i+"\n");
		}
	}
}
class table13 extends Thread
{
	public void run()
	{
		for(int i=1;i<11;i++)
		{
			System.out.println("13 x "+i+" = "+13*i+"\n");
		}
	}
}

class multipliers
{
	public static void main(String args[])
	{	
		new table5().start();
		new table7().start();
		new table13().start();
	}
}

		