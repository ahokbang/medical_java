package p0617;

import java.util.Scanner;

public class C0617_12 {

	public static void main(String[] args) {
		// 점수를 입력 받아, 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 그 외에는 F를 출력할 수 있게 구현하시오.
		// 90~92점 : A-, 97~100 : A+, 나머지는 A
		// 80~82점 : B-, 87~90 : B+, 나머지는 B
		// 70~72점 : C-, 77~80 : C+, 나머지는 C
		// 60~62점 : D-, 67~60 : D+, 나머지는 D
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요. ");
//		int score = scan.nextInt();
//		if (score>=90) System.out.println("A");
//			if (score>=97) System.out.println("A+");
//			else if (score<=92) System.out.println("A-");		
//		else if (score>=80) System.out.println("B");
//		else if (score>=70) System.out.println("C");
//		else if (score>=60) System.out.println("D");
//		else System.out.println("F");
		
		System.out.println("점수를 입력하세요. ");
		int num = scan.nextInt();
		String score = "";
		if (num>=90) {
			score = "A";
			if(num>=97) score = score+"+";
			else if(num<=92) score = score+"-";
		} else if (num>=80) {
			score = "B";
			if(num>=87) score = score+"+";
			else if(num<=82) score = score+"-";
		} else if (num>=70) {
			score = "C";
			if(num>=77) score = score+"+";
			else if(num<=72) score = score+"-";
		} else if (num>=60) {
			score = "D";
			if(num>=67) score = score+"+";
			else if(num<=62) score = score+"-";
		} else score = "F"; 
			
		System.out.println("학점 : "+score);
		
		
		// switch
	}

}
