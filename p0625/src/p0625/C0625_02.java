package p0625;

import java.util.Arrays;

public class C0625_02 {

	public static void main(String[] args) {
		// 상속
		
		Deck d = new Deck(); // 52장 카드생성 - n
		
		// 5장을 뽑는 메소드 구현해서 실행하시오.
		Card[] cc = d.pick5();
		
		for (int i=0;i<cc.length;i++) {
			System.out.printf("카드 %d:  [%s, %d ] \n",i+1, cc[i].kind, cc[i].number );
		}
		
		// 카드 섞기
		d.shuffle();
		System.out.println("카드 섞기");
		
		// 5장을 뽑는 메소드 구현해서 실행하시오.
		Card[] cc2 = d.pick5();
		
		for (int i=0;i<cc2.length;i++) {
			System.out.printf("카드 %d:  [%s, %d ] \n",i+1, cc2[i].kind, cc2[i].number );
		}
		System.out.println();
		
		System.out.println("Card 객체 : "+cc2[0]); // Card에 들어있는 c
		// Card 객체 : p0625.Card@12028586 
		/* public String toString() {
		 * return getClass().getName() + "@" + Integer.toHexString(hashCode());
		 */

//		// 카드를 섞지 않은 상태
//		Card card = d.pick();
//		System.out.println("카드 섞기 전");
//		System.out.printf("카드 1장 : %s, %d \n", card.kind, card.number);
//		
//		Card card2 = d.pick();
//		System.out.printf("카드 1장 : %s, %d \n", card2.kind, card2.number);
//
//		// 3
//		Card card4 = d.pick();
//		System.out.printf("카드 1장 : %s, %d \n", card4.kind, card4.number);
//		
//		// 카드 섞기
//		d.shuffle();
//		
//		// 카드 섞은 후 카드 1장 뽑기
//		Card card3 = d.pick();
//		System.out.println("카드 섞기 후");
//		System.out.printf("카드 1장 : %s, %d \n", card3.kind, card3.number);
		
		// for문을 사용해서 카드 출력하시오. 
		// 카드 1 : CLOVER, 1
		// 카드 2 : CLOVER, 3
		// 카드 3 : CLOVER, 3 
		// ...
		// 카드 52 : SPADE, 52 
 
//		for (int i=0; i<52; i++) {
//			System.out.printf("카드 %d : [ %s, %d ]\n", i+1, d.c[i].kind, d.c[i].number);
//			System.out.printf("카드 %d : [ %s, %d ]", i, d.shape, i); m
//		}
		
		
		
		
		
		
		
		
//		int[][] num = new int[4][13];
//		for (int i=0;i<3;i++) {
//			for (int j=0;j<12;j++) {
//				num[i]num[j] = i+1;
//			} // m
		
		
	} // main

} // class
