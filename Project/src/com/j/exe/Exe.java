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
	
	private void run() {
		
		while(selectNo != 3) {
			
			if(ss.studentInfo==null) {
				Menu();
			}else if(ss.studentInfo!=null) {
				loginMenu();
			}
			switch(selectNo) {
			
			case 1:
				ss.signup();
				break;
			case 2:
				ss.login();
				break;
			case 3:
				System.out.println("end of porg");
				break;
			}
		}
		
	}
		
		private void Menu() {
			System.out.println("1.회원가입 2. 로그인 3.종료");
			System.out.println("입력>");
			
			selectNo = Integer.parseInt(sc.nextLine());
			
		}
	
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
			break;
		}
	}
	
	
}
