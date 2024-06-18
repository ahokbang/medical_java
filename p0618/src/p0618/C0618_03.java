package p0618;

import java.util.Scanner;

public class C0618_03 {

	public static void main(String[] args) {
		// while
		
		
		// 아래 내용 for문으로 
		// 입력한 숫자를 출력하고, x, X를 입력하면 종료되도록 구현
		Scanner scan = new Scanner(System.in);
		// 프로그램이 종료가 될 때 입력한 숫자의 합을 출력하시오.
		int sum = 0;
		for(;;) { // for(;;) : 무한대
			System.out.println("숫자를 입력하세요(종료 : x). >> ");
			String input = scan.nextLine();
			
			if (input.equalsIgnoreCase("X")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} // if
			sum += Integer.parseInt(input);
			System.out.println("입력한 숫자 : "+input);			
		} // for
		System.out.println("입력한 숫자들의 총합 : "+sum); // ***** 위치!!!! *****
		
		
		
//		
//		// 입력한 숫자를 출력하고, x, X를 입력하면 종료되도록 구현
//		Scanner scan = new Scanner(System.in);
//		// 프로그램이 종료가 될 때 입력한 숫자의 합을 출력하시오.
//		int sum = 0;
//		while(true) {
//			System.out.println("숫자를 입력하세요(종료 : x). >> ");
//			String input = scan.nextLine();
//			
//			if (input.equalsIgnoreCase("X")) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			} // if
//			sum += Integer.parseInt(input);
//			System.out.println("입력한 숫자 : "+input);			
//		} // while
//		System.out.println("입력한 숫자들의 총합 : "+sum); // ***** 위치!!!! *****
//		
		
		
//		while(true) {
//			break; // while 빠져나오기
//			continue; // 한번만 빠져나오기
//		} // while
		
//		int i = 10;
//		while(i>=0) {
//			System.out.println(i);
//			i--;
//		} //while
		
//		for (int i=10; i>=10; i--) {
//			System.out.println(i);
//		} // for
		
//		int i = 0;
//		while (i<10) {
//			System.out.println(i);
//			i ++;
//		} // while
		
		// 초기화;조건식;증감식
//		for (int i=0; i<10;i++) {
//			System.out.println(i);
//		} // for
		
	} // public

}
