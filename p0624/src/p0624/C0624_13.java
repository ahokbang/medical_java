package p0624;

import java.text.SimpleDateFormat;
import java.util.Date;

public class C0624_13 {

	public static void main(String[] args) {
		// 학생성적프로그램-메소드 혼자 해보기
		
		// 변수선언
		Stu_score[] sc = new Stu_score[10]; // 학생성적객체배열 선언
		Stu_pro sp = new Stu_pro();
		int s_count = 0; // 입력된 학생 수

		
		// 전체 화면 출력
		while (true) {
			
			// 화면부분
			int choice = sp.screen(); // 화면부분 메소드 호출
			
			switch(choice) {
			case 1:
				
				break;
				
			} //switch
			
		} // while
	} // main 
		
} // class
