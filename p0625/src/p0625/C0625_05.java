package p0625;

public class C0625_05 {

	public static void main(String[] args) {
		// 접근제어자
		
		Time t = new Time();
		t.setHour(12);		
//		t.day = 50;

		System.out.println("현재 시간 : "+t.getHour()+"시");
//		System.out.println("현재 날짜 : "+t.day+"일");

	}

}
