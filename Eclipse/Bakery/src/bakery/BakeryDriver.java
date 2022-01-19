package bakery;

public class BakeryDriver {
	public static void main(String args[])
	{
		Cookie a=new Cookie("Red",52.03);
		System.out.println("Name of Department: "+a.getDepartment()+
				"\nName of Item: "+a.getItemName()+
				"\nType of Cookie: "+a.getType()+
				"\nPrice of Cookie: "+a.getPrice());
	}
	
}
