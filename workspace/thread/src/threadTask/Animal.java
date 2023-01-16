package threadTask;

public class Animal{
	
//	������ �ڿ��� animal�� ����
	public void makeSounds(Runnable animal) {
		String[] sounds = {"����", "�ſ�", "����"};		//������ �����Ҹ��� ��Ʈ�� �迭�� ����
		Thread[] threads = new Thread[sounds.length];	// �ڿ��� ����� ��������� �迭�� ���� �迭�� ������ŭ ����
		
//		�� �����忡 ������ �ڿ��� �����ϵ��� �����ϰ�, �� �̸��� �����Ҹ��� �����Ѵ�.
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(animal, sounds[i]);	// ������ �迭�� i��°�濡 animal�� Ÿ������ �ΰ� name�� sounds[i]������ ����.
		}
		
		for (int i = 0; i < threads.length; i++) {
//			�� �����带 �����ٸ� �� �� 2���� �����尡 ���ÿ� start �ǰ�, ������ �����常 join�� ���� �����ش�.
			threads[i].start();	// �� �����带 Start
			if(i == 1) {	// i = 1�϶� join�� �ɷ��� 0��°�� 1��° �����ϰ� 2�� �������� �ѹ��� ���??????
				try {threads[i].join();} catch (InterruptedException e) {;}	//thread[1],thread[2]�� ������ �ɾ���.
			}
		}
	}
	
}
