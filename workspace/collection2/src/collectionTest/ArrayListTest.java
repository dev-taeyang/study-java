package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
//		<?> : 제네릭 -> (이름이 없는) -> 사용자가 어떤 타입을 쓸줄 모르니까 
//		모든타입을 쓸수 있는 새로운 타입으로 선언해줌
//		제네릭 -> 모든 자료형을 클래스타입으로 해야된다. 기본자료형은 사용 X
//		객체화 시 타입을 지정하는 기법
//		설계할 떄에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언 할 때 사용한다.
//		제네릭을 쓰면 다운케스팅을 할 필요가 없고, 지정할 타입에 제한을 줄 수 있다.
//		배열의 길이를 확인할때 .size
//		Collections -> Class임 Static으로 이루어져 있음.
//		System.out.println("===================");
//		Collections.sort(datas);	// 오름차순으로 정렬. // 주소값을 보내서 전달함.
//		Collections.reverse(datas); // 순서를 반대로 바꾸는 메소드.(좌우를 반대로 바꾸어줌)
//		Collections.shuffle(datas);
		
		ArrayList<Integer> datas = new ArrayList<>();
	      final int SIZE = 9;
	      
//	      C
	      for (int i = 0; i < SIZE; i++) {
	         if(i > 4) {
	            datas.add((14 - i) * 10);
	            System.out.println(datas.size());
	            continue;
	         }
	         datas.add((i + 1) * 10);
	         System.out.println(datas.size());
	      }
	      
//	      R
//	      for (int i = 0; i < datas.size(); i++) {
//	         System.out.println(datas.get(i));
//	      }
	      
//	      빠른 for문(forEach, 향상된 for문)
//	      for(자료형 변수명 : 순서가 있는 무언가){}
//	      변수에 하나씩 값이 순서대로 들어간다!
	      
	      for (int data : datas) {
	         System.out.println(data);
	      }
	      
	      System.out.println("======================");
	      Collections.sort(datas); // 오름차순 정렬
	      Collections.reverse(datas); // 좌우를 반대로 바꿔주는 메소드
	      Collections.shuffle(datas);
	      
//	      for (int i = 0; i < datas.size(); i++) {
//	         System.out.println(datas.get(i));
//	      }
	      for (int data : datas) {
	         System.out.println(data);
	      }
	      
	      
	      System.out.println("======================");
//	      추가(삽입)
//	      50 뒤에 500 삽입
//	      if(datas.contains(50)) {	// datas 에 50이 포함되있다면
//	         datas.add(datas.indexOf(50) + 1, 500);	// 그 50 값의 index +1 번에 500을 추가
//	      }
//	      
//	      System.out.println(datas.toString());
	      
//	      수정
//	      90을 9로 수정
//	      int prev = 0;	// 수정한 데이터를 리턴하기 때문에 리턴값을 넣어줄 변수 선언.
//	      if(datas.contains(90)) {	// 90포함되었다면
//	         prev = datas.set(datas.indexOf(90), 9);	// prev값에 90값을 가지고 있는 인덱스datas에 9로 변경해서 넣어줌.
//	         System.out.println(prev + "이 9로 수정");	// 변경한값 이 9로 수정 메세지 출력.
//	         System.out.println(datas);	// datas의 배열을 출력.
//	      }
	      
//	      삭제
//	      80 삭제
//	      1. 인덱스로 삭제
//	      int removedData = 0; //삭제한 datas를 리턴해주기 떄문에 담아줄 변수 선언.
//	      if(datas.contains(80)) {	// datas가 80을 가지고 있다면.
//	         removedData = datas.remove(datas.indexOf(80)); // removedData에 80을가지고 있는 데이타를 제거한 걸 넣어줌.
//	         System.out.println(removedData + " 삭제");	제거 메세지 출력
//	         System.out.println(datas);	// datas 의 배열을 출력.
//	      }
	      
//	      2. 값으로 삭제
//	      if(datas.remove(Integer.valueOf(80))) {	//remove의 리턴값이 Integer 타입이라서. Integer 값으로 박싱하여 넣어줌.
//	         System.out.println("삭제 성공");
//	         System.out.println(datas);
//	      }
	   }
	}




