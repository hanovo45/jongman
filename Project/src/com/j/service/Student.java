package com.j.service;

public class Student {

//	STUD_ID       NOT NULL VARCHAR2(20) 
//	STUD_PW       NOT NULL VARCHAR2(20) 
//	STUD_NAME     NOT NULL VARCHAR2(12) 
//	STUD_PHONE    NOT NULL NUMBER(13)   
//	STUD_EMAIL             VARCHAR2(50) 
//	STUD_LECTURE  NOT NULL VARCHAR2(19) 
//	STUD_LECTTIME          CHAR(1)  
	
	private String studentId;
	private String studentPw;
	private String studentName;
	private String studentPhone;
	private String studentEmail;
	private String studentLecture;
	private String studentLectTime;
	
	
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentPw() {
		return studentPw;
	}
	public void setStudentPw(String studentPw) {
		this.studentPw = studentPw;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentLecture() {
		return studentLecture;
	}
	public void setStudentLecture(String studentLecture) {
		this.studentLecture = studentLecture;
	}
	public String getStudentLectTime() {
		return studentLectTime;
	}
	public void setStudentLectTime(String studentLectTime) {
		this.studentLectTime = studentLectTime;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentPw=" + studentPw + ", studentName=" + studentName
				+ ", studentPhone=" + studentPhone + ", studentEmail=" + studentEmail + ", studentLecture="
				+ studentLecture + ", studentLectTime=" + studentLectTime + "]";
	}
	
	
	
	
	
}
