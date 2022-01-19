
public class RevNumwCmd
{ public static void main(String args[])
	{
	  int a;
	  a= Integer.parseInt(args[0]);
	  int t=a,s=0,k=0;
	 while(t!=0)
	{ t/=10;
	  ++k;}t=a;
	 while(t!=0)
	{ int r=t%10;
	  s=s+r*(int)(Math.pow(10,--k));
	  t/=10;
	}
	System.out.println("\n"+s);
}
}