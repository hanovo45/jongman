package 시험;

public class SimplePayment implements Payment{
	
	double simplePaymentRatio;
	
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}

	@Override
	public int online(int price) {
		
		return 0;
	}

	@Override
	public int offline(int price) {
		
		return 0;
	}

	@Override
	public void showInfo() {
	
		
	}
	
	
	
}
