package com.yedam.inter2;

public class LG세탁기 implements 세탁기, 세탁기건조{

	private int speed;
	
	@Override
	public void dry() {
		System.out.println("말림");
	}

	@Override
	public void start() {
		System.out.println("돌림");
	}

	@Override
	public void stop() {
		System.out.println("멈춤");
	}

	@Override
	public void end() {
		System.out.println("끝남");
	}
	
	@Override
	public void speed2(int speed) {
		if(speed == 1) {
			speed = BOTTOM; 
		}
		if(speed == 2) {
			speed = MID;
		}
		if(speed == 3) {
			speed = TOP;
		}
		
		System.out.println("세탁기 속도 : "+speed);
	}
	
	
	
	
}
