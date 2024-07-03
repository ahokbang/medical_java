package p0626;

import java.util.ArrayList;

public class Buyer {
	// 캡슐화
	
	String userId;
	String userPw;
	int money;
	int bonusPoint;
//	Product[]cart = new Product[10]; // 인스턴스 변수
//	int count; // 인스턴스 변수, ArrayList는 몇개 들어가있는지 알려주므로 필요 없음.
	ArrayList list = new ArrayList(); // 객체배열 선언
	
	Buyer() {}	
	Buyer(String uesrId, String userPw, int money, int bonusPoint) {
		this.userId = userId;
		this.userPw = userPw;
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String UserId) {
		this.userId = userId;
	}
	
	// 구매 메소드 - 부모의 참조변수
	void buy(Product p) {
		if(money<p.price) {
			System.out.printf("잔액이 부족합니다.(보유금액 : %d 만원) \n", money);
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;	
		list.add(p); // 객체배열 추가 : add()
//		cart[count++] = p; // 구매물품을 저장
		System.out.printf("%s 제품을 구매했습니다.(보유금액 : %d 만원)\n", p.pName, money);
	}
	
	void summary() {
		System.out.println("[ 구매내역 ]");
		int sum = 0;
		for(int i=0;i<5;i++) {
			Product p = (Product)list.get(i); // 형변환
			System.out.println(p.pName); // 주소값 출력
			sum += p.price;
		}
		System.out.println("총 구매 개수 : "+list.size()+"개");
		System.out.println("총 구매금액 : "+sum+" 만원");		
	}
//	void buy(Refrigerator r) { // 상속 안 받은 경우에는 메소드 만들어주어야 해.
//		money -= r.price;
//		bonusPoint += r.bonusPoint;	
//	} // 주석처리해도 C0626_02에서 에러 발생하지 않음.
	
	
	
	
	// 구매메소드
//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	void buy(Computer  c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;	
//	}
//	void buy(Audio a) {
//		money -= a.price;
//		bonusPoint += a.bonusPoint;	
//	}
	
	
}
