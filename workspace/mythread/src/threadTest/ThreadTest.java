package threadTest;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		
		Thread2 thread = new Thread2();
		Thread t1 = new Thread(thread, "?");
		Thread t2 = new Thread(thread, "!");
		t1.start();//�����층
		
		try {
			t2.join();
		} catch (InterruptedException e) {
		}
		t2.start();
		
//		Thread1 t1 = new Thread1("��");
//		Thread1 t2 = new Thread1("��");
//		
//		t1.start();
//		t2.start();
		
//		t1.run();
//		t2.run();
		
		
	}

}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 */
