import java.util.*;
public class SsnCheck {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String ssn=getSsn(in);
		if(validSsn(ssn))
			System.out.print(ssn+" is valid Social Security Number");
		else
			System.out.print("This Social Security Number is not valid! must be in format (999-99-9999)");
		in.close();
	}
	static boolean validSsn(String ssn) {
		return ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}");
	}
	private static String getSsn(Scanner in) {
		System.out.print("Enter your Social Security Number: ");
		return in.nextLine();
	}
}