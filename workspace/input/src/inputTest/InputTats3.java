package inputTest;

import java.util.Scanner;

public class InputTats3 {
	
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
		
		double num1 = 0;
		String result1 = "";
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Ǵ� �Ǽ��� �Է��Ͻÿ�.");
		System.out.println("1. : ");
		num1 = sc.nextDouble();
				
		result1 = num1 - (int)num1 > 0 ? "�Է��� ����(�Ǽ�): %f" : "�Է��� ����(����): %.0f" ;
		
		System.out.printf(result1,num1);
		
	
		
		
	}

}
