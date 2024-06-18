package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_05 {

	public static void main(String[] args) {
		// 배열
		/*
		 * int [] score; // 배열 선언(생성된 배열을 다루는데
		 * score = new int[5]; // 배열 생성(5개의 int 값 저장)
		 * [참고] int[] score = new int[5]; 와 같이 한 문장으로 줄여 쓸 수 있음.
		 * */
		Scanner scan = new Scanner(System.in);
		
		// 배열 생성 : 같은 타입만 생성할 수 있음.
//		int score [] = new int[5]; // 방법 1
		int [] score = new int[5]; // 방법 2 <-- 우리는 이 방법을 사용할거야.
		// 배열에 입력1
//		score[0] = 1; // 주소는 항상 0부터 시작!
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
		
		// 배열에 입력2
		for (int i=0; i<5; i++) {
			score[i] = i+1;
		} // for
		// 배열에 입력2 - 입력 받아 넣기
//		for (int i=0; i<5; i++) {
//			System.out.println("숫자를 입력하세요.  >> ");
//			score[i] = scan.nextInt();
//		} // for
		
		// System.out.println(score[3]); // 4
		System.out.println(score); // score 주소값 출력
		System.out.println(Arrays.toString(score)); // 배열의 모든 데이터 확인 메소드. Arrays import 꼭 하기!
		
		// 배열 출력
		for (int i=0; i<5; i++) {
			System.out.println(score[i]);
		} // for
		
		// 5개의 숫자를 모두 입력 받은 후, 출력을 모두 하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int num1 = scan.nextInt();
////		System.out.println("숫자를 입력하세요.");
//		int num2 = scan.nextInt();
////		System.out.println("숫자를 입력하세요.");
//		int num3 = scan.nextInt();
////		System.out.println("숫자를 입력하세요.");
//		int num4 = scan.nextInt();
////		System.out.println("숫자를 입력하세요.");
//		int num5 = scan.nextInt();
//		
//		System.out.printf("입력 받은 숫자 : %d, %d, %d, %d, %d \n", num1,num2,num3,num4,num5);
//		// m
//		
//		// 5개의 숫자를 모두 입력 받은 후, 3번째 숫자만 출력 하시오.
//		System.out.println("3번째 숫자 : "+num3);
		
//		for (int i=0;i<5;i++) {
//			System.out.println("숫자를 입력하세요.");
//			int num = scan.nextInt();
//		} // for
//		System.out.println(num);
//		// for문 안돼...
		
		
		
	} // main
} // class
