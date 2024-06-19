package p0619;

public class C0619_02 {

	public static void main(String[] args) {
		// C0619_01에서 한 것 혼자 해보기.
		// 1~45까지 로또번호 생성해서 랜덤으로 섞은 후 출력하시오.
		
		int[][] arr = new int [5][5];
		// 1~25까지 번호를 넣고, 랜덤으로 섞은 후 출력하시오.
		// [5,5] 형태로 출력
// 2차원 배열 섞기
		// 1. 입력하기
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				arr[i][j] = 5*i+(j+1);
			}
		}
		// 2. 랜덤으로 섞은 값 넣기
		int no = 0;
		int no2 = 0;
		int t_value = 0;
		for (int i=0; i<500; i++) {
			no = (int)(Math.random()*5);
			no2 = (int)(Math.random()*5);			
			t_value = arr[0][0];
			arr[0][0] = arr[no][no2];
			arr[no][no2] = t_value;				
			}
		// 3. 출력
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println();
		}
		
// ball 사용한 방법 **************************** ball 확인 필요		
//		// 1. 입력하기
//		for (int i=0;i<5;i++) {
//			for (int j=0;j<5;j++) {
//				arr[i][j] = ball[5*i+j)];
//			}
//		}
//		for (int i=0;i<5;i++) {
//			for (int j=0;j<5;j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//		}
// ------------------------------------------------------------
		
		
//		// 1. ball 생성 : 1~45 번호 
//		int[] ball = new int[45];
//		
//		for(int i=0;i<45;i++) {
//			ball[i] = i+1; 
//		}
//		
//		// 2. ball 랜덤으로 섞기
//		int no = 0;
//		int t_value = 0;
//		for (int i=0;i<500;i++) {
//			no = (int)(Math.random()*45);
//			t_value = ball[0];
//			ball[0] = ball[no];
//			ball[no] = t_value;
//		} //for 
//		
//		// 3. ball 출력
//		for(int i=0;i<45;i++) {
//			System.out.print(ball[i]+" ");
//		} //for
		
		
		
	} // main

} // class
