package varName;

public class StringOperation {

	public static void main(String[] args) {
		
		
		String str1="Hello",str2="Shreyas",str3="You are "+str2;
		System.out.println("Welcome "+str3);
		System.out.println(str1.length());
		System.out.println(str3.substring(0,5));
		System.out.println(str2.toUpperCase());
		
		if(str1.compareTo(str2)==0)
			System.out.println("Same");
		else
			System.out.println(str1.compareTo(str2));
		System.out.println(str1.equals(str2));
			
		
	}

}
