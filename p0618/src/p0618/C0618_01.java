package p0618;

import java.util.Scanner;

public class C0618_01 {

	public static void main(String[] args) {
		// 주민등록번호 앞 6자리를 입력 받아 태어난 계절이 봄, 여름, 가을, 겨울인지 출력하시오.
		// 990101-10111011
		// 12~02 : 겨울, 03~05: 봄, 06~08 : 여름, 09~11 : 가을
		
//		String str = "990101";
//		String birthM = str.substring(2,4);
//		System.out.println(birthM);

		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요. >> ");
		String input  = scan.nextLine();
		System.out.println("입력 : "+input);
		
		// 나이 출력하는 프로그램 구현
		// 주민등록번호 뒤 7자리 중 첫번째 글자가 
		// 1 또는 2일 때 1900년 대 : 2024-1988 = 36
		// 3 또는 4일 때 2000년 대 : 2024-2001 = 23
		// switch 사용
		String flag = input.substring(7,8);
		String birthY = input.substring(0,2);
		int age = 0;
		
		switch (flag) {
		case "1": case "2":
			age = 2024 - Integer.parseInt("19"+birthY);
			break;
		case "3": case"4":
			age = 2024 - Integer.parseInt("20"+birthY);
			break;
		} // switch (t)
		System.out.println(age);
		
//		// 생년월일 년도 분리 및 숫자 치환
//		String birthY = input.substring(0,2);
//		int bY = Integer.parseInt(birthY);
//		System.out.println(20+bY);
//		// 주민등록번호 뒤 7자리 중 첫번째 글자
//		String backNum = input.substring(7,8);
//		
//		switch (backNum) {
//		case "1": case "2":
//			System.out.println(2024-(int)(19+bY));
//			break;
//		case "3": case"4":
//			System.out.println(2024-(int)(20+bY));
//			break;
//		} // switch (m)
		
		
		
		// 주민등록번호 앞 6자리를 입력 받아 태어난 계절이 봄, 여름, 가을, 겨울인지 출력하시오.
		// 990101-10111011
		// 12~02 : 겨울, 03~05: 봄, 06~08 : 여름, 09~11 : 가을
		
		// 생년월일 '월' 분리
//		String bitrhM = input.substring(2,4);
//
//		switch (bitrhM) {
//		case "03": case "04": case "05" : 
//			System.out.println("태어난 계절은 '봄'입니다.");
//			break;
//		case "06": case "07": case "08":
//			System.out.println("태어난 계절은 '여름'입니다.");
//			break;
//		case "09": case "10": case "11":
//			System.out.println("태어난 계절은 '가을'입니다.");
//			break;
//		default :
//			System.out.println("태어난 계절은 '겨울'입니다.");
//			break;
//		} // switch

	}

}
