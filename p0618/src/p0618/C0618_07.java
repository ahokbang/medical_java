package p0618;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C0618_07 {

	public static void main(String[] args) {
		// 배열
		
		// 45개 ball 배열 생성, 1-45까지의 숫자 입력
		// 6개 myArr 배열 생성, 1~45까지 6개의 숫자를 입력 받아 출력하시오.
		
		// 1. ball 배열 생성 
		int [] ball = new int [45];
		
		// 2. 반복문을 사용해서 1-45까지 숫자를 입력
		for (int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		} // for
		
		// 3. 랜덤으로 섞기 : 수동으로 해줘야 해
		int no = 0; // 랜덤번호
		int t_value = 0; // 값 저장 (임시)
		for (int i = 0; i<300; i++) {
			no = (int)(Math.random()*45); // 0~44 의 숫자를 랜덤으로 가져와 ==> 중복 이슈 
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
		} // for
		
//		System.out.println(Arrays.toString(ball));
//		
		// 4. my 로또번호 입력(myArr 배열 생성)
		Scanner scan = new Scanner(System.in);
		int [] myArr = new int [6];
		for (int i=0; i<myArr.length; i++) {
			System.out.printf("1-45까지 %d번째 숫자를 입력하세요. >> ", i+1);
			myArr[i] = scan.nextInt();
		}// for
//		// ************** 확인해보기 *****************
		System.out.print("입력한 숫자 : ");
		for (int i=0; i<myArr.length; i++) {
			System.out.print(myArr[i]+" ");
		} // for
		System.out.println();
		
		// 5. 로또번호(6개) 출력하기
		System.out.print("로또 번호 : ");
		for (int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		} //for
		System.out.println();
		
		
		
		
//		// 10개짜리 배열을 생성하고, 숫자를 입력 받아 3, 4번째 숫자만 출력하시오.		
//		Scanner scan = new Scanner(System.in);
//		int [] arr = new int[10];
//		for (int i=0;i<10;i++) {
//			System.out.println("숫자를 입력하세요. >> ");		
//			arr[i]= scan.nextInt();
//		} //for
//		System.out.printf("3번째 값: %d \n4번째 값 : %d \n", arr[2], arr[3]);
//	
	} // main

} // class
