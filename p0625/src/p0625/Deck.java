package p0625;

import java.util.Arrays;

public class Deck extends Object{
	// 상속
	
	// 1, 2, 3, ..., 11-J, 12-Q, 13-K, 13*4=52, 총 52장
	
	Card[] c = new Card[52]; // 배열선언
	Card[] cc = new Card[5]; 
	String[] shape = {"SPADE", "DIAMONE", "HEART", "CLOVER"};
	int count = 0; // 위치 확인 필요
	
	
	// 1, 2, 3, 4, 5, 6, ..., 10
	Deck() { // 기본생성자
		for (int i=0; i<52; i++) {
		// c[i]; c[i] => number, kind
			// 객체선언
			c[i] = new Card(i%13+1, shape[i/13]); // 객체선언, 아래의 세줄을 이 한줄로 쓸 수 있어
//			c[i] = new Card();
//			c[i].number = i%13+1;
//			c[i].kind = shape[i/13];
		
//			
//			Card[] c = new Card[52];
//			
//			int[] number = new int[52];
//			String[] kind = new String[52];
//			String[] shape = {"CLOVER", "HEART", "DIAMONE", "SPADE"};
////			for (int i=0; i<52; i++) {
////				number[i]=i+1;
////			} // for
////			System.out.println(Arrays.toString(number));
//			
//			for (int i=0; i<52; i++) {
//				// 1~13 세트 4개 만들기
//				number[i]= i%13+1;
//				// 0~12 : CLOVER, 13~25 : HEART, 26~38 : DIAMOND, 39~51 : SPADE 출력
//				kind[i] = shape[i/13];
//			} // for		
//			System.out.println(Arrays.toString(number));
//			System.out.println(Arrays.toString(kind));
			
			
		} // for
		
	} // Deck 기본생성자
	
	
	// 카드섞기 메소드
	void shuffle() {
		
		for (int i=0; i<300; i++) {
			// 52 개
			int random = (int)(Math.random()*52); // 0~51
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}		
	} // shuffle
	
	// 한장 뽑아보기
	Card pick() {
		Card card = c[count];
		count++;
		return card;
	} // pick
	
	Card pick(int n) {
		return c[n];
	} // pick
	
	// 카드 5장이 뽑히는 메소드
	Card[] pick5() {
		for (int i=0; i<5; i++) {
//			cc[i] = c[i];
			cc[i] = c[count++];
		} // for
		return cc;
	} // pick5
	
} // class
