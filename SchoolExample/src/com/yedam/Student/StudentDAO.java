package com.yedam.Student;


import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class StudentDAO extends DAO{
	
	// 싱글톤
	
	private static StudentDAO stdDao = null;
	
	private StudentDAO() {
		
	}
	
	public static StudentDAO getInstance() {
		if(stdDao == null) {
			stdDao = new StudentDAO();
		}
		return stdDao;
	}
	
	// 학생 정보 조회
	public List<Student> getStudentList(){
		
		List<Student> list = new ArrayList<>();
		Student student = null;
		try {
//			STD_ID    NOT NULL NUMBER       
//			STD_NAME  NOT NULL VARCHAR2(15) 
//			STD_MAJOR          VARCHAR2(3)  
//			STD_POINT          NUMBER(2,1)  
			conn();
			String sql = "select * from std";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				student = new Student();
				student.setStdId(rs.getInt("std_id"));
				student.setStdName(rs.getString("std_name"));
				student.setStdMajor(rs.getString("std_major"));
				student.setStdPoint(rs.getDouble("std_point"));
				
				list.add(student);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	// 학번 조회
//	public Student getStudent(int stdId) {
//		
//	}
//	
//	// 학생 등록
//	public int insertSTD(Studnet std) {
//		
//	}
//	
	// 학생 제적
//	public int deleteStd(int stdId) {
//		
//	}
//	
//	// 학생 전공 변경
//	public int updatestd(Student std) {
//		
//	}
}
