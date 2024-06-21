package p0621;

import java.util.Arrays;

public class C0621_06 {

	public static void main(String[] args) {
		// 
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
				
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = null; // 공간이 없어		
		System.out.println(Arrays.toString(arr2));

		// 주소값
		arr2 = arr; // arr 공간 5이 생김, 참조형 변수
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println("-----------------------");
		
		arr2[0] = 1000;

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		

	}

}
