package threadTask;

public class Thread1 extends Thread{
	
	public String name;	//�Է¹��� ���� ����
	public Thread1() {;}	//�⺻������
	public Thread1(String name) {	//�ʱ�ȭ ������
		super();
		this.name = name;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(name);	// ������ 10�����
			try {
				Thread.sleep(1000);	// 1���� �����̸� ��.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
			
		
		
	}


