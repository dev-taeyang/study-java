package castingTest;

import java.util.Iterator;

// ���ø���
// �ִϸ��̼�, ��ȭ, ��� Ŭ���� ����
// ����ڰ� ������ ������
// �ִϸ��̼��̶�� "�ڸ�����"��� ���
// ��ȭ��� "4D"��� ���
// ��󸶶�� "����"��� ���
public class CastingTask {

   public void checkVideo(Video video) { // checkVideo �޼ҵ�
      if(video instanceof Animation) { // Animation�� Video�� Ÿ���̳�?
         Animation animation = (Animation) video; // �ٿ� �ɽ���
         animation.getSubtitle(); // �ڸ����� ���
      }else if(video instanceof Film) { // �ʸ��� ���� Ÿ���̳�??
         Film film = (Film) video; // ������ �ʸ�Ÿ������ �ٿ��ɽ���
         film.moveChair(); // 4D ���
      }else if(video instanceof Drama) { // ��󸶵� ���� Ÿ���̳�?
         Drama drama = (Drama) video; // �ٿ��ɽ���
         drama.sellGoods(); // ���� �Ǹ� ���
      }
   }
   
   public static void main(String[] args) {
      Video[] videos = { // ? videos ��� Video Ÿ���� 1���� �迭�� 0 = Animation , 1= Film, 2 = Drama
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







