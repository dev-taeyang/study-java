package inputTest;

import java.util.Scanner;

public class InputTask2 {
	
	public static void main(String[] args) {
		
		//3���� ������ �ѹ��� �Է¹��� ��
		//�� ������ �� ��� Integer.parseInt(" ")
		
		/*
		 * �Է� ���� ������ ������ ����
		 * �Է� 
		 * ù��° ������ �Է¹ޱ����� �޽��� ���
		 * ù��° ���� �Է�
		 * �ι��� ���� �Է� �޽��� ���
		 * �ι��� ���� �Է�
		 * ����° ���
		 * ����° �Է�
		 * 
		 *
		 */
		
		int first = 0;
		int second = 0;
		int third = 0;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 3���Է�:");
	/*	first = Integer.parseInt(sc.next()); ///���ʺκ� ����
		second = Integer.parseInt(sc.next());
		third = Integer.parseInt(sc.next());
		*/
		first = sc.nextInt();
		second = sc.nextInt();
		third = sc.nextInt();
		
		result = first * second * third;
		
		
		System.out.printf("%d * %d * %d= %d",first, second, third, result);
		

		
		
		
	}

}
