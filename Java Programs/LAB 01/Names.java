import java.io.*;
public class Names
{ public static void main(String args[])throws IOException
	{ BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	  int a;
	  System.out.println("Enter a number of students participated in the event");

	  a= Integer.parseInt(in.readLine());
	  String n[]=new String[a];
	  System.out.println("Enter the names");
	  for(int i=0;i<a;i++)
	  n[i]=in.readLine();
		
	  System.out.println("\nThe names are: ");

	  for(int i=0;i<a;i++)
	  System.out.println(n[i]);
	}
}

	  			