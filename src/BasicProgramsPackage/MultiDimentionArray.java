package BasicProgramsPackage;

public class MultiDimentionArray {

	public static void Multidimention() {
		int [][][] arrs = new int [3][4][5];
		
			for(int i=0;i<3;i++ ) {
				for(int j=0;j<4;j++) {
					for(int k = 0;k<5;k++) {
					
		arrs[i][j][k] = (int)(Math.random()*10);
					
				}
		}
			}
		
		for(int i =0;i<3;i++) {
			for(int j = 0; j<4;j++) {
				for(int k = 0;k<5;k++) {
			
				System.out.print(arrs[i][j][k] + " ");
			}
				System.out.println( );
		}

	}

}
}