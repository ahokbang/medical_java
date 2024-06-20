package p0620;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C0620_03 {

	public static void main(String[] args) {
		// 날짜 객체 가져오기(Date, Calendar, currentTimeMillis()) 
		
		// 날짜 객체 가져오기 : Date 객체 : 시간을 임의로 바꿈
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy");
		System.out.println(date);
		System.out.println(sdf.format(date));
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
		System.out.println(sdf4.format(date));
		System.out.println(date.getTime());	
		
		// Calendar 객체
		Calendar cal = Calendar.getInstance(); 
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));		
		
		// 날짜 출력 : currentTimeMillis() 활용
		long today = System.currentTimeMillis();
		System.out.println(today);
		SimpleDateFormat sdf6 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf6.format(today));
		
	}

}
