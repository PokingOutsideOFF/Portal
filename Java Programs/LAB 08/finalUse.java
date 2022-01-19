
class One
{ 	//Methods declared as final cannot be overriden 
	
	final public void skill()
	{	System.out.println("Skills are required to access this." );
	}
}

//classes declared as final cannot be inherited
final class Two extends One
{	//Show error as method cannot be overriden
	
	void skill()
	{	
		System.out.println("Cannot access");
	}
	
}

class Three extends Two
{	
	void skill()	
	{	System.out.println("Cannot access it.");
		super.skill();
	}
	
}

//final 
class finalUse 
{	
	public static void main(String args[])
	{ 	Three ob=new Three();
		ob.skill();
		
	}	
}