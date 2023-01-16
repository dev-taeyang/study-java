package castingTest;

public class CastingTest1 {
	
	public static void main(String[] args) {
		
		// 자동 형변환
		
		System.out.println(11 / 9);	//몪이 출력
		System.out.println(11.0 / 9);	//뒤에 값까지 출력 6째 자리 이후에는 쓰레기값이 출력되니까 6쨰 자리까지만 쓰자.
		
		// 강제 형변환
		
		System.out.println((double)11 / 9); // (자료형)값
		System.out.println((int)8.43 + 2.59);
		System.out.println((int)(8.43 + 2.59)); // 최우선항(괄호) > 단항(강제 형변환) > 산항(산술)
		System.out.println((int)8.43 + (int)2.59); // 8.43 + 2.59 = 10
		
	}

}
