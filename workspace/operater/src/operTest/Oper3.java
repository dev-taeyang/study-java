package operTest;// ����1

import java.util.Scanner;

public class Oper3 {
	
	public static void main(String[] args) {
		
		// ����ڿ��� Ű�� �Է� �ް�
		// ������� ������ ���
		// �Ǽ���� �Ǽ��� ���
		// ��) 183 -> 183 ���
		// 183.5 -> 183.5
		// ���� �����ڸ� ���!
		// �E������ Ǯ�� ����. ���Ĺ��ڷ� Ǯ�� �� ����
		
		/*
		 * �Է� ���� ���� ����
		 * scanner ���� ����
		 * �ⷰ �޼��� ���
		 * �Է¹��� �� �Է�
		 * ���� + ���� = ���� �񱳴�� ���ϱ� �Է°��� 0�� �������� �������� ������ �� �ƴϸ� ����
		 * ���� + �Ǽ� = �Ǽ�
		 * 
		 */
		/*double num1 = 0; // �Է¹��� �� ��������
		String result1 = ""; // ����� ���ڿ��� ���
		
		
		Scanner sc = new Scanner(System.in); // �Է� ���� ����
		
		System.out.println("���� �Ǵ� �Ǽ��� �Է��Ͻÿ�.");// ��¸޼��� ���
		System.out.println("1. : "); // ��¸޼��� ���
		num1 = sc.nextDouble();// �Է�
				
		result1 = num1 - (int)num1 > 0 ? "�Է��� ����(�Ǽ�): %f" : "�Է��� ����(����): %.0f" ;
		// num1���� int�� ��������ȯ �� ���� �P���� �Ǽ���� 0���� ũ�� ������ %f�� ���, ������� �ڸ����� ���� %f�� ���
		System.out.printf(result1,num1);// ���Ĺ��� ��½� printf���
		*/
		
		  double height = 0.0;
	      String message = "Ű: ";
	      Scanner sc = new Scanner(System.in);
	      boolean check = false;
	      String format = null;
	      String forLength = "";
	      int length = 0;
	      
	      System.out.print(message);
	      height = sc.nextDouble();
	      check = height - (int)height == 0;
	      forLength = height - (int)height + "";
	      
	      length = forLength.length() > 8 ? 8 : forLength.length();
	      
	      format = check ? "%.0fcm" : "%." + (length - 2) + "fcm"; // �Ҽ��� ���̸� �Ǵ��ϴ� �Լ�
	      System.out.printf(format, height); 

		
	
	}

}
