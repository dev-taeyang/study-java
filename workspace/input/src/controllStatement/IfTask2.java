package controllStatement;

import java.util.Scanner;

public class IfTask2 {
	
	public static void main(String[] args) {
		
		//사용자에게 아래의 메뉴를 출력하고
//      번호를 입력받는다.
      
//      1. 빨간색
//      2. 검은색
//      3. 노란색
//      4. 흰색

//      사용자가 입력한 번호의 색상을 영어로 출력한다.
		
		String msg = "1. 빨간색\n2. 검은색\n3. 노란색\n4. 흰색";
		int choice = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 번호를 선택하세요: ");
	
		choice = sc.nextInt();
	/*	
		if(choice == 1) {				////if 사용
			
			System.out.println("빨간색");
		}
		else if(choice == 2) {
			
			System.out.println("검은색");
			
		}
		else if(choice == 3) {
			
			System.out.println("노란색");
			
		}
		else if(choice == 4) {
			
			System.out.println("흰색");
			
		}
		else {
			System.out.println("잘못 선택하셨습니다.");
		}
		*/
		
		switch(choice) {			///switch사용
		
		case 1:
			System.out.println("빨간색");
			break;
			
		case 2:
			System.out.println("검은색");
			break;
		case 3:
			System.out.println("노란색");
			break;
		case 4:
			System.out.println("흰색");
			break;
			
		default :
			System.out.println("잘못 입력하셨습니다.");
			break;
			
		}
			
		
		
	}

}
