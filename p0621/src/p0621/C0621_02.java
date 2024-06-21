package p0621;

public class C0621_02 {

	public static void main(String[] args) {
		// 카드
		
		// c1 : Heart 7. c2 : Spade 4
		
		// 객체 선언
		Card c1 = new Card();
		Card c2 = new Card();
		
		c1.kind = "Heart";
		c1.number = 7;
		
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.printf("모양 : %s, 숫자 : %d\n", c1.kind, c1.number);
		System.out.printf("c1 가로 : %s, 세로 : %d\n", c1.width, c1.height);
		System.out.printf("모양 : %s, 숫자 : %d\n", c2.kind, c2.number);
		System.out.printf("c2 가로 : %s, 세로 : %d\n", c2.width, c2.height);
		
		// 클래스 변수
		c1.width = 50; // 참조변수명.변수명으로 변경하나, 클래스명.변수명으로 변경
		c1.height = 80;
		
		Card.width = 50;
		Card.height = 80;
		System.out.printf("c1 가로 : %s, 세로 : %d\n", c1.width, c1.height);
		System.out.printf("c2 가로 : %s, 세로 : %d\n", c2.width, c2.height);
		
		
	} // main

} // class
