package 시험;

public class 실행 {
	public static void main(String[] args) {
	
		// 문제 1
		TossCard toss = new TossCard("신빛용", "5432-4567-9534-3657", 20251203, 253);
		DGBCard dgb = new DGBCard("신빛용", "5432-4567-9534-3657", 20251203, 253);

		toss.showCardInfo();
		
		System.out.println();
		
		dgb.showCardInfo();

		int price = 10000;
		
		// 문제2
		
		Payment card = new CardPayment(0.08);
		card.showInfo();
		System.out.println("온라인 결제 금액 : " + card.online(price));
		System.out.println("오프라인 결제 금액 : " + card.offline(price));
		
		
		
	}
}
 