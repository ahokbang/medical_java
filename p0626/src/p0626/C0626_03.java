package p0626;

import java.util.ArrayList;
import java.util.Arrays;

public class C0626_03 {

	public static void main(String[] args) {
		// 
		
		ArrayList list = new ArrayList();
		list.add(new Students("홍길동", 100, 100, 99));
		list.add(new Students("이몽룡",89, 87, 90));
		list.add(new Students("김삿갓", 90, 90, 92));
		
		// 삭제
		list.remove(1);
		
		System.out.println("입력된 개수 : "+list.size());
		
		// 전체출력
		for (int i=0; i<list.size();i++) {
//			list.get(i); // get : objet type --> 강제형변환 필요
			Students s = (Students) list.get(i); // get : objet type --> 강제형변환 필요
			System.out.printf("%s, %s, %d, %d, %d, %d, %.2f, %d \n",
					s.stuNo, s.name, s.kor, s.eng, s.math, s.total, s.avg, s.rank);
		}
		
		
		
		int[] arr = {1,2,3,4,5};
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println("배열 개수 : "+arr.length);
//		int[] arr2 = {1,2,4,5};
//		arr[2] = 0;
//		
//		System.out.println(Arrays.toString(arr));

	}

}
