package p0627;

public class C0627_05 {
	// 예외던지기 throws
	
	public static void main(String[] args) throws Exception {
		method1(); // 1			
//		try {
//			method1(); // 1			
//		} catch(Exception e) {
//			e.printStackTrace();
//		} // try-catch
		
		System.out.println("프로그램을 종료합니다.");
	} // main
	
	static void method1() throws Exception{
		method2(); // 2
	} // method1
	
	static void method2() throws Exception { 
//			throw new Exception(); // 강제로 예외처리
//		try { // 3			
//			throw new Exception(); // 강제로 예외처리
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
	} // method2
	
} // class
