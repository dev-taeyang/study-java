package interfaceTest; // ������ ���� �θ� Ŭ������. 

public interface Pet {
	
	public final static int EYES = 2; // final static �� ������ �Ȱ� static = ��� ��ü�� �����ϱ����ؼ� ���.
	public int NOSE = 1;
	
	public abstract void giveYourHand();// �߻�޼ҵ常 �����ϴ°Ŷ� abstract�� �����Ǿ�����
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
