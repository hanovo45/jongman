package com.yedam.oop;

public class final사용2 {
	public static void main(String[] args) {
		final사용 p1 = new final사용("11211-11111", "김또치");
		
		// p1.nation = "미국";
		// p1.ssn = "123-123";
		
		// 개명
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// 지구의 반지름
		System.out.println("지구의 반지름 : " + 정적필드.PI);

		// 지구의 표면적(pi*r*r)
		System.out.println("지구의 표면적 : " + (정적필드.PI * 정적필드.EARTH_RADIUS * 정적필드.EARTH_RADIUS));
		
		// 정적필드.PI = 100; final이기떄문에 값변경 불가
		
		
		
		
		
		
	}
}
