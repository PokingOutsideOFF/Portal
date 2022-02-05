package accountgenerator;

import java.util.*;
public class Employee {
	String name,username,email,password;
	
	public String toString() {
		return "Employee Details\n"+"Name: "+name+"\nUsername: "+username+"\nEmail: "+email+"\nIntial password: "+password;
	}
	
	public Employee() {
		name=setName();
		username=setUserName(this.name);
		email=setEmail(this.username);
		password=setPassword(this.username);
	}
	
	/*private int countChars(String s,char c) {
		int count=0;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)==' '||s.charAt(i)=='.')
				count++;	
		return count;
	}*/
	
	public String setName() {
		Scanner s=new Scanner(System.in);String n;
		while(true) {
			System.out.println("Enter your first and last name");
			n=s.nextLine();
			//int k=countChars(n,' ');
			if(getName(n))
				break;
			else
				System.out.println("Invalid. Enter again");
		}
		
		s.close();
		return n;
	}
	
	public boolean getName(String n) {
		return n.matches("[a-zA-Z]+\s[a-zA-Z]+"); 
	}
	
	public String setUserName(String n) {
		n=n.toLowerCase();
		n=n.replace(' ','.');
		
		return n;
	}
	
	public String setEmail(String uname) {
		
		String t;
		int i=0;
		t=""+uname.charAt(i);
		
		while(!(uname.charAt(i)=='.')) {
			i++;
		}
		t=t+uname.substring(i+1)+"@oracleacademy.Test";
		
		return t;
	}
	
	public String setPassword(String uname){
		String password;int i=0;
		
		password=(uname.charAt(i)+"").toUpperCase();
		for(i=1;i<uname.length();i++) {
			if(uname.charAt(i)==' '||isVowel(uname.charAt(i))) 
					password=password+"*";
			else
				password=password+uname.charAt(i);
		}
		
		while(password.length()<8)
			password=password+"*";
		
		password=password.substring(0,8);
	
		
		return password;	
	}
	public boolean isVowel(char c) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			return true;
		else
			return false;
	}
	
}