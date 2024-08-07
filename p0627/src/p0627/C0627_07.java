package p0627;

public class C0627_07 {
// 

	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.id = 801011011111L;
		Person p1 = new Person(8801011011111L); // 위와 같이 넣으면 안돼
		Person p2 = new Person(8801011011111L);
		
		System.out.println("p1 : "+p1);
		System.out.println("p2 : "+p2);
		
		
		if (p1.equals(p2)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");			
		} // if-else
		
		
		Students s = new Students("홍길동", 100, 100, 99);
		System.out.println(s); 
		
		String str = "네이버 핵심 경영진이 인공지능(AI) 반도체 시장을 주도하고 있는 엔비디아 젠슨 황 최고경영자(CEO)와 만났다. 미국 캘리포니아 엔비디아 본사에서 만난 양사는 ‘소버린(Sovereign·주권) AI’ 문제에 대해 논의했다.\r\n"
				+ "\r\n"
				+ "무슨 일이야\r\n"
				+ "27일 네이버 공식 인스타그램 계정에 따르면, 네이버 창업자인 이해진 글로벌투자책임자(GIO)는 25일(현지시간) 미국 엔비디아 본사에서 황 CEO를 만났다. 최수연 대표, 네이버클라우드 김유원 대표 등 팀네이버 주요 경영진이 함께 자리했다.\r\n"
				+ "\r\n"
				+ "네이버는 “각 지역의 문화와 가치를 반영한 다양한 소버린 AI의 중요성과 AI 모델 구축 방안에 대해 논의했다” 밝혔다. 네이버 관계자는 “이번 미팅은 국가별 AI 모델 구축을 위한 하드웨어 인프라를 제공하는 엔비디아와 초거대 AI 모델을 ‘토대부터(From Scratch)’ 개발할 수 있는 원천기술을 보유한 네이버 AI 기술력과의 시너지를 모색하기 위해 이뤄졌다”고 설명했다.\r\n"
				+ "\r\n"
				+ "이게 왜 중요해\r\n"
				+ "‘소버린 AI’는 네이버 AI 산업의 큰 방향성이다. 네이버는 세계 각 지역 문화와 언어에 최적화한 AI 모델을 자체 거대언어모델(LLM) 기술력으로 구축하고, 이를 기반으로 다양한 솔루션을 제공한다는 전략을 갖고 있다.\r\n"
				+ "\r\n"
				+ "2022년 말부터는 삼성전자와 ‘마하’ 시리즈 등을 개발하며 AI 반도체 솔루션을 자체 개발에 힘쓰고 있다. 지난 4월에는 인텔과 AI 가속기 ‘가우디’ 생태계 구축 공동 연구를 하며 협업을 시작했다. 현재 인텔과 네이버는 ‘가우디2’를 내부 클라우드에 적용해 대규모 언어모델(LLM)을 개발 중이다. 업계에서는 AI 반도체 시장을 사실상 독점하고 있는 엔비디아로부터의 종속에서 벗어나기 위한 협업으로 보고 있다.\r\n"
				+ "\r\n"
				+ "하지만 소버린 AI 구축은 고성능 그래픽처리장치(GPU)를 보유한 데이터센터와 이를 구동할 수 있는 전력망, 데이터 수급을 위한 파이프라인과 생태계, 실제 서비스에 적용하는 서빙 과정까지 갖춰야 하는 대규모 프로젝트다. 하이퍼클로바X 고도화, 멀티모달 AI 등 위해선 당장 대체하기 어려운 GPU 확보 등 긴밀한 파트너십이 필요한 상황인 것으로 풀이된다.\r\n"
				+ "\r\n"
				+ "네이버는 “양사가 앞으로 긴밀한 협업을 통해 각 지역의 문화와 가치를 존중하는 다양한 AI 모델들이 나올 수 있도록 함께 노력할 예정”이라고 강조했다.";
		System.out.println(str.hashCode());
		str = "네이버 핵심 경영진이 인공지능(AI) 반도체 시장을 주도하고 있는 엔비디아 젠슨 황 최고경영자(CEO)와 만났다. 미국 캘리포니아 엔비디아 본사에서 만난 양사는 ‘소버린(Sovereign·주권) AI’ 문제에 대해 논의했다.\r\n"
				+ "\r\n"
				+ "무슨 일이야\r\n"
				+ "27일 네이버 공식 인스타그램 계정에 따르면, 네이버 창업자인 이해진 글로벌투자책임자(GIO)는 25일(현지시간) 미국 엔비디아 본사에서 황 CEO를 만났다. 최수연 대표, 네이버클라우드 김유원 대표 등 팀네이버 주요 경영진이 함께 자리했다.\r\n"
				+ "\r\n"
				+ "네이버는 “각 지역의 문화와 가치를 반영한 다양한 소버린 AI의 중요성과 AI 모델 구축 방안에 대해 논의했다” 밝혔다. 네이버 관계자는 “이번 미팅은 국가별 AI 모델 구축을 위한 하드웨어 인프라를 제공하는 엔비디아와 초거대 AI 모델을 ‘토대부터(From Scratch)’ 개발할 수 있는 원천기술을 보유한 네이버 AI 기술력과의 시너지를 모색하기 위해 이뤄졌다”고 설명했다.\r\n"
				+ "\r\n"
				+ "이게 왜 중요해\r\n"
				+ "‘소버린 AI’는 네이버 AI 산업의 큰 방향성이다. 네이버는 세계 각 지역 문화와 언어에 최적화한 AI 모델을 자체 거대언어모델(LLM) 기술력으로 구축하고, 이를 기반으로 다양한 솔루션을 제공한다는 전략을 갖고 있다.\r\n"
				+ "\r\n"
				+ "2022년 말부터는 삼성전자와 ‘마하’ 시리즈 등을 개발하며 AI 반도체 솔루션을 자체 개발에 힘쓰고 있다. 지난 4월에는 인텔과 AI 가속기 ‘가우디’ 생태계 구축 공동 연구를 하며 협업을 시작했다. 현재 인텔과 네이버는 ‘가우디2’를 내부 클라우드에 적용해 대규모 언어모델(LLM)을 개발 중이다. 업계에서는 AI 반도체 시장을 사실상 독점하고 있는 엔비디아로부터의 종속에서 벗어나기 위한 협업으로 보고 있다.\r\n"
				+ "\r\n"
				+ "하지만 소버린 AI 구축은 고성능 그래픽처리장치(GPU)를 보유한 데이터센터와 이를 구동할 수 있는 전력망, 데이터 수급을 위한 파이프라인과 생태계, 실제 서비스에 적용하는 서빙 과정까지 갖춰야 하는 대규모 프로젝트다. 하이퍼클로바X 고도화, 멀티모달 AI 등 위해선 당장 대체하기 어려운 GPU 확보 등 긴밀한 파트너십이 필요한 상황인 것으로 풀이된다.\r\n"
				+ "\r\n"
				+ "네이버는 “양사가 앞으로 긴밀한 협업을 통해 각 지역의 문화와 가치를 존중하는 다양한 AI 모델들이 나올 수 있도록 함께 노력할 예정”이라고 강조했다.";
		System.out.println(str.hashCode());
		
	} // void

} // class
