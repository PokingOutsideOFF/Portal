
public class testBank {
	
	public static void main(String[] args) {
     
	// Instantiate 3 accounts
		// Using constructor with values
    Account A1 = new Account("Sanjay Gupta",11556,300,AccountType.SAVINGS);
	Account A2 = new Account("Parsi",52000,600,AccountType.SAVINGS);
	Account A3 = new Account("Sahol",64781,50,AccountType.SAVINGS);
	
	//Set values of Instances created using default constructor
	
	// Print accounts
	System.out.println(A1);
	System.out.println(A2);
	System.out.println(A3);
	

}
}
