package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;

import domain.UserVO;

public class UserDAO {

	public static Long userId; // �α��� �������� ������ ID�� �����ϱ� ���� Static ������ ����.
	public Connection connection; // ���� ��ü
	public PreparedStatement preparedStatement; // ���� ���� ��ü
	public ResultSet resultSet; // ��� ���̺� ��ü

//   ���̵� �ߺ��˻�
	public boolean checkId(String userIdentification) {
		String query = "SELECT COUNT(USER_ID) FROM TBL_USER WHERE USER_IDENTIFICATION = ?";
		boolean result = false;
		connection = DBConnecter.getConnection(); // DBconnecter�� getConnection �޼ҵ带 �ҷ��ͼ� connection�� ��´�.
		try {
			preparedStatement = connection.prepareStatement(query); // conecntion Ŭ���� �ȿ��ִ� prepareStatement �޼ҵ带 �ҷ���.
			preparedStatement.setString(1, userIdentification); // preparedStatement�� �������� ���� ���� �����ϱ� ���� �޼ҵ���.
			resultSet = preparedStatement.executeQuery(); // select�� ����Ҷ��� executeQuery�� ��� (���������� ���޹��� ����Ÿ����
															// resultset���� ������.)

			resultSet.next(); // resultSet�� �ະ�� �Ѿ�鼭 �д´�. ���â�� �����̹Ƿ� while���� ���� ����. ������ �ִ��� ������ boolean Ÿ������
								// ������.
			result = resultSet.getInt(1) == 0; // count�� ����Ͽ� ����� �Ǵ�. ���������� getInt�� ���. resultset�� ���� �޾ƿ� result�� ����.

		} catch (SQLException e) {
			System.out.println("checkId(String) SQL�� ����"); // �������� ������ ���� �� �Ʒ� �ͼ��� �޼��� ���.
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) { // �������� open�� ������� �ٽ� �ݾ���� ��.
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return result; // �Ҹ�Ÿ���� result���� ������.
	}

//   ȸ������
	public void insert(UserVO userVO) { // ������ ��ü ������ �Է��ؾ� ������ UserVOŸ���� ��ü�� �ŰԺ����� �޴´�. // ȭ���ʿ��� UserVO��ü�� ����.
		String queryForJoin = "INSERT INTO TBL_USER"
				+ "(USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD, USER_PHONE, USER_EMAIL, USER_ADDRESS, USER_RECOMMENDER_ID) "
				+ "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";

//       ���� ���̺��� ��õ�� �÷��� �߰��Ͽ�, ȸ�� ���� ��ȸ �� ��õ ���� ���� ���������� ����
//       String queryForUpdateRecommendCount = 
//             "UPDATE TBL_USER SET RECOMMEND_COUNT = RECOMMEND_COUNT + 1 WHERE USER_ID = ?";

//       ���� ��õ �� ��ȸ�� ���� ���, ���̺��� ���� �и��Ͽ� ����Ű�� ������ �� ��ȸ
//       ���̺��� �и��Ǿ ȸ������ �� TBL_USER�� INSERT �� TBL_RECOMMEND�� ���� INSERT�� �ʿ��ϴ�.
//       �� �� TRIGGER�� ����Ͽ� TBL_USER�� INSERT�̺�Ʈ �߻� �� TBL_RECOMMEND���� �ڵ����� INSERT �ǵ��� ����
		String queryForUpdateRecommendCount = "UPDATE TBL_RECOMMEND SET RECOMMEND_COUNT = RECOMMEND_COUNT + 1 WHERE USER_ID = ?";
		// ��õ���� Ȯ���ϱ����� recommender_ID�� �Էµɶ����� TBL_RECOMMEND ���̺��� RECOMMEND_COUNT���� �ϳ���
		// �÷���.

		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(queryForJoin); // queryForJoin�� �������� DB�� ����
			preparedStatement.setString(1, userVO.getUserIdentification()); // ?�� ������� userVO��ü�� ���� �ϳ��� �־� isert����.
			preparedStatement.setString(2, userVO.getUserName());
			preparedStatement.setString(3, new String(Base64.getEncoder().encode(userVO.getUserPassword().getBytes())));
//         password�� Base64��� Ŭ������ ���ڴ� �޼ҵ带 ����Ͽ� ��й�ȣ�� ��ȣȭ����.
			preparedStatement.setString(4, userVO.getUserPhone());
			preparedStatement.setString(5, userVO.getUserEmail());
			preparedStatement.setString(6, userVO.getUserAddress());
			preparedStatement.setString(7, userVO.getUserRecommenderId());
			preparedStatement.executeUpdate(); // executeUpdate�� �ݿ��� ������� ������ �������ִ� �Լ���.

			if (userVO.getUserRecommenderId() != null) { // RecommenderId���� �Է�������
				preparedStatement = connection.prepareStatement(queryForUpdateRecommendCount); // queryForUpdateRecommendCount��
																								// �������� DB�� ����
				preparedStatement.setString(1, userVO.getUserRecommenderId()); // ?�� �� ���� StringŸ������ set����.
				preparedStatement.executeUpdate(); // �� ������ ������ ����� ������� ������ ����.
			}

		} catch (SQLException e) {
			System.out.println("insert(UserVO) SQL�� ����");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

//   �α���
	public boolean login(String userIdentification, String userPassword) { // ������ ���̵� �� ��й�ȣ�� ���� �Է��Ͽ� login�� �ϰ� Ȯ����
																			// booleanŸ��(����/����).
		String query = "SELECT USER_ID FROM TBL_USER WHERE USER_IDENTIFICATION = ? AND USER_PASSWORD = ?";
		boolean check = false;

		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userIdentification);
			preparedStatement.setString(2, userPassword);

			resultSet = preparedStatement.executeQuery(); // Select���ҋ��� executeQuery�� ����ϰ� �̰��� resultSet�� ���� ������.

			if (resultSet.next()) { // �о�� ���� ���� ��
				userId = resultSet.getLong(1); // select���� ���� �޾ƿ� user_id�� �α��� ���¸� �����Ͽ� �ٸ� �޼ҵ带 ����ϱ����� static������ ������
												// userId�� ����
				check = true; // �α��� ���� ���и� ���� �ϱ� ���� check
			}

		} catch (SQLException e) {
			System.out.println("login(String, String) SQL�� ����");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return check;
	}

//   ȸ��Ż��
	public void delete() {
		String query = "DELETE FROM TBL_USER WHERE USER_ID = ?"; // �� user_id�� �ش��ϴ� ���� ����� ������
		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, userId); // ?�� �־���

			preparedStatement.executeUpdate(); // ����

		} catch (SQLException e) {
			System.out.println("delete() SQL�� ����");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

//   ���̵� ã��
	public String findIdentification(String userPhone) { // ���̵� ã���� userPhone�� �Է��Ͽ� �ٷ� ã��.
		String query = "SELECT USER_IDENTIFICATION FROM TBL_USER WHERE USER_PHONE = ?";
		String userIdentification = null;
		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query); //
			preparedStatement.setString(1, userPhone); //

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) { // resultSet�� ���� �ϳ��� �о��µ� ���� ���� ��
				userIdentification = resultSet.getString(1);
			}

		} catch (SQLException e) {
			System.out.println("findIdentification(String) SQL�� ����");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

		return userIdentification;
	}

//   ��й�ȣ ����
	public void updateUserPassword(String userPassword) { // password�� ���� �Է��Ͽ� ����
		String query = "UPDATE TBL_USER SET USER_PASSWORD = ? WHERE USER_ID = ?";
		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, new String(Base64.getEncoder().encode(userPassword.getBytes()))); // ������
																												// password��
																												// ��ȣȭ�Ͽ�
																												// ?�� ����
			preparedStatement.setLong(2, userId); // static ������ userId�� 2��° ?�� �����. (�α��� ������ ��й�ȣ�� �����ϱ� ���ؼ�)

			preparedStatement.executeUpdate(); // ������ ��� ����������(��й�ȣ ����Ϸ�)

		} catch (SQLException e) {
			System.out.println("updateUserPassword(String) SQL�� ����");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

//   ȸ������ ����
	public void update(UserVO userVO) { // userVO ��ü�� ȭ�鿡�� �޾� �����Ѵ�.
		String query = "UPDATE TBL_USER SET USER_NICKNAME = ?, USER_GENDER = ?, USER_BIRTH = ? WHERE USER_ID = ?";
		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userVO.getUserNickname());
			preparedStatement.setString(2, userVO.getUserGender());
			preparedStatement.setString(3, userVO.getUserBirth());
			preparedStatement.setLong(4, userId); // userId�� �α��ν� static���� �����س��� userId��
			
			
			preparedStatement.executeUpdate(); // ����

		} catch (SQLException e) {
			System.out.println("update(UserVO) SQL�� ����");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

//   ȸ������ ��ȸ
	public UserVO select(Long userId) { // ������ id�� �Է��Ͽ� ������ ��ȸ
		String query = "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
				+ " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
				+ "USER_GENDER, USER_RECOMMENDER_ID " + "FROM TBL_USER WHERE USER_ID = ?";
		UserVO userVO = null;
		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, userId); // ���ϴ� userId �Է�
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) { // �ҷ��� ������ resultSet�� �������� ����� ������ ������ userVO��ü�� set����
				/*
				 * 
					useriD= 3
					USERIDENTIFICATION = JAEHUYN123
					PASSWOERD = SKDFAJSDK
					
				 */
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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

		return userVO;
	}

//   ��õ��
	public Long getCountOfRecommenderId(Long userId) {
//      String query = "SELECT RECOMMEND_COUNT FROM TBL_USER WHERE USER_ID = ?";
		String query = "SELECT RECOMMEND_COUNT FROM TBL_RECOMMEND WHERE USER_ID = ?";
		Long recommendCount = 0L;
		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, userId);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				recommendCount = resultSet.getLong(1); // ���� �޾ƿ� recommencount�� �����
			}
		} catch (SQLException e) {
			System.out.println("getCountOfRecommenderId(Long) SQL�� ����");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return recommendCount; // ����
	}

//   ���� ��õ�� ���
	public ArrayList<UserVO> selectRecommenders() { // ���� ��õ�� ������� �������� �� �ֱ� ������ UserVOŸ���� ArrayList�� �����Ͽ� ��õ�� ������� ���
													// ������ ����
		String query = "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
				+ " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
				+ "USER_GENDER, USER_RECOMMENDER_ID FROM TBL_USER WHERE USER_RECOMMENDER_ID = ?";
		UserVO userVO = null;
		ArrayList<UserVO> users = new ArrayList<UserVO>();

		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, select(userId).getUserIdentification()); // �α����Ͽ� ����� userid�� �̿��Ͽ� select�޼ҵ带
																					// ���� ȸ�������� ������
//         ���� id�� �޾ƿͼ� ?���� �־��ش�.

			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) { // ���྿ �о� �ָ� ������ userVO��ü�� �����. // while�� �̱⶧���� ���̻� ���� ���� ������ �о�ͼ� �Է�����
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
				users.add(userVO); // users��� UserVOŸ���� ArrayList�� add���ش�
			}

		} catch (SQLException e) {
			System.out.println("selectRecommenders() SQL�� ����");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return users;
	}

//   ���� ��õ�� ���
	public UserVO getMyRecommender() {
		String query = "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
				+ " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
				+ "USER_GENDER, USER_RECOMMENDER_ID FROM TBL_USER WHERE USER_ID = " + "("
				+ "SELECT USER_RECOMMENDER_ID FROM TBL_USER WHERE USER_ID = ?" + ")";
		UserVO userVO = null;

		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, userId);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
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
			System.out.println("getMyRecommender() SQL�� ����");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return userVO;
	}
	
//	�ȷο� �ϱ�
	public void insertFollow(UserVO userVO) {
//		follower_id ���� �ȷο� �ϴ� �����. // User_iD �ȷο� �� ���̵�(�α��� ���� �� ���� �ȷο� �ϴ� ������� Ȯ�� �ϱ� ����)
		String query = "INSERT INTO TBL_FOLLOW "
				+ "(FOLLOW_ID, FOLLOWER_ID, FOLLOW_DATE, USER_ID) "
				+ "VALUES((SEQ_FOLLOW.NEXTVAL), ?, SYSDATE, ?)";
		
		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, userVO.getUserId());
			preparedStatement.setLong(2, UserDAO.userId);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("insertFollow(UserVO userVO) SQL�� ����");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
	}
	
//	�ȷο� ��ȸ

	public ArrayList<UserVO> findFollow() {
		
		String query = "SELECT F.USER_ID, F.FOLLOW_ID, F.FOLLOW_DATE, F.FOLLOWER_ID, U.USER_IDENTIFICATION , "
				+ "U.USER_NAME ,U.USER_PHONE ,U.USER_NICKNAME ,U.USER_EMAIL , U.USER_ADDRESS , U.USER_BIRTH , U.USER_GENDER "
				+ "FROM TBL_FOLLOW F RIGHT JOIN TBL_USER U "
				+ "ON F.USER_ID = U.USER_ID AND F.USER_ID = ?";
		ArrayList<UserVO> users = new ArrayList<UserVO>();
		UserVO userVO = null;
		int index = 0;
		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, UserDAO.userId);
//         ���� id�� �޾ƿͼ� ?���� �־��ش�.

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) { // ���྿ �о� �ָ� ������ userVO��ü�� �����. // while�� �̱⶧���� ���̻� ���� ���� ������ �о�ͼ� �Է�����
				index = 0;
				userVO = new UserVO();
				userVO.setUserId(resultSet.getLong(++index));
				userVO.setFollowId(resultSet.getLong(++index));
				userVO.setFollowDate(resultSet.getString(++index));
				userVO.setFollowerId(resultSet.getLong(++index));
				userVO.setUserIdentification(resultSet.getString(++index));
				userVO.setUserName(resultSet.getString(++index));
				userVO.setUserPhone(resultSet.getString(++index));
				userVO.setUserNickname(resultSet.getString(++index));
				userVO.setUserEmail(resultSet.getString(++index));
				userVO.setUserAddress(resultSet.getString(++index));
				userVO.setUserBirth(resultSet.getString(++index));
				userVO.setUserGender(resultSet.getString(++index));
				users.add(userVO); // users��� UserVOŸ���� ArrayList�� add���ش�
			}

		} catch (SQLException e) {
			System.out.println("ArrayList<UserVO> findFollow() SQL�� ����");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return users;
		
	}
	
	
	
	
	
	
	
	
}
