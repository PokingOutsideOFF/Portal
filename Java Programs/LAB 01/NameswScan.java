import java.util.Scanner;
public class NameswScan
{ public static void main(String args[])
	{ Scanner s=new Scanner(System.in);
	  int a;
	  System.out.println("Enter number of participants: ");
	  a= s.nextInt();
	  System.out.println("Enter names of participants: ");
	  String n[]=new String[a];
	  s.nextLine();
	  for(int i=0;i<a;i++)
	  n[i]=s.nextLine();
	  System.out.println("\nThe names are: ");

	  for(int i=0;i<a;i++)
	  System.out.println(n[i]);
	}
}

	  			