package p0625;

public class Buyer {
	
	int money = 10000000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.name+"제품을 구매했습니다.");
	}
	
//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	
//	void but(Computer c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;	
//	}
//	
//	void but(Audio a) {
//		money -= a.price;
//		bonusPoint += a.bonusPoint;	
//	}
	
	
}
