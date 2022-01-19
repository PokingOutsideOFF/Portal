import java.util.*;
class MarksOutOfBoundsException extends Exception
{
	int a;
	MarksOutOfBoundsException(int m)
	{
		a=m;
	}
	public String toString(){
		return "java.MarksOutOfBoundsException: "+a+" must be in range of 0 to 100 ";
	}
}



class Result
{	
	void check(int a)throws MarksOutOfBoundsException
	{
		if(a<0|||a>100)
		 throw new MarksOutOfBoundsException(a);
	}

	void input()
	{
		Scanner s=new Scanner(System.in);
		int seat_no,date,centre_no,marks1,marks2,marks3;
		String name;
		System.out.print("\nStudent's name: ");
		name=s.nextLine();	
		System.out.print("\nSeat number: ");
		seat_no=s.nextInt();
		System.out.print("\nDate: ");
		date=s.nextInt();
		System.out.print("\nCentre number: ");
		centre_no=s.nextInt();		
		System.out.print("\nMarks of 3 semesters: ");
		int k=2;
		do
		{	k=2;
			marks1=s.nextInt();
			marks2=s.nextInt();
			marks3=s.nextInt();
			try
			{		
				check(marks1);
				check(marks2);
				check(marks3);
			}
			catch(MarksOutOfBoundsException e)
			{ 
				System.out.println("You made an error: "+e);
				System.out.print("\nEnter marks again: ");
				k=1;
			}
			
		}while(k==1);

		System.out.println("\nResult of "+name);
		System.out.println("Student's Name: "+name);
		System.out.println("Seat No. "+seat_no);
		System.out.println("Exam Date "+date);
		System.out.println("Centre No. "+centre_no);
		System.out.println("Marks: "+marks1+" "+marks2+" "+marks3);
		
	}
	
	public static void main(String args[])
	{	
		Result a=new Result();	
		a.input();
	}
}
			
			