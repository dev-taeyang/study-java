package exceptionTest;


//	 Exception 상속 : 컴파일러가 체크  -> try catch로 무조건 잡아야함.
//	 RuntimeException 상속 : 컴파일러가 체크하지 않음.
public class BadWordException extends RuntimeException {
	
	public BadWordException(String message) {
		
		super(message);
	}

}
