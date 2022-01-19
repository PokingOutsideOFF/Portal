package classlistobj;
import java.util.*;
public class StudentDriver {

	public static void main(String[] args) {
		ArrayList<Student> studentNames=new ArrayList<Student>();
		addStudents(studentNames);
		displayStudents(studentNames);
		Collections.sort(studentNames);
		System.out.print("\n");
		displayStudents(studentNames);
	}

	static void displayStudents(ArrayList<Student> studentNames) {
		for(Student student:studentNames)
			System.out.println(student);
	}
	
	static void addStudents(ArrayList<Student> studentNames) {
		studentNames.add(new Student("Mark","MyWords",95));
		studentNames.add(new Student("Andrew","Apic",45));
		studentNames.add(new Student("Bob","Tween",78));
	}
}
