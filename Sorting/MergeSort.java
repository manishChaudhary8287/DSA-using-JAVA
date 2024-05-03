import java.util.Scanner;

public class MergeSort {
	
	public static void sort(int[] array,int l,int r) {
		
		if(l<r) {
			int m=(l+(r-1))/2;
			sort(array,l,m);
			sort(array,m+1,r);
			merge(array,l,m,r);
		}
		
	}
	public static void merge(int[] array,int l,int m,int r) {
		
		int n1=m-l+1;
		int n2=r-m;
		int[] l1=new int[n1];
		int[] r1=new int[n2];
		
		for(int i=0;i<n1;i++) {
			l1[i]=array[i+l];
		}
		for(int j=0;j<n2;j++) {
			r1[j]=array[j+m+1];
		}
		int i=0,j=0,k=l;
		while(i<n1 && j<n2) {
			if(l1[i]<=r1[j]) {
				array[k]=l1[i];
				i++;
			}
			else {
				array[k]=r1[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			array[k]=l1[i];
			i++;
			k++;
		}
		while(j<n2) {
			array[k]=r1[j];
			j++;
			k++;
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
		
		sort(array,0,n-1);
		System.out.println("\nArray after sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+ " ");
		}
		sc.close();
	}
}
