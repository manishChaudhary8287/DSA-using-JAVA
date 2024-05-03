import java.util.*;
public class InsertionSort {

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
		
		for(int i=0;i<n;i++) {
			int key=array[i];
			int j=i-1;
			
			while(j>=0 && array[j]>key) {
				array[j+1]=array[j];
				j-=1;
			}
			array[j+1]=key;
		}
		
		System.out.println("\nArray after sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+ " ");
		}
		sc.close();


	}

}
