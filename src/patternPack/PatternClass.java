package patternPack;


public class PatternClass {
	public static void main(String[] args) {
		for (int row = 1; row <= 4; row++) {
			for (int col = row; col <= 3; col++) {
				System.out.print(" ");
			}
			for (int ch = 1; ch <= row; ch++) {
				if (row == 1) 
					System.out.print("J");
				else if (row == 3) 
					System.out.print("V");
				else 
					System.out.print("A");
			}
			for (int even = row; even > 1; even--) {
				if (row %2 == 0) 
					System.out.print("A");
				else 
					System.out.print("V");
			}
			System.out.println();
			
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
//		int n = 4; // Number of rows
//
//        for (int i = 1; i <= n; i++) {
//            // Print spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            
//            // Print characters
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print((char) ('A' + n - i));
//            }
//            
//            System.out.println(); // Move to the next line
//        }
//
//	}
//}

//import java.util.Iterator;
//
//public class PatternClass {
//
//	public static void main(String[] args) {
////		Character a = 'A';
//		int letter = 'A';
//		for (Character ch = 65; ch < 87; ch++) {
//			Character cha = ch;
//			for (int row = 1; row < 9; row++) {
//				if(row % 2 != 0) {
//					for (int col = 0; col < 7-row; col++) {
//						System.out.print(" ");
//					}
//					for (int col = 0; col < row; col++) {
//						if (cha == 86) {
//							System.out.println((Character) cha);
//						}
//					}
//					
////					if (row == 1) {
////						System.out.print((Character) cha);
////					}
////					if (row == 3) {
////						System.out.println((Character) cha);
////					}
////					if (row == 5) {
////						System.out.println((Character) cha);
////					}
////					if (row == 7) {
////						System.out.println((Character) cha);
////					}
////					for (int col = 0; col < row; col++) {
////						System.out.print((Character) cha+" ");
////					}
//					System.out.println();
//				}
//			}
//		}
//		
//		
//		
////		for (Character i =65; i < 87; i++) {
////			Character j = i;
////			System.out.println();
////			for (int row = 1; row < 9; row++) {
////				if (row%2 != 0) {
////					for (int col = 0; col < 7-row; col++) {
////						System.out.print(" ");
////					}
////					for (int col = 0; col < row; col++) {
////						System.out.println((Character) j+" ");
////					}
////					
//////					for (int col = 0; col < row; col++) {
//////						if (row == 1) {
//////							System.out.print((Character) j+" ");
//////						}
//////						
//////					}
////					System.out.println();
////				}
////			}
////		}
//			
//		}
//		
//
//}
