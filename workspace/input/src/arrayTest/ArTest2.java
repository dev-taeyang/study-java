package arrayTest;

import java.util.Scanner;

public class ArTest2 {

	public static void main(String[] args) {
		
		int[] arData = new int[5];
		int num = 0;
	
		String msg = "5�ڸ� ���� �Է��ϼ��� : ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		
		for(int i = 0 ; i < arData.length ; i++)
			
		{
			
			arData[i] = sc.nextInt();
			
		}
		
		
		for(int i = 0; i < arData.length ; i++ ) 
		{
			
			System.out.print(arData[i]);
			
		}
		
	
	}
}
