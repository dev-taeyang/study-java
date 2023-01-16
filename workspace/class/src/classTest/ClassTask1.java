//package classTest;
//
//class SuperCar {
////	�귣��, ���� ����
//	String brand;
//	String color;
//	int price;
//	int engineState;
//
//	SuperCar(String brand, String color, int prince, int engineState) {
//
//		this.brand = brand;
//		this.color = color;
//		this.price = price;
//		this.engineState = engineState;
//
//	}
////	���� ����
//
////	������
// //public Super
////	�õ� �ѱ�
//
////	���� ���¸� Ȯ�� �ϰ�
////	�õ��� ���� �ִٸ�, " �õ� �ѱ�" ���
////	�̹� �õ��� ���� �ִٸ�, "�õ��� �̹� ���� �ֽ��ϴ�." ���
//
//	void engineOn() { // engineState 0 ���� 1 ����
//
//		for (int i = 0; i < 2; i++) {
//
//			if (engineState == 0) {
//
//				engineState = 1;
//				System.out.println("�õ� �ѱ�");
//				break;
//
//			} else {
//
//				engineState = 1;
//				System.out.println("�õ��� �̹� ���� �ֽ��ϴ�.");
//				break;
//
//			}
//
//		}
//
//	}
////
////�õ� ����
//
////���� ���¸� Ȯ���ϰ�
////�õ��� ���� �ִٸ�, "�õ� ����" ���
////�̹� �õ��� ���� �ִٸ�, "�õ��� �̹� ���� �ֽ��ϴ�." ���
//
//	void engineOff() { // engineState 0 ���� 1 ����
//
//		for (int i = 0; i < 2; i++) {
//
//			if (engineState == 0) {
//
//				engineState = 0;
//				System.out.println("�̹� ������ ���� �ֽ��ϴ�.");
//				break;
//
//			} else {
//
//				engineState = 0;
//				System.out.println("�õ� ����.");
//				break;
//
//			}
//
//		}
//
//	}
//
//}
//
//public class ClassTask {
//	public static void main(String[] args) {
//
//		SuperCar aSuperCar = new SuperCar("KIA", "Black", 3000, 1);
//		SuperCar bSuperCar = new SuperCar("HYUNDAY", "White", 5000, 0);
//		SuperCar cSuperCar = new SuperCar("BENZ", "Yellow", 2000, 1);
//		SuperCar dSuperCar = new SuperCar("AUDI", "Blue", 1000, 0);
//		SuperCar eSuperCar = new SuperCar("KAL", "Green", 5000, 1);
//		System.out.println();
//		aSuperCar.engineOn();
//
//	}
//
//}

/////////////////////////////////////// ����� ����
package classTest;

import java.util.Scanner;

class SuperCar {
//   �귣��, ���� ����
   String brand;
   String color;
   String password;
   int price;
   
//   ��й�ȣ ���� Ƚ��
   int wrongCount; 
//   ���� ����
   boolean check;

   {
//      �ڵ��� ��� �� �ʱ� ��й�ȣ ����
      password = "0000";
   }
   
//   ������
   public SuperCar() {;}
   
   public SuperCar(String brand, String color, int price) { //�귣�� ���� ���� ������
      this.brand = brand;
      this.color = color;
      this.price = price;
   }
   
//   ���ϴ� ��й�ȣ�� ���� ����
   public SuperCar(String brand, String color, int price, String password) {
      this.brand = brand;
      this.color = color;
      this.price = price;
      this.password = password;
   }

//   �õ� �ѱ�
//   ���� ���¸� Ȯ���ϰ�
//   �õ��� �����ִٸ�, "�õ� ����" ���
//   �̹� �õ��� �����ִٸ�, "�õ��� �̹� �����ֽ��ϴ�." ���
   void engineStart() {
      check = true;
   }
   
//   �õ� ����
//   ���� ���¸� Ȯ���ϰ�
//   �õ��� �����ִٸ�, "�õ� ����" ���
//   �̹� �õ��� �����ִٸ�, "�õ��� �̹� �����ֽ��ϴ�." ���
   void engineStop() {
      check = false;
   }
   
//   �õ��� �ѱ� ���ؼ� ��й�ȣ 4�ڸ��� �Է¹޾ƾ� �Ѵ�.
//   3�� ���� �߸� �Է����� �� "���� �⵿" ���
//   �� ���ڿ� �񱳴� ==�� �ƴ� equals()�� ���Ѵ�.
//     "���ڿ�".equals("���ڿ�");
   boolean checkPassword(String password) {
      return this.password.equals(password);
   }
}

public class ClassTask1 {
   public static void main(String[] args) {
      String message = "1.�õ��ѱ�\n2.�õ�����";
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      SuperCar urus = new SuperCar("Lamborghini", "Yellow", 35000, "1234");
      
//      ���ϴ� �κп� ǥ�ø� �� �� �ִ� ������ FLAG��� �Ѵ�.
      boolean flag = false;
      
      while(true) {
         System.out.println(message);
         choice = sc.nextInt();
         
         switch(choice) {
         case 1:
//            �õ��� �������� ��
            if(!urus.check) {
//               ��й�ȣ �Է� �� �˻�
               System.out.print("��й�ȣ: ");
               if(urus.checkPassword(sc.next())) {
//                  ��й�ȣ ���� �Է� �� �õ� �ѱ�
                  urus.engineStart();
                  System.out.println(urus.brand + " �õ� ����");
//                  ��й�ȣ ���� Ƚ�� �ʱ�ȭ
                  urus.wrongCount = 0;
               }else { // ��й�ȣ ���� ��
//                  ��й�ȣ ���� Ƚ�� ����
                  urus.wrongCount++;
                  if(urus.wrongCount > 2) { // 3ȸ �̻� ���� ��
                     System.out.println("���� �⵿");
//                     ���� �غ�
                     flag = true;
                  }
                  System.out.println("��й�ȣ " + urus.wrongCount + "ȸ ����");
               }
               break;
            }
            System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
            break;
         case 2:
//            �õ��� ���� ���� ��
            if(urus.check) {
//               �õ� ����
               urus.engineStop();
               System.out.println(urus.brand + " �õ� ����");
//               ���� �غ�
               flag = true;
               break;
            }
            System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
            break;
         default:
            break;
         }
         
//         flag�� true�� ������ while�� Ż��
         if(flag) {
            break;
         }
      }
   }
}









