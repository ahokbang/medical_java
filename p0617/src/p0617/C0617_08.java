package p0617;

import java.util.Scanner;

public class C0617_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 조건문
		int a = 10;
//		if (a>0) {
//			System.out.println("양수입니다.");
//		} else if (a==0) {
//			System.out.println("0입니다.");
//		} else {
//			System.out.println("음수입니다.");
//		}
		// 중괄호 생략 가능
//		if (a>0)
//			System.out.println("양수입니다.");
//		else if (a==0)
//			System.out.println("0입니다.");
//		else 
//			System.out.println("음수입니다.");
		// 한줄 작성 가능(한 줄 일 때만)
		if (a>0) System.out.println("양수입니다.");
		else if (a==0) System.out.println("0입니다.");
		else System.out.println("음수입니다.");
						
		// 삼항식
		// 슛자를 입력 받아, 양수, 음수, 0 입니다. 라고 출력될 수 있도로 구현하시오.
		// 0은 양수로 출력
//		System.out.println("숫자를 입력하세요. >> ");
//		int n = scan.nextInt();
////		String num = n>0? "양수입니다.":"음수입니다."; // int가 아니라 String
//		String num = n>0? "양수입니다.":(n==0? "0입니다.":"음수입니다."); // n=0?이 아니라 n==0?!!
//		System.out.println(num);		
		
//		int x = scan.nextInt();
//		int absX = x>= 10? x:-x;
//		System.out.println(absX);
//		int x = -10;
//		int absX = x>= 10? x:-x;
//		System.out.println(absX); // 10
		
		
//		// 입력한 숫자의 length 
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자를 입력하세요. >> ");
////		String str = scan.next();
//		String str = scan.nextLine();
//		System.out.println("입력한 문자의 길이 : "+str.length());
		
		
		
	}

}
