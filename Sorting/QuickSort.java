import java.util.Scanner;

public class QuickSort {
	
	public static void quick(int[] array,int low,int high) {
		if(low<high) {
			int pivotIndex=partition(array,low,high);
			quick(array,low,pivotIndex-1);
			quick(array,pivotIndex+1,high);
		}
		
	}
	public static int partition(int[] array,int low ,int high) {
		int pivot=array[high];
		int i=(low-1);
		for(int j=low;j<high;j++) {
			if(array[j]<pivot) {
				i++;
				int temp=array[j];
				array[j]=array[i];
				array[i]=temp;
			}
		}
		int temp=array[high];
		array[high]=array[i+1];
		array[i+1]=temp;
		
		return (i+1);
		
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
		quick(array,0,n-1);
		
		System.out.println("\nArray after sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+ " ");
		}
		sc.close();

	}

}
