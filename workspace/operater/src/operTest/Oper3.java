package operTest;// 숙제1

import java.util.Scanner;

public class Oper3 {
	
	public static void main(String[] args) {
		
		// 사용자에게 키를 입력 받고
		// 정수라면 정수로 출력
		// 실수라면 실수로 출력
		// 예) 183 -> 183 출력
		// 183.5 -> 183.5
		// 삼항 연산자를 사용!
		// 뺼샘으로 풀면 쉬움. 서식문자로 풀면 더 쉬움
		
		/*
		 * 입력 받을 변수 선언
		 * scanner 변수 선언
		 * 출럭 메세지 출력
		 * 입력받을 수 입력
		 * 정수 + 정수 = 정수 비교대상 정하기 입력값에 0을 더했을때 같은값이 나오면 참 아니면 거짓
		 * 정수 + 실수 = 실수
		 * 
		 */
		/*double num1 = 0; // 입력받을 수 변수선언
		String result1 = ""; // 결과를 문자열로 출력
		
		
		Scanner sc = new Scanner(System.in); // 입력 변수 선언
		
		System.out.println("정수 또는 실수를 입력하시오.");// 출력메세지 출력
		System.out.println("1. : "); // 출력메세지 출력
		num1 = sc.nextDouble();// 입력
				
		result1 = num1 - (int)num1 > 0 ? "입력한 값은(실수): %f" : "입력한 값은(정수): %.0f" ;
		// num1에서 int로 강제형변환 한 수를 뻇을때 실수라면 0보다 크기 때문에 %f를 출력, 정수라면 자리수가 없는 %f를 출력
		System.out.printf(result1,num1);// 서식문자 출력시 printf사용
		*/
		
		  double height = 0.0;
	      String message = "키: ";
	      Scanner sc = new Scanner(System.in);
	      boolean check = false;
	      String format = null;
	      String forLength = "";
	      int length = 0;
	      
	      System.out.print(message);
	      height = sc.nextDouble();
	      check = height - (int)height == 0;
	      forLength = height - (int)height + "";
	      
	      length = forLength.length() > 8 ? 8 : forLength.length();
	      
	      format = check ? "%.0fcm" : "%." + (length - 2) + "fcm"; // 소수점 길이를 판단하는 함수
	      System.out.printf(format, height); 

		
	
	}

}
