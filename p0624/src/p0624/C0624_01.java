package p0624;

public class C0624_01 {

	public static void main(String[] args) {
		// 메서드
		
		// 인스턴스 사용 : 객체선언 후 참조변수명.변수명
		Data d = new Data();
		
		d.x = 10;
		System.out.println("d.x : "+d.x);
		
		change(d.x);
		System.out.println("d.x2 : "+d.x);
		
	} // main
	
	static void change(int x) { // 기본형 매개변수 : 값만 전달
		x = 1000;
		System.out.println("change x : "+x);
		
	} // change
	

} // class

/*
 * 기본형과 참조형 변수의 차이 : 주소값을 가지는지의 여부
 * class + 참조변수
 * 
 * 참조변수 잘 확인
 * 
 * 메서드는 1개의 값만 리턴
 * 
 * class 변수는 Method Area.
 * Call stack Area,
 * 인스턴스변수는 Heap Area에 저장
 * 
 */