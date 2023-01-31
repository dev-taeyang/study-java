package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domain.ReplyDTO;
import domain.ReplyVO;

public class ReplyDAO {
   public Connection connection;
   public PreparedStatement preparedStatement;
   public ResultSet resultSet;
   
//   대댓글 추가
   public void insert(ReplyVO replyVO, Long target) {
      String query = "INSERT INTO TBL_REPLY"
            + "(REPLY_ID, REPLY_CONTENT, USER_ID, BOARD_ID, REPLY_GROUP, REPLY_DEPTH) "
            + "VALUES(SEQ_REPLY.NEXTVAL, ?, ?, ?, ?, (SELECT REPLY_DEPTH + 1 FROM TBL_REPLY WHERE REPLY_ID = ?))";
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, replyVO.getReplyContent());
         preparedStatement.setLong(2, UserDAO.userId);
         preparedStatement.setLong(3, replyVO.getBoardId());
         preparedStatement.setLong(4, target);
         preparedStatement.setLong(5, target);
         
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
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
      
   }
   
//   댓글 추가
   public void insert(ReplyVO replyVO) {
      String query = "INSERT INTO TBL_REPLY"
            + "(REPLY_ID, REPLY_CONTENT, USER_ID, BOARD_ID, REPLY_GROUP, REPLY_DEPTH) "
            + "VALUES(SEQ_REPLY.NEXTVAL, ?, ?, ?, SEQ_REPLY.CURRVAL, 0)";
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, replyVO.getReplyContent());
         preparedStatement.setLong(2, UserDAO.userId);
         preparedStatement.setLong(3, replyVO.getBoardId());
         
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
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
   }
   
//   댓글 전체 조회
   public ArrayList<ReplyDTO> selectAll(){
      String query = "SELECT NVL(REPLY_COUNT, 0) REPLY_COUNT, REPLY_ID, REPLY_CONTENT, R2.USER_ID, BOARD_ID, REPLY_REGISTER_DATE, REPLY_UPDATE_DATE, " 
            + "R2.REPLY_GROUP, REPLY_DEPTH, " 
            + "USER_IDENTIFICATION, USER_NAME, USER_PASSWORD, " 
            + "USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, " 
            + "USER_GENDER, USER_RECOMMENDER_ID " 
            + "FROM (SELECT REPLY_GROUP, COUNT(REPLY_ID) - 1 REPLY_COUNT FROM TBL_REPLY GROUP BY REPLY_GROUP) R1 RIGHT OUTER JOIN VIEW_REPLY_USER R2 "
            + "ON R1.REPLY_GROUP = R2.REPLY_GROUP AND R1.REPLY_GROUP = R2.REPLY_ID";
      //TBL_REPLY 테이블을 REPLY_GROUP으로 묶어 그룹과 그 그룹들의 REPLY_ID(한 게시글에 적혀있는 그룹의 전체 댓글)의 수를 보여주는 TABLE을 R1이라고 설정
      //COUNT(REPLY_ID) - 1 해준 이유는 REPLY_Group으로 group by를 했을때 현재 자신의 REPLY_ID까지 포함하여 Count하기 떄문에 -1을 해줘야함.
      //유저정보와 댓글정보를 한테이블로 나타내주는 VIEW_REPLY_USER를 R2라고 두어 오른쪽의 테이블 정보를 다 나타내는 RIGHT OUTER JOIN을 함.
      //그럼 한 게시글에 입력되어있는 댓글 및 대댓글의 모든 정보가 SELECT되어 보여줄 수 있음.
      ReplyDTO replyDTO = null;
      int index = 0;
      ArrayList<ReplyDTO> replies = new ArrayList<ReplyDTO>();
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         resultSet = preparedStatement.executeQuery();
         
         while(resultSet.next()) {
            index = 0;
            replyDTO = new ReplyDTO();
            replyDTO.setReplyCount(resultSet.getLong(++index));
            replyDTO.setReplyId(resultSet.getLong(++index));
            replyDTO.setReplyContent(resultSet.getString(++index));
            replyDTO.setUserId(resultSet.getLong(++index));
            replyDTO.setBoardId(resultSet.getLong(++index));
            replyDTO.setReplyRegisterDate(resultSet.getString(++index));
            replyDTO.setReplyUpdateDate(resultSet.getString(++index));
            replyDTO.setReplyGroup(resultSet.getLong(++index));
            replyDTO.setReplyDepth(resultSet.getLong(++index));
            replyDTO.setUserIdentification(resultSet.getString(++index));
            replyDTO.setUserName(resultSet.getString(++index));
            replyDTO.setUserPassword(resultSet.getString(++index));
            replyDTO.setUserPhone(resultSet.getString(++index));
            replyDTO.setUserNickname(resultSet.getString(++index));
            replyDTO.setUserEmail(resultSet.getString(++index));
            replyDTO.setUserAddress(resultSet.getString(++index));
            replyDTO.setUserBirth(resultSet.getString(++index));
            replyDTO.setUserGender(resultSet.getString(++index));
            replyDTO.setUserRecommenderId(resultSet.getString(++index));
            replies.add(replyDTO);
         }
         
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
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
      return replies;
   }

//   대댓글 삭제
   public void deleteReReply(Long replyId) {
      String query = "DELETE FROM TBL_REPLY WHERE REPLY_ID = ?";
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, replyId);
         preparedStatement.executeUpdate();
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
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
   }
   
//   댓글 삭제(댓글에 있는 대댓글까지 모두 삭제)
   public void deleteReply(Long groupId) {
      String query = "DELETE FROM TBL_REPLY WHERE REPLY_GROUP = ?";
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, groupId);
         preparedStatement.executeUpdate();
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
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
   }
   
//   댓글 수정
   public void update(ReplyVO replyVO) {
      String query = "UPDATE TBL_REPLY SET REPLY_CONTENT = ?, REPLY_UPDATE_DATE = SYSDATE WHERE REPLY_ID = ?";
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, replyVO.getReplyContent());
         preparedStatement.setLong(2, replyVO.getReplyId());
         preparedStatement.executeUpdate();
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
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
   }
}






























