package p0617;

import java.util.Scanner;

public class C0617_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*		
		 // 논리연산자 : &&(and), ||(or)
		 * int i = 7;
		 * i>3 && i<5; // false
		 * i>3 || i<0; // true
		 * 
		 *  
		 * */
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		String str = scan.next(); // next() : 사이 띄우기 전까지만 문자열 입력 받음, nextline() : 전부 다 입력 받음
		char ch = str.charAt(0); // charAt() : 문자열을 문자로 변환, () 안에는 index 숫자, charAt(0) : 첫번째 글자, charAt(2) : 세번째 글자
//		char ch = 'g';
//		// 영문자 확인
//		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
//			System.out.println("영문자입니다.");
//		} else {
//			System.out.println("영문자가 아닙니다.");	
//		}
//		// 숫자 확인
//		if((ch>='0' && ch<='9')) {
//			System.out.println("숫자입니다.");
//		} else {
//			System.out.println("슛자가 아닙니다.");	
//		}
		// 영문자, 숫자 확인
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
			System.out.println("영문자입니다.");
		} else if((ch>='0' && ch<='9')) {
			System.out.println("숫자입니다.");
		} else {
			System.out.println("기타 문자입니다.");	
		}
		
	}

}
