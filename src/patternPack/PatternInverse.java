// package patternPack;


public class PatternInverse {

	public static void main(String[] args) {
		
		int ch = 65;
		for (int i = 1; i <= 4; i++) {
			
			for (int j = i; j <= 4; j++) {
//				System.out.print((char) (ch-1+j)+" ");
				System.out.print((char)(ch-1+j)+" ");
			}
			System.out.println();
		}
		
		
//		Print Pattern 1
//					  1 2
//					  1 2 3 
//					  1 2 3 4
		/*for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}*/
		
//		Print Pattern 1
//					  2 3 
//					  4 5 6
//					  7 8 9 10
		/*int num = 1;
		for (int i = 1; i <=4; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(num+++" ");
			}
			System.out.println();
		}*/

		
//		Inverse of like this 1 2 3 4
//							  2 3 4
//					           3 4
//					  			4
		/*for (int i = 1; i <= 4; i++) {
			for (int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int k = i; k <=4; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		*/
	}

}
