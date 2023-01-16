package castingTest;

import java.util.Iterator;

// 넷플릭스
// 애니메이션, 영화, 드라마 클래스 선언
// 사용자가 선택한 영상이
// 애니메이션이라면 "자막지원"기능 사용
// 영화라면 "4D"기능 사용
// 드라마라면 "굿즈"기능 사용
public class CastingTask {

   public void checkVideo(Video video) { // checkVideo 메소드
      if(video instanceof Animation) { // Animation이 Video의 타입이냐?
         Animation animation = (Animation) video; // 다운 케스팅
         animation.getSubtitle(); // 자막지원 출력
      }else if(video instanceof Film) { // 필름도 비디오 타입이냐??
         Film film = (Film) video; // 비디오를 필름타입으로 다운케스팅
         film.moveChair(); // 4D 출력
      }else if(video instanceof Drama) { // 드라마도 비디오 타입이냐?
         Drama drama = (Drama) video; // 다운케스팅
         drama.sellGoods(); // 굿즈 판매 출력
      }
   }
   
   public static void main(String[] args) {
      Video[] videos = { // ? videos 라는 Video 타입의 1차원 배열에 0 = Animation , 1= Film, 2 = Drama
            new Animation(),
            new Film(),
            new Drama()
      };
      CastingTask castingTask = new CastingTask();// 
      
      for (int i = 0; i < videos.length; i++) {
         castingTask.checkVideo(videos[i]);
      }
      
   }
}







