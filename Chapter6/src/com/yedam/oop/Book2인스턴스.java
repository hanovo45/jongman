package com.yedam.oop;

public class Book2인스턴스 {
	public static void main(String[] args) {
		
		// book01 인스턴스 생성(원본복사?)
		Book2 book01 = new Book2("혼공자", 1000, 5000);
		
		// book01 인스턴스가 가진 인스턴스 필드(company)를 사용
		book01.company = "한빛미디어";
		
		
		// book01 인스턴스에 인스턴스 메소드를 통한 인스턴스 필드 초기화 또는 데이터 저장 
		book01.setkind("학습서");
		
		// book01 인스턴스가 가진 인스턴스 메소드(getInfo)를 사용
		book01.getInfo();
		
		
		
		
		
	}
}
