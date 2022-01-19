class Table
{  
	synchronized void printTable(int n)
	{	System.out.println("\nTable of "+n+": ");  
   		for(int i=1;i<=10;i++) 
     			System.out.println(n*i);  	
	}	  
}  
  
public class Synchro
{  
	public static void main(String args[])	
	{  
		Table obj = new Table();
		Thread t1=new Thread(){  
		public void run(){ 
			obj.printTable(5);  
		}  
		};  
		Thread t2=new Thread(){  
		public void run(){
			obj.printTable(13);  
		}  
		};  
		t1.start();
		t2.start();
	}  
}  