public class FinallyImp
{    
      public static void main(String args[])
{   
      try {    
        	System.out.println("Inside the try block");  
       		int data=25/0;    
       		System.out.println(data);    
      	  }    
      	catch(NullPointerException e)
	{  
       		 System.out.println(e);  
     	}   
   
      	finally 
	{  
       		 System.out.println("\nFinally block is always executed");  
		 System.out.println("Could not find suitable catch\n");
		 System.out.println("Error thrown by compiler if it is there: \n");
      	}    
  
      System.out.println("Code is out of try catch and finally");    
   }    
}    