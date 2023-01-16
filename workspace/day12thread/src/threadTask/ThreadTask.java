package threadTask;

public class ThreadTask {
	
//		[실습]
//		동석이네 동물원에는 3마리의 동물이 있다.
//		monkey, tiger, dog
//		각 동물은 울음 소리가 다르고 2마리의 동물은 동시에 운다.
//		"우끼끼", "으르렁", "월월"
//		나머지 1마리 동물은 2마리 동물이 모두 울고 나서 마지막에 운다.
//		monkey와 tiger가 먼저 울고 dog를 마지막에
//	
//		package명은 threadTask으로 만들고 클래스는 2개만 선언한다.
//		하나의 클래스에는 main 쓰레드가 있다.
//		Runnable 인터페이스로 멀티 쓰레드를 구현하고 반드시 join()을 사용한다.
//		※ 각 동물은 10번씩만 운다.
//	
//	
//		- 주석을 작성하였는가
//		- Thread의 name필드를 사용할 수 있는가
//		- 배열을 사용하였는가
//		- 클래스를 두 개 선언하였는가
//		- 가산점 : 람다식을 사용하였는가, main 쓰레드를 사용하였는가
	
	public static void main(String[] args) {
		String[] animal = {"우끼끼~","으르렁~","월월~"};

		/* Thread 상속받아서 사용.
		Thread1 monkey = new Thread1(animal[0]);
		Thread1 tiger = new Thread1(animal[1]);
		Thread1 dog = new Thread1(animal[2]);
		
		monkey.start();
		tiger.start();
		try {
			tiger.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dog.start();
		 * 
		 */
		Thread2 thread = new Thread2();
		
		Thread monkey = new Thread(thread, animal[0]);
		Thread tiger = new Thread(thread, animal[1]);
		Thread dog = new Thread(thread, animal[2]);
		
		monkey.start();
		tiger.start();
		try {tiger.join(); monkey.join();} catch (InterruptedException e) {;}
		
		dog.start();
		
	
		
	}

}
