package p0624;

public class C0624_09 {

	public static void main(String[] args) {
		// 생성자(= 초기화 메서드)
		
		// 객체선언 후 white, auto, 4
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c = new Car("white", "auto", 4); // 위의 4줄을 이 한줄로 쓸 수 있음.
		System.out.println("c.color : "+c.color);
		
//		System.out.println("c color : "+c1.color);
//		System.out.println("c gearType : "+c1.gearType);
//		System.out.println("c door : "+c1.door);
		System.out.println();
		
		// 객체선언 후 red, auto, 5
		Car c2 = new Car();
		c2.color = "red";
		c2.gearType = "auto";
		c2.door = 5;
		
		Car cc = new Car("red", "auto", 5);
		
//		System.out.println("c2 color : "+c2.color);
//		System.out.println("c2 gearType : "+c2.gearType);
//		System.out.println("c2 door : "+c2.door);
		System.out.println();
		
		// 객체선언 후 blue, auto, 3
		Car c3 = new Car();
		c3.color = "blue";
		c3.gearType = "auto";
		c3.door = 3;
		
		Car ccc = new Car("blue", "auto", 3);
		
//		System.out.println("c3 color : "+c3.color);
//		System.out.println("c3 gearType : "+c3.gearType);
//		System.out.println("c3 door : "+c3.door);
		System.out.println();

		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		Data d = new Data(); // 에러없음
////		Data2 d2 = new Data2(); // 에러		
//		Data2 d2 = new Data2(); // 에러 없음. Data2.java에 생성자 생성 후 에러 발생하지 않음.		
//		Data2 d3 = new Data2(10); // 에러없음

		
	}

}
