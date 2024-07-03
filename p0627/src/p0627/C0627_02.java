package p0627;

public class C0627_02 {

	public static void main(String[] args) {
		// 예외처리
		
		// 컴파일에러 : 처리 도중 발생하는 에러, 컴파일할 때 발생하는 에러
//		System.out.prinln("안녕하세요");
		System.out.println("안녕하세요");
		
		// 런타임 에러 : 런 되는 중간에 발생하는 에러, 실행할 때 발생하는 에러
		//            예외와 에러 2종류가 있어 
		// 에러는 어쩔 수 없지만 예외는 처리해야 한다. 
		// - 에러(error) : 프로그램 코드에 의해서 수습됟ㄹ 수 없는 심각한 오류
		// - 예외(exception) : 프로그램 코드에 의해서 수습될 수 없는 다소 미약한 오류
		//                    예외처리는 try-catch 사용, println, DB에 사용 
		//                     
		
		
		int[] arr = {1,2,3,4};
		for (int i=0; i<4; i++) {
//		for (int i=0; i<5; i++) {
			System.out.println(arr[i]);
		} // for
		
		
		
		
		

	} // main

} // class
