package com.yedam.inheri;

public class Student실행 {
	public static void main(String[] args) {
		Student std = new Student("김","333-333",2023); // std에는 2023만있음, 김,333은 부모객체에
		System.out.println("이름 : " + std.name);
		System.out.println("주민등록번호 : " + std.ssn);
		System.out.println("학번 : " + std.stdNo);
	}
}
