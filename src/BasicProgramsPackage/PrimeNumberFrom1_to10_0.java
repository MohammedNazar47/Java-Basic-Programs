package BasicProgramsPackage;

public class PrimeNumberFrom1_to10_0 {

	public static void noPerfect1_to_100() {
		int temp =0;
		for(int i = 1;i<= 100;i++) {
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					temp = temp+i;
				}
			}
			if(temp==0) {
				System.out.println(i);
			}
			else {
					temp = 0;
			}
		}

	}

}
