package p0620;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C0620_학생성적배열사용 {

	public static void main(String[] args) {
		// 학생성적 프로그램
		
		// 변수 선언 
		Scanner scan = new Scanner(System.in);
		final int STU = 10;
		String[] stuNo = new String[STU]; // 학번
		String[] name = new String[STU]; //이름
		int[][] score = new int[STU][4]; // 국어, 영어, 수학, 합계
		double[] avg = new double[STU]; // 평균
		int[] rank = new int[STU]; // 등수
		String[] title = {"학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수"};
		int s_count = 0; // 입력된 학생 수
		
		// 전체 화면 출력
		while (true) {
				
			// 화면부분
			System.out.println("   [ 학생성적 프로그램 ]");
			System.out.println("----------------------");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 학생 검색");
			System.out.println("5. 등수 처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("----------------------");
			System.out.println("원하는 번호를 입력하세요. >> ");
			int choice = scan.nextInt();
			scan.nextLine(); // enter키 때문
			
			switch(choice) {
			case 1:
				while (true) {
					System.out.println("[ 학생 성적 입력 ]");
					// "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수"
					
					// 학번 저장 : 학번 자동으로 부여, 년도+3자리 일련번호
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yy");			
					stuNo[s_count] = "S"+sdf.format(date)+String.format("%03d", s_count+1);
					System.out.println("학번 : "+stuNo[s_count]);
					// 이름 저장
					System.out.println("이름을 입력하세요(0. 이전화면 이동).");
					name[s_count] = scan.nextLine();
					System.out.println("");
					
					if (name[s_count].equals("0")) {
						System.out.println("이전 화면으로 이동합니다.");
						System.out.println();
						break;
					} // if
					
					// 국어, 영어, 수학 점수 저장
					System.out.println("국어 점수를 입력하세요. >> ");
					score[s_count][0] = scan.nextInt();
					System.out.println("영어 점수를 입력하세요. >> ");
					score[s_count][1] = scan.nextInt();
					System.out.println("수학 점수를 입력하세요. >> ");
					score[s_count][2] = scan.nextInt();
					scan.nextLine();
					
					// 합계 저장
					score[s_count][3] = score[s_count][0]+score[s_count][1]+score[s_count][2];
					// 평균 저장
					avg[s_count] = score[s_count][3]/3.0;
					
					// 입력완료
					System.out.printf("%s 학생성적이 저장되었습니다.\n", name[s_count]);
					System.out.println();
					
					s_count++;						
				} //  while
				break;
				
			case 2:
				System.out.println("[ 학생 성적 출력 ]");
				for (int i=0; i<title.length;i++) {
					System.out.printf("%s\t",title[i]);				
				} // for
				System.out.println();
				System.out.println("--------------------------------------------------------------");
				for (int i=0; i<s_count; i++) {
					System.out.printf("%s\t", stuNo[i]); // 학번
					System.out.printf("%s\t", name[i]); // 이름
					for (int j=0;j<4; j++ ) {
						System.out.printf("%d\t",score[i][j]); // 국어, 영어, 수학, 합계
					}
					System.out.printf("%.2f\t", avg[i]); // 평균
					System.out.printf("%d\t", rank[i]); // 등수
					System.out.println();
				} // for				
				break;
				
			case 3:
				while (true) {
					System.out.println("[ 학생 성적 수정 ]");
					System.out.println();
					// 학생 검색
					System.out.println("[ 학생 이름 검색 ]");
					System.out.println("성적을 수정하고자 하는 학생의 이름을 입력하세요. >> ");
					String search = scan.nextLine();
					
					int temp_no = -1;
					
					for (int i=0; i<s_count; i++) {
						if (name[i].equals(search)) {
							temp_no = i;
							System.out.println("입력한 학생을 찾았습니다.");
							break;
						} // if
					} // for
					
					if (temp_no == -1) {
						System.out.println("찾는 학생이 없습니다. 다시 입력해주세요.");
						System.out.println();
						
					} else {
							System.out.println("성적을 수정하고자 하는 과목을 선택하세요.");
							System.out.println("----------------------");
							System.out.println("1. 국어");				
							System.out.println("2. 영어");
							System.out.println("3. 수학");
							System.out.println("----------------------");
							System.out.println();
							int chc = scan.nextInt();
							
							switch (chc) {
							case 1:
								System.out.printf("%s을/를 선택하셨습니다.", title[chc+1]);
								System.out.println();
								System.out.printf("현재 %s 점수 : %d", title[chc+1], score[temp_no][chc-1]);
								System.out.println();
								System.out.println("수정할 점수를 입력하세요. >> ");
								System.out.println();
								score[temp_no][chc-1] = scan.nextInt();
								score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
								avg[temp_no] = score[temp_no][3]/3.0;
								System.out.printf("수정된 %s 점수 : %d", title[chc+1],score[temp_no][chc-1]);
								System.out.println();
							case 2:
								System.out.printf("%s을/를 선택하셨습니다.", title[chc+1]);
								System.out.println();
								System.out.printf("현재 %s 점수 : %d", title[chc+1], score[temp_no][chc-1]);
								System.out.println();
								System.out.println("수정할 점수를 입력하세요. >> ");
								System.out.println();
								score[temp_no][chc-1] = scan.nextInt();
								score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
								avg[temp_no] = score[temp_no][3]/3.0;
								System.out.printf("수정된 %s 점수 : %d", title[chc+1],score[temp_no][chc-1]);
								System.out.println();
							case 3: 
								System.out.printf("%s을/를 선택하셨습니다.", title[chc+1]);
								System.out.println();
								System.out.printf("현재 %s 점수 : %d", title[chc+1], score[temp_no][chc-1]);
								System.out.println();
								System.out.println("수정할 점수를 입력하세요. >> ");
								System.out.println();
								score[temp_no][chc-1] = scan.nextInt();
								score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
								avg[temp_no] = score[temp_no][3]/3.0;
								System.out.printf("수정된 %s 점수 : %d", title[chc+1],score[temp_no][chc-1]);
								System.out.println();
							} // switch
					} // else
				break;
				} // while	
				
				
			case 4:
				System.out.println("   [ 학생 성적 검색 ]");
				System.out.println("----------------------");
				System.out.println("1. 학생 이름 검색");				
				System.out.println("2. 평균 점수 검색");
				System.out.println("3. 합계 점수 검색");
				System.out.println("----------------------");
				System.out.println("원하는 번호를 입력하세요. >> ");
				choice = scan.nextInt();
				scan.nextLine();
				
				int cnt = 0; // 학생을 찾았는지 확인 변수
				
				switch (choice) {
				case 1: // 학생 이름 검색
					System.out.println("[ 학생 이름 검색 ]");
					System.out.println("검색하고자 하는 학생의 이름을 입력하세요. >> ");
					String t_name = scan.nextLine(); 
					
					for (int i=0; i<title.length;i++) {
						System.out.printf("%s\t",title[i]);				
					} // for
					System.out.println();
					System.out.println("--------------------------------------------------------------");
					for (int i=0; i<s_count; i++) {
//					if(name[i].equals(t_name)) { // 이름이 동일해야 해
						if(name[i].contains(t_name)) { // 글자가 포함되어 있는 경우
							System.out.printf("%s\t", stuNo[i]); // 학번
							System.out.printf("%s\t", name[i]); // 이름
							for (int j=0;j<4; j++ ) {
								System.out.printf("%d\t",score[i][j]); // 국어, 영어, 수학, 합계
							} // for
							System.out.printf("%.2f\t", avg[i]); // 평균
							System.out.printf("%d\t", rank[i]); // 등수
							System.out.println();
							cnt = 1;
						} // if
//						else {
//						System.out.println("찾는 학생이 없습니다.");
//						System.out.println();
//					} // else
					} // for
					System.out.println();
					
					if(cnt==0) {
						System.out.println("찾는 학생이 없습니다. 다시 입력해주세요.");
						System.out.println();								
					}										
					break;
				case 2: // 평균 점수 검색
					System.out.println("[ 평균 점수 검색 ]");
					System.out.println("검색하고자 하는 평균 점수를 입력하세요. >> ");
					double t_avg = scan.nextInt(); 
					
					for (int i=0; i<title.length;i++) {
						System.out.printf("%s\t",title[i]);				
					} // for
					System.out.println();
					System.out.println("--------------------------------------------------------------");
					for (int i=0; i<s_count; i++) {
						if(avg[i] >= t_avg) { // 글자가 포함되어 있는 경우
							System.out.printf("%s\t", stuNo[i]); // 학번
							System.out.printf("%s\t", name[i]); // 이름
							for (int j=0;j<4; j++ ) {
								System.out.printf("%d\t",score[i][j]); // 국어, 영어, 수학, 합계
							} // for
							System.out.printf("%.2f\t", avg[i]); // 평균
							System.out.printf("%d\t", rank[i]); // 등수
							System.out.println();
							cnt = 1;
						} // if
					} // for				
					
					if(cnt==0) {
						System.out.println("찾는 학생이 없습니다. 다시 입력해주세요.");
						System.out.println();		
						
					} //if										
					break;
					
				case 3: // 합계 점수 검색
					System.out.println("[ 합계 점수 검색 ]");
					System.out.println("검색하고자 하는 합계 점수를 입력하세요. >> ");
					int t_score = scan.nextInt(); 
					
					for (int i=0; i<title.length;i++) {
						System.out.printf("%s\t",title[i]);				
					} // for
					System.out.println();
					System.out.println("--------------------------------------------------------------");
					for (int i=0; i<s_count; i++) {
						if(score[i][3] >= t_score) { // 글자가 포함되어 있는 경우
							System.out.printf("%s\t", stuNo[i]); // 학번
							System.out.printf("%s\t", name[i]); // 이름
							for (int j=0;j<4; j++ ) {
								System.out.printf("%d\t",score[i][j]); // 국어, 영어, 수학, 합계
							} // for
							System.out.printf("%.2f\t", avg[i]); // 평균
							System.out.printf("%d\t", rank[i]); // 등수
							System.out.println();
							cnt = 1;
						} // if
					} // for				
					
					if(cnt==0) {
						System.out.println("찾는 학생이 없습니다. 다시 입력해주세요.");
						System.out.println();		
						
					} //if										
					break;
					
				} // switch				
				break;
				
			case 5:
				System.out.println("[ 학생 성적 등수 처리 ]");
				for(int i=0; i<s_count; i++) {
					int count = 1; // 초기화;
					for (int j=0; j<s_count; j++)
						if (score[i][3] < score[j][3]) count++; 
					rank[i] = count;
				} // for
				
				System.out.println("등수처리가 완료되었습니다.");
				
				break;
				
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				
				break;
			} // switch
		}// while 
		
	} // main
 
} // class
