package classTest;

class A{
	
	
	
	int data; // �������� -> �ڵ��ʱ�ȭ   ���������� -> �����ʱ�ȭ
	public A() {

	}
	
	A(int data){ // �ްԺ���
		
		System.out.println("�⺻ ������"); // this �� �ּҰ��� �ҷ����°�
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
