public class Wallet implements java.io.Serializable {
private String userName;
private float amount;
public Wallet(String userName, float amount) {
super();
this.userName = userName;
this.amount = amount;
}
public String getUserName() {
return userName;
}
public void setUserName(String userName) {
this.userName = userName;
}
public float getAmount() {
return amount;
}
public void setAmount(float amount) {
this.amount = amount;
}
@Override
public String toString() {
return userName+" you have Rs. "+amount+" in your wallet";
}
}



public class Expense {
    private String date;
    private String details;
    private float amount;
 
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public Expense(String date,String details, float amount) {
        super();        
        this.date = date;
        this.details = details;
        this.amount = amount;
    }        
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String toString(){
        return date+";"+details+";"+amount;
    }
}

import java.io.*;
import java.util.LinkedList;
 
public class DataManager {
    private String wpath = "d:/data/wallet.dat";
    private String tpath = "d:/data/trans.dat";
    private Wallet w;
 
    public DataManager(Wallet w) throws ApplicationException {
        this.w = w;
        verifyFolder();
    }
 
    public DataManager() throws ApplicationException {
        verifyFolder();
    }
 
    private void verifyFolder() throws ApplicationException {
        File file0 = new File("D:/data");
        if (!file0.exists())
            file0.mkdir();
        File file1 = new File(wpath);
        if (file1.exists())
            w = getWallet();
 
    }
 
    public void addExpense(String details, float amt)
            throws ApplicationException {
        Expense e = new Expense(new java.util.Date().toString(), details, amt);
        PrintStream pw = null;
        try {
            pw = new PrintStream(new FileOutputStream(tpath, true));
            withdrawFromWallet(amt);
            pw.println(e);
        } catch (IOException e1) {
            throw new ApplicationException("unable to write transactions");
        } finally {
            pw.close();
        }
    }
 
    public LinkedList<Expense> listExpenses() throws ApplicationException {
        LinkedList<Expense> expenses = new LinkedList<Expense>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(tpath));
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(";");
                Expense e = new Expense(fields[0], fields[1],
                        Float.parseFloat(fields[2]));
                expenses.add(e);
                line = br.readLine();
            }
        } catch (IOException ex) {
            throw new ApplicationException("Unable to read transactions: "
                    + ex.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
            }
        }
        return expenses;
    }
 
    public Wallet getWallet() throws ApplicationException {
        try {
            ObjectInputStream op = new ObjectInputStream(new FileInputStream(
                    wpath));
            Object obj = op.readObject();
            Wallet w = (Wallet) obj;
            this.w = w;
            op.close();
            return w;
        } catch (FileNotFoundException fe) {
            throw new ApplicationException(
                    "Data file not found/No datafile created yet!");
        } catch (IOException ex) {
            throw new ApplicationException("Error while reading file: "
                    + ex.getMessage());
        } catch (ClassNotFoundException cx) {
            throw new ApplicationException(
                    "Invalid datafile/data inside file is modified!");
        }
    }
 
    public void addMoneyToWallet(float amt) throws ApplicationException {
        updateWallet(w.getUserName(), w.getAmount() + amt);
    }
 
    public void withdrawFromWallet(float amt) throws ApplicationException {
        float t = w.getAmount() - amt;
        if (t < 0)
            throw new ApplicationException(
                    "No enough cash available in your wallet!!!");
        updateWallet(w.getUserName(), w.getAmount() - amt);
    }
 
    public void updateWallet(String name, float a) throws ApplicationException {
        try {
            ObjectOutputStream op = new ObjectOutputStream(
                    new FileOutputStream(wpath));
            w = new Wallet(name, a);
            op.writeObject(w);
            op.close();
            File file = new File(tpath);
            file.delete();
        } catch (FileNotFoundException e) {
            throw new ApplicationException(
                    "Data file not found/Data file may be DELETED!");
        } catch (IOException e) {
            throw new ApplicationException("Error while writing datafile : "
                    + e.getMessage());
        }
    }
}

import java.io.*;
import java.util.LinkedList;
 
public class UserIO {
    private DataManager man = null;
    private BufferedReader br = null;
 
    public UserIO()throws ApplicationException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        man = new DataManager();
    }
 
    public void createWallet()
    {
        String name;
        float amt;        
        try{
        System.out.println("Enter your name: ");
        name = br.readLine();
        System.out.println("Enter your balance: ");
        amt = Float.parseFloat(br.readLine());
        man.updateWallet(name, amt);
        }catch(IOException ex){    }
        catch(ApplicationException ae){
            System.out.println("Could not create new wallet");
            System.out.println("Error: "+ae.getMessage());
        }
        System.out.println("\n\n\n\n\n\n\n\n\n");
        getKey();
    }
    public void addExpense()
    {
        try{
        System.out.print("\nEnter details of expenses: ");
        String details = br.readLine();
        System.out.print("\nEnter amount: ");
        float amt = Float.parseFloat(br.readLine());        
        man.addExpense(details, amt);
        }catch(IOException ex){}
        catch(ApplicationException ap){
            System.out.println("Error: "+ap.getMessage());
        }
        System.out.println("\n\n\n\n\n\n\n\n\n");
        getKey();
    }
    public void listExpenses(){        
        LinkedList<Expense> exps = null;
        try {
            exps = man.listExpenses();
        } catch (ApplicationException e1) {
            System.out.println("Error: "+e1.getMessage());
        }
        if(exps==null || exps.size()==0)
        {
            System.out.println("No Expenses made so far?");
            return;
        }        
        String h1 = " Date/Time ";
        String h2 = " Details ";
        String h3 = " Amount ";
        System.out.printf("%n%-32s|%-25s|%15s%n",h1,h2,h3);        
        for(Expense e:exps){
            System.out.println("--------------------------------+-------------------------+---------------------");
            System.out.printf("%-31s |%-24s | %12.2f%n",e.getDate(),e.getDetails(),e.getAmount());            
        }
        System.out.println("--------------------------------------------------------------------------------");
        getKey();
    }
    public void displayWallet()
    {
        System.out.println("----- Wallet Info -----------------");
        Wallet w;
        try {
            w = man.getWallet();
            System.out.println("\nName of User : "+w.getUserName());
            System.out.println("\nBalance      : "+w.getAmount());
        } catch (ApplicationException e) {
            System.out.println("\nError: "+e.getMessage());
        }                
        System.out.println("-----------------------------------");
        System.out.println("\n\n\n\n\n\n\n\n\n");
        getKey();
    }
 
    public void depositCash(){
        System.out.println("Enter amount to be deposited: ");
        try {
            float amt = Float.parseFloat(br.readLine());
            man.addMoneyToWallet(amt);
        } catch (NumberFormatException e) {
                System.out.println("Error: Please enter amount in digits only");
        } catch (IOException e) {}
        catch(ApplicationException ae){
            System.out.println("Error: "+ae.getMessage());
            System.out.println("Amount NOT deposited!");
        }
        getKey();
    }
    public char getOption(){
        String line = null;
            try {
                line=br.readLine();                
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            line.toUpperCase();
            return line.charAt(0);            
    }
    private void getKey(){
        try {
            System.out.println("\n\n\n\n\n\n\nPress any key to continue...");
            br.readLine();
        } catch (IOException e) {
 
        }
    }
}


public class MyWallet {
 
    /**
     * @param args
     */
    public static void main(String[] args) {        
        UserIO io = null;
        System.out.println("--------------- Mahendra's Wallet Manager --------------");
        System.out.print("Starting up....");        
        try {
            io = new UserIO();
        } catch (ApplicationException e) {            
            System.out.print("\rError: "+e.getMessage());
            System.out.println("Application is Shutting down...");
            return;
        }
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {    }        
        System.out.print("\rStarted Successfuly\n");
        while(true){
            System.out.println("   Menu");
            System.out.println("   ----------------------------");
            System.out.println("     Key    Description");
            System.out.println("   ----------------------------");
            System.out.println("     C      Create new Wallet");
            System.out.println("     I      Get Wallet Info");
            System.out.println("     A      Add new expense");
            System.out.println("     L      List all expenses");
            System.out.println("     D      Deposit amount");
            System.out.println("     X      Exit Application");
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n----------------------------");
            System.out.print("   Your option: ");
            char ch = io.getOption();
            switch(ch){
            case 'C':
            case 'c':
                io.createWallet();
                break;
            case 'I':
            case 'i':
                io.displayWallet();
                break;
            case 'A':
            case 'a':
                io.addExpense();
                break;
            case 'D':
            case 'd':
                io.depositCash();
                break;
            case 'L':
            case 'l':
                io.listExpenses();
                break;
            case 'X':
            default:
                return;
            }            
        }
    }
}