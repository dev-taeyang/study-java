package arrayTest; // for �� if �����

import java.util.Scanner;

public class ArTask3 {
	
	public static void main(String[] args) {
		
//      �� ��ư�� ������ ��, �̵��ϴ� �������� ������ ����.
	      
//      btn1 : ȸ������ ������
//      btn2 : �α��� ������
//      btn3 : ���� ������
      
//      ȸ������ -> �α��� -> ���� ������
//      �� ������� �Է��ؾ� �ϸ�, ���� ���� �ܰ踦 �����ϱ� ���� ���� �ܰ� ��ư�� ���� ���, ���� �ܰ迡 ���� �޼����� ������ش�.
//      ��) �α��� Ŭ�� ��, "ȸ�������� ���� �������ּ���" ���
      
//      �˸��� �ܰ��� ��ư�� ������, �ش� �ܰ迡 ���� �޼����� ������ش�.
//      ��)   ȸ������ Ŭ�� ��, ȸ������ ����
//         ���� ������ Ŭ�� ��, ���� �̸��� ���� ���
      
//      ��ư �迭
      String[] arButton = {"btn1", "btn2", "btn3", "btn4"}; // 4�� ¥�� �迭
//      ���� �޼��� �迭
      String[] arMessage = {"ȸ������ ����", "�α��� ����", "�ѵ���(20)", "�α׾ƿ� ����"};
//      ���� �޼��� �迭
      String[] arError = {"ȸ�������� ���� �������ּ���.", "�α����� ���� �������ּ���"};
//      ���� �޼���
      String errorMessage = "�ٽ� �õ����ּ���";
      
      Scanner sc = new Scanner(System.in);
//      choice : ����ڰ� �Է��� ��ȣ, temp : ����ڰ� ������ �Է��� ��ȣ
      int choice = 0, temp = 0;
      boolean condition = false;
      
      while(true) {
//         �޴� ���
         for (int i = 0; i < arButton.length; i++) {
            System.out.println(i + 1 + "." + arButton[i]);
         }
         
//         ���� temp�� 0�� ����ִٸ�, 0�� �����ؾ� �Ѵ�.
         temp = temp == 0 ? 0 : choice; // temp �� 0 �϶� true -> 0 false -> choice
//         ����ڰ� ������ ��ư ��ȣ
         choice = sc.nextInt(); // 1������
//         ��ư ��ȣ �̿��� ��ȣ�� �Է����� ��� ���� �޼��� ���
         if(choice < 1 || choice > 4) {System.out.println(errorMessage); continue;}
//         �α׾ƿ� �� ���α׷� ����
         if(choice == 4) {System.out.println(arMessage[choice - 1]); break;}
         
//         ����ڰ� ������ ��ư�� ��ȣ - 1�� ������ ����ڰ� �Է��� ��ȣ�� ���� �� ��
//         �� �ܰ踦 ���� �ߴ� �� �˻�
         condition = choice - 1 == temp; // temp�� ó���� 0���� �ִµ� choice�� �ٷ� 2���Ǹ�  condition�� false�̹Ƿ�
         
         if(!condition) { // �� �ܰ踦 ������ ���
            temp = 0; // ȸ�����Ժ��� �����϶�� ��.
            System.out.println(arError[choice - 2]);
            continue;
         }
         // �� �ܰ踦 �������� ���
         System.out.println(arMessage[choice - 1]);
         if(choice == 3) { // ���� �������� �������� ������
            temp = 0; // ȸ�����Ժ��� �����϶�� ��.
            continue;
         }
//         ���� ������ �̿��� ���񽺸� �̿����� ��� �Է��ߴ� ��ȣ�� temp�� �����Ѵ�.
         temp = choice;
         
      }

		
	}

}