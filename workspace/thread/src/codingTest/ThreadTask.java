package codingTest;

public class ThreadTask implements Runnable{
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
	
	public static int count;	// �������� ��ȣ�� üũ�ϱ� ���� count ���� ����
	
	public ThreadTask() {;}	// ThreadTask �⺻������ ����

	public void printFirst(Runnable first) {	// ù��° thread ���� �޼ҵ�
		first.run(); // ���� ����
	}

	public void printSecond(Runnable second) {	// �ι�° thread ���� �޼ҵ�
		second.run(); // ���� ����
	}

	public void printThird(Runnable third) {	// ����° thread ���� �޼ҵ�
		third.run(); // ���� ����
	}
	
	@Override
	public void run() {	// run ������
		switch(Thread.currentThread().getName()) {	// ���� thread�� �Է¹��� ���� switch�� �������� ���
		case "1":	// 1�� �Է�������
			printFirst(() -> {System.out.println("Thread" + ++count + " : first");});	// printfirst�޼ҵ� ����
			break;
		case "2":
			printSecond(() -> {System.out.println("Thread" + ++count + " : second");});	// printsecond�޼ҵ� ����
			break;
		case "3":
			printThird(() -> {System.out.println("Thread" + ++count + " : third");});	// printthird�޼ҵ� ����
			break;
		}
	}
	
}





