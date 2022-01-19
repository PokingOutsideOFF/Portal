package hashfruits;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,String> fruitBowl=new HashMap<String,String>();
		addElements(fruitBowl);
		displayElements(fruitBowl);
		findElement(fruitBowl,"Banana");
		findElement(fruitBowl,"Apple");
		findElement(fruitBowl,"Pear");
		
	}
	
	static void addElements(HashMap<String, String> fruitBowl) {
		fruitBowl.put("Apple","Green");
		fruitBowl.put("Cherry","Red");
		fruitBowl.put("Orange","Orange");
		fruitBowl.put("Banana","Yellow");
		fruitBowl.put("Apple","Red");
	}
	
	static void displayElements(HashMap<String, String> fruitBowl) {
		for(HashMap.Entry<String, String> fruit:fruitBowl.entrySet()) {
			System.out.println("Fruit: "+fruit.getKey()+" - Color: "+fruit.getValue());
		}
	}
	
	static void findElement(HashMap<String,String> fruitBowl,String fruitName) {
		if(fruitBowl.containsKey(fruitName))
			System.out.println("The "+fruitName+" is "+fruitBowl.get(fruitName));
		else
			System.out.println("There is no "+fruitName+" in the bowl");
	}
}

