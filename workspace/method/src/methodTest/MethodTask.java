package methodTest;

import java.util.Scanner;



public class MethodTask {
//	1~10까지 println()으로 출력하는 메소드
	
	void print1To10(int num) {
		
		
		
		for(int i = 0 ; i < num  ; i++) {
			
			System.out.println(i +1);
			
		}
		
		
		
	}
	
	
	
//	void printFrom1To10() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + 1);
//		}
//	}

////	"홍길동"을 n번 println()으로 출력하는 메소드
	void printHong(int num){
		
		for(int i = 0 ; i < num ; i++) {
			
			System.out.println((i + 1) + ".홍길동");
			
		}
		
	}
	
	
//	void printHong(int count) {
//		for (int i = 0; i < count; i++) {
//			System.out.println("홍길동");
//		}
//	}
//
////	이름을 n번 println()으로 출력하는 메소드
	
	void printName(String name, int num) {
		
		
		
		for(int i = 0 ; i < num ; i++) {
			
			System.out.println(name);
			
		}
		
	}
	

	
//	void printName(String name, int count) {
//		for (int i = 0; i < count; i++) {
//			System.out.println(name);
//		}
//	}
//
////	세 정수의 뺄셈을 해주는 메소드
	
	int minus(int num1, int num2, int num3) {
		
		int result = 0;
		
		result = num1 - num2 - num3;
		System.out.println(result);
	
		return result;
		
	}
	

	
	
	
//	int sub(int number1, int number2, int number3) {
//		int result = number1 - number2 - number3;
//		return result;
//	}
//
////	두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
	
	int[] percent(int num1, int num2) {
		
		int[] result = new int[2]; //null -> 주소값의 초기값.
		
		result[0] = num1 / num2 ;
		result[1] = num1 % num2 ;
		
		
			System.out.println("몪 : " + result[0]);
			System.out.println("나머지 : " + result[1]);
			
		return result;
		
		
		
	}
	
	
	
//	int[] div(int number1, int number2) {
//		int[] result = null;
//
//		if (number2 != 0) {
//			result = new int[2];
//			result[0] = number1 / number2;
//			result[1] = number1 % number2;
//		}
//		return result;
//	}
//
////	1~n까지의 합을 구해주는 메소드
	
	int sum(int num) {
		int result = 0; 
		for(int i = 0 ; i < num ; i++) {
			
		
			result += i +1;
	
		}
		return result;

	}
	
//	int getTotalFrom1(int end) {
//		int total = 0;
//		for (int i = 0; i < end; i++) {
//			total += i + 1;
//		}
//		return total;
//	}
//
////	홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	
	void change(int num) {
		
		System.out.println(++num);
		
	}
	
	
//	int change(int number) {
	
//		return ++number;
//	}
//
////	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	
	void changeAlphabat(String str) {
		
		String result = "";
		for(int i = 0; i < str.length() ; i++) {
			
			char change = str.charAt(i);
			
			if(change >= 65 && change <= 90) {
				
				result = result + (char)((int)change + 32);
				
			}
			else if(change >= 97 && change <= 120) {
				
				result = result + (char)((int)change - 32);
				
			}
			
			else {
				
				result = result + change;
				
			}
			
			
			
		}
		System.out.println(result);
		
	}
	
	
//	String changeToUpperOrLower(String str) {
//		String result = "";
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			if (c >= 65 && c <= 90) {
//				result += (char) (c + 32);
//
//			} else if (c >= 97 && c <= 122) {
//				result += (char) (c - 32);
//
//			} else {
//
//				result += c;
//			}
//		}
//		return result;
//	}
//
////	문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
	
	void countStr(String str) { // abcde
		
		int count = 0;
		count = str.length();
		System.out.println(count);
		
	}
	
	
	
	
//	int getCount(String str, char c) {
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == c) {
//				count++;
//			}
//		}
//		return count;
//	}
//
////	5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
	void findIndex(int[] arNum, int index) {	//12345
		
		System.out.println(arNum[index-1]);
		
		}
	
//	int getValue(int[] arData, int index) {
//		return arData[index];
//	}
//
////	한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)
	
	void strToNum(String str) {
		
		String num = "공일이삼사오육칠팔구";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			
			result = result + num.indexOf(str.charAt(i));

		}
			System.out.println(Integer.parseInt(result));
		
		
		
		
		
	}
	
//	int changeToInteger(String hangle) { // 1024
//		String hangleOriginal = "공일이삼사오육칠팔구";
//		String result = "";
//		for (int i = 0; i < hangle.length(); i++) {
//			result += hangleOriginal.indexOf(hangle.charAt(i));
//		}
//		return Integer.parseInt(result);
//	 }
//
////	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	void maxMin(int[] arNum) { //arnum[5] 12345
		
		int[] result = new int[2];
		result[0] = arNum[0];
		result[1] = arNum[0];
		
		for (int i = 0; i < arNum.length-1 ; i++) {
			
			if(arNum[i] < arNum[i+1]) { //result[0] = 최대 result[1] = 최소
				
				result[0] = arNum[i+1];
				
				
			} else {
				
				result[1] = arNum[i];	//
				
			}
				
			
		}
		System.out.printf("1.최대값: %d\n2.최소값: %d",result[0],result[1]);
		
	}
	
	
//	int[] getMaxAndMin(int[] arData) {
//		int[] result = {arData[0], arData[0]};
//		
//		for (int i = 0; i < arData.length; i++) {
//			if(result[0] < arData[i]) {result[0] = arData[i];} 
//			if(result[1] > arData[i]) {result[1] = arData[i];} 
//		}
//		return result;
//	}
//	
////	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void)
//	void getMaxAndMin(int[] arData, int[] result) {
//		result[0] = arData[0];
//		result[1] = arData[0];
//		
//		for (int i = 0; i < arData.length; i++) {
//			if(result[0] < arData[i]) {result[0] = arData[i];} 
//			if(result[1] > arData[i]) {result[1] = arData[i];} 
//		}
//	}
//	---------------------------------------------------------------
//	indexOf() 만들기
//	문자열과 문자를 입력받은 뒤 해당 문자가 몇 번째 인덱스에 있는지 검사하고
//	만약 해당 문자가 없으면 -1을 리턴한다.
	
	
//	-------------강사님
//	  int indexOf(String str, char c) {
//    for (int i = 0; i < str.length(); i++) {
//        if(str.charAt(i) == c) {
//           return i;
//        }
//     }
//     return -1;
//  }

	
//	-------내가 푼거  다시보기
//	int indexOf(String str, char c) {	//abcde, a
//		
//		int result = -1;
//		for (int i = 0; i < str.length() ; i++) {
//			
//			if((str.charAt(i)) == c) {
//				
//				result = (char)(str.charAt(i));
//				break;
//				
//			}
//	
//		}
//		return result;
//	}
//		
	
	
	
	public static void main(String[] args) {
		MethodTask methodTest = new MethodTask();
//		methodTask.printFrom1To10();
//		methodTask.printHong(10);
//		methodTask.printName("한동석", 5);
//		System.out.println(methodTask.sub(5, 5 , 10));
//		int[] result = methodTask.div(10, 0);
//		if (result == null) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		} else {
//			System.out.println("몫: " + result[0]);
//			System.out.println("나머지: " + result[1]);
//		}
//		int[] result = new int[2];
//		int[] arData = {3, 5, 6, 2, 1};
//		methodTask.getMaxAndMin(arData, result);
//		System.out.println("최대값: " + result[0]);
//		System.out.println("최소값: " + result[1]);
		
		//methodTest.print1To10(11); 
		//methodTest.printHong(5);
//		String name = ""; // printName 에 필요한 main 소스 코드
//		
//		Scanner sc = new Scanner(System.in);// printName 에 필요한 main 소스 코드
//		name = sc.next();// printName 에 필요한 main 소스 코드
//		methodTest.printName(name, 5);// printName 에 필요한 main 소스 코드
//		methodTest.minus(3, 4, 5); // 3정수 빼기 소스
//		methodTest.percent(3, 4); // 2정수 몪+나머지
//		System.out.println(methodTest.sum(10)); // 1~n까지 합 메소드 사용
		
		
//		methodTest.change(4);	// 짝수 -> 홀수 , 홀수 -> 짝수 메소드
//		methodTest.changeAlphabat("abcde34"); // 소문자 -> 대문제 메소드
		
//		String msg = "문자열을 입력하세요";	//문자열 입력받은 후 문자열의 개수 확인
//		String str = "";	//문자열 입력받은 후 문자열의 개수 확인
//		Scanner sc = new Scanner(System.in);	//문자열 입력받은 후 문자열의 개수 확인
//		System.out.println(msg + " :");	//문자열 입력받은 후 문자열의 개수 확인
//		str = sc.next();	//문자열 입력받은 후 문자열의 개수 확인
//		methodTest.countStr(str);	//문자열 입력받은 후 문자열의 개수 확인
		/* 문자열 입력후 원하는 index 값 확인
		int[] num = new int[5];
		String msg = "5개의 정수를 입력하세요.";
		Scanner sc = new Scanner(System.in);
		System.out.println(msg + " :");
		for (int i = 0; i < num.length; i++) {
			
			num[i] = sc.nextInt(); 
			
		}
		
		methodTest.findIndex(num, 4);
		*/
		
//		methodTest.strToNum("오이오이");	//한글 -> 정수
//		int[] arNum = new int[5];
//		String result = "";
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < arNum.length; i++) {
//			
//			arNum[i] = sc.nextInt();
//			
//		}
//
//		for (int i = 0; i < arNum.length; i++) {
//			
//			System.out.println(arNum[i]);
//		}
//
//		methodTest.maxMin(arNum);
//		String result = "abcde";
////		char c = 0;
//		methodTest.indexOf(result, 'd');
////		c = (char)(methodTest.indexOf(result, 'f'));
//		System.out.println(methodTest.indexOf(result, 'd'));
//		
	}
}























