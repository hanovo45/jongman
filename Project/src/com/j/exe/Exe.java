package com.j.exe;

import java.util.Scanner;

import com.j.service.StudentService;

public class Exe {
	
	StudentService ss = new StudentService();
	Scanner sc = new Scanner(System.in);
	
	boolean run = true;
	String menu = "";
	
	public Exe() {
		run();
	}
	
	private void run() {
		
		String menu = "";
		
		while(run) {
			if(StudentService.studentInfo != null) {
				loginMenu();
			}else if(StudentService.studentInfo == null) {
				logoutMenu();
			}
		}
	}
	
	private void loginMenu() {
		System.out.println("1.조회 2.수정 3.탈퇴");
		System.out.println("입력>");
		menu = sc.nextLine();
		
		switch(menu) {
		case "1":
			ss.getStudent();
			break;
		case "2":
			break;
		case "3":
			break;
		}
	}
	
	private void logoutMenu() {
		System.out.println("1.로그인 2. 종료");
		System.out.println("입력>");
		menu = sc.nextLine();
		
		if(menu.equals("1")) {
			ss.login();
		}else if(menu.equals("2")) {
			run = false;
			System.out.println("프로그램 종료");
		}
	}
	
}
