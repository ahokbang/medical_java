package p0624;

import java.util.Scanner;

public class Calculate {
	// 메소드
	
	static Scanner scan = new Scanner(System.in);
	
	// 메소드 1개를 사용해서 처리하는 방법
	
	   // 방법 2 : C0627_06에서 프린트
	void scoreChange(int[] score) {
		
		System.out.println("변경할 국어점수를 입력하세요. >> "); 
		score[0] = scan.nextInt();
		
		System.out.println("변경할 영어점수를 입력하세요. >> "); 
		score[1]= scan.nextInt();
		  
		System.out.println("변경할 수학점수를 입력하세요. >> "); 
		score[2] = scan.nextInt();
				
		
	}
	
	
		/*
		 * // 방법 1 void change(int kor, int eng, int math) {
		 * System.out.println("변경할 국어점수를 입력하세요. >> "); kor = scan.nextInt();
		 * 
		 * System.out.println("변경할 영어점수를 입력하세요. >> "); eng = scan.nextInt();
		 * 
		 * System.out.println("변경할 수학점수를 입력하세요. >> "); math = scan.nextInt();
		 * 
		 * System.out.println("변경된 국어점수 : "+kor); System.out.println("변경된 영어점수 : "+eng);
		 * System.out.println("변경된 수학점수 : "+math);
		 * 
		 * } // 방법 1 change
		 
	/*
	 * int korChange(int kor) { // Scanner scan = new Scanner(System.in);
	 * System.out.println("변경할 국어점수를 입력하세요. >> "); 
	 * kor = scan.nextInt();
	 * 
	 * return kor; 
	 * } // kor
	 * 
	 * int engChange(int eng) { // Scanner scan = new Scanner(System.in);
	 * System.out.println("변경할 영어점수를 입력하세요. >> "); 
	 * eng = scan.nextInt();
	 * 
	 * return eng; 
	 * } // eng
	 * 
	 * int mathChange(int math) { // Scanner scan = new Scanner(System.in);
	 * System.out.println("변경할 수학점수를 입력하세요. >> ");
	 * math = scan.nextInt();
	 * 
	 * return math; 
	 * } // math
	 */
		
	int result = 0;
	// 메소드 명 : cal()
	// return result; 사용할 것
	
	// 배열일 경우 : 매개변수를 줄일 수 있는 이점이 있음
	
	 int cal(int[] arr, String str) { 
	 switch(str) { 
	 case "+" : 
		 result = arr[0] + arr[1]; 
		 break; 
	 case "-" : 
		 result = arr[0] - arr[1]; 
		 break; 
	 case "*" : 
		 result = arr[0] * arr[1]; 
		 break; 
	 case "/" : 
		 result = arr[0] / arr[1]; 
		 break; 
	 	} 	 // switch
	 
	 return result;
	 }
	
//	} // cal
//	
//	int cal(int x1, int x2, String str) {
//		switch(str) {
//		case "+" :
//			result = x1 + x2;
//			break;
//		case "-" :
//			result = x1 - x2;
//			break;
//		case "*" :
//			result = x1 * x2;
//			break;
//		case "/" :
//			result = x1 / x2;
//			break;						
//		} // switch
//		
//		return result;
//		
//	} // cal
	
	
} // class
