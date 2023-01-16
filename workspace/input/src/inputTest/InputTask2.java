package inputTest;

import java.util.Scanner;

public class InputTask2 {
	
	public static void main(String[] args) {
		
		//3개의 정수를 한번에 입력받은 후
		//세 정수의 곱 출력 Integer.parseInt(" ")
		
		/*
		 * 입력 받을 정수를 변수로 선언
		 * 입력 
		 * 첫번째 정수를 입력받기위해 메시지 출력
		 * 첫번째 정수 입력
		 * 두번쨰 정수 입력 메시지 출력
		 * 두번쨰 정수 입력
		 * 세번째 출력
		 * 세번째 입력
		 * 
		 *
		 */
		
		int first = 0;
		int second = 0;
		int third = 0;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개입력:");
	/*	first = Integer.parseInt(sc.next()); ///이쪽부분 복습
		second = Integer.parseInt(sc.next());
		third = Integer.parseInt(sc.next());
		*/
		first = sc.nextInt();
		second = sc.nextInt();
		third = sc.nextInt();
		
		result = first * second * third;
		
		
		System.out.printf("%d * %d * %d= %d",first, second, third, result);
		

		
		
		
	}

}
