package p0624;

import java.util.Scanner;

public class C0624_05 {

	public static void main(String[] args) {
		// 
		
		// 두 수와 한 개의 사칙연산(+,-,*,/)을 받아 결과값을 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		
		// 배열로 해보기
		int arr[] = new int[2];
		for (int i=0; i<arr.length; i++) {
			System.out.println("숫자를 입력하세요. >> ");
			arr[i] = scan.nextInt();			
		} // for
		
		System.out.println("사칙연산을 입력하세요. >> ");
		String str = scan.next();
		
		Calculate c = new Calculate();
		int result = c.cal(arr, str);
		
//		System.out.println("숫자를 입력하세요. >> ");
//		int x1 = scan.nextInt();
//		System.out.println("숫자를 입력하세요. >> ");
//		int x2 = scan.nextInt();
//		System.out.println("사칙연산을 입력하세요. >> ");
//		String str = scan.next();
//		
//
//		// cal() 메소드를 사용해서 구현하시오. 
//		// 인스턴스 메소드 : 객체선언 후, 참조변수명.메소드명
//				
////		Calculate cal = new Calculate();
////		cal.result(x1, x2, str); // m
//		
//		Calculate c = new Calculate();
//		int result = c.cal(x1, x2, str);
//		
		
//		if (str=="+") {
//			System.out.println("더하기 : "+(x1+x2));
//		} else if (str=="-") {
//			System.out.println("빼기 : "+(x1-x2));
//		} else if (str=="*") {
//			System.out.println("곱하기 : "+(x1*x2));
//		} else if (str=="-") {
//			System.out.println("나누기 : "+(x1/x2));
//		} else {
//			System.out.println("잘못 입력했습니다.");
//		} // else m : else만 나옴
		
//		int result = 0;
//		switch (str) {
//		case "+":
//			result = x1+x2;
//			break;
//		case "-":
//			result = x1-x2;
//			break;
//		case "*":
//			result = x1*x2;
//			break;
//		case "/":
//			result = x1/x2;
//			break;
//		}
//		
//		System.out.println("결과값 : "+result); // t

	} // main

} // class
