package p0627;

// 클래스를 상속받아 구현 extends
// 인터페이스를 상속받아 구현 implements


//public class Fighter implements Fightable{ // 둘 중에 하나만 구현할 경우 아래와 같이 abstract 붙여주어야 함. 
//abstract public class Fighter implements Fightable{
abstract public class Fighter extends Unit implements Fightable{ // 상속, 구현 동시에 가능 

	Fighter(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int x, int y) {	}

	@Override
//	public void attack(Unit u) {	}
	abstract public void attack(Unit u); // 구현 안하고 싶을 때, 선언문에도 abstract 추가

	
} //class
