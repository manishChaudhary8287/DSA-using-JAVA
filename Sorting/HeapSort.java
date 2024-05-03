import java.util.Scanner;

public class HeapSort {
	
	public static void sort(int[] array,int n) {
		
		for(int i=n/2-1;i>=0;i--) {
			heapify(array,n,i);
		}
		for(int i=n-1;i>0;i--) {
			int temp=array[i];
			array[i]=array[0];
			array[0]=temp;
			
			heapify(array,i,0);
		}
		
	}
	
	public static void heapify(int[] array,int n,int i) {
		
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n && array[left]>array[largest]) {
			largest=left;
		}
		if(right<n && array[right]>array[largest]) {
			largest=right;
		}
		if(largest!=i) {
			int temp=array[i];
			array[i]=array[largest];
			array[largest]=temp;
			
			heapify(array,n,largest);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n=sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Array before sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+ " ");
		}
		
		sort(array,n);
		
		System.out.println("\nArray after sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+ " ");
		}
		sc.close();
		

	}

}
