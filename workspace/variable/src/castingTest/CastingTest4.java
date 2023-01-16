package castingTest;

public class CastingTest4 {
	
	public static void main(String[] args) {
		

		
		System.out.println("1" + 3 + 9);
		System.out.println(Integer.parseInt("1") + 3 + 9); // 기본타입끼리 만 형변형이 가능 클래스랑 다른타입은 형변환이 안됨
		System.out.println(Double.parseDouble("3.9") + 9);// 문자형을 Double형으로 형변환 시키는 것
		System.out.println(Double.parseDouble("3.9") + 9 + 3);// 문자형을 Double형으로 형변환 시키는 것
		//System.out.println(Double.parseDouble("3.9") + 9);// 문자형을 Double형으로 형변환 시키는 것
		System.out.println(Float.parseFloat("12")+3);
	
		
	}

}
