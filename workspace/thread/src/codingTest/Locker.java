package codingTest;

public class Locker {
	public int solution(String p, String s) {
		int answer = 0;	// ������ �뵵�� ���� ����
		
		for (int i = 0; i < s.length(); i++) {
			int number = p.charAt(i), target = s.charAt(i), result = target - number;	//p�� i��° ���ڿ��� number�� ����. target�� �Է¹��� s�� i��°���� ����.
			answer += Math.abs(result) > 4 ? 10 - result : Math.abs(result);	//p - s�� ������ 4���� ũ�ٸ� �׳� �����ϰ� ������ ���밪�� ����� ����
		}
		return answer;
	}
}
