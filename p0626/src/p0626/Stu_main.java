package p0626;

import java.util.ArrayList;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Scanner;

public class Stu_main {

	public static void main(String[] args) {
		// 
		
		// 변수 선언 			
		ArrayList list = new ArrayList();
		list.add(new Students("홍길동", 100, 100, 99));
		list.add(new Students("임꺽정", 89, 99, 91));
		list.add(new Students("이몽룡", 80, 90, 99));
		list.add(new Students("성춘향", 100, 99, 99));
		list.add(new Students("김첨지", 50, 80, 71));
		list.add(new Students("김삿갓", 90, 99, 98));
		list.add(new Students("심청이", 80, 85, 99));
		Stu_process sp = new Stu_process();
		
			
		// 전체 화면 출력
		while (true) { 
			int choice = sp.screen(list); // 화면부분 메소드 호출
			
			switch(choice) {
			case 1: // 학생입력부분
				sp.stu_input(list);
				break;
			
			case 2 : // 출력부분
				sp.stu_print(list);
				break;
				
			case 3: // 학생성적수정
				sp.stu_update(list);
				break;
				
			case 4: // 학생삭제
				sp.stu_delete(list);
				break;
				
			case 5: // 학생검색
				sp.stu_search(list);
				break;
				
			case 6: // 등수처리
				sp.stu_rank(list);
				break;
			}
			
		}
	}

}
