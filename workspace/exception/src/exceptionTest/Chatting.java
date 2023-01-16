package exceptionTest;

import java.util.Scanner;

public class Chatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String massage = null;

		System.out.println("메세지 : ");
		massage = sc.nextLine();
//		입력받은 메세지 중 "바보"가 포함되어있으면.
		if (massage.contains("바보")) {
//			BadWordException 예외를 발생시켜 "욕설은 안돼요!"를 출력함.
//			try { // A+ S+ z 단축키 그영역에 쓸 문법을 바로 쓸
			throw new BadWordException("욕설은 안돼요!"); // 예외를 필드에 올려서 발생을 시키는것 trow
		}
	}

}
