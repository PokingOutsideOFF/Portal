import java.util.*;
class RevString
{ public static void main(String args[])
{	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string to be reversed");
	String a=s.nextLine(),b="";
	for(int i=a.length()-1;i>-1;i--)
	{	
		b=b+a.charAt(i);
	}
	System.out.println("\nReversed String: "+b);
}
}	