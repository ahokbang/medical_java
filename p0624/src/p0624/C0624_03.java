package p0624;

public class C0624_03 {

	public static void main(String[] args) {
		// 참조형 매개변수
		
		Data d = new Data();
		d.x = 10; 
		System.out.println("d.x : "+d.x);

//		for (int i=0; i<10; i++) {			
//		} // for(1)
//		
//		for (int i=5; i<20; i++) {			
//		} // for(2)
		
		
		change(d); // change 메소드에 값이 반영 돼
		System.out.println("d.x : "+d.x);
		
	} // main
	
	static void change(Data d) { // for(1)과 for(2)의 i가 다르듯이 main method에 있는 d와 달라
		d.x = 1000; // 주소값이 같기 때문에 main 메소드에 있는 d.x가 1000이 돼
		
		System.out.println("change x : "+d.x);
	}

}
