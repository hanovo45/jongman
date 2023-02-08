package com.yedam.inheri;

public class SuperSonicAirplane extends AirPlane{

	// 자식 클래스
	
	// 필드
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행 모드");
		}else {
			// super.  부모가 가지고 있는거 쓰고 싶을때
			super.fly();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
