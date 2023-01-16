package interfaceTest; // 따지고 보면 부모 클래스다. 

public interface Pet {
	
	public final static int EYES = 2; // final static 이 생략이 된것 static = 모든 객체가 공유하기위해서 사용.
	public int NOSE = 1;
	
	public abstract void giveYourHand();// 추상메소드만 선언하는거라서 abstract가 생략되어있음
	public void bang();
	public void sitDown();
	public void waitNow();
	public void getNose();
	
	public static void main(String[] args) {
		
		Pet pet = new Cat();
		
		pet.bang();
		pet.sitDown();
		pet.waitNow();
		
		
		
	}

}
