package exceptionTest;

import java.util.Scanner;

public class Chatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String massage = null;

		System.out.println("�޼��� : ");
		massage = sc.nextLine();
//		�Է¹��� �޼��� �� "�ٺ�"�� ���ԵǾ�������.
		if (massage.contains("�ٺ�")) {
//			BadWordException ���ܸ� �߻����� "�弳�� �ȵſ�!"�� �����.
//			try { // A+ S+ z ����Ű �׿����� �� ������ �ٷ� ��
			throw new BadWordException("�弳�� �ȵſ�!"); // ���ܸ� �ʵ忡 �÷��� �߻��� ��Ű�°� trow
		}
	}

}
