
interface Place 
{	
	public void city();
	public void district();
	public void state();
}

class Country
{	
	String count="India";
	String state="Maharashtra";
	String district="Thane";
	void count()
	{ 	
		System.out.println("\nEntering superclass");
		System.out.println("Country: "+count);
		System.out.println("Exiting superclass\n");
	}
}

class Home extends Country implements Place
{	
	String city;
	Home(String a)
	{	
		city=a;
	}
	//Methods of interface Place
	public void state()
	{	super.count();
		System.out.println("State: "+state);//Using variables from superclass
	} 
	public void district()
	{	 System.out.println("District: "+district);
	}
	public void city()
	{	System.out.println("City: "+city);
	}
}

class extendAndImplement
{	static public void main(String args[])
	{	
		Home ob=new Home("Thane City");
		ob.state();
		ob.district();
		ob.city();
	}
}
	