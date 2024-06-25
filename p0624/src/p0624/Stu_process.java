package p0624;

import java.util.Scanner;

public class Stu_process {
	
	Scanner scan = new Scanner(System.in);
	static int s_count = Stu_score.count; // Stu_score count 사용
	String[] title = {"학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수"};
	String stuNo, name;
	int kor, eng, math, total, rank;
	double avg;
	
	
	// 화면부분 메소드
	int screen() { // 인스턴스 메소드
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
	
	// 학생성적입력 메소드
	void stu_input(Stu_score[] sc) {
		while (true) {
			System.out.println("[ 학생 성적 입력 ]");
			s_count = Stu_score.count; // Stu_score count 사용
			
			// 이름저장
			System.out.println("이름을 입력하세요(0. 이전). >> ");
			name = scan.nextLine();		
			
			// 이전 페이지 이동
			if (name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				System.out.println();
				break;
			} // if
			
			// 국어 점수 저장
			System.out.println("국어점수를 입력하세요. >> ");
			kor = scan.nextInt();
			// 영어 점수 저장
			System.out.println("영어점수를 입력하세요. >> ");
			eng = scan.nextInt();
			// 수학 점수 저장
			System.out.println("수학점수를 입력하세요. >> ");
			math = scan.nextInt();
			scan.nextLine();
			
			// 객체 선언 : 매개변수가 있는 생성자 사용
			sc[s_count] = new Stu_score(name, kor, eng, math);
			
			// 입력 완료
			System.out.println("< 학생성적 입력완료 >");
			System.out.printf("%s 학생성적이 저장되었습니다.", name);
			System.out.println();
			System.out.println();
									
		} // while
		System.out.println();	
	} // stu_input
	
	// 학생성적출력 메소드
	void stu_output(Stu_score[] sc) {
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
		
	} // stu_output
	
	
	// 등수처리 메소드
	void stu_rank(Stu_score[] sc) {
		
		System.out.println("[ 학생 성적 등수 처리 ]");
		for(int i=0; i<s_count; i++) {
			int count = 1; // 초기화;
			for (int j=0; j<s_count; j++)
				if (sc[i].total < sc[j].total) count++; 
			sc[i].rank = count;
		} // for
		
		System.out.println("등수처리가 완료되었습니다.");
	} 
	
	
	
	
} // class
