package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ThreadMain {
	
	public static void main(String[] args) {
		ArrayList<String> datas = new ArrayList<String>(Arrays.asList
				("first","second","third"));
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String msg = "순서를 입력해주세요\n 입력 : ";
		ThreadTask first = new ThreadTask(datas.get(0));
		ThreadTask second = new ThreadTask(datas.get(1));
		ThreadTask third = new ThreadTask(datas.get(2));
		ThreadTask thread = new ThreadTask();
	
		
		System.out.println(msg);
		
		for (int i = 1; i < 4; i++) {
			choice = sc.nextInt();
			
			if(choice == 1) {
				
				thread.printFirst(first);
		
				
			}else if(choice == 2) {
				
				thread.printSecond(second);
				
			}else if(choice == 3) {
				
				thread.printThird(third);
			}else {
				
				System.out.println("1,2,3 중에서 입력해주세요.");
				
			}
			
			
		}
		
	
		

	}

}
