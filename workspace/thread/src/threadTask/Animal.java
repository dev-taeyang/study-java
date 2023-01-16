package threadTask;

public class Animal{
	
//	구현된 자원을 animal로 받음
	public void makeSounds(Runnable animal) {
		String[] sounds = {"어흥", "매에", "음메"};		//동물의 울음소리를 스트링 배열로 선언
		Thread[] threads = new Thread[sounds.length];	// 자원을 사용할 쓰레드들을 배열로 사운드 배열의 개수만큼 선언
		
//		각 쓰레드에 동일한 자원에 접근하도록 설정하고, 각 이름을 울음소리로 설정한다.
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(animal, sounds[i]);	// 쓰레드 배열의 i번째방에 animal을 타겟으로 두고 name을 sounds[i]방으로 설정.
		}
		
		for (int i = 0; i < threads.length; i++) {
//			각 쓰레드를 스케줄링 한 뒤 2개의 쓰레드가 동시에 start 되고, 마지막 쓰레드만 join을 통해 멈춰준다.
			threads[i].start();	// 각 쓰레드를 Start
			if(i == 1) {	// i = 1일때 join이 걸려야 0번째랑 1번째 같이하고 2를 마지막에 한번에 출력??????
				try {threads[i].join();} catch (InterruptedException e) {;}	//thread[1],thread[2]의 조인을 걸어줌.
			}
		}
	}
	
}
