package operTest;

import java.util.Scanner;

public class Oper4 {
	
	public static void main(String[] args) {
		
//      �ɸ� �׽�Ʈ
      /*
       * Q. ����� �����ϴ� ���� �����ϼ���.
       * 1. ������
       * 2. �����
       * 3. ������
       * 4. ���
       * 
       * ������ : �Ұ��� �������̰� �������̴�.
       * ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
       * ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
       * ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
       * 
       */
		/*
		int choice = 0;// �Է¹��� ���� ����
		String msg = "Q. ����� �����ϴ� ���� �����ϼ���.\n 1.������\n 2.�����\n 3.������\n 4.���";//��� �޼��� ���� ����
		String mind = "";//��� ��� ���� ����
		Scanner sc = new Scanner(System.in); //�Է� ���� ����
		
		System.out.println(msg);// �޼��� ���
		System.out.print("�Է�:");
		choice = sc.nextInt();
		mind = choice == 1 ? "->������ : �Ұ��� �������̰� �������̴�." // choice �� 1�϶� ��� �ƴϸ� �ٽ� Choice ���� -> �ݺ�
				: choice == 2 ? "->����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�." 
				: choice == 3 ? "->������ : �����ϰ� ����ϰ� ��ö�ϰ� ������."
				: choice == 4 ? "->��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����."
				: "�ٽ��Է��ϼ���";
		System.out.println(mind);// ��� ���
		*/
//      �ɸ� �׽�Ʈ
      /*
       * Q. ����� �����ϴ� ���� �����ϼ���.
       * 1. ������
       * 2. �����
       * 3. ������
       * 4. ���
       * 
       * ������ : �Ұ��� �������̰� �������̴�.
       * ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
       * ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
       * ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
       * 
       */
      String message = "Q. ����� �����ϴ� ���� �����ϼ���.";
      String choiceMessage = "1.������\n2.�����\n3.������\n4.���";
      String redMessage = "�Ұ��� �������̰� �������̴�."; 
      String yellowMessage = "�߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�."; 
      String blackMessage = "�����ϰ� ����ϰ� ��ö�ϰ� ������."; 
      String whiteMessage = "õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
      String errorMessage = "�ٽ� �Է����ּ���.";
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
