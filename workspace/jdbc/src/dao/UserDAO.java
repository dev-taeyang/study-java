package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.UserVO;

public class UserDAO {

	public Connection connection; //연결 객체
	public PreparedStatement preparedStatement; //쿼리 관리 객체
	public ResultSet resultSet; //결과 테이블 객체
	
//	아이디 중복검사
	public boolean checkId(String userIdentification) {	//checkid 메소드 
//		DB에 입력할 select 문을 저장할 변수 선언
		String query = "SELECT COUNT(USER_ID) FROM TBL_USER WHERE USER_IDENTIFICATION = ?";
		boolean result = false;	// 리턴할 변수 선언
		connection = DBConnecter.getConnection();	//DB와 연결할 정보들을 불러오는 메소드
		try {
			preparedStatement = connection.prepareStatement(query);	//커넥션 메소드 중 prepareStatement를 담는 과정.
//			prepareStatement는 쿼리문을 자바가 쉽게 인식할 수 있게 도와주는 메소드임.
			preparedStatement.setString(1, userIdentification);	// 첫번째 물음표에 들어갈 메개변수를 set해줌.
			resultSet = preparedStatement.executeQuery();	// select절을 변환할때는 execute를 써주고, update, delete 등등은 execute update를 사용
			resultSet.next();	// resultSet의 행을 한줄한줄 읽어옴.
			result = resultSet.getInt(1) == 0;	// db안의 count된 값이 없으면 0이 출려됨으로 result = 0 이면 참이 리턴됨.
			
//			SQL문을 잘못 입력했을 때 경고창을 알려줄 수 있는 catch문
		} catch (SQLException e) {
			System.out.println("checkId(String) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {	// 불러온 순서의 반대로 닫아줌.
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);	//runtime익셉션
			}
		}
		return result;
	}
	
//	회원가입
	
	public void join(UserVO user) {
		
//		DB에 입력할 select 문을 저장할 변수 선언
		String query = "INSERT INTO TBL_USER "
				+ "(USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, USER_GENDER, USER_RECOMMENDER_ID)"
				+ "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		boolean result = false;	// 리턴할 변수 선언
		connection = DBConnecter.getConnection();	//DB와 연결할 정보들을 불러오는 메소드
		try {
			preparedStatement = connection.prepareStatement(query);	//커넥션 메소드 중 prepareStatement를 담는 과정.
//			prepareStatement는 쿼리문을 자바가 쉽게 인식할 수 있게 도와주는 메소드임.
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
			preparedStatement.executeUpdate();	// select절을 변환할때는 execute를 써주고, update, delete 등등은 execute update를 사용
			
//			while(true) {
//				
//				resultSet.next();	// resultSet의 행을 한줄한줄 읽어옴.
//				
//			}
//			SQL문을 잘못 입력했을 때 경고창을 알려줄 수 있는 catch문
		} catch (SQLException e) {
			System.out.println("checkId(String) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {	// 불러온 순서의 반대로 닫아줌.
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);	//runtime익셉션
			}
		}
		
	}
//	로그인
	public UserVO logIn(String userIdentification, String passWord) {
		UserVO userVO = null;
		UserDAO userDAO = new UserDAO();
		UserVO result = null;
//		DB에 입력할 select 문을 저장할 변수 선언
		String query = "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD, "
				+ " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
				+ "USER_GENDER, USER_RECOMMENDER_ID "
				+ "FROM TBL_USER WHERE USER_IDENTIFICATION = ? AND USER_PASSWORD = ?";
		connection = DBConnecter.getConnection();	//DB와 연결할 정보들을 불러오는 메소드
		try {
			preparedStatement = connection.prepareStatement(query);	//커넥션 메소드 중 prepareStatement를 담는 과정.
//			prepareStatement는 쿼리문을 자바가 쉽게 인식할 수 있게 도와주는 메소드임.
			preparedStatement.setString(1, userIdentification);	// 첫번째 물음표에 들어갈 메개변수를 set해줌.
			preparedStatement.setString(2, passWord);	// 두번째 물음표에 들어갈 메개변수를 set해줌.
			resultSet = preparedStatement.executeQuery();	// select절을 변환할때는 execute를 써주고, update, delete 등등은 execute update를 사용
			// resultSet의 행을 한줄한줄 읽어옴.
			if(resultSet.next()) {
				result = userDAO.select(resultSet.getLong(1));
			}else {
			System.out.println("아이디나 비밀번호가 잘못 되었습니다.");
			}
			
//			SQL문을 잘못 입력했을 때 경고창을 알려줄 수 있는 catch문
		} catch (SQLException e) {
			System.out.println("checkId(String) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {	// 불러온 순서의 반대로 닫아줌.
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);	//runtime익셉션
			}
		} return result;
	
		
	}
//	암호화
//	회원탈퇴
//	아이디 찾기
//	비밀번호 변경
//	회원정보 수정
//	회원정보 조회
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
			System.out.println("select(Long) SQL문 오류");
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
//	추천수
//	나를 추천한 사람
//	내가 추천한 사람
	
}





















