package lettersstack;
import java.util.*;
public class LettersStack {

	public static void main(String[] args) {
		LinkedList<String> letterS=new LinkedList<String>();
		letterS.push("A");
		letterS.push("B");
		letterS.push("C");
		letterS.push("D");
		System.out.println("Linked List: "+letterS);
		System.out.println("Stack Sizet: "+letterS.size());
		
		while(!letterS.isEmpty()) {
			System.out.println(letterS.pop());
		}
		System.out.println("Linked List: "+letterS);
	}
}
