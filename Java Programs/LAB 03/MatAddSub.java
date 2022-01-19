import java.util.Scanner;
class MatAddSub
{ public static void main(String args[])
	{ Scanner s=new Scanner(System.in);
	  System.out.println("Enter size of matrix");
	  int n=s.nextInt();
	  int a[][]=new int[n][n];
	  int b[][]=new int[n][n];
	  System.out.println();
	  System.out.println("Enter elements of matrix A: ");
	  for(int i=0;i<n;i++){
	 	for(int j=0;j<n;j++){
			a[i][j]=s.nextInt();}}
	  System.out.println();	
	  System.out.println("Enter elements of matrix B: ");
	  for(int i=0;i<n;i++){
	 	for(int j=0;j<n;j++){
			b[i][j]=s.nextInt();}}
	  System.out.println();
	  System.out.println("Matrix A:");
	  for(int i=0;i<n;i++){
	 	for(int j=0;j<n;j++){
			System.out.print(a[i][j]+" ");
	        }System.out.println();}
	  System.out.println();
	  System.out.println("Matrix B:");
	  for(int i=0;i<n;i++){
	 	for(int j=0;j<n;j++){
			System.out.print(b[i][j]+" ");
	        }System.out.println();}
	  System.out.println();
	  System.out.println("A+B:");
	  for(int i=0;i<n;i++){
	 	for(int j=0;j<n;j++){
			System.out.print(a[i][j]+b[i][j]+" ");
	        }System.out.println();}
	  System.out.println();
	  System.out.println("A-B:");
	  for(int i=0;i<n;i++){
	 	for(int j=0;j<n;j++){
			System.out.print(a[i][j]-b[i][j]+" ");
	        }System.out.println();}
}
}