package objectTest;



public class HashCodeTest {
	
	public static void main(String[] args) {
		
		String data1 = "ABC";
//		String data2 = "ABC";
		String data2 = new String("ABC");
		
//		hash코드 재정의는 나중에 다시와서 ㄱㄱ
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data1.toString());
		System.out.println(data2.toString());
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
		
	}

}
