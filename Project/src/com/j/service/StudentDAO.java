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
	public Student getStudent() {
		Student student = null;
		
		try {
			conn();
			String sql = "select * from student where stud_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, StudentService.studentInfo.getStudentId());
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
//	public int modifyStudent(Student student) {
//		
//	}
	// 탈퇴
	
}
