
abstract public class AbstractBankAccount {
	public final String BANK="JavaBank";
	protected String accountname;
    protected int accountnum;
    protected int balance;
    
    public AbstractBankAccount(String name, int num,int amt)
    {
            accountname=name;
    	    accountnum=num;
            balance=amt;
    }
    
	abstract public void deposit(int amt);
	 
	public String getBankName() {return BANK; }
	
	public void setaccountname(String name){accountname = name;}
	public String getaccountname(){return accountname;}
	
	public void setaccountnum(int num){accountnum = num;}
	public int getaccountnum (){return accountnum;}
	
	public void setbalance(int num){balance = num;}
	public int getbalance(){return balance;}
	
	public void withdraw(int amt){balance=balance-amt;}
	
	public String toString() {return "Bank Name: "+getBankName()+"\nAccount Holder:  "+accountname + "\nAccount Number:  " + accountnum + "\nAccount balance:  " + balance+"\n";}
	
	
		
	
	
	 
}
