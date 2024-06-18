package p0618;

import java.util.Arrays;

public class C0618_06 {

	public static void main(String[] args) {
		// 배열
		
		// int 배열 10개를 선언해서 1, 3, 5, 7, 9, ... 10개를 입력해서 출력하시오. for문 사용하기.
		int[] score = new int [10];
//		for (int i=0; i<10; i++) {
		for (int i=0; i<score.length; i++) { // 배열이름.length : 배열의 크기
			
//			System.out.println(score[i]);
		} // for
		System.out.println(Arrays.toString(score));
		
//		// 배열 선언 및 초기화 1
//		// 배열 선언 : 주소는 0부터 시작
//		int [] score = new int[5];		
//		// 초기화
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		
//		// 배열 선언 및 초기화 2
//		int[] sc = {1, 2, 3, 4, 5};
//		
//		// 배열 선언 및 초기화 3 
//		int[] sc2 = new int[] {1,2,3,4,5};
//		
//		// 배열 선언 및 초기화 4 (for문 사용)
//		int[] s = new int [5];
//		for (int i=0; i<5; i++) {
//			score[i] = i+1;
//		} // for
		
/*
 int [] score;
 score = {1,2,3,4,5}; // error
*/
	} // main

} // class
