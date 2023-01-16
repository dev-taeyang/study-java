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
	
	
//		//////////////	회원가입.
	public void joinMember(String id, String passWord, String name, String phonNumber) {
		
		
		
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setPassWord(passWord);
		user.setPhoneNumber(phonNumber);
		DBConnecter.users.add(user);
		System.out.println("회원가입 성공!");
		System.out.println("이름:" + user.getName());
		System.out.println("ID:" + user.getId() );
		System.out.println("PhoneNumber:" + user.getPhoneNumber());
		
		}
	
	
//	//////////	아이디 중복 검사.
	public String checkID(String id) { 
		
		
		
		for(User user : users) { // users.get(i)의 i가 하나씩 들어나면서 user에 들어감.
			
			if(user.getId().equals(id)) { // users의 id를 불러와서 입력받은 id와 비교
				
				System.out.println("동일한 아이디가 존재합니다.");
				return user.getId();	// 똑같은게 있으면 user.getid값을 리턴해줌.
				
			}
		}
//				빠른 포문 말고 그냥
//		for (int i = 0; i < users.size(); i++) {
//			
//			if(users.get(i).getId().equals(id)) {
//				
//				System.out.println("ID 중복.");
//				return users.get(i).getId();
//				
//				
//			}
//		}
		System.out.println("ID 생성 가능.");// 같은게 없으면 가능 메세지 출력
		return null;// null값을 리턴

		
	}
//		/////////////		로그인
	public User logIn(String id, String passWord) {
		
		User result = null;	//return용 변수
		
		for(User user : users) { // 빠른 for문
			
			if(user.getId().equals(id)) { //users의 각각의 id와 입력받은 id 비교
				
				if(user.getPassWord().equals(passWord)) {	//users의 각각의 pass와 입력받은 pass 비교
					
					System.out.println("로그인 성공");
					return user;	// ID PASS둘다 맞을 때 user값을 리턴
					
				}else { // pass가 다를때
					
					System.out.println("비밀번호가 다릅니다.");
					
					
				}
				
			}else { // ID가 다를때
				
				System.out.println("아이디가 다릅니다.");
				
			}
				
			
		} return result;
	}
		

	
//		////////////	암호화
	public void encryption(String passWord) {
		
		String encryption = "";
		for (int i = 0; i < passWord.length(); i++) {
			encryption += (char)(passWord.charAt(i) * 3);
			
		}
		System.out.println(encryption);
		
	}
//////////////////////////////////인증번호 발송
	public String massageSend(String phoneNumber) {
		
	String result = "";
	final int result_Length = 4;
	Random random = new Random();	
		
	String api_key = "NCSQL6MBUJERYBLA";
    String api_secret = "OXA8GH2AJ2WKSNI2YIKRFLTFISCNGOFW";
    Message coolsms = new Message(api_key, api_secret);
    
  
		for (int i = 0; i < result_Length; i++) {
			result += random.nextInt(10);//인증번호를 랜덤한 번호로 만듬.
		}
    

    // 4 params(to, from, type, text) are mandatory. must be filled
    HashMap<String, String> params = new HashMap<String, String>();
    params.put("to", phoneNumber);
    params.put("from", "01064844195");
    params.put("type", "SMS");
    params.put("text", "인증번호를 입력해주세요\n 인증번호 :" + result);
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
	

	
	
//////////////////////////////////비밀번호 찾기
	public String findPassWord(String id, String phoneNumber) {
		String verifyNumber = "";
		Scanner sc = new Scanner(System.in);
		UserField userField = new UserField();
		String result = null;
		verifyNumber = sc.next();
		
		for(User user : users) { // users.get(i)의 i가 하나씩 들어나면서 user에 들어감.
			
			if(user.getId().equals(id)) { // users의 id를 불러와서 입력받은 id와 비교
//				아이디가 맞으면,
				if(user.getPhoneNumber().equals(phoneNumber)) {	//받은 폰번호와 입력된 폰번호 비교
					userField.massageSend(phoneNumber);	// 번호에 인정번호 전송
				}else {
					System.out.println("없는 휴대폰 번호입니다.");		//다를때 없는번호 알려주는 메세지 출력
					continue;
				}
			}else {
				System.out.println("없는 ID입니다.");	//다를때 오류메세지 출력
				continue;
			}
			if(userField.massageSend(phoneNumber) == verifyNumber) {	//보낸 인증번호랑 입력한것과 같다면
				System.out.println("당신의 비밀번호는 : " + user.getPassWord());	// 저장해놓은 패스워드를 출력
				return user.getPassWord();	// 저장된 패스워드를 리턴
						
			}else {
						
					System.out.println("인증번호가 틀렸습니다.");
					break;
			}
					
		}
		
		return null;
		
	}
	
//	/////////////////////비밀번호 변경
	public String changePassWord(String passWord,String changePass) {
		
		
		for(User user : users) {
			
			if(user.getPassWord().equals(passWord)) { // 비번 맞으면
				
				user.setPassWord(changePass); // 변경할꺼로 변경
				return changePass; //확인을 위해 변경값 리턴
				
				
			}else {
				
				System.out.println("비밀번호가 다릅니다.");// 아니면 에러메세지 출력
				
			}
			
		}return null;
		
		
	}
	

}
	
	
	


