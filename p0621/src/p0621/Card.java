package p0621;

public class Card {

	// 기본생성자 - this
	Card(){}
	Card(String kind, int number) {
		this.kind = kind;
		this.number =number;
	}
	
	// 생성자
//	Card(String k, int n) {
//		kind = k;
//		number =n;
//	}
	
	String kind; // 인스턴스 변수
	int number;  // 인스턴스 변수
	static int width = 100; // 클래스 변수
	static int height = 250; // 클래스 변수
	
	
}
