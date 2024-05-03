import java.util.*;

// This is the java program for the binary search in the array of int type.
public class BinarySearch {
	
	public void binarySearchMethod(int[] array,int i,int n,int num) {
		int mid=(i+n)/2;
		while(i<=n) {
			if(array[mid]==num) {
				System.out.println("Number is found at location : "+(mid+1));
				break;
			}
			else if(array[mid]>num) {
					n=mid-1;
					mid=(i+n)/2;
				}
			else {
				i=mid+1;
				mid=(i+n)/2;
			}
			if(i>n) {
				System.out.println("Element not found!!!");
			}
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
		System.out.print("Enter the number to be search in the array : ");
		int num=sc.nextInt();
		BinarySearch obj = new BinarySearch();
		obj.binarySearchMethod(array,0,n-1,num);
		System.out.println("Numbers present in the array : ");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+ " ");
		}
		sc.close();

	}

}
