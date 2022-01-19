
public class NameswCmd
{ public static void main(String args[])
	{
	  int a;
	  a= Integer.parseInt(args[0]); 	  
          System.out.println("\nThe names are: ");
	  for(int i=0;i<a;i++)
	  System.out.println(args[i+1]);
	}
}

	  			