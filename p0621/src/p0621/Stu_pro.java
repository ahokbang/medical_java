package p0621;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Stu_pro {
	
	Scanner scan = new Scanner(System.in);
	
	// 1. 화면부분
	int screen() {
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
		
		return choice;	
	} // screen
	
	// 2. 학생성적입력
	int stu_input(Stu_score[] sc, int s_count) {
		while (true) {
			System.out.println("[ 학생 성적 입력 ]");
			// 학번 자동 생성
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yy");			
			String stuNo1 = "S"+sdf.format(date)+String.format("%03d", s_count+1);				
			// 학번 저장 : 학번 자동으로 부여, 년도+3자리 일련번호
			// 객체 선언
			sc[s_count] = new Stu_score();
			// 학번저장
			sc[s_count].stuNo = stuNo1;
			System.out.println("학번 : "+stuNo1);
			// 이름저장
			System.out.println("이름을 입력하세요(0. 이전). >> ");
			sc[s_count].name = scan.nextLine();		
			
			// 이전 페이지 이동
			if (sc[s_count].name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				System.out.println();
				break;
			} // if
			
			// 국어 점수 저장
			System.out.println("국어점수를 입력하세요. >> ");
			sc[s_count].kor = scan.nextInt();
			// 영어 점수 저장
			System.out.println("영어점수를 입력하세요. >> ");
			sc[s_count].eng = scan.nextInt();
			// 수학 점수 저장
			System.out.println("수학점수를 입력하세요. >> ");
			sc[s_count].math = scan.nextInt();
			scan.nextLine();
			
			// 합계 점수 저장
			sc[s_count].total = sc[s_count].kor+sc[s_count].eng+sc[s_count].math;
			// 평균 점수 저장
			sc[s_count].avg = sc[s_count].total/3.0;
			
			// 입력 완료
			System.out.println("< 학생성적 입력완료 >");
			System.out.printf("%s 학생성적이 저장되었습니다.", sc[s_count].name);
			System.out.println();
			
			s_count++;		
	
		} // while
		return s_count;
		
	} // stu_input
	
	
	
} // class
