package p0619;

import java.util.Arrays;
import java.util.Scanner;

public class C0619_01 {
	
	public static void main(String[] args) {
		// 로또 프로그램 구현
		// 1~45개 배열에서 랜덤으로 섞어, 그 가운데 6개를 가져오면 로또번호
		// 내가 입력한 입력번호 6개
		// 당첨번호 개수 담을 수 있는 배열, 카운트할 수 있는 변수
		// 모든 배열(당첨번호 개수, 맞춘 개수)을 출력
		
		Scanner scan = new Scanner(System.in);
		
		// 1. ball 배열 생성 : 1~45까지 번호 생성
		int[] ball = new int [45]; // 0~44개의 저장공간 생성, ball에는 45개의 주소값이 저장되어 있어서 출력하면 주소값이 출력돼.
		for (int i=0;i<45;i++) {
			ball[i] = (i+1); // 1~45
		} //for
		
		
		// 2. ball 배열 섞기
		int no = 0; 	  // ball 배열을 섞기 위해 0번째 배열과 바꾸 배열번호
		int t_value = 0;  // 임시 저장 공간 
		for (int i=0;i<500;i++) {
			no = (int)(Math.random()*45); // 0~44, 랜덤번호 생성
			t_value = ball[0]; // 먼저 ball[0]에 있는 값을 t_value로 이동. ball[0]은 빈 상태
			ball[0] = ball[no]; // ball의 랜덤(no번째)값(ball[no])에 있는 값을 ball의 0번째 배열로 이동
			ball[no] = t_value; // t_value에 있던 ball[0]값을 ball[no]에 넣어주고 이를 500번 반복해서 랜덤으로 숫자를 섞어줌.
		}
		
		// 3. my_ball 입력 : 6개의 로또번호 입력
		int[] my_ball = new int[6];
		for(int i=0;i<6;i++) {
			System.out.printf("%d번째 로또번호를 입력하세요. >> ", i+1);
			my_ball[i] = scan.nextInt();
		}
		
		System.out.println("[ 로또번호 현황 ]");
		System.out.println("----------------------------");
		
		// 4. my_ball 출력 : 6개 로또번호 출력
		System.out.print("입력번호 : ");
		for (int i=0;i<6;i++) {
			System.out.printf("%4d",my_ball[i]); // 1~45 출력
		} // for 
		System.out.println();
		
		
		// 5. ball 배열 출력 : 로또당첨번호 6개 출력
		System.out.print("로또번호 : ");
		for (int i=0;i<6;i++) {
			System.out.printf("%4d",ball[i]); // 1~45 출력
		} // for 
		System.out.println();
		
		// 6. 당첨 개수 출력
		int[] lotto = new int[6]; // 7번 내용 추가 
		int count = 0;
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				if (ball[i]==my_ball[j]) {	// my_ball[i]==ball[j] 이렇게 하면 오류 나.
					lotto[count] = ball[i]; // 7번 내용 추가
					count ++;
					break;
				} // if
			} // itn j for
		} // int i for
		System.out.println("당첨 개수 : "+count+"개");
		
		// 7. 당첨번호 출력 : 6번에 추가
		System.out.print("당첨 번호 : ");
		for(int i=0; i<count; i++) {
			System.out.printf("%4d", lotto[i]);
		}
		
		if (count==0) {
			System.out.println("당첨된 번호가 없습니다.");
		}
		System.out.println();
	} //main
	
} //class

// --------------------------------------------------------------------------------------
// 2차원배열에 값 넣기 [[1,2,3,4,5],[6,7,8,9,10],...,[21,22,23,24,25]]
// 입력
//		int[][] arr = new int[5][5];
//		for (int i=0;i<5;i++) {
//			for (int j=0;j<5;j++) {
//				arr[i][j] = 5*i+(j+1);
//			}
//		}
//		// 출력
//		for (int i=0;i<5;i++) {
//			for (int j=0;j<5;j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}

// 설명
//		System.out.println(ball); // 주소값 출력
//		ball[0] = 1;
//		System.out.println(ball[0]); // 1 출력