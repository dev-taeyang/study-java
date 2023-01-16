package variableTest;

public class StorageClassTest1 {
	
	int data = 10;			// 지역변수
	static int data_s = 10; // 정적변수

	void increaseData() {
		
		System.out.println(++data);
		
	}
	static void increaseData_s() {
		
		System.out.println();
	}
}
