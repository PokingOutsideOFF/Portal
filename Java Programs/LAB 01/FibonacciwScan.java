import java.util.*;
public class FibonacciwScan
{ public static void main(String args[])
	{ Scanner s=new Scanner(System.in);
	  System.out.println("Enter number of terms");
	  int a= s.nextInt();
	  long u=0,v=1, w;
        System.out.print("\nFibonacci series till "+a+" terms is: ");
	if(a>=1)
	System.out.print(v);
	else
	System.out.print(u);
         while(a>1)
	{ w=u+v;
	  System.out.print(" "+w);
	  u=v;
	  v=w;--a;
	}System.out.println();
	}
}