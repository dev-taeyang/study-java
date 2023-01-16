package job;

import java.util.Random;
import java.util.Scanner;

// Ÿ¥
// ����(��, ��, ����)
// ���� ����� ���
// ���: ȣ��, ����, ����, Ÿ¥
// �и� ���� �� �߰� �ݾ� ����
// ���� �а� ���� �� ���� �� �� ��
// ����, �� ����
// �ǵ�: 1��
// ���� 3ȸ �¸� �� ��� ���

public class CardMaster { // �⺻ Ŭ���� ����
   String nickname; // 
   int money; // �ڻ��� �ʵ忡 ����
   int level;
   int deck;
   int winCount;
   
   public CardMaster() {;} // �⺻ ������ ����

   public CardMaster(String nickname, int money) { //�̸�, �� ������
      this.nickname = nickname;
      this.money = money;
   }
   
//   �ǵ� �� �߰� �ݾ��� �޴´�.
   void deposit(int money) {
      this.money -= money; // this.money = this.money - money ;
   }
   
//   ��(60) ��(30) ����(10)
   void getMyDeck() {	//�� �ޱ� (random���� ������ ����)
      Random random = new Random();
      int[] rating = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2}; // (0�� ���� 1�� ��, 2�� ��)
      this.deck = rating[random.nextInt(rating.length)];
   }
   
   int battle(CardMaster cardMaster) { // ����ϱ�
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
   
   public static void main(String[] args) { // ���� �Լ�
      String[] arLevel = {"ȣ��", "����", "����", "Ÿ¥"};
      String[] decks = {"����", "��", "��"};
      String[] status = {"���º�", "�й�", "�¸�"};
      String message = "1. ����ϱ�\n2. ���� ����\n3. ������";
      String depositMessage = "1. �߰��ݾ� �Է�\n2. �߰��ݾ� ���� ����";
      int choice = 0, money = 0, defaultMoney = 10_000, result = 0, depositMoney = 0;
      Scanner sc = new Scanner(System.in);
      CardMaster me = new CardMaster("������", 10000);
      CardMaster computer = new CardMaster("���¾�", 0);
      String title = null;
      
      while (true) {
         title = "[" + arLevel[me.level] + "]" + me.nickname + " �ڻ�: " + me.money + "\n"
               + "[" + arLevel[computer.level] + "]" + computer.nickname + " �ڻ�: " + computer.money;
         System.out.println(title);
         System.out.println(message);
         choice = sc.nextInt();
         
         if(choice == 3) {break;}
         
         switch(choice) {
         case 1: // ����ϱ�
            me.deposit(defaultMoney); // ���� �ǵ� ���ֱ�
            computer.deposit(defaultMoney);// ��ǻ�� �ǵ� ���ֱ�
            money += defaultMoney * 2; // ���� ���� �ǵ� + ��ǻ�� �ǵ��� ������ ����.
            me.getMyDeck(); // �� �и� �޴´�.
            computer.getMyDeck(); // ��ǻ�� �и� �޴´�.
            System.out.println("���� ��: " + decks[me.deck]); // 0�� ����, 1�� ��, 2�� ��
            
            System.out.println(depositMessage); // �߰��� �Է�, Ȥ�� ����
            choice = sc.nextInt(); // choice ���� �Է� �޴´�.
            
            if(choice == 1) { // choice == 1�϶�
               System.out.print("�߰� �ݾ�: ");
               depositMoney = sc.nextInt(); // �߰��ݾ��� �Է¹���.
               me.deposit(depositMoney); // ���� �� �߰��ݿ�
               computer.deposit(depositMoney); // ��ǻ�� �߰��ݾ�
               money += depositMoney * 2; // �ݾ׿� �߰��ݾ��� 2�踦 �ִ´�.
            }
            
            result = me.battle(computer);  /// ��Ʋ����� result�� ����.
            System.out.println(status[result + 1]); // ��Ʋ = -1 , 0 ,1 -> status == 0 , 1, 2
            
            switch(result) {
            case -1: // ���º�
               while(result == -1) {
//                  ************************************************
                  me.deposit(money);
                  computer.deposit(money);
                  money *= 3;// money = money * 3;
//                  ************************************************
//                  money *= 2
                  System.out.println(money);
                  me.getMyDeck();
                  System.out.println("���� ��: " +decks[me.deck]);
                  System.out.println("1. ��\n2. ����");
                  choice = sc.nextInt();
                  if(choice == 2) {  // ���� ����������
                     result = 0; // status = 1
                     System.out.println(status[result + 1]); // �й�
                     computer.money += money; // ��ǻ���� �ڻ꿡 �ɸ� ���� ������
//                     me.money -= money - (defaultMoney + depositMoney) * 2;
                     me.winCount = 0;// ���� 3�� �¸��� ���� ���
                     computer.winCount++;
                     break;
                  }
                  result = me.battle(computer); // 
                  System.out.println(status[result + 1]);
                  
                  switch(result) {
                  case 0: // �й�
                     computer.money += money;
//                     me.money -= money - (defaultMoney + depositMoney) * 2;
                     me.winCount = 0;
                     computer.winCount++;
                     break;
                  case 1: // �¸�
                     me.money += money;
//                     computer.money -= money - (defaultMoney + depositMoney) * 2;
                     me.winCount++;
                     computer.winCount = 0;
                     break;
                  }
               }
               break;
            case 0: // �й�
               computer.money += money; // ��ǻ�� ���� ���� �ǵ� + �߰��ݾ��� ������
               me.money -= money - (defaultMoney + depositMoney) * 2; // ���������� ����
               me.winCount = 0;// ���� ��ī��Ʈ �ʱ�ȭ
               computer.winCount++;// ��ǻ�� ��ī��Ʈ +1;
               break;
            case 1: // �¸�
               System.out.println(money);
               me.money += money;
               computer.money -= money - (defaultMoney + depositMoney) * 2;
               me.winCount++;
               computer.winCount = 0;
               break;
            }
            if(me.winCount > 2 && me.level < 3) {// �� ��ī��Ʈ�� 3�̵ǰ�, ���� ������ Ÿ¥���� �Ʒ���
               me.level++; // �������� ������
            }
            if(computer.winCount > 2 && computer.level < 3) { // ��ǻ�͵� �Ȱ���.
               computer.level++;
            }
            money = 0;// �߰��ݾ�, �ǵ� �ʱ�ȭ
            break;
         case 2: // ���� ����
            break;
         default: // �� �� ���ý� �����޼��� ���
            System.out.println("�ٽ� �Է����ּ���.");
            break;
         }
      }
      
      
   }
}








