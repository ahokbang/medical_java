package p0614;

import java.util.Scanner;

public class C0614_14 {

	public static void main(String[] args) {
		// 입력한 숫자가 양수인지, 음수인지 출력하시오. 0은 양수로 출력해주세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		if (num >= 0) {
			System.out.println("입력한 숫자는 양수입니다.");
		} else {
			System.out.println(("입력한 숫자는 음수입니다."));
		}
			
		
//		int a = 10;
//		if (a == 10) {
//			System.out.println("a는 10이다.");
//		}else {
//			System.out.println("a는 10이 아니다.");
//		}
//		
		
//		if (a>0) {
//			System.out.println("양수");
//		} // if
//		else {
//			System.out.println("음수");
//		}// else
	}
}
