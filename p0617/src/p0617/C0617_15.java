package p0617;

import java.util.Scanner;

public class C0617_15 {

	public static void main(String[] args) {
		// Math.random()
		
		// 1부터 10까지 랜덤숫자를 생성하고 숫자 1개를 입력 받아 정답인지 아닌지 출력하시오.
		// 같으면 당첨, 다르면 꽝이라고 출력하시오.
		int num = (int)(Math.random()*10)+1;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int n = scan.nextInt();
		if (n == num) System.out.println("당첨! 축하합니다.");
		else System.out.println("꽝! 당첨번호는 '"+num+"'입니다.");
		
		
//		// 1부터 100까지의 숫자를 랜덤으로 생성해서 출력하시오.
//		int num = (int)(Math.random()*100)+1;
//		System.out.println(num);
//		
//		// 1부터 3까지 랜덤숫자 생성 출력
//		int num2 = (int)(Math.random()*3)+1;
//		System.out.println(num2);
//		
//		// 1부터 45까지 랜덤숫자 생성 출력
//		int num3 = (int)(Math.random()*45)+1;
//		System.out.println(num3);
		
		
//		Math.random(); // 0.0<=x && x<1.0 (0.0<= x <1.0 @python)
//		System.out.println(Math.random()); // 0.34982340245871035, 유효숫자 소수점 15자리까지, double		
//		// Math.round(0); //int
//		// Math.ceil(0); // double
////		Math.max(10, 5); // int
////		Math.max(10.5, 5); // double
//
//		// 1~10 범위의 임의의 정수 만들기
//			// 1. 각 변에 10을 곱한다.
//			// 2. 각 변을 int형으로 변환한다.
//			// 3. 각 변에 1을 더한다.
//			int num = (int)(Math.random()*10)+1;
//			System.out.println(num);
//			
//		// 1~100까지 생성 출력
//			int num2 = (int)(Math.random()*100)+1;
//			System.out.println(num2);
//		// 0~4까지 출력
//			int num3 = (int)(Math.random()*5);
//		// 0~19까지 출력
//			int num4 = (int)(Math.random()*20);
//		// 0~9까지 출력
//			int num5 = (int)(Math.random()*10);			
//		// 0~10까지
//			int num6 = (int)(Math.random()*11);
//		// 2~10까지
//			int num7 = (int)(Math.random()*9)+2;
		
	}	
}
