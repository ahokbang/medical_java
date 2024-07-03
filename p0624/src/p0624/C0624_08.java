package p0624;

public class C0624_08 {

	public static void main(String[] args) {
		// 재귀호출, 메소드, 오버로딩, 생성자
		
		
		Stu_score stu;
//		stu.kor = 100; // error, new를 안해서 공간이 없음.
//		Stu_score s = new Stu_score(); // 기본 생성자 호출
		Stu_score s = new Stu_score("홍길동",100, 100, 100); // 기본 생성자 호출
		System.out.println("합계 : "+s.total);
		System.out.println("평균 : "+s.avg);
		Stu_score s2 = new Stu_score(); // 매개변수 비워 있으면 사용 못해, 사용하기 위해서는 기본생성자가 정의되어 있으면 됨.
		s.kor = 100;
		
		System.out.println("s.kor : "+s.kor);
		
//		println_boolean();
//		println_char();
		
		int a = 10;
//		int a = 100; // error, 변수 이름 동일할 수 없어.
		
		
		// 5 팩토리얼 = 5*4*3*2*1
		int result = 1;
		for(int i=4;i>0;i--) {
			result *= i;
		} // for
		System.out.println(result);
		add(); // 메서드 호출만 가능. 객체 선언 없이 클래스명.메소드명, 같은 클래스 내에서는 클래스명 생ㅑㄱ 가능
		
		// method 내에서 새로운 method 정의 불가  
//		void add() {	
//		} // error

		
//		change(); // error
		// change() 사용
		C0624_08 c = new C0624_08();
		c.change();
		
		
	} // main
	
	void change() { // 인스턴스 메소드 : 객체 선언 후, 참조변수명.메소드명
		System.out.println(0);
	} // change
	
	void change(int a) { // 메소드 내부에 매개변수가 다르면 메소드 이름이 같아도 사용 가능
		System.out.println(a);		
	} // change
	
	void change(int a, int b) { // 메소드 내부에 매개변수가 다르면 메소드 이름이 같아도 사용 가능
		System.out.println(a+b);		
	} // change
	
	static void add() {
		
	} // add

} // class


/* 오버로딩 : 이름이 같아도 매개변수가 개수, 타입이 다르면 다른 메소드.
 *  - 매개변수의 이름만 다른 것은 오버로딩이 아님.
 * 예) int add (int a, int b) { return a+b; }
 *    int add (int x, int y) { return x+y; } 
 *  - 리턴 타입은 오버로딩의 성립조건이 아니다.
 *  - 매개변수의 타입이 다르므로 오버로딩이 성립 
 *  - 오버로딩의 올바른 예 : 매개변수는 다르지만 같은 의미의 기능 수행
 *  
 * 오버로딩의 조건
 
 * 생성자 [ 중요! ]
 * - 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드' , 다른 말로는 new 연산자
 * 
 * 생성자의 조건
 * - 생성자의 이름은 클래스의 이름과 같아야 한다.
 * - 생성자는 리턴값이 없다. 하지만 void를 사용하지 않는다.
 * 예) 클래스이름(타입 변수명, 타입 변수명, ...)
 *  
 * 기본생성자
 * - 매개변수가 없는 생성자
 * - 클래스에 생성자가 하나도 없으면 Java가 기본생성자를 추가한다.
 * (생성자가 하나라도 있으면 기본 생성자를 추가하지 않는다.)
 * - 클래스에는 무조건 하나의 생성자가 있어야 한다. 
 
 
 
 */