package codingTest;

public class ThreadTask extends Thread{
	
	
	// ���ѽð� : 1�ð�
	// 3���� �����尡 �ִ�.
	// Thread1, Thread2, Thread3
	// ����ڰ� �Է��� ������� �� �˸´� ���ڿ��� ��µȴ�.

	// �Է� ��) 3 1 2
	// ��� ��) third first second

	// ��, Thread���� �׻� 1, 2, 3 ������ ����Ǿ�� �Ѵ�.

	// Thread1 : third
	// Thread2 : first
	// Thread3 : second

	// ��� �� �������� ��ȣ�� ����� ��� ���������� ó���Ѵ�.
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
		first.run(); // ���� ����
	}

	public void printSecond(Runnable second) {
		second.run(); // ���� ����
	}

	public void printThird(Runnable third) {
		third.run(); // ���� ����
	}
	
	
	
}





