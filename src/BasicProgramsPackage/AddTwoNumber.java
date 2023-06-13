package BasicProgramsPackage;

import java.util.Scanner;

public class AddTwoNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int number= scanner.nextInt();
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter the second number: ");
		int number1= scanner1.nextInt();
		
		int result = number + number1;
		System.out.println("The result is " + result);
	}
}
