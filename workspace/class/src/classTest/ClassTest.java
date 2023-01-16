package classTest;

class A{
	
	
	
	int data; // 전역변수 -> 자동초기화   지역변수는 -> 직접초기화
	public A() {

	}
	
	A(int data){ // 메게변수
		
		System.out.println("기본 생성자"); // this 는 주소값을 불러오는거
		this.data = data;
	}
	
	void printData() {
		
		System.out.println(data);
		
	}
	
}

public class ClassTest {
	
	public static void main(String[] args) {
		
		A a = new A(10);
		A a2 = new A(20); //
		
		System.out.println(a); // data
		System.out.println(a.data);
		System.out.println(a2.data);
		System.out.println(A.class);
		a.printData();
	}

}
