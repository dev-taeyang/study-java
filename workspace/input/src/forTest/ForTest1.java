package forTest;

import java.util.Scanner;

public class ForTest1 {
	
	public static void main(String[] args) { // for����� ���ϴ� ���� ��ŭ 1~ ���ϱ�
		
		int choice = 0;
		int result = 0;
		String msg = "������ �Է��ϼ��� : ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		choice = sc.nextInt();
		
		for(int i = 1 ; i < choice + 1 ; i++) {
			
			
			if(i <5 ) {
				
				result = result + i; // i= 1 result = 1, i=2 result = 3, i=3 result = 6, i=4 result= 10
				System.out.println("1." + result);
			}
			else if (i < 8) {
				
				result = result + i + 1; // i=5 result = 16, i=6 result = 23,
				System.out.println("2." + result);
			}
			else {
				
				result = result + i + 2;
				System.out.println("3." + result);
			}
		
			
		}
		
		System.out.print("������� : " + result);
		
	}

}
