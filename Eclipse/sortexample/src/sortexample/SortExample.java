package sortexample;

public class SortExample {

	public static void main(String[] args) {
		int numbers[]= {40,7,59,4,1};
		displayElements(numbers);
		sequentialSearch(numbers,13);
		sequentialSearch(numbers,7);
		//selectionSort(numbers);
		//displayElements(numbers);
		System.out.print("\n");
		bubbleSort(numbers);
		displayElements(numbers);
		binarySearch(numbers,7);
		binarySearch(numbers,41);
	}
	
	static void selectionSort(int []numbers) {
		int min;
		for(int i=0;i<numbers.length;i++) {
			min=i;
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[j]<numbers[min]) {
					min=j;
				}
			}
			int temp=numbers[i];
			numbers[i]=numbers[min];
			numbers[min]=temp;
		}
	}
	
	static void bubbleSort(int []numbers) {
		boolean flag=false;
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length-1;j++) {
				if(numbers[j]>numbers[j+1]) {
					flag=true;
					int temp=numbers[j];
				    numbers[j]=numbers[j+1];
				    numbers[j+1]=temp;
				}
			}
			if(!flag)
				return;
		}
	}
	
	static void sequentialSearch(int []numbers,int val) {
		for(int i=0;i<numbers.length;i++) {
			if(val==numbers[i]) {
				System.out.println("The number "+val+" is at position "+i+" in the list");
				return;
			}
		}
		System.out.println("The number "+val+" is not in the list");
	}
	
	static void binarySearch(int []numbers,int val) {
		int lb=0,ub=numbers.length-1,mid;
		while(ub>=lb) {
			mid=(ub+lb)/2;
			if(numbers[mid]==val) {
				System.out.println("The number "+val+" is at position "+mid+" in the list");
				return;
			}
			if(numbers[mid]<val)
				lb=mid+1;
			if(numbers[mid]>val)
				ub=mid-1;
		
		}
		System.out.println("The number "+val+" is not in the list");
	}
	
	static void displayElements(int []numbers) {
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println("");
	}

}
