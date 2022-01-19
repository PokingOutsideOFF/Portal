import java.util.Scanner;
class MatMulti
{ public static void main(String args[])
{ Scanner s=new Scanner(System.in);
System.out.println("Enter size of first matrix: ");
int m1=s.nextInt();
int n1=s.nextInt();
int a[][]=new int[m1][n1];

System.out.println("Enter size of second matrix: ");
int m2=s.nextInt();
int n2=s.nextInt();
int b[][]=new int[m2][n2];

if(n1==m2)
{}
else
{System.out.println("NOT POSSIBLE");
return;}


System.out.println("Enter elements of the first matrix: ");

for(int i=0;i<m1;i++){
	 for(int j=0;j<n1;j++){
		 a[i][j]=s.nextInt();}}
System.out.println("\nThe matrix is: ");
for(int i=0;i<m1;i++){
	 for(int j=0;j<n1;j++){
		System.out.print(a[i][j]+" ");}
System.out.println();}



System.out.println("Enter elements of the second matrix: ");
for(int i=0;i<m2;i++)
	 for(int j=0;j<n2;j++)
		 b[i][j]=s.nextInt();
System.out.println("\nThe matrix is: ");
for(int i=0;i<m2;i++){
	 for(int j=0;j<n2;j++){
		System.out.print(b[i][j]+" ");}
System.out.println();}



int c[][]=new int[m1][n2];

 for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < m2; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }
System.out.println("\nThe multiplied matrix is: ");
for(int i=0;i<m1;i++){
	 for(int j=0;j<n2;j++){
		System.out.print(c[i][j]+" ");}
System.out.println();}

}
}