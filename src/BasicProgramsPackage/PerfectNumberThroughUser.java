package BasicProgramsPackage;

import java.util.Scanner;

public class PerfectNumberThroughUser {

	public static void throughperfect(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		 int no = scanner.nextInt();
		 int sum = 0;
		 for(int i = 1;i<no;i++) {
			 if(no%i==0)				// Through an user input
				 sum = sum + i;
	}
		 	if(sum==no) {
		 		
		 		System.out.println("It is an per6fect number");
		 	} else {
		 		
		 		System.out.println("It is not an perfect number");
		 	}
	}

}
