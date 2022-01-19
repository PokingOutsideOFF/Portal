package varName;
import java.util.ArrayList;
public class GenericMethodDriver {
	public static  void main(String args[])
	{
		GenericMethodClass gmc=new GenericMethodClass();
		
		Integer[] integerArray= {1,2,3};
		String[] stringArray= {"This","is","fun\n"};
		
		
		gmc.printArray(integerArray);
		gmc.printArray(stringArray);
		
		ArrayList<Double> array1=new ArrayList<Double>();
		array1.add(34.3);
		array1.add(54.3);
		gmc.printList(array1);
		
		ArrayList<Integer> array2=new ArrayList<Integer>();
		array2.add(33);
		array2.add(43);
		gmc.printList(array2);
		
		System.out.println(gmc.sumOfList(array1));
		System.out.println((int)gmc.sumOfList(array1));
		
		ArrayList<Integer> intArray=new ArrayList<Integer>();
		gmc.addNumbers(intArray);
		gmc.printList(intArray);
		
	}
}
