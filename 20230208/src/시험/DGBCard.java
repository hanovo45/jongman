package 시험;

public class DGBCard extends Card{
	
	String company = "대구은행";
	String cardStaff;
	
	public DGBCard(String cardStaff,String cardNo, int validDate, int CVC) {
		super(cardNo, validDate, CVC);
		this.cardStaff = cardStaff;
//		this.company = "대구은행";
	}
	
	// 메소드 시그니처 오버라이딩
	@Override
	public void showCardInfo() {
		super.showCardInfo();
//		System.out.println("카드정보 (Card NO : " + cardNo + " , 유효기간 : " + validDate + " CVC : " + CVC);
//		showinfo 써야함 상속되니깐
		System.out.println("담당직원 - " + cardStaff + " , " + company);
		
	}

	
	
	
	
}
