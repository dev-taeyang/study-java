package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {	//date, Calendar´Â ÀÌÁ¤µµ¸¸
	
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar calendar = Calendar.getInstance(); // ½Ì±Û Åæ ¶Ç´Â ½Ì±Û ÅÏ
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		try {
			System.out.println(simpleDateFormat.parse("2023/01/15"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
