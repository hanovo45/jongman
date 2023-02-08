package com.yedam.inter2;

public class Car {
	
	// Car 클래스에서 필드에다가 Tire 넣기
	tire flt = new kumhoTire();
	tire frt = new kumhoTire();
	tire blt = new kumhoTire();
	tire brt = new kumhoTire();
	
	void run() {
		flt.roll();
		frt.roll();
		blt.roll();
		brt.roll();
	}
	
	
	
	
}
