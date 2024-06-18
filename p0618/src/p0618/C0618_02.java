package p0618;

import java.util.Scanner;

public class C0618_02 {

	public static void main(String[] args) {
		// if문으로 변경해보기
		
		// 주민등록번호를 입력 받아 태어난 계절이 봄, 여름, 가을, 겨울인지 출력하시오.
		// 990101-10111011
		// 나이 출력 프로그램

		Scanner scan = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요.");
		String input = scan.nextLine();

		
		
		String birthY = input.substring(0,2);
		String flag = input.substring(7,8);
		int age = 0;
		
		if (flag.equals("1") || flag.equals("2")) {
			age = 2024 - Integer.parseInt("19"+birthY);
		} else if (flag.equals("3") || flag.equals("4")) {
			age = 2024 - Integer.parseInt("20"+birthY);
		}
		System.out.println(age);
	}

}
