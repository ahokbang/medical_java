package p0625;

public class Singleton {
	
	private int hour; // 인스턴스변수
	private static Singleton s = new Singleton(); // 클래스변수
	// 클래스변수 : 객체선언 없이, 클래스명.변수명
	
	private Singleton() {} // 기본생성자
	
	
	// 클래스메소드 : 객체선언 없이, 클래스명.메소드명
	public static Singleton getInstance() {
		if(s==null) {
			s = new Singleton();			
		}
		return s;
	}
	
}
