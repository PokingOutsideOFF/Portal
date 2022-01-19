import java.io.*;
public class Fibonacci
{ public static void main(String args[])throws IOException
	{ BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	  int a;
	  System.out.println("Enter number of terms");
	  a= Integer.parseInt(in.readLine());
	  long u=0,v=1, w;
	if(a>=1)
	System.out.print(u+" "+v);
	else
	System.out.print(u);
         while(a>1)
	{ w=u+v;
	  System.out.print(" "+w);
	  u=v;
	  v=w;--a;
	}
	}
}