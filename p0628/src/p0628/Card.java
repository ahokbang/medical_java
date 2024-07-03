package p0628;

public class Card {
	
//	enum Kind{ SPADE, DIAMOND, HEART, CLOVER }
	
	// private : 데이터 읽을 수 없음
	private int number;
	private String kind;
//	Kind kind;
	
	Card(){}
	Card(int number, String kind){
//	Card(int number, String kind){
		this.number = number;
		this.kind = kind;
	} // Card
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind){
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		return String.format("%d, %s", number, kind);
	}
}
