package collectionTask;

import java.util.ArrayList;

public class Page {
	
	public static void main(String[] args) {
		
		ArrayList<User> users = DBConnecter.users;
		UserField userField = new UserField();
		DBConnecter dbConnecter = new DBConnecter();
		
		userField.joinMember("oty", "asd12453", "���¾�", "01064844195");
		userField.encryption("dfsdf");
		System.out.println(userField.changePassWord("asd12453", "asd1212"));
//		System.out.println(userField.massageSend("01064844195")); //�޼��� ����
		System.out.println(users);
//		System.out.println(userField.findPassWord("oty", "01064844195"));
		
//		System.out.println(userField.checkID("oty"));
		
		

	}
	
	

}

//page ����� ��.
//Scanner sc = new Scanner(System.in);
//String msg1 = "���ϴ� ��ȣ�� �������ּ���.";
//String msg2 = "1. ȸ������ \n 2. �α���\n 3. ��й�ȣ ����\n 4. ����������\n 5. ������";
//String id = "";
//String passWord = "";
//String name = "";
//String phonNumber = "";
//UserField userField = new UserField();
//
//
//
//int choice = 0; // ������ ���� ���̽�
//while(true) {	// ���� �ݺ�
//
//System.out.println(msg1);	// ��ȣ ���� �޼��� ���
//System.out.println(msg2);	// �޴� ���� �޼��� ���
//
//choice = sc.nextInt();	// �޴� ����
//if(choice == 5) break;	// 5�� �Է������� ������
//
//switch(choice) {
//
//case 1 : {	//ȸ�������� �������� ��.
//
//System.out.println("ȸ������ ������ �Դϴ�.");
//System.out.println("�̸��� �Է����ּ���.");
//name = sc.next();
//System.out.println("ID�� �Է����ּ���.");
//id = sc.next();
//UserField userField = new UserField();
//userField.checkID(id);
//
//
//
//}
//default :
//{
//break;
//}
//
//}
//
//}
//
//
//System.out.println(msg);
//
//Scanner sc = new Scanner(System.in);
//
//UserField userField = new UserField();
//
//id = sc.next();
//userField.idCheck("oty7942");
//
//
//
//
//
//
//