package p0627;

public class C0627_01 {

	public static void main(String[] args) {
		// 

		Marine m = new Marine(); // 보병 1명 생성
		System.out.println("Marine 현재 체력 : "+m.hitPoint);
		Tank t = new Tank();
		System.out.println("Tank 현재 체력 : "+t.hitPoint);
		DropShip d = new DropShip();
		System.out.println("DropShip 현재 체력 : "+d.hitPoint);
		
		System.out.println("Tank가 포탄을 맞았습니다.");
		t.hitPoint -= 10;
		System.out.println("Tank가 포탄을 맞았습니다.");
		t.hitPoint -= 10;
		System.out.println("Tank가 포탄을 맞았습니다.");
		t.hitPoint -= 10;		
		System.out.println("Tank 현재 체력 : "+t.hitPoint);
		
		System.out.println("DropShip이 포탄을 맞았습니다.");
		hpDown(d);
		System.out.println("DropShip이 포탄을 맞았습니다.");
		hpDown(d);
		System.out.println("DropShip 현재 체력 : "+d.hitPoint);
		
		System.out.println("Marine이 포탄을 맞았습니다.");
		hpDown(m);
		System.out.println("Marine 현재 체력 : "+d.hitPoint);
		
		// SCV : 기계를 수리할 수 있는 능력이 있음.
		Scv s = new Scv(); // SCV 1대 생성
		System.out.println("SCV 현재 체력 : "+s.hitPoint);
		
		System.out.println("-------------------------");
		System.out.println("Tank 현재 체력 : "+t.hitPoint);
		System.out.println("SCV가 Tank를 수리합니다.");
		s.repair(t);
		System.out.println("SCV가 Tank를 수리하였습니다.");
		System.out.println("Tank 현재 체력 : "+t.hitPoint);
		
		// Marine은 사람이므로 SCV가 repair 할 수 없음 
//		System.out.println("Marine 현재 체력 : "+m.hitPoint);
//		System.out.println("SCV가 Marine을 수리합니다.");
//		s.repair(m); 
//		System.out.println("SCV가 Marine을 수리하였습니다.");
//		System.out.println("Marine 현재 체력 : "+m.hitPoint);
		
		
	} // main
		
	static void hpDown(Unit u) {
		u.hitPoint -= 10;
		
	} // hpDown
		
		
//		Marine m = new Marine(); // 객체선언 가능
////		Unit u = new Unit(); // 객체선언 불가
//
//	
//	int add(int x, int y) {
//		int result = x + y;
//		return result;
//	} // add
//	
//	
//	Marine move(int x, int y) {
//		Marine m = new Marine();
//		
//		return m; // return 타입을 꼭 맞춰줘야 해.
//	} // move
//	
//	Unit start(int x, int y) { 
//		Marine m = new Marine();
//		return m; // Marine은 Unit을 상속 받았기 때문에 return m 가능. 
//	}
//	
	
} // class

