package p0619;

import java.util.Scanner;

public class C0619_09 {

	public static void main(String[] args) {
		// 학생성적 프로그램 혼자서 해보기
		// 학생 3명의 국어, 영어, 수학 성적 입력하기
		
		Scanner scan = new Scanner(System.in);
		
		// 변수, 배열 선언하기
		// 학번, 학생(3명), 과목(국, 영, 수), 총점, 평균, 등수 
		final int STU = 20;
		String [] stuNo = new String[STU]; // 학번
		String [] name = new String[STU]; // 이름
		int[][] score = new int[STU][4]; // 국, 영, 수, 총점
		double[] avg = new double[STU]; // 평균
		int[] rank = new int [STU];
		String[] title = {"학번", "이름", "국어", "영어", "수학", "총점", "평균", "등수"};
		int s_count = 0;
		
		// ----- 프로그램 실행 -----
		Loop1 : while (true) {				
			System.out.println("[ 성적 프로그램 ]");
			System.out.println("[ 1. 성적 입력 ]");
			System.out.println("[ 2. 성적 출력 ]");
			System.out.println("[ 3. 성적 수정 ]");
			System.out.println("[ 0. 프로그램 종료 ]");
			System.out.println("-----------------------------");
			System.out.println("원하는 번호를 입력하세요. >> ");
			int choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1:
				while (true) {
					
					System.out.println("[ 성적 입력 ]");
					
					// 학번(자동) 입력
					stuNo[s_count] = "S"+String.format("%04d", s_count+1) ;
					System.out.println("학번 "+stuNo[s_count]);
					
					// 이름 입력
					System.out.println("이름을 입력하세요(0. 취소). >> ");
					String temp = scan.nextLine();
					
					if (temp.equals("0")) {
						System.out.println("이전 화면으로 돌아갑니다.");
						break; 
					} // if
				
					// 이름 입력
					name[s_count] = temp;
				
				// ------------------------------------------------
				// 학번(수동), 이름 입력
//				System.out.println("학번을 입력하세요. >> ");
//				stuNo[s_count] = scan.nextLine();
//				System.out.println("이름을 입력하세요. >> ");
//				name[s_count] = scan.nextLine();
				// ------------------------------------------------
				
				// 과목별 성적 입력
				for (int i=0;i<3;i++) {
					System.out.printf("%s 성적을 입력하세요. >> ", title[i+2]);
					score[s_count][i] = scan.nextInt();
				} // for
				
				// 합계, 평균
				score[s_count][3] = score[s_count][0]+score[s_count][1]+score[s_count][2];
				avg[s_count] = score[s_count][3]/3.0;
				
				System.out.printf("학번 : %s, 이름 : %s \n", stuNo[s_count], name[s_count]);
				System.out.println("성적입력이 완료되었습니다.");
				System.out.println();
				scan.nextLine();
				
				s_count ++ ;
			} // while
				break;
			case 2:
				System.out.println("[ 성적 출력 ]");
				// 출력
				for (int i=0;i<title.length;i++) {					
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				System.out.println("---------------------------------------------------------------");
				for (int i=0; i<s_count; i++) {
					System.out.print(stuNo[i]+"\t");
					System.out.print(name[i]+"\t");
					System.out.printf("%d\t%d\t%d\t", score[i][0],score[i][1], score[i][2]);
					System.out.printf("%d\t%.2f\t", score[i][3], avg[i]);
					System.out.printf("%d\n", rank[i]);
					System.out.println();				
				} //for 
				System.out.println();
				break;
				
			case 3:
				System.out.println("[ 학생 검색 ]");
				System.out.println("성적을 수정하고자 하는 학생의 이름을 입력하세요. >> ");
				String search = scan.nextLine();
				int temp = -1;
				for (int i=0;i<name.length;i++) {
					if (name[i]== search) {
						
					}
					
				}
				System.out.printf("'%s' 학생이 검색되었습니다.", search);
				
				
				System.out.println("[ 성적 수정 ]");
				System.out.println("-----------------------------------------");
				System.out.println("[ 1. 국어점수 수정 ]");
				System.out.println("[ 2. 영어점수 수정 ]");
				System.out.println("[ 3. 수학점수 수정 ]");
				System.out.println("-----------------------------------------");

				
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.out.println("[ 프로그램 종료 ]");
			
				break Loop1 ;
			} // switch
		} // while

	} // main

} // class
