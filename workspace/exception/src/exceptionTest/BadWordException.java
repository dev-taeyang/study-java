package exceptionTest;


//	 Exception ��� : �����Ϸ��� üũ  -> try catch�� ������ ��ƾ���.
//	 RuntimeException ��� : �����Ϸ��� üũ���� ����.
public class BadWordException extends RuntimeException {
	
	public BadWordException(String message) {
		
		super(message);
	}

}
