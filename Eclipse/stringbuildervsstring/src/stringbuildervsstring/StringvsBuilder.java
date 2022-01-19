package stringbuildervsstring;

public class StringvsBuilder {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("Test Immutability");
		String str2="Test Immutability";
		
		System.out.println("StringBuilder: "+str.hashCode());
		System.out.println("String: "+str2.hashCode());
		
		str.replace(0, str.length(), "Hello World");
		str2="Hello World";
		
		System.out.println("StringBuilder: "+str.hashCode());
		System.out.println("String: "+str2.hashCode());
	}

}
