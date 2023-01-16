package dial;

import java.util.Scanner;

public class codingTask {
	
	public static void main(String[] args) {
		
		String msg = "0과 1로 이루어진 숫자열을 입력하세요(3자리 이상, 5000자리 이하)";
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
