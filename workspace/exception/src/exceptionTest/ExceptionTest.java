package exceptionTest;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(10 / 0);
			System.out.println("���꼺��");
		} catch(ArithmeticException e) {
			
//			e.printStackTrace(); // ������ �����ؼ� �������.
//			System.out.println("0���� ���� �� �����ϴ�.");
//			System.out.println(e);
//			System.out.println(e.getMessage());
		} catch(Exception e) {
			e.printStackTrace();
		}
//		System.out.println("���� ��");
	}

}
