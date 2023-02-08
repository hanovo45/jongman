package com.yedam.inter;

public interface RemoteControl {
	
	// 인터페이스
	
	// 상수 -> static final 생략
	public int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;   // static final 생략
	
	// 추상 메소드 -> abstract 생략
	public void turnOn();
	public abstract void turnOff(); 	 // abstract 생략
	public void setVolume(int volume);   // 매개변수 주어진걸로도 만들수잇음
	
	
	
	
	
}
