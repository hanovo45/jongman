package com.j.exe;

import java.util.Scanner;

import com.j.service.StudentService;

public class Exe {
	
	StudentService ss = new StudentService();
	Scanner sc = new Scanner(System.in);
	
	boolean run = true;
	String menu = "";
	int selectNo = 0;
	public Exe() {
		run();
	}
	
//	private void run() {
//		
//		while(selectNo != 4) {
//			
//			if(ss.studentInfo==null) {
//				Menu();
//			}else if(ss.studentInfo!=null) {
//				loginMenu();
//			}
//			switch(selectNo) {
//			
//			case 1:
//				ss.signup();
//				break;
//			case 2:
//				ss.login();
//				break;
//			case 3:
//				ss.aLogin();
//				break;
//			case 4:
//				System.out.println("end of porg");
//				break;
//			}
//		}
//		
//	}
		
	private void run() {
		while(run) {
		if(StudentService.studentInfo!=null) {
			if(StudentService.studentInfo.getStudentId().equals("admin")) {
				aLoginMenu();
			}else{
				loginMenu();
				}
			}else if(StudentService.studentInfo==null) {
				Menu();
			}
		}
	}
	
		private void Menu() {
			System.out.println("1.회원가입 2. 로그인 3.관리자 로그인 4. 종료");
			System.out.println("입력>");
			
			selectNo = Integer.parseInt(sc.nextLine());
			
			
				
				switch(selectNo) {
				
				case 1:
					ss.signup();
					break;
				case 2:
					ss.login();
					break;
				case 3:
					ss.aLogin();
					break;
				case 4:
					System.out.println("end of porg");
					break;
			
					}
			
		}
		//일반회원 메뉴
		private void loginMenu() {
		System.out.println("1.조회 2.수정 3.탈퇴");
		System.out.println("입력>");
		String login = sc.nextLine();
		
		switch(login) {
		case "1":
			ss.getStud();
			break;
		case "2":
			ss.modifyStud();
			break;
		case "3":
			ss.deleteStud();
			break;
		}
	}
	//관리자 메뉴
	private void aLoginMenu() {
		System.out.println("1.회원가입 승인 2.전체 학생조회 3.학생조회 4.수정 5.뒤로");
		System.out.println("입력>");
		String login = sc.nextLine();
		
		switch(login) {
		case "1":
			ss.approveStudent();
			break;
		case "2":
			ss.getStudentList();
			break;
		case "3":
			ss.getStud();
			break;
		case "4":
			ss.modifyStud();
			break;
		case "5":
			Menu();
			break;
			
		}
	}
	
}
