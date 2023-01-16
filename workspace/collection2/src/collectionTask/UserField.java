package collectionTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
	
	
	ArrayList<User> users = DBConnecter.users;
	
	
//		//////////////	ȸ������.
	public void joinMember(String id, String passWord, String name, String phonNumber) {
		
		
		
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setPassWord(passWord);
		user.setPhoneNumber(phonNumber);
		DBConnecter.users.add(user);
		System.out.println("ȸ������ ����!");
		System.out.println("�̸�:" + user.getName());
		System.out.println("ID:" + user.getId() );
		System.out.println("PhoneNumber:" + user.getPhoneNumber());
		
		}
	
	
//	//////////	���̵� �ߺ� �˻�.
	public String checkID(String id) { 
		
		
		
		for(User user : users) { // users.get(i)�� i�� �ϳ��� ���鼭 user�� ��.
			
			if(user.getId().equals(id)) { // users�� id�� �ҷ��ͼ� �Է¹��� id�� ��
				
				System.out.println("������ ���̵� �����մϴ�.");
				return user.getId();	// �Ȱ����� ������ user.getid���� ��������.
				
			}
		}
//				���� ���� ���� �׳�
//		for (int i = 0; i < users.size(); i++) {
//			
//			if(users.get(i).getId().equals(id)) {
//				
//				System.out.println("ID �ߺ�.");
//				return users.get(i).getId();
//				
//				
//			}
//		}
		System.out.println("ID ���� ����.");// ������ ������ ���� �޼��� ���
		return null;// null���� ����

		
	}
//		/////////////		�α���
	public User logIn(String id, String passWord) {
		
		User result = null;	//return�� ����
		
		for(User user : users) { // ���� for��
			
			if(user.getId().equals(id)) { //users�� ������ id�� �Է¹��� id ��
				
				if(user.getPassWord().equals(passWord)) {	//users�� ������ pass�� �Է¹��� pass ��
					
					System.out.println("�α��� ����");
					return user;	// ID PASS�Ѵ� ���� �� user���� ����
					
				}else { // pass�� �ٸ���
					
					System.out.println("��й�ȣ�� �ٸ��ϴ�.");
					
					
				}
				
			}else { // ID�� �ٸ���
				
				System.out.println("���̵� �ٸ��ϴ�.");
				
			}
				
			
		} return result;
	}
		

	
//		////////////	��ȣȭ
	public void encryption(String passWord) {
		
		String encryption = "";
		for (int i = 0; i < passWord.length(); i++) {
			encryption += (char)(passWord.charAt(i) * 3);
			
		}
		System.out.println(encryption);
		
	}
//////////////////////////////////������ȣ �߼�
	public String massageSend(String phoneNumber) {
		
	String result = "";
	final int result_Length = 4;
	Random random = new Random();	
		
	String api_key = "NCSQL6MBUJERYBLA";
    String api_secret = "OXA8GH2AJ2WKSNI2YIKRFLTFISCNGOFW";
    Message coolsms = new Message(api_key, api_secret);
    
  
		for (int i = 0; i < result_Length; i++) {
			result += random.nextInt(10);//������ȣ�� ������ ��ȣ�� ����.
		}
    

    // 4 params(to, from, type, text) are mandatory. must be filled
    HashMap<String, String> params = new HashMap<String, String>();
    params.put("to", phoneNumber);
    params.put("from", "01064844195");
    params.put("type", "SMS");
    params.put("text", "������ȣ�� �Է����ּ���\n ������ȣ :" + result);
    params.put("app_version", "test app 1.2"); // application name and version
   

    try {
      JSONObject obj = (JSONObject) coolsms.send(params);
    //  System.out.println(obj.toString());
    } catch (CoolsmsException e) {
   //   System.out.println(e.getMessage());
    //  System.out.println(e.getCode());
    }
    	return result;
	} 
	

	
	
//////////////////////////////////��й�ȣ ã��
	public String findPassWord(String id, String phoneNumber) {
		String verifyNumber = "";
		Scanner sc = new Scanner(System.in);
		UserField userField = new UserField();
		String result = null;
		verifyNumber = sc.next();
		
		for(User user : users) { // users.get(i)�� i�� �ϳ��� ���鼭 user�� ��.
			
			if(user.getId().equals(id)) { // users�� id�� �ҷ��ͼ� �Է¹��� id�� ��
//				���̵� ������,
				if(user.getPhoneNumber().equals(phoneNumber)) {	//���� ����ȣ�� �Էµ� ����ȣ ��
					userField.massageSend(phoneNumber);	// ��ȣ�� ������ȣ ����
				}else {
					System.out.println("���� �޴��� ��ȣ�Դϴ�.");		//�ٸ��� ���¹�ȣ �˷��ִ� �޼��� ���
					continue;
				}
			}else {
				System.out.println("���� ID�Դϴ�.");	//�ٸ��� �����޼��� ���
				continue;
			}
			if(userField.massageSend(phoneNumber) == verifyNumber) {	//���� ������ȣ�� �Է��ѰͰ� ���ٸ�
				System.out.println("����� ��й�ȣ�� : " + user.getPassWord());	// �����س��� �н����带 ���
				return user.getPassWord();	// ����� �н����带 ����
						
			}else {
						
					System.out.println("������ȣ�� Ʋ�Ƚ��ϴ�.");
					break;
			}
					
		}
		
		return null;
		
	}
	
//	/////////////////////��й�ȣ ����
	public String changePassWord(String passWord,String changePass) {
		
		
		for(User user : users) {
			
			if(user.getPassWord().equals(passWord)) { // ��� ������
				
				user.setPassWord(changePass); // �����Ҳ��� ����
				return changePass; //Ȯ���� ���� ���氪 ����
				
				
			}else {
				
				System.out.println("��й�ȣ�� �ٸ��ϴ�.");// �ƴϸ� �����޼��� ���
				
			}
			
		}return null;
		
		
	}
	

}
	
	
	


