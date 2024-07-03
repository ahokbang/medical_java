package p0628;

import java.util.Scanner;

public class C0628_03 {

	public static void main(String[] args) {
		// 문자열을 입력 받아 3번째의 문자를 출력하시오.
		// 문자열이 3자 미만으로 입력되면 다시 입력을 할 수 있도록 하시오.
		// 무한반복, x가 출력되면 프로그램 종료하시오.
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열을 입력하세요(x : 프로그램 종료). >> ");
			String str = scan.nextLine();
			if (str.equalsIgnoreCase("x")) {
				System.out.println("프로그램을 종료합니다.");
//				break;
				return;				
			} // if
			
			if (str.length()<3) {
				System.out.println("문자열의 길이가 너무 짧습니다. 다시 입력하세요.");
				continue;
			} else {
				System.out.println("입력한 문자열의 3번째 문자 : "+str.charAt(2));
			} // if-else
			
			
		} // while

	} // main

} // class
