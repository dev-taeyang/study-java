package arrayTest;

public class ArrTest {
	
	public static void main(String[] args) {
		
	int[][] arrData = {{3, 4, 5, 6}, {8, 9, 0, 9}, {1, 2, 3, 4}};
		
		for (int i = 0; i < arrData.length; i++) {
			
			for (int j = 0; j < arrData[i].length; j++) {
				
				System.out.print(arrData[i][j]);
				
			}
			
			System.out.println();
			
		}
		
		
//		int[][] arrData = {{3, 4, 5, 6}, {8, 9, 0, 9}, {1, 2, 3, 4}};
////		int[][] arrData = new int[3][4];
//		int length = 0;
//		
//		for(int i = 0; i < arrData.length; i++) {
//			
//			length += arrData[i].length; // length = length + arrData[i].length;
//			
//		}
//		
//		for (int i = 0; i < length; i++) {
//			
//			System.out.println(arrData[i/4][i%4]);
//		}
//		
	}

}
