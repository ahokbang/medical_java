package p0624;

public class Car {
	// this
	
	static int count = 0; 
	String serial_no;
	String color;
	String gearType;
	int door;
	// 초기화블럭 : 생성자 호출하기 전에 먼저 실행을 시켜줌. 
	{
		count += 1;
		this.serial_no = "HD"+String.format("%04d", count);
	}
	
	
	Car(){ 
		
	} // 기본 생성자
	
	Car(String color){
		this.color = color;
				
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
				
		
//		Car(String c, String g, int d){
//			color = c;
//			gearType = g;
//			door = d;			
	}
		
}
