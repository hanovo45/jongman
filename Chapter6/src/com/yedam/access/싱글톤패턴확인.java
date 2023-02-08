package com.yedam.access;

public class 싱글톤패턴확인 {
	public static void main(String[] args) {
		
		// 싱글톤패턴.getInstance() = 싱글톤패턴 클래스에서 만든 객체 = (sington)
		
		싱글톤패턴 obj1 = 싱글톤패턴.getInstance();
		싱글톤패턴 obj2 = 싱글톤패턴.getInstance();
		싱글톤패턴 obj3 = 싱글톤패턴.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		obj1.getInfo();
		
		
		
		
		
		
		
		
	}
}
