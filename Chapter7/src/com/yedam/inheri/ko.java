package com.yedam.inheri;

public class ko {
	public static void main(String[] args) {
		
		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		// 이륙 -> 부모클래스에 있는 메소드 호출
		sa.takeOff();
		
		// 비행모드 확인
		sa.fly();

		// 비행모드 변경
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		
		// 비행모드 확인
		sa.fly();
		
		// 비행모드 변경
		sa.flyMode = SuperSonicAirplane.NORMAL;
		
		//비행모드 확인
		sa.fly();
		
		// 착륙
		sa.land();
	}
}
