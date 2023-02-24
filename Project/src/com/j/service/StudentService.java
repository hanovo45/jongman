package com.j.service;

import java.util.Scanner;

public class StudentService {
	
	public static Student studentInfo = null;
	Scanner sc = new Scanner(System.in);
	
	// 회원가입
	public void signup() {
		
		Student signStud = new Student();
		
		System.out.println("아이디는>");
		String signId = sc.nextLine();
		System.out.println("비밀번호는>");
		String signPw = sc.nextLine();
		System.out.println("이름은>");
		String signName = sc.nextLine();
		System.out.println("휴대폰번호는>");
		String signPhone = sc.nextLine();
		
		signStud.setStudentId(signId);
		signStud.setStudentPw(signPw);
		signStud.setStudentName(signName);
		signStud.setStudentPhone(signPhone);
				
		int result = StudentDAO.getInstance().signup(signStud);
		
			if (result > 0) {
				System.out.println("회원가입 완료");
			} else {
				System.out.println("회원가입 실패");
			}		
		
	}
	
	
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
	public void getStud() {
		System.out.println("과목 입력");
		String lect = sc.nextLine();
		Student student = StudentDAO.getInstance().getStud(lect);
		if(student == null) {
			System.out.println("등록되지 않음");
		}else {
			System.out.println(student.getStudentLecture());
		}
	}
	
	// 수정
	public void modifyStud() {

		Student stud = new Student();
		
		System.out.println("변경 아이디>");
		stud.setStudentId(sc.nextLine());
		System.out.println("변경 비밀번호>");
		stud.setStudentPw(sc.nextLine());
		System.out.println("변경 연락처>");
		stud.setStudentPhone(sc.nextLine());
		
		int result = StudentDAO.getInstance().modifyStud(stud);
		
		if(result > 0) {
			System.out.println("수정 완료");
		}else {
			System.out.println("수정 실패");
		}
	}
	
	// 탈퇴
	
	
	
	
}
