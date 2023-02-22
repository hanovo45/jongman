package com.yedam.Student;

import java.util.List;
import java.util.Scanner;

public class StudentService {
	
	Scanner sc = new Scanner(System.in);
	
	// 전체 학생 정보 조회
		public void getStudentList() {
			List<Student> list =
			StudentDAO.getInstance().getStudentList();
			System.out.println("전체 조회 결과>");
			for(Student std : list) {
				System.out.println(std.toString());
			}
		}
		
		//학번 조회
		public void getStudent() {
			System.out.println("학번 입력>");
			int stdNo = Integer.parseInt(sc.nextLine());
			
			Student std =
			StudentDAO.getInstance().getStudent(stdNo);
			
			System.out.println("조회한 결과>");
			System.out.println(std.toString());
		}

		//학생 등록
		public void insertStd() {
			Student std = new Student();
			System.out.println("이름>");
			std.setStdName(sc.nextLine());
			System.out.println("전공>");
			std.setStdMajor(sc.nextLine());
			System.out.println("점수>");
			std.setStdPoint(Double.parseDouble(sc.nextLine()));
			
			int result = StudentDAO.getInstance().insertStd(std);
			
			if(result > 0) {
				System.out.println("학생 정보 등록 완료");
			} else {
				System.out.println("학생 정보 등록 실패");
			}
		}
		
		//학생 제적
		public void deleteStd() {
			System.out.println("학번 입력>");
			int result =
			StudentDAO.getInstance().deleteStd(Integer.parseInt(sc.nextLine()));
			
			if(result > 0) {
				System.out.println("학생 정보 삭제 완료");
			} else {
				System.out.println("학생 정보 삭제 실패");
			}
		}
		
		//학생 전공 변경
		public void updateStd() {
			Student std = new Student();
			System.out.println("학번 입력>");
			std.setStdId(Integer.parseInt(sc.nextLine()));
			System.out.println("변경할 전공 입력>");
			std.setStdMajor(sc.nextLine());
			
			int result = StudentDAO.getInstance().updateStd(std);
			
			if(result > 0) {
				System.out.println("학생 정보 수정 완료");
			} else {
				System.out.println("학생 정보 수정 실패");
			}
			
		}
		//전공별 성적 합계, 성적 평균
		public void getAnalyze() {
			List<Student> list = 
			StudentDAO.getInstance().getAnalyze();
			
			for(int i = 0; i<list.size(); i++) {
				System.out.println("======전공별 분석======");
				System.out.println("전공명 :" + list.get(i).getStdMajor());
				System.out.println("합 계 : " + list.get(i).getStdSum());
				System.out.println("평 균 : " + list.get(i).getStdAvg());
				System.out.println("학생수 : " + (int)(list.get(i).getStdSum()/list.get(i).getStdAvg())+"명");
				System.out.println("====================");
			}
			
		}
}
