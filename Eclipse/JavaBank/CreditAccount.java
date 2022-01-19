
public class CreditAccount extends AbstractBankAccount{

	int creditLimit;
	
	//default constructor for CreditAccount
	CreditAccount(String name,int num,int amt)
    {
    	super(name,num,amt);
    	this.creditLimit=calculateCreditLimit(amt);
    }
	//overloaded constructor for CreditAccount
	CreditAccount(String name, int num,int amt,int credit)
    {
            super(name,num,amt);
            this.creditLimit=credit;
            
    }
	
	private static int calculateCreditLimit(int amt)
	{
		if(amt>=1 && amt<=2000)
			return 100;
		else if(amt<=4000)
			return 200;
		else
			return 300;
	}
	//modifier to set the account creditlimit
	 public void setcreditlimit(int num)
	    {
	    	    creditLimit = num;
	    }
	//accessor to get the account creditlimit
	 public int getcreditlimit ( ) {
	   	 
	    	return creditLimit;
	    }
	 
	 public void deposit(int amt)
	    {		balance=balance+amt;
	    
	    }
	 public String toString() {
		 return super.toString()+""+"Credit limit: " + creditLimit+"\n";
		 //System.out.print("Credit limit: " + creditLimit+"\n");
	 }
	 
	 //print method 
	 public void print() {
	        System.out.println(toString());
	      }
}
