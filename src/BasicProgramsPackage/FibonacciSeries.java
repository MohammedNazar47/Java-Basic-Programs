package BasicProgramsPackage;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		int n3,n = 9;
		System.out.println(n1+" "+ n2);
		for(int i=1;i<=n;i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
