package p0617;

import java.util.Scanner;

public class C0617_13 {

	public static void main(String[] args) {
		// 조건문 : if, switch
		// switch

		// 두 수를 입력 받아 사칙연산 프로그램 구현
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int n = scan.nextInt();
		System.out.println("숫자를 입력하세요.");
		int n2 = scan.nextInt();
		
		System.out.println("1. 더하기(+)   2. 빼기(-)   3. 곱하기(*)   4. 나누기(/)");
		System.out.println("원하는 번호/사칙연산를/을 입력하세요.");
//		int choice = scan.nextInt();
		String choice = scan.next();
		
		switch(choice) {
//		case 1 :
		case "+" :
			System.out.println("더하기 : "+(n+n2));
			break ;
			
//		case 2 :
		case "-" :
			System.out.println("빼기 : "+(n-n2));
			break;
		
//		case 3:
		case "*":
			System.out.println("곱하기 "+(n*n2));
			break;
			
//		case 4:
		case "/":
			System.out.println("나누기 "+(n/n2));
			break;
			
		default :
			System.out.println("번호/사칙연산를/을 잘못 입력하셨습니다.");
			break;
		
		}
	}

}
