package com.yedam.inheri;

public class Compute오버라이딩 extends OverrideExam{
	public static void main(String[] args) {
		
		Compute compute = new Compute();
		compute.areaCircle(5.0);
		
		Exam exam = new Exam();
		exam.method01();	// 자식클래스 메소드
		exam.method02();	// 부모 클래스 메소드
	}
	
}
