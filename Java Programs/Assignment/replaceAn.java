import java.util.Scanner;
class replaceAn
{	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String k;
		System.out.println("Enter a long sentence");
		k=s.nextLine();
		String r;
		r=k.replace("an","the");
		System.out.println("Replaced sentence: "+r);
	}
}