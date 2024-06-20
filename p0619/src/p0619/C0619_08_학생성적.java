package p0619;

import java.util.Scanner;

public class C0619_08_학생성적 {

	public static void main(String[] args) {
		// 배열-학생성적
		
		Scanner scan = new Scanner(System.in);
		
		// 3명 학생 : 국어, 영어, 수학 
		// 학번(stu0001) : string, 이름 : string, 국어 : int, 영어 : int, 수학 : int, 합계 : int, 평균 : double, 등수 : int 
		final int STU = 20; // 전체 학생 수
		String[] stuNo = new String[STU]; // 학번
		String[] name = new String[STU]; // 이름
		int[][] score = new int [STU][4]; // 국어, 영어, 수학, 합계
		double[] avg = new double[STU]; // 평균
		int[] rank = new int[STU]; // 등수
		String[] title = {"학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수"};
		int s_count = 0; // 입력된 학생 수
		
		// 출력 화면
		Loop1 : while (true) {
			
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("----------------------------");
			System.out.println("원하는 번호를 입력하세요(0: 프로그램 종료). >> ");
			int choice = scan.nextInt();
			scan.nextLine(); // 숫자 입력 후 누른 엔터키가 다음 nextLine()에 영향(--> stuNo에 영향을 주어 바로 stuNo는 앞의 엔터로 인해 작성 된것으로 인식하여 바로 name 작성하도록 넘어감. 그래서 이 줄을 추가함)
				
			switch(choice) {
			case 1: 
				
				// 입력화면
				while (true) {
					System.out.println("[ 성적 입력 ]");
													
					// 학번 자동 부여 : 삭제 시 중복 부여 이슈 있어. 
					stuNo[s_count] = "S"+String.format("%04d",s_count+1); // S0001
					System.out.println("학번 : "+stuNo[s_count]);
					
					// 이름입력
					System.out.println("이름을 입력하세요(0.취소). >> ");
					String temp = scan.nextLine();
				
					if(temp.equals("0")) {
						System.out.println("이전 화면으로 이동합니다.");
						System.out.println();
						break; // while
					} // if

					// 이름입력
					name[s_count] = temp;
					
					// ------------------------------------------------------------------------
//					// 학번(수동), 이름 입력
//					// 학번 입력하게 만들 것인지? 자동으로 부여하게 할 것인지? 정해야 함. 일단 입력하는 것으로.
//					System.out.println("학번을 입력하세요(0. 취소). >> ");
////					stuNo[s_count] = scan.nextLine();
//					String temp = scan.nextLine();
//					
//					if(temp.equals("0")) {
//						System.out.println("이전 화면으로 이동합니다.");
//						System.out.println();
//						break; // while
//					} // if
//					
//					stuNo[s_count] = temp; 
//					System.out.println("이름을 입력하세요(0.취소). >> ");
//					name[s_count] = scan.nextLine();
					// ------------------------------------------------------------------------
					
					// 점수 입력				
					// 방법 1. for문 미사용
	//				System.out.println("국어점수를 입력하세요. >> ");
	//				score[s_count][0] = scan.nextInt();
	//				System.out.println("영어점수를 입력하세요. >> ");
	//				score[s_count][1] = scan.nextInt();
	//				System.out.println("수학점수를 입력하세요. >> ");
	//				score[s_count][2] = scan.nextInt();
					// 방법 2. for문 사용
					for (int i=0; i<3; i++) {
						System.out.printf("%s 점수를 입력하세요. >> ", title[i+2]);
						score[s_count][i] = scan.nextInt();
					} // for				
					scan.nextLine();
					// 합계, 평균
					score[s_count][3] = score[s_count][0]+score[s_count][1]+score[s_count][2];
					avg[s_count] = score[s_count][3]/3.0;
//					avg[s_count] = score[s_count][3]/(double)3; // 위와 같이 3.0 또는 (double)3으로 작성해주어야 소수점 출력
					
					System.out.printf("학번 : %s, 이름 : %s \n",stuNo[s_count], name[s_count]);
					System.out.println("성적입력이 완료되었습니다. ");
					System.out.println();
					
					s_count ++; // 학생 수 증가 			
				} //while
					break;
					
			case 2:
				System.out.println("[ 성적 출력 ]");
				// 입력한 학생 데이터 출력
				for (int i=0;i<title.length;i++) {
					System.out.print(title[i]+"\t");
				} // for
				System.out.println();
				System.out.println("--------------------------------------------------------------");
				for (int i=0; i<s_count; i++) {
					System.out.print(stuNo[i]+"\t");
					System.out.print(name[i]+"\t");
//					System.out.printf("학번 : %s, 이름 : %s \n", stuNo[s_count], name[s_count]);
					System.out.printf("%d\t%d\t%d\t", score[i][0], score[i][1], score[i][2]);
					System.out.printf("%d\t%.2f\t", score[i][3], avg[i]);
					System.out.printf("%d\n", rank[i]);					
				} //for
				System.out.println();
				break;
				
			case 3: 
				System.out.println("[ 학생 검색 ]");
				System.out.println("---------------------------------");
				System.out.println("성적을 수정하고자 하는 학생 이름을 입력하세요. >> ");
				String search = scan.nextLine();
				
				// 검색
				int temp_no = -1; // 임시 번호
				for (int i=0; i<s_count; i++) {
					if (name[i].equals(search)) {
						temp_no = i; // 검색한 이름과 동일한 이름이 있으면 그 위치값 저장, 찾는 학생이 검색되었을 경우
						System.out.printf("%s 학생이 검색되었습니다. \n", search);
						break;
					} // if
				} // for
				
				if(temp_no==-1) { // 찾는 학생이 업을 경우
					System.out.println("찾는 학생이 없습니다. 다시 입력하세요.");
				} else { 
					// 찾는 학생이 있는 경우
					// 학생 검색 후 진행
					System.out.printf("[ %s 성적 수정 ] \n", search);
					System.out.println("---------------------------------");
					System.out.println("1. 국어점수 수정");
					System.out.println("2. 영어점수 수정");
					System.out.println("3. 수학점수 수정");
					System.out.println("---------------------------------");
					System.out.println("원하는 번호를 입력하세요. >> ");
					choice = scan.nextInt();
					
					switch (choice) {
					
					case 1: // 국어점수 변경
						System.out.printf("[ %s점수 수정 ] \n", title[choice+1]);
						// 국어점수 : score[temp_no][0]
						System.out.printf("현재 %s 점수 : %d",title[choice+1],score[temp_no][choice-1]);
						System.out.println();
						System.out.println("---------------------------------");
						System.out.printf("변경 %s 점수를 입력하세요. >> \n", title[choice+1]);
						score[temp_no][choice-1] = scan.nextInt();
						
						// 합계, 평균 변경
						// 합계 = 국어점수 + 영어점수 + 수학점수
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						// 합계 = 합계/3.0
						avg[temp_no] = score[temp_no][3]/3.0;
						// 국어점수 : score[temp_no][0]
						System.out.printf("%s 점수가 %d로 변경되었습니다. \n",title[choice+1], score[temp_no][choice-1]);
						System.out.println();
						
						break;
						
					case 2: // 영어점수 변경
						System.out.printf("[ %s 점수 수정 ] \n", title[choice+1]);
						// 영어점수 : score[temp_no][1]
						System.out.printf("현재 %s 점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
						System.out.println("---------------------------------");
						System.out.printf("변경 %s 점수를 입력하세요. >> \n", title[choice+1]);
						score[temp_no][choice-1] = scan.nextInt();
						
						// 합계, 평균 변경
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						avg[temp_no] = score[temp_no][3]/3.0;
						System.out.printf("%s 점수가 %d로 변경되었습니다. \n",title[choice+1], score[temp_no][choice-1]);
						System.out.println();
						
						break;
						
					case 3: // 수학점수 변경
						System.out.printf("[ %s 점수 수정 ] \n", title[choice+1]);
						// 수학점수 : score[temp_no][2]						
						System.out.printf("현재 %s 점수 : %d",title[choice+1],score[temp_no][choice-1]);
						System.out.println("---------------------------------");
						System.out.printf("변경 %s 점수를 입력하세요. >> \n", title[choice+1]);
						score[temp_no][choice-1] = scan.nextInt();
						
						// 합계, 평균 변경
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						avg[temp_no] = score[temp_no][3]/3.0;
						System.out.printf("%s점수가 %d로 변경되었습니다. \n",title[choice+1], score[temp_no][choice-1]);
						System.out.println();
		
						break;
						
					} // switch
					
				} // if
				System.out.println("입력한 이름 : "+search);
				
				break;
				
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break Loop1;
			} // switch
		
		} // while
		
	} // main 

} // class
