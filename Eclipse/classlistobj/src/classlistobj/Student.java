package classlistobj;

public class Student implements Comparable<Student> {
	private String firstName;
	private String lastName;
	private int mark;
	
	public Student(String firstName,String lastName,int mark) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.mark=mark;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String s) {
		firstName=s;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String s) {
		lastName=s;
	}
	
	public int getMark() {
		return mark;
	}
	
	public void setMark(int m) {
		mark=m;
	}
	
	public String toString() {
		return "Student Details: "+firstName+" "+lastName+" "+mark;
	}
	
	public int compareTo(Student stud2) {
		if(Integer.valueOf(mark).compareTo(Integer.valueOf(stud2.getMark()))<0)
			return -1;
		else if(Integer.valueOf(mark).compareTo(Integer.valueOf(stud2.getMark()))>0)
			return 1;
		else
			return 0;
	}
	
	

}
