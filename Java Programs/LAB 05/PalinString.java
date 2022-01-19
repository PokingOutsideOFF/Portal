import java.util.*;
class PalinString
{ public static void main(String args[])
{	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string to be checked if palin or not");
	String a=s.nextLine(),b="";
	for(int i=a.length()-1;i>-1;i--)
	{	
		b=b+a.charAt(i);
	}
	if(a.equals(b))
		System.out.println("Palindrome String");
	else
		System.out.println("Not Palindrome String");
}
}	