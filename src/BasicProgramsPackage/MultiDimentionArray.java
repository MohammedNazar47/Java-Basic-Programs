package BasicProgramsPackage;

public class MultiDimentionArray {

	public static void main(String[] args) {
		int [][] arrs = new int [3][4];
		
//			for(int i=0;i<3;i++ ) {
//				for(int j=0;j<4;j++) {
//					
//				}
//			}
		
		
		for(int i =0;i<3;i++) {
			for(int j = 0; j<4;j++) {
				arrs[i][j] = (int)(Math.random()*100);
				System.out.print(arrs[i][j] + " ");
			}
				System.out.println( );
		}

	}

}
