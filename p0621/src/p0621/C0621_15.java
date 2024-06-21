package p0621;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C0621_15 {

	public static void main(String[] args) {
		// 
Scanner scan = new Scanner(System.in);
		
		// 변수 선언 
		Stu_pro sp = new Stu_pro();
		Stu_score[] sc = new Stu_score[10]; // 학생성적객체배열 선언
		String[] title = {"학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수"};
		int s_count = 0; // 입력된 학생 수

		// 전체 화면 출력
		while (true) {
			// 화면 출력 부분
			int choice = sp.screen();
					
			switch(choice) {
			case 1: // 학생성적입력
				sp.stu_input(sc, s_count);
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
	}

}
