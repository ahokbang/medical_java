package p0618;

public class C0618_04 {

	public static void main(String[] args) {
		// 구구단 출력
		
		// 반복문(while, for)에는 이름 부여 가능. ==> 내가 원하는 위치에서 멈출 수 있어. 조건문은 안돼. 반복문에만 가능
		loop1 : for (int i=2;i<=9;i++) {
			System.out.printf("[ %d 단 ]\n", i);			
			for (int j=1;j<=9;j++) {
				System.out.printf("%d x %d = %d \n", i, j, i*j);
				// 4*4까지만 출력
				// if (i==4 && j==4) break; // 4단만 멈추고 5단부터는 계속 가. for j에 대해서만 break.
				if (i==4 && j==4) break loop1; // for i에 loop1이라고 이름을 달고 break에 loop를 명시해주면 for i에서도 break
			} // j for
		} // i for

	} // main
 
} // class
