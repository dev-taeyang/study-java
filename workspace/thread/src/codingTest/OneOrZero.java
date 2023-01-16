package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OneOrZero {
	public int solution(String s) {
		int result = 0;
		
		
//		��Ƽ�� Ÿ���� arrayList results�� �����ؼ� s���ڿ��� 0�������� ��� �ϳ��� �־��� �� ������������ ��Ƽ�� �����ش��� ���ϰ��� ����.
		List<Integer> results = new ArrayList<String>(Arrays.asList(s.split("0")))	
				.stream().map(String::length).sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		
//		try {
//			result = new ArrayList<String>(Arrays.asList(s.split("0")))
//					.stream().map(String::length).sorted(Collections.reverseOrder())
//					.collect(Collectors.toList()).get(0);
//		} catch (Exception e) {
//			result = 0;
//		}
		return results.size() == 0 ? 0 : results.get(0);	// rusults�� ũ�Ⱑ 0�̸� 0�� �����ϰ�, 0���� ũ�� results�� ����Ʈ�� ù��° ���� ���� ������.
//		ù��° ���� ���� ū������ ��Ƽ�� �Ǿ��ֱ� ������ �ִ밪�� �����ο�.
	}
	
	public static void main(String[] args) {
		String s = "1101111011111";
		System.out.println(new OneOrZero().solution(s));
	}
}
















