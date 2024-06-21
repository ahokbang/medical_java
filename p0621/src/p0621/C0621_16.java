package p0621;

public class C0621_16 {

	public static void main(String[] args) {
		// 카드, 1~10, J, Q, K 13장 * 무늬 4개 = 52장 카드
		
		// 무늬 : CLOVVER, DIAMOND, SPADE, HAERT
		// 숫자 : 1,2,3,4,5,6,7,8,9,10,11-J,12-Q,13-K
		String[] kind = {"CLOVER", "DIAMOND", "SPADE", "HEART"};
		String[] number = {"0", "1", "2", "3","4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		Card[] c = new Card[52];
			c[0] = new Card("CLOVER", 1);
			c[1] = new Card("CLOVER", 2);
			c[13] = new Card();
//			c[0] = new Card();
//			c[0].kind = "CLOVER";
//			c[0].number = 1;
//			c[1] = new Card();
//			c[1].kind = "CLOVER";
//			c[1].number = 2;
		
		// (int)(i/13)
		for (int i=0; i<c.length; i++) {
			c[i] = new Card();
			c[i].kind = kind[i/13];
			c[i].number = (i%13)+1;
			
		} // for
		
		for (int i=0;i<c.length;i++) {
			System.out.printf("무늬 : %s, 숫자 : %s \n", c[i].kind, number[c[i].number]);
//			if (c[i].number==11) {
////				c[i].number = String.format("J", c[i].number);
//				System.out.printf("무늬 : %s, 숫자 : %d \n", c[i].kind, "J");
//			} else if (c[i].number==12) System.out.printf("무늬 : %s, 숫자 : %d \n", c[i].kind, "Q");
//			else if (c[i].number==13) System.out.printf("무늬 : %s, 숫자 : %d \n", c[i].kind, "K");
//			// if
		} // for

	} // main

} // class
