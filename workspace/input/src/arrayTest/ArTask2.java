package arrayTest; // switch�� ���

import java.util.Scanner;

public class ArTask2 {
	
	public static void main(String[] args) {
		
//		������
		
//		�� ��ư�� ������ ��, �̵��ϴ� �������� ������ ����.
//		btn1 : ȸ������ ������
//		btn2 : �α��� ������
//		btn3 : ���� ������
//		ȸ������ -> �α��� -> ���� ������
//		�� ������� �Է��ؾ� �ϸ�, ���� ���� �ܰ踦 �����ϱ� ���� ���� �ܰ� ��ư�� �������, �����ܰ迡 ���� �޼����� ������ش�.
//		��) �α��� Ŭ�� ��, "ȸ�������� ���� ������ �ּ���" ���
//		�˸��� �ܰ��� ��ư�� ������ �ش� �ܰ迡 ���� �޼����� ������ش�.
//		��) ȸ������ Ŭ����, "ȸ������ ����"
//		���������� Ŭ����, ���� �̸��� ���� ���
		
//		String[] arBtn = {"btn1", "btn2", "btn3"};
//		String msg = "��ư�� �������ּ���\n1. ȸ������ ������\n2. �α��� ������\n3. ���� ������\n�Է�:";
//		String[] arMsg = new String[3];
//		
//		int choice = 0;
//		int count = 0;
//		
//		arBtn[0] = "ȸ�� ���� ����";
//		arBtn[1] = "�α��� ����";
//		arBtn[2] = "�̸� : ���¾�, ���� : 32";
//		
//		arMsg[0] = "ȸ�������� ���� ���ּ���." ;
//		arMsg[1] = "�߸� �����ϼ̽��ϴ�.\n";
//		arMsg[2] = "�����մϴ�.";
//		
////		System.out.println(Msg);
//		Scanner sc = new Scanner(System.in);
//		
//		
//		while(true) { // ���� �ݺ�
//			
//			System.out.println(msg); // �ȳ� �޼��� ���
//			choice = sc.nextInt();
//			
//				switch(choice) {
//				
//				case 1 :
//					
//					System.out.println(arBtn[0]);
//					count++;
//					
//					break;
//					
//				case 2 :
//					
//					if(count>=1) {
//						
//					System.out.println(arBtn[1]);
//					count++;
//					
//					break;
//					}
//					else if(count<1) {
//						
//						System.out.println(arMsg[0]);
//						
//					}
//					
//				case 3 :
//					
//					if(count>=2) {
//						
//					System.out.println(arBtn[2]);
//					count++;
//					break;
//					
//					}
//					else if(count<1) {
//						
//						System.out.println(arMsg[0]);
//						
//					}
//					
//				default :
//					
//					System.out.println(arMsg[1]);
//					break;
//				
//				}
//				if(count>3) {
//					
//					System.out.println(arMsg[2]);
//					break;
//					
//				}
//		}
		
//		����� ����
		 String[] arButton = {"btn1", "btn2", "btn3", "btn4"};
	      String[] arMessage = {"ȸ������ ����", "�α��� ����", "�ѵ���(20)", "�α׾ƿ� ����"};
	      String[] arError = {"ȸ�������� ���� �������ּ���.", "�α����� ���� �������ּ���"};
	      String errorMessage = "�ٽ� �õ����ּ���", result = null;
	      
	      Scanner sc = new Scanner(System.in);
	      int choice = 0, temp = 0;
	      boolean condition = false;
	      
	      while(true) {
//	    	 i + 1 + "." + arBotton[i] �迭 ���
	         for (int i = 0; i < arButton.length; i++) {
	            System.out.println(i + 1 + "." + arButton[i]);
	         }
	         temp = choice; // choice = 0 -> temp = 0 -> temp = 1
	         choice = sc.nextInt(); // choice = 1 �϶� 0> choice =2
	         condition = choice - 1 == temp; //condition = 1-1 == 0 ==false; -> true
	         
	         switch(choice) {
	         case 1: case 4:
	            result = arMessage[choice - 1];
	            break;
	         case 2: case 3:
	            result = condition ? arMessage[choice - 1] : arError[choice - 2]; 
	            if(!condition) { choice = 0; }
	            break;
	         default:
	            result = errorMessage;
	            break;
	         }
	         
	         System.out.println(result);
	         if(choice == 4) { break; }
	      }


		
		
	}

}
