import java.util.Scanner;
class TransposeMat
{ public static void main(String args[])
	{ Scanner s=new Scanner(System.in);
	  System.out.println("Enter size of matrix");
	  int m=s.nextInt();
	  int n=s.nextInt();
	  int a[][]=new int[m][n];
	  System.out.println("\nEnter elements of matrix: ");
	  for(int i=0;i<m;i++){
	 	for(int j=0;j<n;j++){
			a[i][j]=s.nextInt();}}
	  
          System.out.println("\nThe matrix is: ");
	  for(int i=0;i<m;i++){
	 	for(int j=0;j<n;j++){
			System.out.print(a[i][j]+" ");
	        }System.out.println();}	
	  
	  int b[][]=new int[n][m];
	  for(int i=0;i<n;i++){
	 	for(int j=0;j<m;j++){
			b[i][j]=a[j][i];
	        }}	

	  System.out.println("\nThe transpose matrix is: ");
	  for(int i=0;i<n;i++){
	 	for(int j=0;j<m;j++){
			System.out.print(b[i][j]+" ");
	        }System.out.println();}	
}
}