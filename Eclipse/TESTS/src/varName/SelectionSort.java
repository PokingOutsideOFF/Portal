package varName;
import java.util.*;
public class SelectionSort {

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter elements");
		for(int i=0;i<a.length;i++)
			a[i]=s.nextInt();
		System.out.print("Array: ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.print("\nSorted Array: ");
		int min;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		s.close();
	}
}
