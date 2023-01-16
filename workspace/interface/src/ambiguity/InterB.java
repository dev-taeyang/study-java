package ambiguity;

public interface InterB {
	
	public default void printData() { // 아무것도 안적혀 있을때 abstract가 생략되어있으니까 일반메소드로
//		쓰고 싶으면 default를 붙여야된다.
		
		System.out.println("InterB");

	}
}
