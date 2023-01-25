package view;

import dao.UserDAO;

public class Test {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
//		아이디 중복 체크
//		if(userDAO.checkId("hds123")) {
//			System.out.println("사용 가능한 아이디");
//			return;
//		}
//		System.out.println("중복된 아이디");
//		회원id조회
//		System.out.println(userDAO.select(1L));
//		회원가입.
//		UserVO user1 = new UserVO(2L, "moonjaehyun", "asd1112", "오태양", "01011112222"
//				, "원숭이", "mjh6974@gmail.com", "경기도 용인시", "1997-11-17", "M", "ddddddd");
//		
//		userDAO.join(user1);
		
		System.out.println(userDAO.logIn("oty0601", "asd12453"));
		
	}
}
