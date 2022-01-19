package classlist;
import java.util.*;
public class Student {

	public static void main(String[] args) {
		
		List<String> studentNames=new ArrayList<String>();
		
		addStudents(studentNames);
		displayStudents(studentNames);
		Collections.sort(studentNames);
		System.out.print("\n");
		displayStudents(studentNames);
	}
	
	static void addStudents(List<String> studentNames){
		studentNames.add("Shreyas");
		studentNames.add("Lauri");
		//studentNames.add("Shreyas");
	}
	
	static void displayStudents(List<String> studentNames) {
		for(String name:studentNames) {
			System.out.println("Student Name: "+name);
		}
	}
	

}
