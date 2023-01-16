package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
   public static void main(String[] args) {
//      5개의 정수만 입력받기
//      - 무한 입력 상태로 구현
//      - q 입력 시 나가기
//      - 각 정수는 배열에 담기
//      - if문은 딱 한 번만 사용하기
//	   입력 메소드 선언
      Scanner sc = new Scanner(System.in);
//      5행 짜리 인트 배열 변수 선언
      int[] arData = new int[5];
//      문자열 변수 선언
      String temp = null;
//      for문 반복 시 반복횟수를 비어놓으면 무한 반복함.
      for(int i=0;; i++) {
         System.out.print(i + 1 + "번째 정수[q: 나가기]: ");
//         temp값을 입력받음
         temp = sc.next();
//         대문자를 받았을 때 소문자로 변환해주는 메소드 사용 : toLowerCase();
         temp = temp.toLowerCase();
//         입력받은 값이 q와 같을때
         if(temp.equals("q")) {
//        	 for문 탈출
            break;
         }
//         예외 처리
         try {
//        	 arData[i]에 받은 temp값을 정수형으로 변환하여 대입.
            arData[i] = Integer.parseInt(temp);
//            예외 상황 1 NumberFormatException : 정수 이외의 값을 입력했을때
         } catch (NumberFormatException e) {
            System.out.println("정수만 입력해주세요.");
//            반복 카운트를 1줄여서 다시 입력받을수 있게 함.
            i--;
//            예외 상황 2 ArrayIndexOutOfBoundsException : 선언된 배열의 개수보다 더 많이 입력됬을 때.
         } catch (ArrayIndexOutOfBoundsException e) {
//        	 오류 메세지 출력 후 arData 배열의 저장된 값을 출력.
            System.out.println("5개의 정수만 입력이 가능합니다.");
            for (int j = 0; j < arData.length; j++) {
               System.out.print(arData[j] + " ");
            }
            break;
//            그외 오류 메세지 출력시 다시 입력하게 함.
         } catch (Exception e) {
            System.out.println("다시 시도해주세요.");
            i--;
         }
      }
   }
}















