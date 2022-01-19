
public class StringExample {
	public static void main(String args[]) {
		String str="Sample String";
		displayString(str);
		displayStringBackwards(str);
		searchString(str,'S');
	}
	
	static void displayString(String str) {
		System.out.println(str);
		for(int i=0;i<str.length();i++)
			System.out.print(str.charAt(i));
		System.out.println("");
	}
	
	static void displayStringBackwards(String str) {
		for(int i=str.length()-1;i>=0;i--)
			System.out.print(str.charAt(i));
		System.out.println("");
	}
	
	static void searchString(String str,char val) {
		int k=0;
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==val)
				k++;
		System.out.println("The character "+val+" appears in the text "+k+" times.");
	}
}
