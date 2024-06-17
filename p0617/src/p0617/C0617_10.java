package p0617;

import java.util.Scanner;

public class C0617_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. >> ");
		int n = scan.nextInt();

		
		// 숫자를 입력 받아 60점 이상이면 합격, 60점 미만이면 불합격을 출력하시오.
		//90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 그 외 F라고 출력하시오.
		if (n>= 90) System.out.println("A");
		else if (n>=80) System.out.println("B");
		else if (n>=70) System.out.println("C");
		else if (n>=60) System.out.println("D");
		else System.out.println("F");
		
//		// 숫자를 입력 받아 60점 이상이면 합격, 60점 미만이면 불합격을 출력하시오.		
//		if (n>=60) System.out.println("합격");
//		else System.out.println("불합격");
//		

	}

}
