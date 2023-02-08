
public class StandardWeightInfo extends Human{

	
//	2) StandardWeightInfo 클래스를 정의한다.
//	- Human 클래스를 상속한다.
//	- 메소드는 다음과 같이 정의한다.

	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	//홍길동님의 신장 168, 몸무게 45, 표준체중 61.2 입니다.
	//	(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
	// ( * 표준 체중 : (Height - 100) * 0.9 )
	@Override
	public void getInformation() {
		super.getInformation();
//		System.out.printf(" 표준체중 %.1f 입니다 .\n " + );
//		getStadardWeight()();
	}
	
//	(2) public double getStandardWeight() : 표준체중을 구하는 기능
//	( * 표준 체중 : (Height - 100) * 0.9 )
	
	public double getStandardWeight() {
		double result = ((height -100) * 0.9);
		return height;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
