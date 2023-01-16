package jobTask;


class AntonioConte { //토트넘 감독 콘테가 되어 각종 확률 게임 진행이 되는 프로그램
	
//	축구 게임 진행
////	미니게임 진행(Penalty shoot-out )
//변수 1. 내팀이름 2. 상대팀이름 3. 골넣은 횟수 4. 막은 횟수 6번 진행 후  
	
	
//	
//
	String tottenham;
	String teamName;
	int reftShoot;
	int rightShoot;
	int middleShoot;
	int matchCount;
	
	public AntonioConte() {;}

	public AntonioConte(String teamName, int reftShoot, int rightShoot, int middleShoot, int matchCount) {
		super();
		this.teamName = teamName;
		this.reftShoot = reftShoot;
		this.rightShoot = rightShoot;
		this.middleShoot = middleShoot;
		this.matchCount = matchCount;
	}
	
	
	
	
//	String player;
//
//	boolean goal; // 0-> 골을 넣음, 1 -> goal먹힘
//	int goalCount; // goal의 수를 세는 용도
//	int winGame; // 이긴수 저장
//	int loseGame; // 진수 저장
//	static int inCome; // 수익 저장
//	int gameCount; // 게임 수 저장
//	int getMoney; // 번돈
//	int uniformSell; // 유니폼 판매
//	
//
//	{
//		gameCount = 0;
//		goal = true;
//		inCome = 10000;
//	}
////////생성자
//public AntonioConte(String player, boolean goal, int gameCount, int goalCount, int getMoney) { // 경기수별 선수별 골 저장
//	
//	this.player = player;
//	this.goal = goal;
//	this.gameCount = gameCount;
//	this.goalCount = goalCount;
//	this.getMoney = getMoney;
//}
//
//
////생성자
//public AntonioConte(int goalCount, int uniformSell) {//골수에 따른 유니폼 판매량
//	super();
//	this.goalCount = goalCount;
//	this.uniformSell = uniformSell;
//}
//
//
//
////생성자
//public AntonioConte(String player, int goalCount) {//선수 득점수
//	super();
//	this.player = player;
//	this.goalCount = goalCount;
//}
//
//
//
//
//void playerGoal(int data, int gameCount) { //골넣는 확률 구하기 메소드
//	
//	  Random random = new Random();
//    
//    int[] rating = new int[10];
//    data = 30;
//    gameCount = 10; // 슛팅 횟수
//    int money = 0;
//    for (int i = 0; i < data / 10; i++) {
//       rating[i] = 1;
//    }
//    for (int i = 0; i < gameCount-1 ; i++) {
//		
//	
//    if(rating[random.nextInt(10)] == 1) {
//       System.out.println("슛~~~~~~~~ 골이에요~~~~~\n");
//       goalCount++;
//       money += 1000;
//       inCome = inCome+money;
//       System.out.printf("스코어\n%d : 0\n",goalCount);
//    }else {
//       System.out.println("슛~~~~~~~~~~~~~~~~~ 아쉬워요! 노골입니다.\n");
//       
//    }
//    }
//}
//	
//    int playerXG() { // 선수별 골넣는 기대값.
//    	
//   
//    Random random = new Random();
//
//  int result1 = 0;
//  int[] rating = new int[10];
//  int data = 30;
//  
//  for (int i = 0; i < data / 10; i++) {
//     rating[i] = 1;
//  }
//  for (int i = 0; i < 10; i++) 
//	
//{
//	
//
//  if(rating[random.nextInt(10)] == 1) { // 1이 나올 확률이 3분의 1
//     result1++;
//     
//  }
//  }
//  return result1;
//    
//    }
//
//
//int checkScore() { //골 수 확인
//	
//	return goalCount;
//	
//}
//int checkIncome() { // 수익 확인
//	int result=0;
//	
//	result = inCome;
//	return result;
//	
//}
//
//int uniformSell(int result) { // 유니폼 판매
//	uniformSell=0;
//	if(goalCount>0 && goalCount <5) {
//		
//		uniformSell = 100;
//		
//	} else if(goalCount>5) {
//		
//		uniformSell = 500;
//	}
//	result = goalCount * uniformSell;
//	return result;
//	
//}
//	
//	
//	
//}
//
//
//		
//	
//
//
//public class MyJob {
//	public static void main(String[] args) {
//		
//		String[] msg1 = {"이벤트 매치(골당1000원)","경기를 시작하겠습니다.\n","----------전반전----------\n"};
//		String[] msg2 = {"전반전 종료됩니다.\n","----------후반전----------\n"};
//		String[] msg3 = {"번호를 골라주세요!\n","1. 문자 중계\n","2. 수익 계산\n","3. 선수별 득점확률(무작위)\n",
//				"4. 나가기(exit)\n"};
//		String[] player = {"손흥민","헤리케인","히샬리송","오태양"};
//		boolean flag = false;
//		int choice = 0;
//		AntonioConte goal = new AntonioConte("손흥민", true, 10, 1,10000); 
//		//AntonioConte uniform = new AntonioConte(10, 1000); //-> 유니폼 가격확인
//		AntonioConte playerXG = new AntonioConte("손흥민", 0);
//		
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//		
//			for (int i = 0; i < msg3.length; i++) {
//				
//				System.out.println(msg3[i]);
//				
//			}
//			choice = sc.nextInt();
//		
//		switch (choice) {
//		case 1:{ //문자 중계 및 스코어 계산
//			
//			for (int i = 0; i < msg1.length; i++) {
//				System.out.println(msg1[i]);
//				
//			}
//			
//			goal.playerGoal(50, 20);
//			
//			
//			for (int i = 0; i < msg2.length; i++) {
//				System.out.println(msg2[i]);
//				
//			}
//			
//			goal.playerGoal(90, 20);
//			System.out.printf("\n-----최종스코어:%d:0-----\n",goal.checkScore());
//
//			break;
//		}
//		
//		
//		
//		case 2: { // 수익 계산
//			
//			System.out.printf("\n-----최종수익: %d 원-----\n",goal.checkIncome());
//			break;
//
//			
//		}
//		
//		case 3: { // 선수별 득점 확률 계산
//			
//			System.out.println("-------선수 별 득점 확률 계산-------");
//			for (int i = 0; i < player.length; i++) {
//				
//				System.out.println(player[i] +" 10번의 슛팅 중 " + playerXG.playerXG() + "번 성공\n" );
//				
//			}
//			break;
//			
//		}
//		case 4: {
//			System.out.println("종료합니다.");
//			flag = true;
//		}
//		
//		defaul : break;
//		
//
//		}
//		if(flag) {
//			
//			break;
//		}
//	}
//}
}
	




