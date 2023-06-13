package BasicProgramsPackage;

import java.util.Scanner;

public class BinarySearchAlg {
	public static  void binary(int [] arr,int searchvalue) {
		int start = 0;
		int end = arr.length-1;
		int mid = (start+end)/2;
		
		while(arr[mid]!=searchvalue && start<end) {
			if(searchvalue<arr[mid]) {
				end= mid -1;
			} else {
				start = mid +1;
			}
			mid = (start+end)/2;
		}
			if(searchvalue==arr[mid]) {
				System.out.println("the element is present at index " + mid );
				System.out.println(arr.length);
			} else {
				System.out.println("the element is not present");
			}
	}
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the index number: arr[] ");
				int number= scanner.nextInt();
				int [] arr = {1,2,3,4,5,6,7,8,9,};
				binary(arr,9);
			}
}
