package p0620;

public class C0620_07 {

	public static void main(String[] args) {
		// 클래스
		
		int hour = 10;
		int min = 10;
		int sec = 10;
	
		int[] h = new int[10];
		int[] m = new int[10];
		int[] s = new int[10];
		
		// 배열 선언
		Time[] tt = new Time[10];
		
		// 객체선언
		tt[0] = new Time(); 
		tt[1] = new Time();
		tt[1].hour = 10;
		tt[1].min = 10;
//		tt[2].hour = 12;
//		System.out.println(tt[2].hour); // tt[2]에 대한 객체 선언을 하지 않아서 error 
		// error : Cannot assign field "hour" because "tt[2]" is null
		System.out.println(tt[1].hour); 
		
		// 객체선언
		Time t = new Time();
		t.hour = 10;
		t.min = 10;
		t.sec = 10;

	}

}
