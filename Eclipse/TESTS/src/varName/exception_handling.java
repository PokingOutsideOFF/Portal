package varName;

public class exception_handling  {
	public static void main(String args[])
	{
		try
		{
			int i,sum;
			sum=10;
			for(i=-1;i<3;++i)
			{
				sum=(sum/i);
				System.out.print(i);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.print("0");
		}
		finally
		{
			//System.out.println("only executed");
		}
	}
}
