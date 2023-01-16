package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		
		String name = "오태양";
		int age = 20;
		double height = 123.5;
		//System.out.println("이름 : name");
		System.out.printf("이름 : %s\n", name); // println은 서식문자를 지원하지 않음. -> printf 사용(format)
		System.out.printf("나이 : %d살\n", age); // 정수형 서식문자 사용
		System.out.printf("몸무게 : %.2fkg\n", height); // %. 뒤에 몇째자리까지 나타낼지 숫자 뒤에서 반올림
	}

}
