package collectionTask;

import java.util.ArrayList;

public class Page {
	
	public static void main(String[] args) {
		
		ArrayList<User> users = DBConnecter.users;
		UserField userField = new UserField();
		DBConnecter dbConnecter = new DBConnecter();
		
		userField.joinMember("oty", "asd12453", "오태양", "01064844195");
		userField.encryption("dfsdf");
		System.out.println(userField.changePassWord("asd12453", "asd1212"));
//		System.out.println(userField.massageSend("01064844195")); //메세지 전송
		System.out.println(users);
//		System.out.println(userField.findPassWord("oty", "01064844195"));
		
//		System.out.println(userField.checkID("oty"));
		
		

	}
	
	

}

//page 만드는 중.
//Scanner sc = new Scanner(System.in);
//String msg1 = "원하는 번호를 선택해주세요.";
//String msg2 = "1. 회원가입 \n 2. 로그인\n 3. 비밀번호 변경\n 4. 마이페이지\n 5. 나가기";
//String id = "";
//String passWord = "";
//String name = "";
//String phonNumber = "";
//UserField userField = new UserField();
//
//
//
//int choice = 0; // 선택을 위한 초이스
//while(true) {	// 무한 반복
//
//System.out.println(msg1);	// 번호 선택 메세지 출력
//System.out.println(msg2);	// 메뉴 선택 메세지 출력
//
//choice = sc.nextInt();	// 메뉴 선택
//if(choice == 5) break;	// 5를 입력했을때 나가기
//
//switch(choice) {
//
//case 1 : {	//회원가입을 선택했을 때.
//
//System.out.println("회원가입 페이지 입니다.");
//System.out.println("이름을 입력해주세요.");
//name = sc.next();
//System.out.println("ID를 입력해주세요.");
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