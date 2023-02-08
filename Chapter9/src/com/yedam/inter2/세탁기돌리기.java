package com.yedam.inter2;

public class 세탁기돌리기 {
	public static void main(String[] args) {
		
		LG세탁기 wash = new LG세탁기();
		
		wash.dry();
		wash.start();
		wash.stop();
		wash.end();
		wash.speed2(3);
		
	}
}
