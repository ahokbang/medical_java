package p0625;

public class C0625_07 {

	public static void main(String[] args) {
		// 다형성
		
		Car c = new Car();
		Car c2 = null;
		Ambulance a = new Ambulance();
		Ambulance a2 = null;
		FireEngine f = new FireEngine();
		FireEngine f2= null;

		// 다형성 : 부모의 참조변수 자손의 객체를 다루는 것
		// 자손의 참조변수로 조상의 객체를 다루는 것(X)
		// 자손참조변소 = 조상의 객체
//		a2 = (Ambulance)c; // error
		
		c = a; // 부모의 참조변수에 자손객체를 넣어줌.
		if (c instanceof Ambulance) {
			System.out.println("가능합니다.");
			c=a;
		}
		if (a instanceof Car) {
			System.out.println("가능합니다.");
			c=a;
		}
		a2 = (Ambulance) c; 
		
		
		
//		c2 = a; // 업캐스팅
//		f2 = (FireEngine)c2; // 실행시키면 error
		
//		// 형변환 - 자손타입에서 조상타입 : 형변환타입 생략 가능
//		a.siren();
//		c2 = a; // Ambulance -> Car
//		c2.drive();
////		c2.siren(); // 부모의 참조변수로는 사용할 수 없음.
//		
//		a2 = (Ambulance) c2;
//		a2.siren();
//		
////		c2 = (Car)a;
//		
//		// Car에서는 변경될 수 있는게 여러가지(Ambulance, FireEngine)가 있으므로 타입을 정해야 함.
//		// 업캐스팅일때는 안 붙여도 되지만, 다운캐스팅일 때는 꼭 붙여야 해.
//		a2 = (Ambulance)c2; 
//		
		
	}

}
