package ambiguity;

public interface InterB {
	
	public default void printData() { // �ƹ��͵� ������ ������ abstract�� �����Ǿ������ϱ� �Ϲݸ޼ҵ��
//		���� ������ default�� �ٿ��ߵȴ�.
		
		System.out.println("InterB");

	}
}
