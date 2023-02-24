package com.j.service;

import com.j.common.DAO;


public class StudentDAO extends DAO{
	
	// 싱글톤
	
	private static StudentDAO sDao = new StudentDAO();
	
	private StudentDAO() {
		
	}
	
	public static StudentDAO getInstance() {
		return sDao;
	}
	
	// 회원가입
	public int signup(Student stud) {
		int result = 0;
		try {
			
			conn();
			String sql = "insert into student(stud_id,stud_pw,stud_name,stud_phone) values (?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stud.getStudentId());
			pstmt.setString(2, stud.getStudentPw());
			pstmt.setString(3, stud.getStudentName());
			pstmt.setString(4, stud.getStudentPhone());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result; 
	}
	
	// 로그인 기능
	public Student login(String id) {
		Student std = null;
		
		try {
			conn();
			String sql = "select * from student where stud_id = ?";
			
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {				
				std  = new Student();
				std.setStudentId(rs.getString("stud_id"));
				std.setStudentPw(rs.getString("stud_pw"));
				std.setStudentName(rs.getString("stud_name"));
				std.setStudentPhone(rs.getString("stud_phone"));
				std.setStudentEmail(rs.getString("stud_email"));
				std.setStudentLecture(rs.getString("stud_lecture"));
				std.setStudentLectTime(rs.getString("stud_lecttime"));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return std;
	}
	
	// 조회
	public Student getStud(String name) {
		Student student = null;
		
		try {
			conn();
			String sql = "select * from student where stud_lecture = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				student = new Student();
				student.setStudentId(rs.getString("stud_id"));
				student.setStudentPw(rs.getString("stud_pw"));
				student.setStudentName(rs.getString("stud_name"));
				student.setStudentPhone(rs.getString("stud_phone"));
				student.setStudentEmail(rs.getString("stud_email"));
				student.setStudentLecture(rs.getString("stud_lecture"));
				student.setStudentLectTime(rs.getString("stud_lecttime"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return student;
	}

	// 수정
	public int modifyStud(Student stud) {
		
		int result = 0;
		try {
			conn();
			String sql =  "update student\r\n"
					+ "set stud_id = ? ,stud_pw = ? ,stud_phone = ?\r\n"
					+ "where stud_id = ?";
					
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stud.getStudentId());
			pstmt.setString(2, stud.getStudentPw());
			pstmt.setString(3, stud.getStudentPhone());
			pstmt.setString(4, StudentService.studentInfo.getStudentId());
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	// 수강 신청
	
	
	// 탈퇴
	
	
	
	
	// 관리자 승인하려면 db에 테이블 한개 더만들라고 함. 
	
//	특정과목 조회 = 수강생 이름 = 학생들
//			select stud_name, stud_lecttime
//			from student
//			where stud_lecture = '자바';

	
	
	
	
	
	
	
	
	
}
