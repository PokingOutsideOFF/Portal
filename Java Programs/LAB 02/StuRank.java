import java.util.Scanner;
class StuRank
{ public static void main(String args[])
{	Scanner s=new Scanner(System.in);
	System.out.print("\nEnter the student aggregate percentage: ");
	int n=s.nextInt();
	if(n>80)
	System.out.println("\nMerit");
	else if(n>70 && n<=80)
	System.out.println("\nDistinction");
	else if(n>60 && n<=70)
	System.out.println("\nFirst Class");
	else if(n>50 && n<=60)
	System.out.println("\nPass");
	else
	System.out.println("\nFail");
}
}