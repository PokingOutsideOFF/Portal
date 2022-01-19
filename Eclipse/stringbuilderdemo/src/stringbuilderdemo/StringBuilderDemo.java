package stringbuilderdemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("Learning Java with Oracle");
		System.out.println("String: "+str);
		System.out.println("The length of text is: "+str.length());
		System.out.println("The second character is: "+str.charAt(2));
		System.out.println("The position of the start of text \"acl\" is: "+str.indexOf("acl"));
		System.out.println("The following text is included within the String: "+str.substring(1,4));
		System.out.println("Reverse: "+str.reverse());
		System.out.println("Reverse: "+str.reverse());
		str.append(" is fun");
		System.out.println("Appended String: "+str);
		str.delete(8, 13);
		System.out.println("Deleted String: "+str);
		str.insert(8," Java Programming");
		System.out.println("Inserted String: "+str);
		str.replace(13, 25, " String processing");
		System.out.println("Replaced String: "+str);
	}

}
