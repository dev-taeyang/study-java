package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OneOrZero {
	public int solution(String s) {
		int result = 0;
		
		
//		인티져 타입의 arrayList results를 선언해서 s문자열을 0기준으로 끊어서 하나씩 넣어준 후 내림차순으로 소티드 시켜준다음 리턴값을 받음.
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
		return results.size() == 0 ? 0 : results.get(0);	// rusults의 크기가 0이면 0을 리턴하고, 0보다 크면 results의 리스트중 첫번째 방의 값을 리턴함.
//		첫번째 값이 가장 큰값으로 소티드 되어있기 때문에 최대값이 앞으로옴.
	}
	
	public static void main(String[] args) {
		String s = "1101111011111";
		System.out.println(new OneOrZero().solution(s));
	}
}
















