package threadTask;

public class ThreadTask {
	
//		[�ǽ�]
//		�����̳� ���������� 3������ ������ �ִ�.
//		monkey, tiger, dog
//		�� ������ ���� �Ҹ��� �ٸ��� 2������ ������ ���ÿ� ���.
//		"�쳢��", "������", "����"
//		������ 1���� ������ 2���� ������ ��� ��� ���� �������� ���.
//		monkey�� tiger�� ���� ��� dog�� ��������
//	
//		package���� threadTask���� ����� Ŭ������ 2���� �����Ѵ�.
//		�ϳ��� Ŭ�������� main �����尡 �ִ�.
//		Runnable �������̽��� ��Ƽ �����带 �����ϰ� �ݵ�� join()�� ����Ѵ�.
//		�� �� ������ 10������ ���.
//	
//	
//		- �ּ��� �ۼ��Ͽ��°�
//		- Thread�� name�ʵ带 ����� �� �ִ°�
//		- �迭�� ����Ͽ��°�
//		- Ŭ������ �� �� �����Ͽ��°�
//		- ������ : ���ٽ��� ����Ͽ��°�, main �����带 ����Ͽ��°�
	
	public static void main(String[] args) {
		String[] animal = {"�쳢��~","������~","����~"};

		/* Thread ��ӹ޾Ƽ� ���.
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
