package p0624;

import java.util.Scanner;

public class C0624_04 {

	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner(System.in);
		
		
		int [] num = new int[3];
		
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요. >> ");
			num[i] = scan.nextInt();
		}
		
		
//		int result = add(num[0], num[1], num[2]); // error
		// 다른 파일의 인스턴스 메소드를 사용하려면,
		// 객세선언 후, 참조변수명.메소드명
		
		// 객체선언
		Cal c = new Cal();		
		int result = c.add(num[0], num[1], num[2]);
		System.out.println("합계 : "+result);
		
		int sum = c.add2(num);
		
		// 두 수를 입력 받아, 두 수를 더한 값을 출력하시오. 
//		System.out.println("1번째 숫자를 입력하세요.");
//		int x1 = scan.nextInt();
//		System.out.println("2번째 숫자를 입력하세요.");
//		int x2 = scan.nextInt();
//		System.out.println("두 수의 합 : "+(x1+x2));

		// 세 수를 입력 받아 세 개의 수를 더한 값을 배열 및 for문을 사용해서 출력하시오.
//		int[] nums = new int[3];
//		for (int i=0; i<1; i++ ) {
//			System.out.println("숫자를 입력하세요.");
//			nums[0] = scan.nextInt();
//			nums[1] = scan.nextInt();
//			nums[2] = scan.nextInt();			
//		} // for m
//		System.out.println("세 수의 합 : "+(nums[0]+nums[1]+nums[2]));
		
//		int sum = 0;
//		for (int i=0; i<3; i++ ) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요.");
//			nums[i] = scan.nextInt();	
//			sum += nums[i];
//		} // for t
//		System.out.println("합계 : "+sum); // t
		
//		// 합계 1 t
//		int sum = 0;
//		for(int i=0;i<3;i++) {
//			sum += nums[i];
//		} 
//		System.out.println("합계 : "+sum);
		
	} // main

} // class
