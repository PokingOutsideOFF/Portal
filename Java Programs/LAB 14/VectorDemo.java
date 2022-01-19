import java.util.*;

class VectorDemo
{	public static void main(String args[])
	{	
		Vector v=new Vector();
		System.out.println("Initial capacity of the created vector is:"+ v.capacity());
		Integer i=new Integer(100);
		v.addElement(i);
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		v.addElement(new Integer(5));
		v.addElement(new Integer(6));
		v.addElement(new Double(3.14));
		v.addElement(new Float(3.14157));
		System.out.println("capacity of the vector after increment is:"+ v.capacity());
		System.out.println();
		System.out.println("vector size:"+v.size());
		System.out.println();
		System.out.println("First item in the vector is:"+ v.firstElement());
		System.out.println("last item in the vector is:"+ v.lastElement());
		System.out.println();
		if(v.contains(new Integer(3)))
			System.out.println("Yes integer value 3 is present");

		System.out.println();
		//Traversing vector through enumeration methods
		Enumeration e=v.elements();
		System.out.println("Element objects present in this vector are:");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		v.removeElement(6);
	
		Integer result=v.get(0);
		System.out.println(result);

		System.out.println(v.subList(0,v.size()));		
		v.removeAllElements();
	}
}