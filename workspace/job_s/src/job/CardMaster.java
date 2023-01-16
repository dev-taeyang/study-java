package job;

import java.util.Random;
import java.util.Scanner;

// 타짜
// 족보(끗, 땡, 광땡)
// 나랑 상대방과 대결
// 계급: 호구, 물주, 마담, 타짜
// 패를 받을 시 추가 금액 설정
// 같은 패가 나올 시 다음 판 두 배
// 다이, 고 결정
// 판돈: 1억
// 연속 3회 승리 시 계급 상승

public class CardMaster { // 기본 클래스 선언
   String nickname; // 
   int money; // 자산을 필드에 선언
   int level;
   int deck;
   int winCount;
   
   public CardMaster() {;} // 기본 생성자 선언

   public CardMaster(String nickname, int money) { //이름, 돈 생성자
      this.nickname = nickname;
      this.money = money;
   }
   
//   판돈 및 추가 금액을 받는다.
   void deposit(int money) {
      this.money -= money; // this.money = this.money - money ;
   }
   
//   끗(60) 땡(30) 광땡(10)
   void getMyDeck() {	//덱 받기 (random으로 돌려서 받음)
      Random random = new Random();
      int[] rating = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2}; // (0은 광땡 1은 땡, 2는 끗)
      this.deck = rating[random.nextInt(rating.length)];
   }
   
   int battle(CardMaster cardMaster) { // 대결하기
//      -1 : draw, 0 : lose, 1 : win
      boolean draw = this.deck == cardMaster.deck; // 
      boolean lose = this.deck > cardMaster.deck;
      boolean win = this.deck < cardMaster.deck;
      boolean[] status = {draw, lose, win};
      int result = 0;
      
      for (int i = -1; i < 2; i++) {
         if(status[1 + i]) { // status 0 = -1, status 1 = 0, status = 2 = -1
            result = i; // result = -1 , 0, 1,
            break;
         }
      }
      return result;
      
   }
   
   public static void main(String[] args) { // 메인 함수
      String[] arLevel = {"호구", "물주", "마담", "타짜"};
      String[] decks = {"광땡", "땡", "끗"};
      String[] status = {"무승부", "패배", "승리"};
      String message = "1. 대결하기\n2. 나의 정보\n3. 나가기";
      String depositMessage = "1. 추가금액 입력\n2. 추가금액 없이 진행";
      int choice = 0, money = 0, defaultMoney = 10_000, result = 0, depositMoney = 0;
      Scanner sc = new Scanner(System.in);
      CardMaster me = new CardMaster("김유진", 10000);
      CardMaster computer = new CardMaster("오태양", 0);
      String title = null;
      
      while (true) {
         title = "[" + arLevel[me.level] + "]" + me.nickname + " 자산: " + me.money + "\n"
               + "[" + arLevel[computer.level] + "]" + computer.nickname + " 자산: " + computer.money;
         System.out.println(title);
         System.out.println(message);
         choice = sc.nextInt();
         
         if(choice == 3) {break;}
         
         switch(choice) {
         case 1: // 대결하기
            me.deposit(defaultMoney); // 나의 판돈 빼주기
            computer.deposit(defaultMoney);// 컴퓨터 판돈 빼주기
            money += defaultMoney * 2; // 돈에 나의 판돈 + 컴퓨터 판돈을 저장해 놓음.
            me.getMyDeck(); // 내 패를 받는다.
            computer.getMyDeck(); // 컴퓨터 패를 받는다.
            System.out.println("나의 패: " + decks[me.deck]); // 0는 광땡, 1은 땡, 2는 끗
            
            System.out.println(depositMessage); // 추가금 입력, 혹은 다이
            choice = sc.nextInt(); // choice 값을 입력 받는다.
            
            if(choice == 1) { // choice == 1일때
               System.out.print("추가 금액: ");
               depositMoney = sc.nextInt(); // 추가금액을 입력받음.
               me.deposit(depositMoney); // 내가 건 추가금엑
               computer.deposit(depositMoney); // 컴퓨터 추가금액
               money += depositMoney * 2; // 금액에 추가금액의 2배를 넣는다.
            }
            
            result = me.battle(computer);  /// 배틀결과를 result에 담음.
            System.out.println(status[result + 1]); // 배틀 = -1 , 0 ,1 -> status == 0 , 1, 2
            
            switch(result) {
            case -1: // 무승부
               while(result == -1) {
//                  ************************************************
                  me.deposit(money);
                  computer.deposit(money);
                  money *= 3;// money = money * 3;
//                  ************************************************
//                  money *= 2
                  System.out.println(money);
                  me.getMyDeck();
                  System.out.println("나의 패: " +decks[me.deck]);
                  System.out.println("1. 고\n2. 다이");
                  choice = sc.nextInt();
                  if(choice == 2) {  // 다이 선택했을떄
                     result = 0; // status = 1
                     System.out.println(status[result + 1]); // 패배
                     computer.money += money; // 컴퓨터의 자산에 걸린 돈을 더해줌
//                     me.money -= money - (defaultMoney + depositMoney) * 2;
                     me.winCount = 0;// 연속 3번 승리시 레벨 상승
                     computer.winCount++;
                     break;
                  }
                  result = me.battle(computer); // 
                  System.out.println(status[result + 1]);
                  
                  switch(result) {
                  case 0: // 패배
                     computer.money += money;
//                     me.money -= money - (defaultMoney + depositMoney) * 2;
                     me.winCount = 0;
                     computer.winCount++;
                     break;
                  case 1: // 승리
                     me.money += money;
//                     computer.money -= money - (defaultMoney + depositMoney) * 2;
                     me.winCount++;
                     computer.winCount = 0;
                     break;
                  }
               }
               break;
            case 0: // 패배
               computer.money += money; // 컴퓨터 돈에 돈을 판돈 + 추가금액을 더해줌
               me.money -= money - (defaultMoney + depositMoney) * 2; // 내꺼에서는 빼줌
               me.winCount = 0;// 내꺼 승카운트 초기화
               computer.winCount++;// 컴퓨터 승카운트 +1;
               break;
            case 1: // 승리
               System.out.println(money);
               me.money += money;
               computer.money -= money - (defaultMoney + depositMoney) * 2;
               me.winCount++;
               computer.winCount = 0;
               break;
            }
            if(me.winCount > 2 && me.level < 3) {// 내 승카운트가 3이되고, 나의 레벨이 타짜보다 아래면
               me.level++; // 레벨업을 시켜줌
            }
            if(computer.winCount > 2 && computer.level < 3) { // 컴퓨터도 똑같이.
               computer.level++;
            }
            money = 0;// 추가금액, 판돈 초기화
            break;
         case 2: // 나의 정보
            break;
         default: // 그 외 선택시 오류메세지 출력
            System.out.println("다시 입력해주세요.");
            break;
         }
      }
      
      
   }
}








