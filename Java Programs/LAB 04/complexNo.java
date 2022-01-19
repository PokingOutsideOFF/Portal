import java.util.Scanner;
class complexNo
{	int r,i;
complexNo(){}
complexNo(int a,int b)
{	r=a;i=b;
}
complexNo compAdd(complexNo A,complexNo B)
{	complexNo sum=new complexNo();
	sum.r=A.r+B.r;
	sum.i=A.i+B.i;
	return sum;
}
	
public static void main(String args[])
	{	Scanner s=new Scanner(System.in);

		System.out.println("\nEnter the real and imaginary part of first complex number");
		int r1=s.nextInt();
		int i1=s.nextInt();
		
		System.out.println("Enter the real and imaginary part of second complex number");
		int r2=s.nextInt();
		int i2=s.nextInt();
		
		complexNo A=new complexNo(r1,i1);
		complexNo B=new complexNo(r2,i2);
		complexNo C=new complexNo();
		C=C.compAdd(A,B);
		System.out.println("Sum of the two complex numbers is: "+C.r+" + i"+C.i);
	}
}
		