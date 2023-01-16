package codingTest;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {	
		final int SIZE = 3;
		Runnable threadTask = new ThreadTask();	// 러너블 타입의 threadTask 선언
		Scanner sc = new Scanner(System.in);	//
		Thread[] arThread = new Thread[SIZE];	// 
		
		for (int i = 0; i < arThread.length; i++) { //3번 돌림
			arThread[i] = new Thread(threadTask); // arThread[0] 1 2 생성
		}

		System.out.println("예)3 1 2");
		System.out.print("입력[1~3] : ");
		for (int i = 0; i < arThread.length; i++) {	// 
			arThread[i].setName(sc.next());	// name = 입력받아서 매개 변수로 사용.
			arThread[i].start();	//	Start;
			try {arThread[i].join();} catch (InterruptedException e) {;}	//각쓰레드에 join을 검.
		}
	}
}






