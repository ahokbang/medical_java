package p0619;

public class C0619_05 {

	public static void main(String[] args) {
		// [5,5] 배열을 생성해서 1~25의 숫자를 입력하고, 램덤으로 섞은 후 출력하시오.
		int[][] arr = new int[5][5];
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				arr[i][j] = 5*i+(j+1);
			}
		}

		int no = 0;
		int no2 = 0;
		int t_value;
		for (int i=0; i<500; i++) {
			no = (int)(Math.random()*5);
			no2 = (int)(Math.random()*5);
			t_value = arr[0][0];
			arr[0][0] = arr[no][no2];
			arr[no][no2] = t_value;
		}
		
		for (int i=0;i<5;i++) {
			for (int j=0; j<5; j++) {
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println();
		}
	}

}
