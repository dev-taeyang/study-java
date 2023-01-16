package threadTask;

public class Thread1 extends Thread{
	
	public String name;	//입력받을 변수 선언
	public Thread1() {;}	//기본생성자
	public Thread1(String name) {	//초기화 생성자
		super();
		this.name = name;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(name);	// 변수를 10번출력
			try {
				Thread.sleep(1000);	// 1초의 딜레이를 줌.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
			
		
		
	}


