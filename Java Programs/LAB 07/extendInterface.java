interface Market
{
	void shop1();
	void shop2();
}

// Mall now includes shop1() and shop2(), and it adds shop3().
interface Mall extends Market 
{
	void shop3();
}

// This class must implement all of Market and Mall
class Shops implements Mall {
	public void shop1() 
	{
		System.out.println("Shop 1: Stationary");
	}
	public void shop2() 
	{
		System.out.println("Shop 2: Electrical");
	}
	public void shop3() 
	{
		System.out.println("Shop 3: Electronics in Mall");
	}
}

class extendInterface 
{
	public static void main(String arg[]) 
	{
		Shops ob = new Shops();
		ob.shop1();
		ob.shop2();
		ob.shop3();
	}
}