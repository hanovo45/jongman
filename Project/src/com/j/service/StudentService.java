package com.j.service;

import java.util.Scanner;

public class StudentService {
	
	public static Student studentInfo = null;
	Scanner sc = new Scanner(System.in);
	
	// 로그인
	public void login() {
		Student student = null;
		System.out.println("ID 입력");
		String studentId = sc.nextLine();
		
		System.out.println("pw 입력");
		String studentPw = sc.nextLine();
		
		student = StudentDAO.getInstance().login(studentId);
		
		if(student != null) {
			if(student.getStudentPw().equals(studentPw)) {
				System.out.println("정상 로그인");
				studentInfo = student;
			}else {
				System.out.println("비밀번호 오류");
			}
		}else {
			System.out.println("아이디 오류");
		}
	}
	
	// 조회
	public void getStudent() {
		Student student = StudentDAO.getInstance().getStudent();
		System.out.println(student.toString());
	}
	
	// 수정
	public void modifyStudent() {
		Student student = new Student();
		
		System.out.println("연락처>");
		student.setStudentPhone(sc.nextLine());
		
		System.out.println("");
	}
	
	// 탈퇴
	
	
	
}
