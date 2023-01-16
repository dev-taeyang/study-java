package operTest;

import java.util.Scanner;

public class Oper2 {
	
	public static void main(String[] args) {
		
		//두 정수 대소 비교
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력하세요: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		result = num1 > num2 ? num1 : num2; // 삼항 연산자 ??
		System.out.println("결과 : " + result);
		
	}

}
