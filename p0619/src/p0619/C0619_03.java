package p0619;

import java.util.Arrays;

public class C0619_03 {

	public static void main(String[] args) {
		// 배열의 복사 : 얕은 복사, 깊은 복사
		
		// 얕은 복사
		int[] score = {1,2,3,4,5};
		System.out.println(score);
		int[] score2 = score; // 배열 복사 ==> 얕은 복사(주소값 공유/복사); 한쪽의 값이 바뀌면 다른쪽도 바뀌므로 좋지 않아.
		System.out.println(score2); // 배열은 주소값을 저장하므로 배열 복사하면 동일한 저장소(주소값)에 값 저장 ==> 같은 공간 사용!!
		
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(score2));

		// score 배열의 값을 변경 
		score[4] = 0;
			
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(score2));
		
		/*
		// 변수를 복사했을 때, 기존의 값이 변경되어도 복사한 값이 변경되지 않음.
		int num = 10;
		int num2 = num; // num과 num2는 서로 다른 저장소에 값 저장
		num = 5;
		System.out.println(num); // 5
		System.out.println(num2); // 10
		 * */
		
		// 깊은 복사
		// 1. for문을 이용한 배열의 복사 ==> 이 방법을 주로 사용
//		int[] score3 = new int[5];
		int[] score3 = new int[score.length];
//		for(int i=0;i<5;i++) {
		for(int i=0;score.length<5;i++) {
			score3[i] = score[i];
		} // for
		
		// 2. System.arraycopy()를 이용한 배열의 복사
		/* System.arraycopy(arr1, 0, arr2, 0, arr1.length); 
		 * arr1[0]에서 arr2으로 arr1.length개의 데이터를 보사
		 * */
		int[] score4 = new int[5];
		System.arraycopy(score, 0, score4, 0, score.length);
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(score4));
		
	} // main
	
} // class
