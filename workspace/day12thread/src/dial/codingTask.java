package dial;

import java.util.Scanner;

public class codingTask {
	
	public static void main(String[] args) {
		
		String msg = "0�� 1�� �̷���� ���ڿ��� �Է��ϼ���(3�ڸ� �̻�, 5000�ڸ� ����)";
		String number;
		Task2 check = new Task2();
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		number = sc.next();
		if(number.length() > 3 && number.length() <5000) {
			
			check.countingOne(number);
			
		}
		
		result =  check.countingOne(number);
		
		System.out.println(result);
	}

}
