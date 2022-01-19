
class Child extends Parent
{	int i,j;
	Child(int a,int b)
	{ 	super(a,b);	//First use of super: To call the constructor of immediate superclass
		i=1;j=2;
		
	}
	void show()
	{	//Second use of super: To access a member of superclass that has been hidden by a member of subclass
		
		i=i+super.i;
		j=j-super.j;
		System.out.println("Show from subclass (i and j): "+i+" "+j);
		super.show();
	}
}
class Parent
{ 	public int i,j;
	Parent(int a,int b)
	{ 	
		i=a;
		j=b;
	}
	void show()
	{ 
		System.out.println("Show from superclass (i and j): "+i+" "+j+"\n");
	}
}

class superUse
{	public static void main(String args[])
	{
		Child ob=new Child(5,7);
		Child ob1=new Child(75,5);
		ob.show();
		ob1.show();
	}
}	
	