package controllStatement;

import java.util.Scanner;

public class IfTask2 {
	
	public static void main(String[] args) {
		
		//����ڿ��� �Ʒ��� �޴��� ����ϰ�
//      ��ȣ�� �Է¹޴´�.
      
//      1. ������
//      2. ������
//      3. �����
//      4. ���

//      ����ڰ� �Է��� ��ȣ�� ������ ����� ����Ѵ�.
		
		String msg = "1. ������\n2. ������\n3. �����\n4. ���";
		int choice = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ϴ� ��ȣ�� �����ϼ���: ");
	
		choice = sc.nextInt();
	/*	
		if(choice == 1) {				////if ���
			
			System.out.println("������");
		}
		else if(choice == 2) {
			
			System.out.println("������");
			
		}
		else if(choice == 3) {
			
			System.out.println("�����");
			
		}
		else if(choice == 4) {
			
			System.out.println("���");
			
		}
		else {
			System.out.println("�߸� �����ϼ̽��ϴ�.");
		}
		*/
		
		switch(choice) {			///switch���
		
		case 1:
			System.out.println("������");
			break;
			
		case 2:
			System.out.println("������");
			break;
		case 3:
			System.out.println("�����");
			break;
		case 4:
			System.out.println("���");
			break;
			
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
			
		}
			
		
		
	}

}
