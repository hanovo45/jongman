package 시험;

public class CardPayment implements Payment{
	
	// 필드
	double cardRatio;
	
	// 생성자를 통한 필드 초기화
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}

	// 메소드 오버라이딩
	@Override
	public int online(int price) {
		return(int)(price - price * (Payment.ONLINE_PAYMENT_RATIO + cardRatio));
	}

	@Override
	public int offline(int price) {
		return(int)(price - price * (Payment.OFFLINE_PAYMENT_RATIO + cardRatio));
	}

	@Override
	public void showInfo() {
		System.out.println("*** 현금으로 결제 시 할인정보");
		System.out.println(ONLINE_PAYMENT_RATIO + cardRatio); // 온라인결제할인
		System.out.println(OFFLINE_PAYMENT_RATIO + cardRatio); // 오프라인결제할인
	}
	
	
	
	
	
	
}
