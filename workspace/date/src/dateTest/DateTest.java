package dateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {	//
	
	public static void main(String[] args) {
		long time = 0;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd��"); //������ �ٲ��ִ� �޼ҵ�
		Date now = new Date();
		System.out.println(simpleDateFormat.format(now));
		
//		getTIme() : �� ��¥�� ���̸� ���� �� ���, �и��� ����
		Date date1 = new Date();
		System.out.println("���¾�");
		Date date2 = new Date();
		
		time = date2.getTime() - date1.getTime();
		System.out.println(time);
		
	}

}
