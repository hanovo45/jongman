package com.yedam.access;

public class 싱글톤패턴 {
	
	// 외부에서 접근은 못하지만 공유는 가능하다
	// 객체 생성 -> 객체가 존재하고 있는 주소값
	// sington -> 100번지(힙영역?)
	private static 싱글톤패턴 sington = new 싱글톤패턴();  
	
	// 외부에서 객체를 생성하지 못하도록 막는 역할
	private 싱글톤패턴() {
		
	}
	
	// 싱글톤패턴 내부에서 만든 객체를 외부에 전달 하는 용도
	public static 싱글톤패턴 getInstance() {
		return sington;
	}
	
	public void getInfo() {
		System.out.println("싱글톤 내부 getInfo메소드 실행");
	}
	
	
	
}
