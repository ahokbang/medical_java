package p0627;

public class C0627_04 {

	public static void main(String[] args) {
		// try-catch, try-catch-finally
		// finally : 예외의 발생여부에 관계없이 항상 수행
		
		try {
//			Exception e = new Exception("고의로 발생시켰음");
//			throw e;								
			
			System.out.println(0/0);
			
		} catch(Exception e){ 
			System.out.println("에러메시지 : "+e.getMessage());
			e.printStackTrace();
		} // try-catch
		
		System.out.println("프로그램을 종료합니다. ");
	
	} // main
	
} // class
