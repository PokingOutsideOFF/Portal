
public class ArmstrongwCmd
{ public static void main(String args[])
	{ int a;
	  a= Integer.parseInt(args[0]);
	  int k=0,s=0;
	  int t=a;
	 while(t!=0)
	{ t/=10;
	  k++;}t=a;
	 while(t!=0)
	{ int r=t%10;
	  s=s+(int)(Math.pow(r,k));
	  t/=10;
	}
	if(s==a)
	{ System.out.println(a+" is Armstrong");
	}
	else
	System.out.println(a+ " is Not Armstrong");
	}
}