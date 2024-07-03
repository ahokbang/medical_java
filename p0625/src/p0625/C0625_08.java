package p0625;

public class C0625_08 {

	public static void main(String[] args) {
		// 
		
		Buyer b = new Buyer();
		System.out.println("현재 보유 금액 : "+b.money);
		System.out.println("현재 보너스 포인트 : "+b.bonusPoint);
		
		Tv tv = new Tv();
		b.buy(tv);
		System.out.println("TV 구매");
		b.buy(tv);
		System.out.println("TV 구매");
		b.buy(tv);
		System.out.println("TV 구매");
		Computer c = new Computer();
		b.buy(c);
		System.out.println("컴퓨터 구매");
		b.buy(c);
		System.out.println("컴퓨터 구매");
		b.buy(new Audio());
		System.out.println("오디오 구매");
		b.buy(new Audio());
		System.out.println("오디오 구매");
		b.buy(new Audio());
		System.out.println("오디오 구매");
		b.buy(new Audio());
		System.out.println("오디오 구매");
		b.buy(new Audio());
		System.out.println("오디오 구매");
		
		
		System.out.println("현재 보유 금액 : "+b.money);
		System.out.println("현재 보너스 포인트 : "+b.bonusPoint);
		

	}

}
