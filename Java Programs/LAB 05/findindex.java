import java.util.*;
class findindex
{ public static void main(String args[])
{	Scanner s=new Scanner(System.in);
	String a;int b;
	System.out.println("Enter a string");
	a=s.nextLine();
	System.out.println("Enter the index of which the character is to be known");
	b=s.nextInt();
	for(int i=0;i<a.length();i++)
	{
		if(b==i)
		{	
			System.out.println("Character at index "+i+" is "+a.charAt(i));break;
		}
	}
}
}