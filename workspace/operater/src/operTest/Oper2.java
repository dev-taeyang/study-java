package operTest;

import java.util.Scanner;

public class Oper2 {
	
	public static void main(String[] args) {
		
		//�� ���� ��� ��
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է��ϼ���: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		result = num1 > num2 ? num1 : num2; // ���� ������ ??
		System.out.println("��� : " + result);
		
	}

}
