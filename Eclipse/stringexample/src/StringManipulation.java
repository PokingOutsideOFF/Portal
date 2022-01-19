import java.util.*;
public class StringManipulation {

	public static void main(String[] args) {
		String str="Parse this String";
		ArrayList<String> words=new ArrayList<String>();
		while(str.length()>0) {
			for(int i=0;i<str.length();i++) {
				if(i==str.length()-1) {
					words.add(str.substring(0));
					str="";
					break;
				}
				else if(str.charAt(i)==' ') {
					words.add(str.substring(0,i));
					str=str.substring(i+1);
					break;
				}	
			}
		}
		
		System.out.println("The number of words in the sentence are: "+words.size());
		Collections.sort(words);
		System.out.println("Sorted words "+words);
	}
}
