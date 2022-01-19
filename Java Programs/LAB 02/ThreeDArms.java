import java.util.Scanner;
class ThreeDArms
{ public static void main(String args[])
{	Scanner s=new Scanner(System.in);
	System.out.println("\nThe 3 digit armstrong no. are: ");
	for(int i=100;i<999;i++)
	{ boolean k=armstrong(i);
	 if(k)
	 {System.out.print(i+" ");}
	}System.out.println();

}
static boolean armstrong(int a)
{ int t=a;int s=0;
	while(t!=0)
	{ int r= t%10;
	  s=s+r*r*r;
	  t/=10;
	}
if(a==s)
return true;
else
return false;
}
}