package com.yedam.Student;

import java.util.List;
import java.util.Scanner;

public class StudentService {
	
	Scanner sc = new Scanner(System.in);
	
	// 전체 학생 조회
	public void getStudnetList() {
		List<Student> list = StudentDAO.getInstance().getStudentList();
		for(int i=0; i<list.size();i++) {
			System.out.println("학번 : " + list.get(i).getStdId());
			System.out.println("이름 : " + list.get(i).getStdName());
			System.out.println("전공 : " + list.get(i).getStdMajor());
			System.out.println("성적 : " + list.get(i).getStdPoint());
		}
	}
	
//	STD_ID    NOT NULL NUMBER       
//	STD_NAME  NOT NULL VARCHAR2(15) 
//	STD_MAJOR          VARCHAR2(3)  
//	STD_POINT          NUMBER(2,1)
	
	// 학번 조회
	public void getStudent() {
		
	}
	
	// 학생 등록
	public void insertStd() {
		
	}
	
	// 학생 제적
	public void deleteStd() {
		
	}
	
	// 학생 전공 변경
	public void updateStd() {
		
	}
	
	
	
	
	
}
