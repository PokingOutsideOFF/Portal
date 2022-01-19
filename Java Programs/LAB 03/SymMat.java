import java.util.Scanner;
class SymMat
{ public static void main(String args[])
	{ Scanner s=new Scanner(System.in);
	  System.out.println("Enter size of matrix");
	  int m=s.nextInt();
	  
	  int a[][]=new int[m][m];
	  System.out.println("\nEnter elements of matrix: ");
	  for(int i=0;i<m;i++){
	 	for(int j=0;j<m;j++){
			a[i][j]=s.nextInt();}}
	  
          System.out.println("\nThe matrix is: ");
	  for(int i=0;i<m;i++){
	 	for(int j=0;j<m;j++){
			System.out.print(a[i][j]+" ");
	        }System.out.println();}	

	  int b[][]=new int[m][m];
	  for(int i=0;i<m;i++){
	 	for(int j=0;j<m;j++){
			b[i][j]=a[j][i];
	        }}	
	  int k=0;
	
	  System.out.println("\nThe transpose matrix is: ");
	  for(int i=0;i<m;i++){
	 	for(int j=0;j<m;j++){
			System.out.print(b[i][j]+" ");
	        }System.out.println();}	


	  for(int i=0;i<m;i++){
	 	for(int j=0;j<m;j++){
		 	if(a[i][j]==b[i][j])
		          k=1;
	  		else
			break; }}
	  if (k==1)
 	  System.out.println("\nSymmetric Matrix");
  	  else
	  System.out.println("\nNon-Symmetric Matrix");
}}
