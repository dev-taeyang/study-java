package codingTest;

public class ThreadTask extends Thread{
	
	
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
	public String name;
	public ThreadTask() {;}
	public ThreadTask(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.print(name + " ");
		try {Thread.sleep(500);} catch (InterruptedException e) {;}
		
	}




	public void printFirst(Runnable first) {
		first.run(); // 수정 금지
	}

	public void printSecond(Runnable second) {
		second.run(); // 수정 금지
	}

	public void printThird(Runnable third) {
		third.run(); // 수정 금지
	}
	
	
	
}





