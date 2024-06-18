package p0618;

import java.util.Scanner;

public class C0618_12 {

	public static void main(String[] args) {
		// 3,3, 홍길동, 유관순, 이순신, 국어, 영어, 수학 성적을 입력 받아 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		int[][] score = new int [3][3];
		String[] title = {"이름", "국어", "영어", "수학"};
		
		// 입력
		for (int i=0;i<score.length;i++) {
			System.out.println("이름을 입력하세요. >> ");
			name[i] = scan.next();
			for (int j=0;j<score[i].length;j++) {
				System.out.println(title[j+1]+"성적을 입력하세요. >> ");
				score[i][j] = scan.nextInt();
			}
		}
		
		// 출력
		for (int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
			System.out.print("---------------------");
		}
		System.out.println();
		for (int i=0;i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for (int j=0; j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
		System.out.println();
		}
		
		

	}

}
