package codingTest;

public class Locker {
	public int solution(String p, String s) {
		int answer = 0;	// 리턴할 용도의 변수 선언
		
		for (int i = 0; i < s.length(); i++) {
			int number = p.charAt(i), target = s.charAt(i), result = target - number;	//p의 i번째 문자열을 number에 넣음. target에 입력받은 s의 i번째열을 넣음.
			answer += Math.abs(result) > 4 ? 10 - result : Math.abs(result);	//p - s를 했을때 4보다 크다면 그냥 리턴하고 작으면 절대값을 씌우고 리턴
		}
		return answer;
	}
}
