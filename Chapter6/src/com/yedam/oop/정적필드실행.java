package com.yedam.oop;

public class 정적필드실행 {
	
	// 필드 선언 (stack 저장)
	int num = 1;
	
	// 정적 필드 선언 (method 저장)
	static int sNum = 1;
	
	// 필드 선언
	int field1;		// 인스턴스 필드(heap 영역)
	
	// 메소드
	void info() {
		System.out.println("info 출력");
	}
	
	
	// 메소드 영역에 포함되어 있는 정적 메소드 static때문?
	public static void main(String[] args) {      
		
		// 클래스 한공간에서 정적 멤버, 인스턴스 멤버
		// 1. 인스턴스 필드 -> 정적 메소드에서 사용한다 
		// 	  자기 자신을 객체로 만든 다음 인스턴스 필드를 호출해서 사용
		// 2. 필드 -> 정적 필드로 변경해서 사용한다
		
		
		
		정적필드실행 app = new 정적필드실행();
		
		app.field1 = 0;
		app.info();
		
//		this.field1 = 1;
		
//		num = num + 1;					// 정적 필드가 아니라?
//		System.out.println(num);		// 필드를 정적 필드로 바꾸기  
		
//		double result1 = 10 * 10 * 정적필드.pi;
		
		int result2 = 정적필드.plus(10, 5);
		int result3 = 정적필드.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
	}
}
