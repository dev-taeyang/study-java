package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
   public static void main(String[] args) {
//      5���� ������ �Է¹ޱ�
//      - ���� �Է� ���·� ����
//      - q �Է� �� ������
//      - �� ������ �迭�� ���
//      - if���� �� �� ���� ����ϱ�
//	   �Է� �޼ҵ� ����
      Scanner sc = new Scanner(System.in);
//      5�� ¥�� ��Ʈ �迭 ���� ����
      int[] arData = new int[5];
//      ���ڿ� ���� ����
      String temp = null;
//      for�� �ݺ� �� �ݺ�Ƚ���� �������� ���� �ݺ���.
      for(int i=0;; i++) {
         System.out.print(i + 1 + "��° ����[q: ������]: ");
//         temp���� �Է¹���
         temp = sc.next();
//         �빮�ڸ� �޾��� �� �ҹ��ڷ� ��ȯ���ִ� �޼ҵ� ��� : toLowerCase();
         temp = temp.toLowerCase();
//         �Է¹��� ���� q�� ������
         if(temp.equals("q")) {
//        	 for�� Ż��
            break;
         }
//         ���� ó��
         try {
//        	 arData[i]�� ���� temp���� ���������� ��ȯ�Ͽ� ����.
            arData[i] = Integer.parseInt(temp);
//            ���� ��Ȳ 1 NumberFormatException : ���� �̿��� ���� �Է�������
         } catch (NumberFormatException e) {
            System.out.println("������ �Է����ּ���.");
//            �ݺ� ī��Ʈ�� 1�ٿ��� �ٽ� �Է¹����� �ְ� ��.
            i--;
//            ���� ��Ȳ 2 ArrayIndexOutOfBoundsException : ����� �迭�� �������� �� ���� �Է��� ��.
         } catch (ArrayIndexOutOfBoundsException e) {
//        	 ���� �޼��� ��� �� arData �迭�� ����� ���� ���.
            System.out.println("5���� ������ �Է��� �����մϴ�.");
            for (int j = 0; j < arData.length; j++) {
               System.out.print(arData[j] + " ");
            }
            break;
//            �׿� ���� �޼��� ��½� �ٽ� �Է��ϰ� ��.
         } catch (Exception e) {
            System.out.println("�ٽ� �õ����ּ���.");
            i--;
         }
      }
   }
}















