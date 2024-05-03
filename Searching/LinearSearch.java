import java.util.*;

// This is the java program for the linear Search
public class LinearSearch {

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
		int loc=-1;
		for(int i=0;i<n;i++) {
			if(array[i]==num) {
				loc=i;
				break;
			}
		}
		if(loc==-1) {
			System.out.println("Number not found!!!");
		}
		else {
			System.out.println("Number found at the location : "+ (loc+1));
		}
		System.out.println("Numbers present in the array : ");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+ " ");
		}
		sc.close();
	}

}