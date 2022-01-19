package regexgroups;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.*;
public class RegExGroups {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String date;
		Pattern dateP=Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");
		date=getDate(in,dateP);
		System.out.print("ISO 8601 Style date: "+date);
		in.close();
	}
	
	static String getDate(Scanner in,Pattern dateP) {
		String date;
		Matcher dateM;
		boolean validDate=false;
		do {
			System.out.print("Enter date (DD/MM/YYYY): ");
			date= in.nextLine();
			dateM=dateP.matcher(date);
			if(dateM.matches()) {
				String day=dateM.group(1);
				String month=dateM.group(2);
				String year=dateM.group(3);
				validDate=validateDate(date);
				if(dateM.matches()&&validDate) {
					date=year+"/" +month+"/"+day;
				}
				else
					System.out.print("Incorrect date entered\n\n");
				
			}
		}while(!(dateM.matches()&&validDate));
		return date;
	}
	
	static boolean validateDate(String newDate) {
		DateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		format.setLenient(false);
		String date=newDate;
		try {
			format.parse(date);
			return true;
		}catch(ParseException e) {
			System.out.println(date+" is not valid according to "+((SimpleDateFormat)format).toPattern()+" pattern");
			return false;
		}
	}
	

}
