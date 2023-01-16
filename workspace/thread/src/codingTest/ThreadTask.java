package codingTest;

public class ThreadTask implements Runnable{
	// 제한시간 : 1시간
	// 3개의 쓰레드가 있다.
	// Thread1, Thread2, Thread3
	// 사용자가 입력한 순서대로 각 알맞는 문자열이 출력된다.

	// 입력 예) 3 1 2
	// 출력 예) third first second

	// 단, Thread들은 항상 1, 2, 3 순서로 실행되어야 한다.

	// Thread1 : third
	// Thread2 : first
	// Thread3 : second

	// 출력 시 쓰레드의 번호도 출력할 경우 가산점으로 처리한다.
	
	public static int count;	// 쓰레드의 번호를 체크하기 위한 count 변수 선언
	
	public ThreadTask() {;}	// ThreadTask 기본생성자 선언

	public void printFirst(Runnable first) {	// 첫번째 thread 실행 메소드
		first.run(); // 수정 금지
	}

	public void printSecond(Runnable second) {	// 두번째 thread 실행 메소드
		second.run(); // 수정 금지
	}

	public void printThird(Runnable third) {	// 세번째 thread 실행 메소드
		third.run(); // 수정 금지
	}
	
	@Override
	public void run() {	// run 재정의
		switch(Thread.currentThread().getName()) {	// 현재 thread의 입력받은 값을 switch의 조건으로 사용
		case "1":	// 1을 입력했을때
			printFirst(() -> {System.out.println("Thread" + ++count + " : first");});	// printfirst메소드 실행
			break;
		case "2":
			printSecond(() -> {System.out.println("Thread" + ++count + " : second");});	// printsecond메소드 실행
			break;
		case "3":
			printThird(() -> {System.out.println("Thread" + ++count + " : third");});	// printthird메소드 실행
			break;
		}
	}
	
}





