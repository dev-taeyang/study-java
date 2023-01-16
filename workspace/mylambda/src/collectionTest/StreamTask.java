package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;






public class StreamTask {
	
	public static void main(String[] args) {

//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		1~10까지 ArrayList에 담고 출력
//		IntStream.range(1, 11).forEach(data :: add);
//		System.out.println(datas);
//		----------------------------------다시해보기-------------------
		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 11).forEach(c-> datas.add(c));
//		IntStream.rangeClosed(1, 10).forEach(datas :: add);
		
		
//		10~1까지 ArrayList에 담고 출력
		
		IntStream.rangeClosed(0, 9).forEach(c -> datas.add(10-c));
		System.out.println(datas);
//		IntStream.rangeClosed(1, 10).forEach(v -> datas.add(11-v));
//		System.out.println(datas);
		
//		chars() 
//		String data = "ABC";
		String data = "ABC";
		data.chars().forEach(c -> System.out.println((char)c));
		
		System.out.println("--------------------------------------------------");
//		data.chars().forEach(c -> System.out.println((char)c));
		
//		ABCDEF를 각 문자별로 출력
//		IntStream.range('A', 'D').forEach(c -> System.out.println((char)c));
		
//		String data2 = "ABCDEF";
//		data2.chars().forEach(c -> System.out.println((char)c));
//		chars() : 문자열을 IntStream으로 변경
//		IntStream.rangeClosed('A', 'F').forEach(c -> System.out.println((char)c));
		
//		map() : 기존 값을 원하는 값으로 변경
//		String data = "ABC";
//		data.chars().map(c -> c+3).forEach(c -> System.out.print((char)c));
		data.chars().map(c -> c+3).forEach(c -> System.out.println((char)c));
		System.out.println("--------------------------------------------------");
		
		
//		1~100까지 중 홀수만 ArrayList에 담고 출력
		ArrayList<Integer> holsu = new ArrayList<Integer>();
		IntStream.range(1, 51).map(c -> 2*c -1).forEach(holsu :: add);
		System.out.println(holsu);
		
		System.out.println("--------------------------------------------------");
		
//		IntStream.range(1,51).map(v -> v*2 -1).forEach(datas::add);
//		System.out.println(datas);
		
		
//		A~F까지 중 D제외하고 ArrayList에 담고 출력
		ArrayList<Character> atoF = new ArrayList<Character>();
		IntStream.range('A','F').map(v -> v > 'C' ? v+1 : v).forEach(v -> atoF.add((char) v));
		System.out.println(atoF);
		System.out.println("--------------------------------------------------");
//		IntStream.rangeClosed('A', 'E').map(c -> c > 67 ? c +1 : c).forEach(c -> System.out.println((char)c));
		
//		5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLoew, PINK) , toLowerCase()
//		String color = "Black";
//		System.out.println(color.toLowerCase());
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black","WHITE","reD","yeLLow","PINK"));
//		
//		datas.stream().map(c -> c.toLowerCase()).forEach(c->System.out.println(c));
	
		
//		1~100까지 중 홀수만 ArrayList에 담고 출력
		
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		IntStream.range(1, 101).filter(c -> c%2 != 0).forEach(c -> datas1.add(c));
		System.out.println(datas1);
//		IntStream.range(1, 101).filter(data -> data % 2 != 0).forEach(data -> datas.add(data));
//		System.out.println(datas1);
		
		System.out.println("--------------------------------------------------");

		
//		A~F까지 중 D제외하고 ArrayList에 담고 출력
//		IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(c -> System.out.print((char)c));
		
		ArrayList<Character> datas2 = new ArrayList<Character>();
		IntStream.range('A', 'F').filter(c -> c != 'D').forEach(c -> datas2.add((char)c));
		System.out.println(datas2);
		
		System.out.println("--------------------------------------------------");
		
//		Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력
		
//	      ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//	      datas.stream()
//	         .filter(data -> data.charAt(0) >= 'A')
//	            .filter(data -> data.charAt(0) <= 'Z')
//	               .forEach(System.out::println);

		System.out.println("--------------------------------------------------");
		
//      한글을 정수로 변경
//      String hangle = "공일이삼사오육칠팔구";
//      String data = "일공이사";
//      data.chars().map(hangle::indexOf).forEach(System.out::print);
            
//      정수를 한글로 변경
//      String hangle = "공일이삼사오육칠팔구";
//      String data = "1024";
//      StreamTask streamTask = new StreamTask();
//      data.chars().map(streamTask::change).forEach(i -> System.out.print(hangle.charAt(i)));

		
	}

}
