package jobTask;


class AntonioConte { //��Ʈ�� ���� ���װ� �Ǿ� ���� Ȯ�� ���� ������ �Ǵ� ���α׷�
	
//	�౸ ���� ����
////	�̴ϰ��� ����(Penalty shoot-out )
//���� 1. �����̸� 2. ������̸� 3. ����� Ƚ�� 4. ���� Ƚ�� 6�� ���� ��  
	
	
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
//	boolean goal; // 0-> ���� ����, 1 -> goal����
//	int goalCount; // goal�� ���� ���� �뵵
//	int winGame; // �̱�� ����
//	int loseGame; // ���� ����
//	static int inCome; // ���� ����
//	int gameCount; // ���� �� ����
//	int getMoney; // ����
//	int uniformSell; // ������ �Ǹ�
//	
//
//	{
//		gameCount = 0;
//		goal = true;
//		inCome = 10000;
//	}
////////������
//public AntonioConte(String player, boolean goal, int gameCount, int goalCount, int getMoney) { // ������ ������ �� ����
//	
//	this.player = player;
//	this.goal = goal;
//	this.gameCount = gameCount;
//	this.goalCount = goalCount;
//	this.getMoney = getMoney;
//}
//
//
////������
//public AntonioConte(int goalCount, int uniformSell) {//����� ���� ������ �Ǹŷ�
//	super();
//	this.goalCount = goalCount;
//	this.uniformSell = uniformSell;
//}
//
//
//
////������
//public AntonioConte(String player, int goalCount) {//���� ������
//	super();
//	this.player = player;
//	this.goalCount = goalCount;
//}
//
//
//
//
//void playerGoal(int data, int gameCount) { //��ִ� Ȯ�� ���ϱ� �޼ҵ�
//	
//	  Random random = new Random();
//    
//    int[] rating = new int[10];
//    data = 30;
//    gameCount = 10; // ���� Ƚ��
//    int money = 0;
//    for (int i = 0; i < data / 10; i++) {
//       rating[i] = 1;
//    }
//    for (int i = 0; i < gameCount-1 ; i++) {
//		
//	
//    if(rating[random.nextInt(10)] == 1) {
//       System.out.println("��~~~~~~~~ ���̿���~~~~~\n");
//       goalCount++;
//       money += 1000;
//       inCome = inCome+money;
//       System.out.printf("���ھ�\n%d : 0\n",goalCount);
//    }else {
//       System.out.println("��~~~~~~~~~~~~~~~~~ �ƽ�����! ����Դϴ�.\n");
//       
//    }
//    }
//}
//	
//    int playerXG() { // ������ ��ִ� ��밪.
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
//  if(rating[random.nextInt(10)] == 1) { // 1�� ���� Ȯ���� 3���� 1
//     result1++;
//     
//  }
//  }
//  return result1;
//    
//    }
//
//
//int checkScore() { //�� �� Ȯ��
//	
//	return goalCount;
//	
//}
//int checkIncome() { // ���� Ȯ��
//	int result=0;
//	
//	result = inCome;
//	return result;
//	
//}
//
//int uniformSell(int result) { // ������ �Ǹ�
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
//		String[] msg1 = {"�̺�Ʈ ��ġ(���1000��)","��⸦ �����ϰڽ��ϴ�.\n","----------������----------\n"};
//		String[] msg2 = {"������ ����˴ϴ�.\n","----------�Ĺ���----------\n"};
//		String[] msg3 = {"��ȣ�� ����ּ���!\n","1. ���� �߰�\n","2. ���� ���\n","3. ������ ����Ȯ��(������)\n",
//				"4. ������(exit)\n"};
//		String[] player = {"�����","�츮����","��������","���¾�"};
//		boolean flag = false;
//		int choice = 0;
//		AntonioConte goal = new AntonioConte("�����", true, 10, 1,10000); 
//		//AntonioConte uniform = new AntonioConte(10, 1000); //-> ������ ����Ȯ��
//		AntonioConte playerXG = new AntonioConte("�����", 0);
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
//		case 1:{ //���� �߰� �� ���ھ� ���
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
//			System.out.printf("\n-----�������ھ�:%d:0-----\n",goal.checkScore());
//
//			break;
//		}
//		
//		
//		
//		case 2: { // ���� ���
//			
//			System.out.printf("\n-----��������: %d ��-----\n",goal.checkIncome());
//			break;
//
//			
//		}
//		
//		case 3: { // ������ ���� Ȯ�� ���
//			
//			System.out.println("-------���� �� ���� Ȯ�� ���-------");
//			for (int i = 0; i < player.length; i++) {
//				
//				System.out.println(player[i] +" 10���� ���� �� " + playerXG.playerXG() + "�� ����\n" );
//				
//			}
//			break;
//			
//		}
//		case 4: {
//			System.out.println("�����մϴ�.");
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
	




