package abstractTest;



public abstract class Electronics { // �Ϲ�Ŭ������ �߻�޼ҵ带 ����� �� ����. , �ʵ�ȿ� �߻����ΰ��� �����ϱ� ���� �߻�Ŭ������ ����
	
	public abstract void on(); // �Ϲݸ޼ҵ�� ȥ���� �����ؼ� abstract�� �پ����.
	public abstract void off(); // �Ϲݸ޼ҵ�� ȥ���� �����ؼ� abstract�� �پ����.
	
	public static void main(String[] args) {
		
		
		Electronics refrigerator = new Refrigerator() {
			
			@Override
			public void on() {
				
				System.out.println("����ġ On");
				
			}
			
			@Override
			public void off() {
				
				System.out.println("����ġ Off");
			}
		};
		
		refrigerator.off();
		refrigerator.on();
		
	
}
}


