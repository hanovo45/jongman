package com.j.service;

import java.util.ArrayList;
import java.util.List;
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
		signStud.setStudState(null);		
		int result = StudentDAO.getInstance().signup(signStud);
		
			if (result > 0) {
				System.out.println("회원가입 승인대기중");
			} else {
				System.out.println("회원가입 실패");
			}		
		
	}

	// 승인
	public void approveStudent() {
		
		int result = 0;
		System.out.println("승인할 학생");
		String appStud = sc.nextLine();
		
		Student updateStudent = new Student();
		updateStudent.setStudState(appStud);
		
		result = StudentDAO.getInstance().appStudent(updateStudent);
		
		
		
		if(result > 0) {
			System.out.println("승인");
		}else {
			System.out.println("승인 실패");
		}
	}
	
	
	// 로그인
		public void login() {
			Student student = null;
			System.out.println("ID 입력>");
			String studentId = sc.nextLine();
		    	
			System.out.println("pw 입력>");
			String studentPw = sc.nextLine();
		 
			
			student = StudentDAO.getInstance().login(studentId);
			
			if(student != null) {
				if(student.getStudState().equals("Y")) {
					if(student.getStudentPw().equals(studentPw)) {
						System.out.println("정상 로그인 되었습니다");
						studentInfo = student;
					}else {
						System.out.println("비밀번호 오류");
					}
				}else {
					System.out.println("회원가입이 승인 되지 않은 아이디 입니다.");
				}
			}else {
				System.out.println("아이디 오류");
			}
		}
		
		// 관리자 로그인
		
		public void aLogin() {
			Student student = null;
			System.out.println("ID 입력>");
			String studentId = sc.nextLine();
			System.out.println("pw 입력>");
			String studentPw = sc.nextLine();
		 
			
			
			if(studentId.equals("admin")){
				student = StudentDAO.getInstance().aLogin(studentId);
			}else {
		    System.out.println("관리자가 아닙니다.");
		    System.out.println("========================");
		    System.out.println("다시 로그인을 시도해 주십시오.");
		    aLogin();
		    }
			if(student != null) {
				
					if(student.getStudentPw().equals(studentPw)) {
						System.out.println("정상 로그인 되었습니다");
						studentInfo = student;
						
					}else {
						System.out.println("비밀번호 오류");
					}
				}else {
				System.out.println("아이디 오류");
			}
		}
		
	// 전체 학생조회
	public void getStudentList() {
		
		List<Student> list = StudentDAO.getInstance().getStudentList();
		for(int i =0; i<list.size();i++) {
			
			System.out.println("아이디 : " + list.get(i).getStudentId());
			System.out.println("비밀번호 : " + list.get(i).getStudentPw());
			System.out.println("이름 : " + list.get(i).getStudentName());
			System.out.println("번호 : " + list.get(i).getStudentPhone());
			System.out.println("이메일 : " + list.get(i).getStudentEmail());
			System.out.println("수강 과목 : " + list.get(i).getStudentLecture());
			System.out.println("수강 시간 : " + list.get(i).getStudentLectTime());
			System.out.println("승인 상태 : " + list.get(i).getStudState());
			System.out.println("======================");
		}
		
	}
		
		
	// 조회
//	public void getStud() {
//		System.out.println("과목 입력");
//		String lect = sc.nextLine();
//		Student student = StudentDAO.getInstance().getStud(lect);
//		if(student == null) {
//			System.out.println("등록되지 않음");
//		}else {
//			System.out.println("이름 : " + student.getStudentName());
//			System.out.println("수강 과목 : " + student.getStudentLecture());
//			System.out.println("수강 시간 : " + student.getStudentLectTime());
//			
//		}
//	}
	
	public void getStud() {
		System.out.println("과목 입력");
		String lect = sc.nextLine();
		List<Student> list = new ArrayList<>();
		 list = StudentDAO.getInstance().getStudList(lect);
		for(int i=0;i<list.size();i++) {
			System.out.print("이름 : " + list.get(i).getStudentName());
			System.out.print("| 수강 과목 : " + list.get(i).getStudentLecture());
			System.out.println("| 수강 시간 : " + list.get(i).getStudentLectTime());
			System.out.println();
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
	
	public void deleteStud() {
		System.out.println("아이디 입력>");
		int result = StudentDAO.getInstance().deleteStud(sc.nextLine());
		
		if(result > 0) {
			System.out.println("탈퇴 완료");
		} else {
			System.out.println("탈퇴 실패");
		}
	}
	
	
}
