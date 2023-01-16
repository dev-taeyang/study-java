package arrayTest;

import java.util.Scanner;

public class ArTest2 {

	public static void main(String[] args) {
		
		int[] arData = new int[5];
		int num = 0;
	
		String msg = "5자리 수를 입력하세요 : ";
		
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
