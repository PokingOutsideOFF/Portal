import java.util.Scanner;
class VoterElig
{ public static void main(String args[])
{	Scanner s=new Scanner(System.in);
	System.out.print("\nEnter name: ");
	String n=s.nextLine();
	System.out.print("\nEnter age: ");
	int a=s.nextInt();
	System.out.print("\nEnter contact no.: ");
	long c=s.nextLong();
	if(a>=18)
	{System.out.println("\nEligible: ");
	System.out.println("Voter details: ");
	System.out.println("Name: "+n);
	System.out.println("Age: "+a);
	System.out.println("Contact Number: "+c);
	}
	else
	System.out.println("\nNot eligible: ");
}
}