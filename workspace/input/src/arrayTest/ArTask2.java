package arrayTest; // switch문 사용

import java.util.Scanner;

public class ArTask2 {
	
	public static void main(String[] args) {
		
//		내버전
		
//		각 버튼을 눌렀을 떄, 이동하는 페이지는 다음과 같다.
//		btn1 : 회원가입 페이지
//		btn2 : 로그인 페이지
//		btn3 : 마이 페이지
//		회원가입 -> 로그인 -> 마이 페이지
//		위 순서대로 입력해야 하며, 만약 이전 단계를 진행하기 전에 다음 단계 버튼을 누를경우, 이전단계에 대한 메세지를 출력해준다.
//		예) 로그인 클릭 시, "회원가입을 먼저 진행해 주세요" 출력
//		알맞은 단계의 버튼을 누르면 해당 단계에 대한 메세지를 출력해준다.
//		예) 회원가입 클릭시, "회원가입 성공"
//		마이페이지 클릭시, 본인 이름과 나이 출력
		
//		String[] arBtn = {"btn1", "btn2", "btn3"};
//		String msg = "버튼을 선택해주세요\n1. 회원가입 페이지\n2. 로그인 페이지\n3. 마이 페이지\n입력:";
//		String[] arMsg = new String[3];
//		
//		int choice = 0;
//		int count = 0;
//		
//		arBtn[0] = "회원 가입 성공";
//		arBtn[1] = "로그인 성공";
//		arBtn[2] = "이름 : 오태양, 나이 : 32";
//		
//		arMsg[0] = "회원가입을 먼저 해주세요." ;
//		arMsg[1] = "잘못 선택하셨습니다.\n";
//		arMsg[2] = "종료합니다.";
//		
////		System.out.println(Msg);
//		Scanner sc = new Scanner(System.in);
//		
//		
//		while(true) { // 무한 반복
//			
//			System.out.println(msg); // 안내 메세지 출력
//			choice = sc.nextInt();
//			
//				switch(choice) {
//				
//				case 1 :
//					
//					System.out.println(arBtn[0]);
//					count++;
//					
//					break;
//					
//				case 2 :
//					
//					if(count>=1) {
//						
//					System.out.println(arBtn[1]);
//					count++;
//					
//					break;
//					}
//					else if(count<1) {
//						
//						System.out.println(arMsg[0]);
//						
//					}
//					
//				case 3 :
//					
//					if(count>=2) {
//						
//					System.out.println(arBtn[2]);
//					count++;
//					break;
//					
//					}
//					else if(count<1) {
//						
//						System.out.println(arMsg[0]);
//						
//					}
//					
//				default :
//					
//					System.out.println(arMsg[1]);
//					break;
//				
//				}
//				if(count>3) {
//					
//					System.out.println(arMsg[2]);
//					break;
//					
//				}
//		}
		
//		강사님 버전
		 String[] arButton = {"btn1", "btn2", "btn3", "btn4"};
	      String[] arMessage = {"회원가입 성공", "로그인 성공", "한동석(20)", "로그아웃 성공"};
	      String[] arError = {"회원가입을 먼저 진행해주세요.", "로그인을 먼저 진행해주세요"};
	      String errorMessage = "다시 시도해주세요", result = null;
	      
	      Scanner sc = new Scanner(System.in);
	      int choice = 0, temp = 0;
	      boolean condition = false;
	      
	      while(true) {
//	    	 i + 1 + "." + arBotton[i] 배열 출력
	         for (int i = 0; i < arButton.length; i++) {
	            System.out.println(i + 1 + "." + arButton[i]);
	         }
	         temp = choice; // choice = 0 -> temp = 0 -> temp = 1
	         choice = sc.nextInt(); // choice = 1 일때 0> choice =2
	         condition = choice - 1 == temp; //condition = 1-1 == 0 ==false; -> true
	         
	         switch(choice) {
	         case 1: case 4:
	            result = arMessage[choice - 1];
	            break;
	         case 2: case 3:
	            result = condition ? arMessage[choice - 1] : arError[choice - 2]; 
	            if(!condition) { choice = 0; }
	            break;
	         default:
	            result = errorMessage;
	            break;
	         }
	         
	         System.out.println(result);
	         if(choice == 4) { break; }
	      }


		
		
	}

}
