package view;

import dao.UserDAO;

public class Test {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
//		���̵� �ߺ� üũ
//		if(userDAO.checkId("hds123")) {
//			System.out.println("��� ������ ���̵�");
//			return;
//		}
//		System.out.println("�ߺ��� ���̵�");
//		ȸ��id��ȸ
//		System.out.println(userDAO.select(1L));
//		ȸ������.
//		UserVO user1 = new UserVO(2L, "moonjaehyun", "asd1112", "���¾�", "01011112222"
//				, "������", "mjh6974@gmail.com", "��⵵ ���ν�", "1997-11-17", "M", "ddddddd");
//		
//		userDAO.join(user1);
		
		System.out.println(userDAO.logIn("oty0601", "asd12453"));
		
	}
}
