package BasicProgramsPackage;

public class ReverseNumber {

	public static void reverseno() {
		int no =1234;
		int rev = 0;
		while(no!=0) {
			int rem = no % 10;
			 rev = rev*10+rem;
			 no = no/10;
		}
		 System.out.println(rev);

	}

}
