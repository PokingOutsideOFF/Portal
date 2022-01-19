package ryhminggame;
import java.util.*;
public class RhymeGame {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String animal;
		animal=getAnimal(in);
		if(rhymingAnimal(animal))
			System.out.println("This animal rhymes with cat!");
		else
			System.out.println("This animal doesnt rhyme!");
		in.close();
	}
	private static boolean rhymingAnimal(String animal) {
		return animal.matches("[a-zA-Z]{1,2}(at|AT)");
	}
	private static String getAnimal(Scanner in) {
		System.out.println("Please enter name of the animal: ");
		return in.nextLine();
	}
	
}
