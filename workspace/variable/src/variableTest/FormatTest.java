package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		
		String name = "���¾�";
		int age = 20;
		double height = 123.5;
		//System.out.println("�̸� : name");
		System.out.printf("�̸� : %s\n", name); // println�� ���Ĺ��ڸ� �������� ����. -> printf ���(format)
		System.out.printf("���� : %d��\n", age); // ������ ���Ĺ��� ���
		System.out.printf("������ : %.2fkg\n", height); // %. �ڿ� ��°�ڸ����� ��Ÿ���� ���� �ڿ��� �ݿø�
	}

}
