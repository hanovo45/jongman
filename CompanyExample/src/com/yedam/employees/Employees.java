package com.yedam.employees;

public class Employees {
	
	// not null조건은 꼭 넣어야 함
	
	private int employeeId;
	private String lastName;
	private String email;
	private Date hireDate;
	// java.sql.Date vs java.util.Date 차이
	//   연 월 일 			원월일시분초
	// 사용하시는 방식이 달라서 Date빨간줄
	
	private String jobId;

	
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	// toString
	// ??????????????
	@Override
	public String toString() {
		
//		return "Employees [employeeId =
	}

	
	
	
	
	
	}
