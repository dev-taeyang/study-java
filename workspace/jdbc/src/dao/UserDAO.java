package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.UserVO;

public class UserDAO {

	public Connection connection; //���� ��ü
	public PreparedStatement preparedStatement; //���� ���� ��ü
	public ResultSet resultSet; //��� ���̺� ��ü
	
//	���̵� �ߺ��˻�
	public boolean checkId(String userIdentification) {	//checkid �޼ҵ� 
//		DB�� �Է��� select ���� ������ ���� ����
		String query = "SELECT COUNT(USER_ID) FROM TBL_USER WHERE USER_IDENTIFICATION = ?";
		boolean result = false;	// ������ ���� ����
		connection = DBConnecter.getConnection();	//DB�� ������ �������� �ҷ����� �޼ҵ�
		try {
			preparedStatement = connection.prepareStatement(query);	//Ŀ�ؼ� �޼ҵ� �� prepareStatement�� ��� ����.
//			prepareStatement�� �������� �ڹٰ� ���� �ν��� �� �ְ� �����ִ� �޼ҵ���.
			preparedStatement.setString(1, userIdentification);	// ù��° ����ǥ�� �� �ް������� set����.
			resultSet = preparedStatement.executeQuery();	// select���� ��ȯ�Ҷ��� execute�� ���ְ�, update, delete ����� execute update�� ���
			resultSet.next();	// resultSet�� ���� �������� �о��.
			result = resultSet.getInt(1) == 0;	// db���� count�� ���� ������ 0�� ��������� result = 0 �̸� ���� ���ϵ�.
			
//			SQL���� �߸� �Է����� �� ���â�� �˷��� �� �ִ� catch��
		} catch (SQLException e) {
			System.out.println("checkId(String) SQL�� ����");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {	// �ҷ��� ������ �ݴ�� �ݾ���.
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);	//runtime�ͼ���
			}
		}
		return result;
	}
	
//	ȸ������
	
	public void join(UserVO user) {
		
//		DB�� �Է��� select ���� ������ ���� ����
		String query = "INSERT INTO TBL_USER "
				+ "(USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, USER_GENDER, USER_RECOMMENDER_ID)"
				+ "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		boolean result = false;	// ������ ���� ����
		connection = DBConnecter.getConnection();	//DB�� ������ �������� �ҷ����� �޼ҵ�
		try {
			preparedStatement = connection.prepareStatement(query);	//Ŀ�ؼ� �޼ҵ� �� prepareStatement�� ��� ����.
//			prepareStatement�� �������� �ڹٰ� ���� �ν��� �� �ְ� �����ִ� �޼ҵ���.
			preparedStatement.setString(1, user.getUserIdentification());	
			preparedStatement.setString(2, user.getUserName());	
			preparedStatement.setString(3, user.getUserPassword());	
			preparedStatement.setString(4, user.getUserPhone());	
			preparedStatement.setString(5, user.getUserNickname());	
			preparedStatement.setString(6, user.getUserEmail());	
			preparedStatement.setString(7, user.getUserAddress());	
			preparedStatement.setString(8, user.getUserBirth());	
			preparedStatement.setString(9, user.getUserGender());	
			preparedStatement.setString(10, user.getUserRecommenderId());	
			preparedStatement.executeUpdate();	// select���� ��ȯ�Ҷ��� execute�� ���ְ�, update, delete ����� execute update�� ���
			
//			while(true) {
//				
//				resultSet.next();	// resultSet�� ���� �������� �о��.
//				
//			}
//			SQL���� �߸� �Է����� �� ���â�� �˷��� �� �ִ� catch��
		} catch (SQLException e) {
			System.out.println("checkId(String) SQL�� ����");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {	// �ҷ��� ������ �ݴ�� �ݾ���.
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);	//runtime�ͼ���
			}
		}
		
	}
//	�α���
	public UserVO logIn(String userIdentification, String passWord) {
		UserVO userVO = null;
		UserDAO userDAO = new UserDAO();
		UserVO result = null;
//		DB�� �Է��� select ���� ������ ���� ����
		String query = "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD, "
				+ " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
				+ "USER_GENDER, USER_RECOMMENDER_ID "
				+ "FROM TBL_USER WHERE USER_IDENTIFICATION = ? AND USER_PASSWORD = ?";
		connection = DBConnecter.getConnection();	//DB�� ������ �������� �ҷ����� �޼ҵ�
		try {
			preparedStatement = connection.prepareStatement(query);	//Ŀ�ؼ� �޼ҵ� �� prepareStatement�� ��� ����.
//			prepareStatement�� �������� �ڹٰ� ���� �ν��� �� �ְ� �����ִ� �޼ҵ���.
			preparedStatement.setString(1, userIdentification);	// ù��° ����ǥ�� �� �ް������� set����.
			preparedStatement.setString(2, passWord);	// �ι�° ����ǥ�� �� �ް������� set����.
			resultSet = preparedStatement.executeQuery();	// select���� ��ȯ�Ҷ��� execute�� ���ְ�, update, delete ����� execute update�� ���
			// resultSet�� ���� �������� �о��.
			if(resultSet.next()) {
				result = userDAO.select(resultSet.getLong(1));
			}else {
			System.out.println("���̵� ��й�ȣ�� �߸� �Ǿ����ϴ�.");
			}
			
//			SQL���� �߸� �Է����� �� ���â�� �˷��� �� �ִ� catch��
		} catch (SQLException e) {
			System.out.println("checkId(String) SQL�� ����");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {	// �ҷ��� ������ �ݴ�� �ݾ���.
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);	//runtime�ͼ���
			}
		} return result;
	
		
	}
//	��ȣȭ
//	ȸ��Ż��
//	���̵� ã��
//	��й�ȣ ����
//	ȸ������ ����
//	ȸ������ ��ȸ
	public UserVO select(Long userId) {
		String query = 
				"SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
				+ " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
				+ "USER_GENDER, USER_RECOMMENDER_ID "
				+ "FROM TBL_USER WHERE USER_ID = ?";
		UserVO userVO = null;
		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, userId);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				userVO = new UserVO();
				userVO.setUserId(resultSet.getLong(1));
				userVO.setUserIdentification(resultSet.getString(2));
				userVO.setUserName(resultSet.getString(3));
				userVO.setUserPassword(resultSet.getString(4));
				userVO.setUserPhone(resultSet.getString(5));
				userVO.setUserNickname(resultSet.getString(6));
				userVO.setUserEmail(resultSet.getString(7));
				userVO.setUserAddress(resultSet.getString(8));
				userVO.setUserBirth(resultSet.getString(9));
				userVO.setUserGender(resultSet.getString(10));
				userVO.setUserRecommenderId(resultSet.getString(11));
			}
			
		} catch (SQLException e) {
			System.out.println("select(Long) SQL�� ����");
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
		return userVO;
	}
//	��õ��
//	���� ��õ�� ���
//	���� ��õ�� ���
	
}





















