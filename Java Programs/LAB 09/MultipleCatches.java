public class MultipleCatches 
{  
    public static void main(String args[]) 
{  
           try{    
                int a[]=new int[5];
		a[Integer.parseInt(args[0])]=10;    
                a[5]=30/0;    
                  
               } 
		catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("\nGoing out of range");  
                  }       
               catch(ArithmeticException e)  
                  {  
                   System.out.println("\nWhy are you dividing by zero?");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
              System.out.println("Out of try catch blocks");    
    }  
} 