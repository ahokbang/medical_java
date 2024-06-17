package p0617;

import java.util.Scanner;

public class C0617_11 {

	public static void main(String[] args) {
		// if 조건문
		
		Scanner scan = new Scanner(System.in);
		System.out.println("프로그램을 종료합니까?(종료: x)");
		String str = scan.next();
		// if (scan.next())
//		if (str.equals("x") || str.equals("X")) {
		if (str.equalsIgnoreCase("x")) { // equalsIgnoreCase() : 영문대소문자 구분 안함
			System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.println("프로그램을 계속 실행합니다.");
		}
		
		
//		String str = null;
//		// str.charAt(0); // error, str=null이기 때문에
//		if (str != null)
//			str.charAt(0); 
//		else 
//			System.out.println("빈 문자입니다.");
		
//		String str = "";
//		// str.charAt(0); // error, str=null이기 때문에
//		if (str != null && !str.equals(""))
//			str.charAt(0); 
//		else 
//			System.out.println("빈 문자입니다.");
	}

}
