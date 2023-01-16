package operTest;

public class Oper5 {
	
	public static void main(String[] args) {
		
		int data = 10;
		//data++;
		//System.out.println(data++); // 후위형 은 다음줄부터 연산되서 나옴
		System.out.println(++data); // 전위형은 해당라인 부터 바로 연산
		System.out.println(data);
	}

}
