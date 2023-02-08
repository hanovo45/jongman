package com.yedam.oop;

public class Book2 {
	
	// book이라는 클래스는 아래의 정보를 가져야합니다.
	// 책이름, 책종류, 가격, 도서번호, 출판사
	// 생성자는 아무런 행동을 하지 않습니다.
	
	// 생성자는 3개정도 생성
	// 1. 기본생성자
	
	// 데이터(매개변수) -> 필드를 초기화 할수있게끔 생성자
	// 2. 모든 데이터를 초기화 할수있는 생성자
	// 3. 책이름, 책가격, 도서번호를 받아오는 생성자
	
	// 메소드는 getInfo() 메소드를 가지는데, 아무런 기능이 없습니다.
	// getInfo() 메소드를 클래스 외부에서 실행할때 
	// 다음과 같은 출력물이 나오도록 구현
	// 객체 생성할때 생성자를 통한 필드초기화
	
	// 책 이름 : 혼자 공부하는 자바
	// # 내용
	// 1. 종류 : 학습서
	// 2. 가격 : 24000원
	// 3. 출판사 : 한빛 미디어
	// 4. 도서번호 : 0001	
	// system.out.println()
	
	// 필드
	String name;
	String sort;
	int price;
	int isbn;
	String company;
		
		
	// 생성자	
	public Book2() {
		// 기본 생성자
	}
	public Book2(String name, String sort, int price, int isbn, String company) {
		this.name = name;
		this.sort = sort;
		this.price = price;
		this.isbn = isbn;
		this.company = company;
		
	}
	public Book2(String name, int price, int isbn) {
		this.name = name;
		this.price = price;
		this.isbn = isbn;
	}
	public Book2(String name) {
		this.name = name;
	}
	
	
	
	// 메소드	
	void getInfo() {
			System.out.println("책 이름 :" + name);
			System.out.println("# 내용");
			System.out.println("1) 종류 :" + sort);
			System.out.println("2) 가격 :" + price);
			System.out.println("3) 출판사 :" + company);
			System.out.println("4) 도서번호 :" + isbn);
			
	}
	
	void setkind(String sort) {
		this.sort = sort;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
