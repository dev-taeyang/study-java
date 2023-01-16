package inputTest;

import java.util.Scanner;

public class InputTask1 { ///이름수정할떄 A S R을 누른 후 수정해줘야함.

	/*
	 * 두 정수를 입력한 뒤 덧셈 결과 출력
	 * 단, next()만 사용한다.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int first = 0;
		int second = 0;
		
		System.out.println("첫번째 정수 입력: ");
		
		first = sc.nextInt();
		
		System.out.println("두번째 정수 입력: ");
		
		second = sc.nextInt();
		
		System.out.println("덧셈 결과 : " + (first + second));
		
		
		
		
		
		
	}
	
}
