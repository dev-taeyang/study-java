package anonymous1;

public class Computer {
	
	public static void main(String[] args) { // 익명클래스 선언이 메소드 안에서 되서 익명클레스가 내부클레스가 된다.
		
//		인터페이스에 구현되지 않은 필드가 존재하기 때문에,
//		익명 클래스가 열린 뒤 인터페이스를 지정하여 구현시킨다.
		Game game = new Game() {	//클레스 안에 이름이 없어 익명 클래스다. 구현이 안된것을 구현하기 위해 사용
			
			@Override
			public void play() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void exit() {
				// TODO Auto-generated method stub
				
			}
		};
		
	
		
	}

}
