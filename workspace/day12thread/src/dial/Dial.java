package dial;

import java.util.Scanner;

public class Dial {
	
	public static void main(String[] args) {
		
		Function function = new Function("1234", 0);
		
		Scanner sc = new Scanner(System.in);
	
		String passWord  = "";
		System.out.println("비밀번호를 입력해주세요");
		passWord = sc.next();
		
		System.out.println(function.checkPassWord(passWord));
		
	
		
		
		
	}

}
