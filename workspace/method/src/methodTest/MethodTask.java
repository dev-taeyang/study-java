package methodTest;

import java.util.Scanner;



public class MethodTask {
//	1~10���� println()���� ����ϴ� �޼ҵ�
	
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

////	"ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
	void printHong(int num){
		
		for(int i = 0 ; i < num ; i++) {
			
			System.out.println((i + 1) + ".ȫ�浿");
			
		}
		
	}
	
	
//	void printHong(int count) {
//		for (int i = 0; i < count; i++) {
//			System.out.println("ȫ�浿");
//		}
//	}
//
////	�̸��� n�� println()���� ����ϴ� �޼ҵ�
	
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
////	�� ������ ������ ���ִ� �޼ҵ�
	
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
////	�� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ�
	
	int[] percent(int num1, int num2) {
		
		int[] result = new int[2]; //null -> �ּҰ��� �ʱⰪ.
		
		result[0] = num1 / num2 ;
		result[1] = num1 % num2 ;
		
		
			System.out.println("�� : " + result[0]);
			System.out.println("������ : " + result[1]);
			
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
////	1~n������ ���� �����ִ� �޼ҵ�
	
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
////	Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
	
	void change(int num) {
		
		System.out.println(++num);
		
	}
	
	
//	int change(int number) {
	
//		return ++number;
//	}
//
////	���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
	
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
////	���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
	
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
////	5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
	void findIndex(int[] arNum, int index) {	//12345
		
		System.out.println(arNum[index-1]);
		
		}
	
//	int getValue(int[] arData, int index) {
//		return arData[index];
//	}
//
////	�ѱ��� ������ �ٲ��ִ� �޼ҵ�(�ϰ��̻� -> 1024)
	
	void strToNum(String str) {
		
		String num = "�����̻�����ĥ�ȱ�";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			
			result = result + num.indexOf(str.charAt(i));

		}
			System.out.println(Integer.parseInt(result));
		
		
		
		
		
	}
	
//	int changeToInteger(String hangle) { // 1024
//		String hangleOriginal = "�����̻�����ĥ�ȱ�";
//		String result = "";
//		for (int i = 0; i < hangle.length(); i++) {
//			result += hangleOriginal.indexOf(hangle.charAt(i));
//		}
//		return Integer.parseInt(result);
//	 }
//
////	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
	void maxMin(int[] arNum) { //arnum[5] 12345
		
		int[] result = new int[2];
		result[0] = arNum[0];
		result[1] = arNum[0];
		
		for (int i = 0; i < arNum.length-1 ; i++) {
			
			if(arNum[i] < arNum[i+1]) { //result[0] = �ִ� result[1] = �ּ�
				
				result[0] = arNum[i+1];
				
				
			} else {
				
				result[1] = arNum[i];	//
				
			}
				
			
		}
		System.out.printf("1.�ִ밪: %d\n2.�ּҰ�: %d",result[0],result[1]);
		
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
////	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
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
//	indexOf() �����
//	���ڿ��� ���ڸ� �Է¹��� �� �ش� ���ڰ� �� ��° �ε����� �ִ��� �˻��ϰ�
//	���� �ش� ���ڰ� ������ -1�� �����Ѵ�.
	
	
//	-------------�����
//	  int indexOf(String str, char c) {
//    for (int i = 0; i < str.length(); i++) {
//        if(str.charAt(i) == c) {
//           return i;
//        }
//     }
//     return -1;
//  }

	
//	-------���� Ǭ��  �ٽú���
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
//		methodTask.printName("�ѵ���", 5);
//		System.out.println(methodTask.sub(5, 5 , 10));
//		int[] result = methodTask.div(10, 0);
//		if (result == null) {
//			System.out.println("0���� ���� �� �����ϴ�.");
//		} else {
//			System.out.println("��: " + result[0]);
//			System.out.println("������: " + result[1]);
//		}
//		int[] result = new int[2];
//		int[] arData = {3, 5, 6, 2, 1};
//		methodTask.getMaxAndMin(arData, result);
//		System.out.println("�ִ밪: " + result[0]);
//		System.out.println("�ּҰ�: " + result[1]);
		
		//methodTest.print1To10(11); 
		//methodTest.printHong(5);
//		String name = ""; // printName �� �ʿ��� main �ҽ� �ڵ�
//		
//		Scanner sc = new Scanner(System.in);// printName �� �ʿ��� main �ҽ� �ڵ�
//		name = sc.next();// printName �� �ʿ��� main �ҽ� �ڵ�
//		methodTest.printName(name, 5);// printName �� �ʿ��� main �ҽ� �ڵ�
//		methodTest.minus(3, 4, 5); // 3���� ���� �ҽ�
//		methodTest.percent(3, 4); // 2���� ��+������
//		System.out.println(methodTest.sum(10)); // 1~n���� �� �޼ҵ� ���
		
		
//		methodTest.change(4);	// ¦�� -> Ȧ�� , Ȧ�� -> ¦�� �޼ҵ�
//		methodTest.changeAlphabat("abcde34"); // �ҹ��� -> �빮�� �޼ҵ�
		
//		String msg = "���ڿ��� �Է��ϼ���";	//���ڿ� �Է¹��� �� ���ڿ��� ���� Ȯ��
//		String str = "";	//���ڿ� �Է¹��� �� ���ڿ��� ���� Ȯ��
//		Scanner sc = new Scanner(System.in);	//���ڿ� �Է¹��� �� ���ڿ��� ���� Ȯ��
//		System.out.println(msg + " :");	//���ڿ� �Է¹��� �� ���ڿ��� ���� Ȯ��
//		str = sc.next();	//���ڿ� �Է¹��� �� ���ڿ��� ���� Ȯ��
//		methodTest.countStr(str);	//���ڿ� �Է¹��� �� ���ڿ��� ���� Ȯ��
		/* ���ڿ� �Է��� ���ϴ� index �� Ȯ��
		int[] num = new int[5];
		String msg = "5���� ������ �Է��ϼ���.";
		Scanner sc = new Scanner(System.in);
		System.out.println(msg + " :");
		for (int i = 0; i < num.length; i++) {
			
			num[i] = sc.nextInt(); 
			
		}
		
		methodTest.findIndex(num, 4);
		*/
		
//		methodTest.strToNum("���̿���");	//�ѱ� -> ����
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























