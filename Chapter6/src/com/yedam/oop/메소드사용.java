package com.yedam.oop;

public class 메소드사용 {
	public static void main(String[] args) {
		
		메소드 cal = new 메소드();
		cal.sum(10,20);
		int result = cal.sum2(10, 30);
		System.out.println(result);
		
		cal.sum3(new int[] {1,2,3,4,5,6});
		cal.sum4(1,2,3,4,5,6);
		
		// 클래스 외부에서 avg 메소드 호출
		cal.avg();
		
		Book2 bok= new Book2("혼자 공부하는 자바","학습서",24000,0001,"한빛");
		bok.getInfo();
	}
}
