
public class cccc extends StandardWeightInfo{


	
//	3) ObesityInfo 클래스를 정의한다.
//	- StandardWeightInfo 클래스를 상속한다.
	
	public cccc(String name, int height, int weight) {
		super(name, height, weight);
	}

	//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능

	@Override
	public void getInformation() {
		System.out.println(name + "님의 신장 "
				+ height + ", 몸무게 : " + weight+ " 표준체중"	+ "입니다");
	}
	
	
	
//	(2) public double getObesity() : 비만도를 구하는 기능
//	( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
	public double cccc() { 
		// 부모 클래스에 있는 표준 체중 메소드를 활용해서 비만도 연산
		double bmi = (weight - super.getStandardWeight()/super.getStandardWeight()*100);
		// bmit에 따른 비만도를알려줘야함
		String cccc = null;
		if(bmi <= 18.5) {
			cccc = "저체중";
		}else if(bmi <= 22.9) {
			cccc = "정상";
		}else if(bmi <= 24.9) {
			cccc = "과체중";
		}else {
			cccc = "비만";
		}
		return height;
		
	}
}
