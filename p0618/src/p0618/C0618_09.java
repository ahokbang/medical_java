package p0618;

import java.util.Scanner;

public class C0618_09 {

	public static void main(String[] args) {
		// 배열
		
		Scanner scan = new Scanner(System.in);
		
		// 이진코드 배열
		String [] binary = {
				"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111"
		};
		
		// a: 10, b: 11, c: 12, d: 13, e: 14, f: 15
		System.out.println("문자를 입력하세요. >> ");
		String input = scan.next();		
		String result = "";
		for (int i=0;i<input.length();i++) {
			if(input.charAt(i)>='0' && input.charAt(i)<='9') {
				// 문자숫자인 경우, 숫자로 변경하려면 '0'을 빼주면 됨. '8' - '0' = 8
				result += binary[input.charAt(i)-'0']+" ";
//				System.out.println(result);
			} else {
				result += binary[input.charAt(i)-'A'+10]+" ";
			} // else
		} // for
		
		System.out.println("입력문자 : "+input);
		System.out.println("이진코드 : "+result);
			
//		System.out.println("문자를 입력하세요. >> ");
//		String input = scan.next();		
//		// 내가 입력한 문자의 0번째 글자를 출력하고 싶어.
////		System.out.println(input.charAt(0));
//		// 문자 다 분해하고 싶어
//		for (int i=0;i<input.length();i++) System.out.println(input.charAt(i));
	
	} // main

} // class
