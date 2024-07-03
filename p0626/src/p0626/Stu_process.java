
package p0626;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_process {

	Scanner scan = new Scanner(System.in);
	String[] title = {"학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수"};
	String stuNo, name;
	int kor, eng, math, total, rank;
	double avg;
	int choice;
	
	// 화면부분 메소드
	int screen(ArrayList list) {
		System.out.println("   [ 학생성적 프로그램 ]");
		System.out.println("현재 입력된 학생 수 : "+list.size()+" 명");
		System.out.println("----------------------");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 학생 삭제");
		System.out.println("5. 학생 검색");
		System.out.println("6. 등수 처리");
		System.out.println("7. 학생 성적 정렬");
		System.out.println("0. 프로그램 종료");
		System.out.println("----------------------");
		System.out.println("원하는 번호를 입력하세요. >> ");
		choice = scan.nextInt(); 
		scan.nextLine(); // enter키 때문
		

		return choice;
	} // screen
	
	// 학생입력부분 메소드
	void stu_input(ArrayList list) {
		while (true) {
			// 이름입력
			System.out.printf("%d번째 학생이름을 입력하세요(0. 이전). >> \n", list.size()+1);
			name = scan.nextLine();
			
			if (name.equals("0")) {
				System.out.println("이전 페이지로 이동합니다.");
				System.out.println();
				break;
			}
			System.out.printf("%s 점수를 입력하세요. >> \n", title[2]);
			kor = scan.nextInt();
			System.out.printf("%s 점수를 입력하세요. >> \n", title[3]);
			eng = scan.nextInt();
//			System.out.println("수학 점수를 입력하세요.");
			System.out.printf("%s 점수를 입력하세요. >> \n", title[4]);
			math = scan.nextInt();
			scan.nextLine();
			
			// ArrayList에 저장
			list.add(new Students(name, kor, eng, math));
			
			
			// 입력완료
			System.out.printf("%s 학생 점수를 저장합니다.\n", name);
			System.out.println();	
			
		} // while
	} // stu_input
	
	
	// 학생성적출력 메소드
	void stu_print(ArrayList list) {
		System.out.println("                   [ 학생 성적 출력 ]");
		for (int i=0; i<title.length;i++) {
			System.out.printf("%s\t",title[i]);				
		} // for
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		if(list.size()==0) {
			System.out.println("< 출력할 학생성적이 없습니다. >");
			System.out.println();
			return;
		} 
		
		for (int i=0; i<list.size(); i++) {
			Students s = (Students)list.get(i);
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n", 
					s.stuNo, s.name, s.kor,s.eng, s.math,s.total, s.avg, s.rank); 
		}
		System.out.println();
	} // stu_print
	
	
	// 학생성적수정 메서드
	void stu_update(ArrayList list) {
		// 검색부분 : 메소드로 분리
		int temp_no = stu_subSearch(list);
		
		// 찾은 학생 성적 수정
		if (temp_no == -1) {// 찾는 학생이 없을 경우
			System.out.println("찾는 학생이 없습니다. 다시 입력해주세요.");
			System.out.println();
		}
		
		// 검색한 학생의 위치
		Students s = (Students)list.get(temp_no);
		
		// 학생 검색 후 진행
		System.out.printf("                      [ %s 성적수정 ] \n", s.name);
		System.out.println("----------------------");
		System.out.println("1. 국어");				
		System.out.println("2. 영어");
		System.out.println("3. 수학");
		System.out.println("----------------------");
		System.out.println("원하는 번호를 입력하세요. >> ");
		choice = scan.nextInt();
		
		
		switch (choice) {
		case 1: // 국어점수 수정
			subject_update(s, s.kor, choice);
			break;
		
		case 2: // 영어점수 수정
			 subject_update(s, s.eng, choice);
			break;
					
		case 3: // 수학점수 수정 
			subject_update(s, s.math, choice);		
			break;
		
		} // switch		
		
	} // stu_update
	
	
	// 학생 삭제 메소드
	void stu_delete(ArrayList list) {
		// 검색부분 메소드 분리
		int temp_no = stu_subSearch(list);
		
		// 찾은 학생 삭제
		if (temp_no == -1) {// 찾는 학생이 없을 경우
			System.out.println("찾는 학생이 없습니다. 다시 입력해주세요.");
			System.out.println();
			return;
		} // if
		
		// 삭제코드 추가하면 됨
//		String name = ((Students)list.get(temp_no)).name;
		Students s = (Students)list.get(temp_no);
		
//		System.out.printf("%s 학생을 삭제하시겠습니까? (1. 삭제, 0. 취소) \n", name);
		System.out.printf("%s 학생을 삭제하시겠습니까? (1. 삭제, 0. 취소) \n", s.name);
		choice = scan.nextInt();
			
		if (choice==0) {
			System.out.println("삭제가 취소되었습니다.");
			System.out.println();
			return;
		} else {
			System.out.printf("%s 학생 성적을 삭제했습니다.\n", s.name);
			System.out.println();
			list.remove(temp_no);
		} //else				
	} // stu_delete
	
	// 학생검색 메소드
	void stu_search(ArrayList list) {
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
		ArrayList searchList = new ArrayList();
		String search_name = "";
		int search_num = 0;
		double search_avg = 0;		
		
		switch (choice) {
		case 1: // 학생 이름 검색
//			System.out.println("[ 학생 이름 검색 ]");
			System.out.println("검색하고자 하는 학생의 이름을 입력하세요. >> ");
			search_name = scan.nextLine(); 			
			
			for(int i=0; i<list.size();i++) {
				Students s = (Students) list.get(i);
				if (s.name.contains(search_name)) {
					searchList.add(s);			
					}
			}						
			break;
			
		case 2: // 합계 점수 검색
			System.out.println("몇점 이상의 합계점수를 검색하시겠습니까? >> ");
			search_num = scan.nextInt(); 
						
			for(int i=0; i<list.size();i++) {
				Students s = (Students) list.get(i);
				if (s.total >= search_num) {
					searchList.add(s);					
				}
			}					
			break;
			
		case 3: // 평균 점수 검색
			System.out.println("몇점 이상의 평균점수를 검색하시겠습니까? >> ");
			search_avg = scan.nextDouble(); 
						
			for(int i=0; i<list.size();i++) {
				Students s = (Students) list.get(i);
				if (s.avg >= search_avg) {
					searchList.add(s);					
				}
			}
			break;		
			
		} // switch
		// 학생성적 출력 메소드 호출
		stu_print(searchList);
	} // stu_search
	
	
	// 등수처리 메소드
	void stu_rank(ArrayList list) {
		System.out.println(" [ 등수 처리 ] ");
		for(int i=0; i<list.size(); i++) {
			int count = 1; // 초기화;
			for (int j=0; j<list.size(); j++) {				
				Students s = (Students) list.get(i);
				Students s2 = (Students) list.get(j);
				if (s.total < s2.total) count++; 
				s.rank = count;
			} // for int j
		} // for int i
		
		System.out.println("등수처리가 완료되었습니다.");
		System.out.println();
		
	} // stu_rank
	

// -------------------------------------------------------------------------
	
	// 수정, 삭제 부분에서 검색부분 메소드
	int stu_subSearch(ArrayList list) {
		System.out.println("[ 학생 이름 검색 ]");
		System.out.println("찾고자 하는 학생의 이름을 입력하세요. >> ");
		String search = scan.nextLine();
		
		// 학생 검색
		int temp_no = -1; // 찾는 학생이 검색된 위치값
		for(int i=0;i<list.size();i++) {
		Students s = (Students) list.get(i);
			if (s.name.equals(search)) {
				temp_no = i; // 찾는 학생이 검색된 위치값
				System.out.printf("%s 학생이 검색되었습니다. \n", search);
				System.out.println();
				break;
			} // if
		} // for
		return temp_no;
		
	} // stu_subsearch
	
	
	// 과목별 수정 메소드
	void subject_update(Students s, int score, int choice) {
		System.out.printf(" [ %s 점수 수정 ]\n", title[choice+1]);
		System.out.printf("현재 %s 점수 : %d \n", title[choice+1], score);	
		System.out.println("---------------------------------");
		System.out.printf("수정할 %s 점수를 입력하세요. >> \n", title[choice+1]);			
		score = scan.nextInt();
		
		// 합계, 평균 변경
		if (choice == 1) s.kor = score;
		else if (choice == 2) s.eng = score;
		else s.math = score;
		
		s.total = s.kor+s.eng+s.math;
		s.avg = s.total/3.0;
		System.out.printf("수정된 %s 점수 : %d \n", title[choice+1],score);
		System.out.println();
		
	} // subject_update
	
	
	
	
} // class



