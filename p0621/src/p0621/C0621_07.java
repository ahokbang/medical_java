package p0621;

public class C0621_07 {

	public static void main(String[] args) {
		// 
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : "+d.x);
		System.out.println("-----------------------");
	
//		C0621_07 c = new C0621_07();
//		C0621_07.change(d.x);
//		c.change(d.x);
		
		change(d.x); // 클래스 메소드 : 객체선언없이 클래스명.메소드명
		
		System.out.println("change 호출 후 d.x : "+d.x);
		
	}
	// 인스턴스 변수는 객체선언 후에 사용 가능
	static void change (int x) {
		x = 1000;
		System.out.println("change x : "+x);
	}

}
