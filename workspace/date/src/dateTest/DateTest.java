package dateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {	//
	
	public static void main(String[] args) {
		long time = 0;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일"); //형식을 바꿔주는 메소드
		Date now = new Date();
		System.out.println(simpleDateFormat.format(now));
		
//		getTIme() : 두 날짜의 차이를 구할 때 사용, 밀리초 리턴
		Date date1 = new Date();
		System.out.println("오태양");
		Date date2 = new Date();
		
		time = date2.getTime() - date1.getTime();
		System.out.println(time);
		
	}

}
