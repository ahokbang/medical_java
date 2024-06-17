package p0617;

import java.util.Scanner;

public class C0617_07 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		// 2개의 문자열을 입력 받아 숫자이면(문자 한자리만 입력)
		// 정수 타입으로 변경해서 두 수를 더하는 프로그램을 구현하시오.
		
		System.out.println("문자1을 입력하세요.");
		String str = scan.next();
		char ch = str.charAt(0);

		System.out.println("문자2를 입력하세요.");
		String str2 = scan.next();
		char ch2 = str2.charAt(0);
		
		if ((ch>='0' && ch<='9') && (ch2>='0' && ch2<='9')) {
			int num = ch - '0'; // 문자 숫자를 정수형으로 변경하는 방법 : '0' 빼줌
//			int n = Integer.parseInt(str); // 문자열을 정수형으로 변경
			int num2 = ch2 - '0'; // 문자 숫자를 정수형으로 변경하는 방법 : '0' 빼줌			
			System.out.println("두 수의 합 : "+(num+num2));
		} else {
//			System.out.println("숫자가 아닙니다.");
			System.out.printf("%c, %c \n", ch, ch2);
		}
	}

}
