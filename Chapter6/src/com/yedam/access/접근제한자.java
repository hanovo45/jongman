package com.yedam.access;

public class 접근제한자 {
	
	// 사용 : 필드 , 메소드 , 클래스 , 인터페이스 등등 앞에 사용 가능
	// public    어디서든 누구나 다 접근 가능 -> 필드 = 누구나 다 쓸수있다.
	// protected 상속이라는 관계맺은 다음에 부모 - 자식 사용(패키지가 달라도 사용가능)
	//           같은 패키지에서만 접근 가능, 서로 다른 패키지면 접근 불가
	// default   같은 패키지에서만 접근 가능, 서로 다른 패키지면 접근 불가
	// private   내가 속한 클래에서만 사용 가능
	
	// 필드 
	public String free;
	protected String parent;
	private String privacy;
	String basic;
	
	// 생성자에 접근 제한자 -> 객체를 생성하는 범위를 조절
	// public -> 어디서든 객체 생성 가능
	// protected -> 같은패키지, 자식클래스에서만 객체 생성 가능
	// default -> 같은패키지에서만 객체 생성 가능
	// private -> 객체 생성 불가능
		
//		준호씨 :메소드는 void << 리턴값 없는 메소드랑 리턴값 있는 경우는 속성 줘서 메소드 사용 //명을 사용함
//			생성자는 클래스 사용함
				
						
	// 생성자
	public 접근제한자() {
		
	}
	protected  접근제한자(int a) {
		
	}
	접근제한자(String s) {
		
	}
//	private 접근제한자(double a) {
//		
//	}
	
	// 메소드
	
	// 캡슐화?
	// 숨기고 싶은 정보
	private void info() {
		System.out.println("private 메소드");
	}
	
	// 숨긴 정보를 대신 불러주는 메소드
	public void instead() {
		info();
	}
	
	protected void parent() {
		System.out.println("protecte 메소드");
	}
	void basic() {
		System.out.println("default 메소드");
	}
	
	
	
	
	
	
	
	
	
	
}
