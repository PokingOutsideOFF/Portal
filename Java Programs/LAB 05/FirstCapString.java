import java.util.*;
class FirstCapString
{ public static void main(String args[])
{	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string to be convert first letter of word to capital");
	String a=s.nextLine(),b=a.substring(0,1).toUpperCase();
	for(int i=1;i<a.length();i++)
	{	b=b+a.charAt(i);
		if(a.charAt(i)==' ')
		{	i++;
			b=b+a.substring(i,i+1).toUpperCase();
		}				
		
	}
	System.out.println("\nConverted String: "+b);
}
}	