package p0621;

public class C0621_01 {
	// 변수와 메서드 : 클래스변수, 인스턴스변수, 메소드 변수
	/*
	 * 52장의 카드 
	 * 속성 : 무늬, 숫자, 폭, 높이
	 * 기능 : ... 
	 * 
	 * - 무늬와 숫자는 겹치지 않아 --> 인스턴스 변수
	 *   String kind; // 무늬
	 *   int number; // 숫자
	 * 
	 * - 폭과 높이는 동일 --> 클래스 변수
	 *   static int width = 100; // 폭
	 *   static int height = 250; // 높이
	 * */
	

	int i = 0; // 인스턴스 변수. 객체선언을 하지 않아 사용할 수 없음.
	static int j = 0;
	
	void add() {
		int i = 0;
	}
	
	void add2() {
		int i = 0;
	}
		
	
	
	
	
	
	public static void main(String[] args) {
		
		// 객체선언
		C0621_01 c = new C0621_01();
		c.i = 10;
		C0621_01.j = 10;
		j = 10; // 클래스 변수는 같은 클래스 내에서 클래스명 생략 가능
		
		int j = 100; // 지역변수
		
		System.out.println(j); // 100; 지역변수>클래스변수/인스턴스변수
		
		Time[] t = new Time[3]; // 배열 선언; 대괄호
		
		t[0] = new Time(); // 객체 선언
		t[1] = new Time(); // 객체 선언
		t[2] = new Time(); // 객체 선언
		
//		t[0].day = 21; // 클래스 변수를 인스턴스 변수로 사용하면 아래에서 클래스 변수 값(t[1].day)을 바꾸면 여기도 같이 변해  
		Time.day = 21; // 클래스명.변수명 사용
		t[0].hour = 10; // 참조변수명.변수명
		t[0].min = 10;  
		t[0].sec = 10;

//		t[1].day = 25;
		Time.day = 25;
		t[1].hour = 20;
		t[1].min = 11;  
		t[1].sec = 11;
		
		System.out.printf("일시 : %d일 %d시 %d분 %d초\n", t[0].day, t[0].hour, t[0].min, t[0].sec);
		System.out.printf("일시 : %d일 %d시 %d분 %d초\n", t[1].day, t[1].hour, t[1].min, t[1].sec);
		
		Time tt = new Time(); // 객체 선언; 소괄호 

//		int i=0; // error 발생
		for (int i=0;i<5;i++) {
			System.out.println(i);
		}
		
		for (int i=0;i<5;i++) { // 메소드 변수는 중복 가능
			System.out.println(i);
		}
		
	} // main

} // class
