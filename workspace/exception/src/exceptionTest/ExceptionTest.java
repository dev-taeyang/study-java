package exceptionTest;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(10 / 0);
			System.out.println("연산성공");
		} catch(ArithmeticException e) {
			
//			e.printStackTrace(); // 오류를 추적해서 출력해줌.
//			System.out.println("0으로 나눌 수 없습니다.");
//			System.out.println(e);
//			System.out.println(e.getMessage());
		} catch(Exception e) {
			e.printStackTrace();
		}
//		System.out.println("오류 뜸");
	}

}
