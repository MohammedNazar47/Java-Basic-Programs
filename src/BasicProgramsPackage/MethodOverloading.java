package BasicProgramsPackage;

public class MethodOverloading {
	
	void add() {
		int a =10, b = 20, c;
		c = a + b;
		System.out.println(c);
	}
     	int add(int x, int y) {
			int c;
			c = x + y;
			return c;		
		}
		
		void add(int p,double q) {
			double c = p + q;
			System.out.println(c);
		}
		
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.add();
		int ref= mo.add(40,47);
		System.out.println(ref);
		mo.add(20,70.07);

	}

}
