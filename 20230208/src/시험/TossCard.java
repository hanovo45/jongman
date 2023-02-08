package 시험;

public class TossCard extends Card{


	String company = "toss";
	String cardStaff;
	
	public TossCard(String cardStaff,String cardNo, int validDate, int CVC) {
		super(cardNo, validDate, CVC);
		this.cardStaff = cardStaff;
//		this.company = "toss";
	}
	
	
	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card No " + cardNo);
		System.out.println("담당직원 - " + cardStaff + " , " + company);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
