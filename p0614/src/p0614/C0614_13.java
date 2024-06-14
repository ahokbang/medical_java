package p0614;

import java.util.Scanner;

public class C0614_13 {

	public static void main(String[] args) {
				
		// 입력한 숫자를 소수점 2자리에서 절사하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요(소수점 5자리까지).");
		double input = scan.nextFloat();
		// double s_input = (int)(input*100)/100d; // 절사 floor()
		double s_input = Math.floor(input*100)/100d; // 버림 floor()
		// double s_input = Math.round(input*1000)/1000d; // 반올림 round()
		// double s_input = Math.ceil(input*100)/100d; // 올림 ceil()
		System.out.println(s_input);			
		
		
//		float pi = 3.141592f;
//		float shortPi = (int)(pi*1000)/1000f; // f 없으면 int가 되서 int/int는 int이므로 소수점이 다 없어져
//		System.out.println(shortPi);

	}

}
