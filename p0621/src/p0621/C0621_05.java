package p0621;

import java.util.Scanner;

public class C0621_05 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		
		// 입력한 두 수의 더하기, 빼기, 곱하기, 나누기 계산결과값을 출력하시오.
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
//		C0621_05 c = new C0621_05();
		Cal2 c = new Cal2();
		int r1 = c.plus(a,b);
		int r2 = c.minus(a,b);
		int r3 = c.multi(a,b);
		int r4 = c.divide(a,b);
		
		System.out.println("더하기 : "+ r1);
		System.out.println("빼기 : "+ r2);
		System.out.println("곱하기 : "+ r3);
		System.out.println("나누기 : "+ r4);
		
	

	} // main
	
	// 메소드 선언
	int plus (int a, int b) {
		return a+b;		
	}
	
	int minus (int a, int b) {
		return a-b;
	}
	
	int multi (int a, int b) {
		return a*b;
	} 
	
	int divide (int a, int b) { 
		return a/b;
	}
	
	

} // class

/* [기본형 매개변수와 참조형 매개변수]
 * 기본형 매개변수 : 변수의 값을 읽기만 할 수 있다(read only).
 * 참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다(read % write).
 * 
 * */
