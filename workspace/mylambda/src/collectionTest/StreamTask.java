package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;






public class StreamTask {
	
	public static void main(String[] args) {

//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		1~10���� ArrayList�� ��� ���
//		IntStream.range(1, 11).forEach(data :: add);
//		System.out.println(datas);
//		----------------------------------�ٽ��غ���-------------------
		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 11).forEach(c-> datas.add(c));
//		IntStream.rangeClosed(1, 10).forEach(datas :: add);
		
		
//		10~1���� ArrayList�� ��� ���
		
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
		
//		ABCDEF�� �� ���ں��� ���
//		IntStream.range('A', 'D').forEach(c -> System.out.println((char)c));
		
//		String data2 = "ABCDEF";
//		data2.chars().forEach(c -> System.out.println((char)c));
//		chars() : ���ڿ��� IntStream���� ����
//		IntStream.rangeClosed('A', 'F').forEach(c -> System.out.println((char)c));
		
//		map() : ���� ���� ���ϴ� ������ ����
//		String data = "ABC";
//		data.chars().map(c -> c+3).forEach(c -> System.out.print((char)c));
		data.chars().map(c -> c+3).forEach(c -> System.out.println((char)c));
		System.out.println("--------------------------------------------------");
		
		
//		1~100���� �� Ȧ���� ArrayList�� ��� ���
		ArrayList<Integer> holsu = new ArrayList<Integer>();
		IntStream.range(1, 51).map(c -> 2*c -1).forEach(holsu :: add);
		System.out.println(holsu);
		
		System.out.println("--------------------------------------------------");
		
//		IntStream.range(1,51).map(v -> v*2 -1).forEach(datas::add);
//		System.out.println(datas);
		
		
//		A~F���� �� D�����ϰ� ArrayList�� ��� ���
		ArrayList<Character> atoF = new ArrayList<Character>();
		IntStream.range('A','F').map(v -> v > 'C' ? v+1 : v).forEach(v -> atoF.add((char) v));
		System.out.println(atoF);
		System.out.println("--------------------------------------------------");
//		IntStream.rangeClosed('A', 'E').map(c -> c > 67 ? c +1 : c).forEach(c -> System.out.println((char)c));
		
//		5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLoew, PINK) , toLowerCase()
//		String color = "Black";
//		System.out.println(color.toLowerCase());
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black","WHITE","reD","yeLLow","PINK"));
//		
//		datas.stream().map(c -> c.toLowerCase()).forEach(c->System.out.println(c));
	
		
//		1~100���� �� Ȧ���� ArrayList�� ��� ���
		
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		IntStream.range(1, 101).filter(c -> c%2 != 0).forEach(c -> datas1.add(c));
		System.out.println(datas1);
//		IntStream.range(1, 101).filter(data -> data % 2 != 0).forEach(data -> datas.add(data));
//		System.out.println(datas1);
		
		System.out.println("--------------------------------------------------");

		
//		A~F���� �� D�����ϰ� ArrayList�� ��� ���
//		IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(c -> System.out.print((char)c));
		
		ArrayList<Character> datas2 = new ArrayList<Character>();
		IntStream.range('A', 'F').filter(c -> c != 'D').forEach(c -> datas2.add((char)c));
		System.out.println(datas2);
		
		System.out.println("--------------------------------------------------");
		
//		Apple, banana, Melon �� ù��° ���ڰ� �빮���� ���ڿ� ���
		
//	      ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//	      datas.stream()
//	         .filter(data -> data.charAt(0) >= 'A')
//	            .filter(data -> data.charAt(0) <= 'Z')
//	               .forEach(System.out::println);

		System.out.println("--------------------------------------------------");
		
//      �ѱ��� ������ ����
//      String hangle = "�����̻�����ĥ�ȱ�";
//      String data = "�ϰ��̻�";
//      data.chars().map(hangle::indexOf).forEach(System.out::print);
            
//      ������ �ѱ۷� ����
//      String hangle = "�����̻�����ĥ�ȱ�";
//      String data = "1024";
//      StreamTask streamTask = new StreamTask();
//      data.chars().map(streamTask::change).forEach(i -> System.out.print(hangle.charAt(i)));

		
	}

}
