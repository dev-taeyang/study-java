package operTest;

import java.util.Scanner;

public class Oper4 {
	
	public static void main(String[] args) {
		
//      심리 테스트
      /*
       * Q. 당신이 좋아하는 색을 선택하세요.
       * 1. 빨간색
       * 2. 노란색
       * 3. 검은색
       * 4. 흰색
       * 
       * 빨간색 : 불같고 열정적이고 적극적이다.
       * 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
       * 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
       * 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
       * 
       */
		/*
		int choice = 0;// 입력받을 변수 선언
		String msg = "Q. 당신이 좋아하는 색을 선택하세요.\n 1.빨간색\n 2.노란색\n 3.검은색\n 4.흰색";//출력 메세지 변수 선언
		String mind = "";//결과 출력 변수 선언
		Scanner sc = new Scanner(System.in); //입력 변수 선언
		
		System.out.println(msg);// 메세지 출력
		System.out.print("입력:");
		choice = sc.nextInt();
		mind = choice == 1 ? "->빨간색 : 불같고 열정적이고 적극적이다." // choice 가 1일때 출력 아니면 다시 Choice 선택 -> 반복
				: choice == 2 ? "->노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다." 
				: choice == 3 ? "->검은색 : 묵묵하고 든든하고 냉철하고 멋지다."
				: choice == 4 ? "->흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다."
				: "다시입력하세요";
		System.out.println(mind);// 결과 출력
		*/
//      심리 테스트
      /*
       * Q. 당신이 좋아하는 색을 선택하세요.
       * 1. 빨간색
       * 2. 노란색
       * 3. 검은색
       * 4. 흰색
       * 
       * 빨간색 : 불같고 열정적이고 적극적이다.
       * 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
       * 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
       * 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
       * 
       */
      String message = "Q. 당신이 좋아하는 색을 선택하세요.";
      String choiceMessage = "1.빨간색\n2.노란색\n3.검은색\n4.흰색";
      String redMessage = "불같고 열정적이고 적극적이다."; 
      String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다."; 
      String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다."; 
      String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
      String errorMessage = "다시 입력해주세요.";
      String result = null;
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      
      System.out.println(message + "\n" + choiceMessage);
      choice = sc.nextInt();
      
//      result = choice == 1 ? redMessage :
//         choice == 2 ? yellowMessage :
//            choice == 3 ? blackMessage :
//               choice == 4 ? whiteMessage :
//                  errorMessage;
//      if(choice == 1) {
//         result = redMessage;
//         
//      }else if(choice == 2) {
//         result = yellowMessage;
//         
//      }else if(choice == 3) {
//         result = blackMessage;
//         
//      }else if(choice == 4) {
//         result = whiteMessage;
//         
//      }else {
//         result = errorMessage;
//         
//      }
      
      switch(choice) {
      case 1:
         result = redMessage;
         break;
      case 2:
         result = yellowMessage;
         break;
      case 3:
         result = blackMessage;
         break;
      case 4:
         result = whiteMessage;
         break;
      default:
         result = errorMessage;
         break;
      }
      
      System.out.println(result);

		
		
	}

}
