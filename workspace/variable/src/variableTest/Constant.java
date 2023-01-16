package variableTest;

public class Constant {
	
	public static void main(String[] args) {
		
		final int ON = 1; // 상수는 다 대문자로 하자 언더바 표기법 사용
		final int OFF = 0;
		// on=2; 넣으면 선언값이 깨져버림(final 안붙였을때)
		// final을 붙이면 변수의 상수값이 고정됨.
		
		//on = 2; 오류값 출력
		System.out.println(ON * OFF);
	}

}	
