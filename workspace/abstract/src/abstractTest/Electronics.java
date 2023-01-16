package abstractTest;



public abstract class Electronics { // 일반클래스는 추상메소드를 사용할 수 없음. , 필드안에 추상적인것을 선언하기 위해 추상클레스를 선언
	
	public abstract void on(); // 일반메소드와 혼용이 가능해서 abstract를 붙어야함.
	public abstract void off(); // 일반메소드와 혼용이 가능해서 abstract를 붙어야함.
	
	public static void main(String[] args) {
		
		
		Electronics refrigerator = new Refrigerator() {
			
			@Override
			public void on() {
				
				System.out.println("스위치 On");
				
			}
			
			@Override
			public void off() {
				
				System.out.println("스위치 Off");
			}
		};
		
		refrigerator.off();
		refrigerator.on();
		
	
}
}


