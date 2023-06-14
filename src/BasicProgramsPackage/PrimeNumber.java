package BasicProgramsPackage;

import java.util.Scanner;

public class PrimeNumber {
	public static void primeno() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = scanner.nextInt();
		int temp = 0;
		for(int i =2;i<=no-1;i++) {
			if(no%i==0) {
			temp = temp + 1;
		 }
		}
			if(temp==0)
		{
				System.out.println("It's a prime number");
		} else {
				System.out.println("It's not a prime number");
		}
	}
}
