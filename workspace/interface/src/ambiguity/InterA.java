package ambiguity;

public interface InterA {
	
	public default void printData() { // �ƹ��͵� ������ ������ abstract�� �����Ǿ������ϱ� �Ϲݸ޼ҵ��
//		���� ������ default�� �ٿ��ߵȴ�.
		
		System.out.println("InterA");
		
	}

}
