package p0620;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C0620_학생성적클래스사용 { // 클래스 영역
	
	int num = 0; // 인스턴스 변수 : 객체선언 후 참조변수명.변수명으로 사용
	static int n = 0; // 클래스 변수 : 객체선언 없이 
	
	
	public static void main(String[] args) { // 메서드 영역, 여기서 선언된 변수는 지역변수
		// 변수와 메서드
		/*
		 * 메서드 내 선언된 변수 - 지역변수 : 변수 선언문 수행 시, 객체 선언 후 사용 가능
		 * 쿨래스 내 선언된 변수 - 인스턴스 변수 : 인스턴스 생성 시 (인스턴스 = 객체), 객체 선언 후 사용 가능
		 *                  - 클래스변수(static 변수, 공유변수) : 클래스가 메모리에 올라갈 때, 객체선언없이 사용할 수 있어.거의 사용하지 않음.
		 * 
		 * [인스턴스 변수]
		 * - 각 인스턴스의 개별적인 저장 공간. 인스턴스마다 다른 값 저장 가능
		 * - 인스턴스 생성 후 '참조변수.인스턴스변수명'으로 접근 
		 * - 인스턴스를 생성할 때 생성되고, 참조변수가 없을 때 가비지컬렉터에 의해 자동 제거됨.
		 * 
		 * [클래스 변수] 저장 공간이 1개
		 * - 같은 클래스의 모든 인스턴스들이 공유하는 변수
		 * - 인스턴스 생성없이 '클래스이름.클래스변수명'으로 접근
		 * - 클래스가 로딩될 때 생성되고 프로그램이 종료될 때 소멸 
		 * 
		 * [지역변수]
		 * - 메서드 내에 선언되며, 메서드의 종료와 함께 소멸
		 * - 조건문, 반목문의 블럭 {} 내에 선언된 지역변수는 블력을 벗어나면 소멸
		 * 
		 * 
		 * 
		 * 
		 * */

		
		
		
		
		// 객체를 사용한 학생성적프로그램: 크게 달라지는 건 없지만 데이터 이동이 용이
		Scanner scan = new Scanner(System.in);
		
		// 변수 선언 
		Stu_score[] sc = new Stu_score[10]; // 학생성적객체배열 선언
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
				break;
			case 2:
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
				break;				
			
			} // switch
			
		} // while
				
	} // main

} // class
