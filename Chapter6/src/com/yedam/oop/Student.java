package com.yedam.oop;

public class Student {
	
	// 정보 - 학생이름 , 학번 , 국어 , 영어 , 수학 점수
	// 기본 생성자, 모든 데이터를 초기화 생성자
	// 학생의 정보를 출력해주는 getInfo()
	// 이름 : 김또치
	// 학번 : 20230201
	// 총좀 : 200 
	// 평균 : 68.xx
	
	// 필드
	String name;
	int num;
	int kor;
	int en;
	int math;
	int sum;
	double avg;
	
	// 생성자
	public Student() {
		
	}
	public Student(String name, int num, int kor, int en, int math) {
		this.name = name;
		this.num = num;
		this.kor = kor;
		this.en = en;
		this.math = math;
	}
	// 메소드
	void getInfo(){
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + num);
		System.out.println("총점 : " + (kor+en+math));
		System.out.println("평균 : " + avg);
		
	}
	
	int sum() {
		return kor + en + math;
	}
	
	int avg() {
		return sum()/3;
	}
	
	
	
	
	
}
