import java.util.Scanner;
import java.util.LinkedList;

class MyWallet
{	
	Double amt; 
	Scanner s = new Scanner(System.in);
	LinkedList<String> l = new LinkedList<String>();
	void create()
	{	
		String name;
        	       
        		
        		System.out.println("\nEnter your name: ");
       			while(true)
			{	
				name = s.nextLine();
				if(name.equals(""))
					System.out.println("\nInvalid.Enter your name again: ");
				else
					break;
			}
       			System.out.println("\nEnter your balance: ");
        		while(true)
			{	
				amt = s.nextDouble();
				if(amt>0)
					break;
				else
				System.out.println("\nInvalid.Enter your balance again: ");
			}

			
	}

	void addExpense()
	{	
		String expense_name;
		double expense_amt;
		s.nextLine();
		System.out.println("\nEnter expense name: ");
		
		while(true)
		{	
			expense_name=s.nextLine();
			if(expense_name.equals(""))
				System.out.println("\nInvalid.Enter expense name again: ");
			else
				break;
		}
			

		System.out.println("\nEnter expenditure: ");
		
		while(true)
		{	
			expense_amt=s.nextDouble();
			if(expense_amt>0)
				break;
			else
				System.out.println("\nInvalid.Enter your balance again: ");
		}
		
		amt -= expense_amt;
		store(expense_name,expense_amt);
	}
	
	void store(String a,double b)
	{	
		String c=a+" Rs "+b;
		l.add(c);
	}


	void display()
	{
		
		System.out.print("\n\n");
		System.out.print("Balance: " + amt + "\n\nExpenses: \n\n");
		for (int i = 0; i < l.size(); i++) 
		{
            		System.out.println((i+1) +". "+l.get(i));
        	}

	}

	
	public static void main(String args[])
	{	
		Scanner s = new Scanner(System.in);
		int opt;
		
		System.out.println("\n\nCreate Wallet: ");
		MyWallet a=new MyWallet();
		a.create();
		
		
		do
		{	
			System.out.println("\n\n\nMENU");
			System.out.println("\n1. Add Expense");
			System.out.println("2. Display Wallet & Expenses");
			System.out.println("3. Exit");
				
			System.out.print("\nEnter Option: ");
			opt = s.nextInt();
			
			switch(opt)
			{
				case 1: 
				a.addExpense();
				break;
				case 2:
				a.display();
				break;
				case 3:
				break;
				default:
				System.out.println("\nInvalid Option");
				break;
			}
			
		}while(opt != 3);
		
	}
}






     	

		
	

