package arrayTest;

import java.util.Scanner;

public class ArTask {
	
	public static void main(String[] args) {
		
//      브론즈
//     1. 1~10까지 배열에 담고 출력
//      int[] arData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//      int[] arData = new int[10];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1; 
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
      
//      2. 10~1까지 중 짝수만 배열에 담고 출력
//		int[] arData = new int[5];
//		// 0 -> 10 , 1 -> 8
//		for(int i = 0; i < arData.length ; i++) {
//			
//			arData[i] = 10- (i * 2);
//			System.out.print(arData[i] + " ");
//			
//		}
		
		
		
//      int[] arData = new int[5];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = 10 - i * 2;
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
      
//    3.  1~100까지 배열에 담은 후 홀수만 출력
		
//		int[] arData = new int[100]; // 0 -> 1 1 -> 3 2 -> 5
//		
//		for(int i = 0 ; i < arData.length ; i++) {
//			
//			if(i < 50 ) {
//				
//				arData[i] = i*2 + 1;
//				System.out.print(arData[i] + " ");
//				
//			}
//			else {
//				break;
//			}
//			 
//			
//		}
		
		
//      int[] arData = new int[100];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//         if(arData[i] % 2 == 0) {continue;}
//         System.out.println(arData[i]);
////         if(arData[i] % 2 == 1) {
////            System.out.println(arData[i]);
////         }
//      }
      
//      실버
//      1. 1~100까지 배열에 담은 후 짝수의 합 출력
		
//		int[] arData = new int[100];
//		int result = 0;
//		for(int i = 0; i < arData.length ; i++ ) {
//			
//			if(i<50) {
//				
//				arData[i] = i * 2 +2;
//				result = result + arData[i] ;
//				
//			}
//			else {
//				break;
//			}
//			
//			
//		}
//		System.out.printf("결과는 : %d",result);
		
	
		
		
//      int[] arData = new int[100];
//      int total = 0;
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//         if(arData[i] % 2 == 0) {
//            total += arData[i];
//         }
//      }
//      
//      System.out.println(total);
      
      
//      2. A~F까지 배열에 담고 출력
//      char[] arData = new char[6];
////      for (int i = 0; i < arData.length; i++) {
////    	  arData[i] = (char)(i + 65);
////    	  System.out.print(arData[i] + " ");
////    	  
////      	}
//      for (char i = 'A'; i < 'G'; i ++) { //'A' -> 65니까 i = 65 ~ 70
//    	  arData[i - 65] = i; // i= 65 -> arData[0]
//    	  System.out.print(arData[i - 65]);
//      	}
//  
 
//      3. A~F까지 중 C제외하고 배열에 담은 후 출력
//      char[] arData = new char[5];
////    0 > 1 ? 0 + 66 : 0 + 65 -> 거짓이라 arData[0] = (char)65 -> A
////    2 > 1 ? 2 + 66 : 2 + 65 -> 참이라 arData[2] = (char)2+66 -> D출력 
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = (char)(i > 1 ? i + 66 : i + 65); 
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
      
//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//      Scanner sc = new Scanner(System.in);
//      String message = "5개의 정수를 입력하세요\n예)1 3 4 5 6";
//      int[] arData = new int[5];
//      int max = 0, min = 0;
//      
//      System.out.println(message);
//     // 사용자가 입력한 정수를 배열에 담아준다.
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = sc.nextInt();
//      }
//      
//     // 첫 번째로 입력받은 값을 max와 min에 각각 담아준다.
//      max = arData[0];
//      min = arData[0];
//      
//      for (int i = 1; i < arData.length; i++) {
//       //  만약 max에 담긴 값보다 더 큰 값이 있다면, 그 값을 max에 담아준다.
//         if(max < arData[i]) {max = arData[i];} // i = 1 -> max = arData[1]
//       //  만약 min에 담긴 값보다 더 작은 값이 있다면, 그 값을 min에 담아준다.
//         if(min > arData[i]) {min = arData[i];}
//      }
//      
//      System.out.printf("최대값 : %d\n", max);
//      System.out.printf("최소값 : %d\n", min);
      
//      다이아
//      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
//      int[] arData = null;
//      Scanner sc = new Scanner(System.in);
//      String message = "몇 개의 정수를 입력하시겠어요?";
//      int total = 0;
//      double average = 0.0;
//      
//      System.out.println(message);
//      
//      arData = new int[sc.nextInt()];
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.print(i + 1 + "번째 정수 : ");
//         arData[i] = sc.nextInt();
//         total += arData[i];
//      }
//      
//      average = (double)total / arData.length;
//      
//      System.out.println("평균 : " + average);

	}
}


