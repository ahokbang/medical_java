package p0621;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Stu_process {

	static Scanner scan = new Scanner(System.in); // 클래스 변수
	String stuNo; 
	String name;
	int kor; 
	int eng;
	int math; 
	int total;
	double avg;
	int rank;	
	
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
		scan.nextLine();
		return choice;
	} // screen
	
	// 2. 학생성적입력 부분 - Stu_score[] sc, int s_count 없어서 에러 발생 
	int stu_input(Stu_score[] sc, int s_count) {
		while (true) {
	
			System.out.println("[ 학생 성적 입력 ]");
			// 학번 자동 생성
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yy");			
//			String stuNo1 = "S"+sdf.format(date)+String.format("%03d", s_count+1);				
			stuNo = "S"+sdf.format(date)+String.format("%03d", s_count+1);				
			// 학번 저장 : 학번 자동으로 부여, 년도+3자리 일련번호
			
			// 객체 선언
			// sc[s_count] = new Stu_score();
			
			// 학번저장
			// sc[s_count].stuNo = stuNo1;
			 System.out.println("학번 : "+stuNo);

			// 이름저장
			System.out.println("이름을 입력하세요(0. 이전). >> ");
//			sc[s_count].name = scan.nextLine();
			name = scan.nextLine();
			
			// 이전 페이지 이동
//			if (sc[s_count].name.equals("0")) {
			if (name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				System.out.println();
				break;
			} // if
			
			// 국어 점수 저장
			System.out.println("국어점수를 입력하세요. >> ");
//			sc[s_count].kor = scan.nextInt();
			kor = scan.nextInt();
			// 영어 점수 저장
			System.out.println("영어점수를 입력하세요. >> ");
//			sc[s_count].eng = scan.nextInt();
			eng = scan.nextInt();
			// 수학 점수 저장
			System.out.println("수학점수를 입력하세요. >> ");
//			sc[s_count].math = scan.nextInt();
			math = scan.nextInt();
			scan.nextLine();
			
			
			// Stu_score(String stuNo, String name, int kor, int eng, int math) {
			// 객체선언 - 매개변수가 있는 생성자
			sc[s_count] = new Stu_score(stuNo, name, kor, eng, math);
			
			
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
	
	// 3. 학생성적출력부분 - Stu_score[] sc
	void stu_output(Stu_score[] sc, int s_count, String[] title) {
		System.out.println("                      [ 학생 성적 출력 ]");
		for (int i=0; i<title.length;i++) {
			System.out.printf("%s\t",title[i]);				
		} // for
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		for (int i=0; i<s_count; i++) {
			System.out.printf("%s\t", sc[i].stuNo); // 학번
			System.out.printf("%s\t", sc[i].name); // 이름					
			System.out.printf("%d\t",sc[i].kor); // 국어
			System.out.printf("%d\t",sc[i].eng); // 영어
			System.out.printf("%d\t",sc[i].math); // 수학
			System.out.printf("%d\t",sc[i].total); // 합계					
			System.out.printf("%.2f\t", sc[i].avg); // 평균
			System.out.printf("%d\t", sc[i].rank); // 등수
			System.out.println();
		} // for				
		System.out.println();
		
	} // stu_output()
	
} // class
