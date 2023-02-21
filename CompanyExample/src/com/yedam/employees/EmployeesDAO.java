package com.yedam.employees;

import java.util.ArrayList;
import java.util.List;

import cam.yedam.common.DAO;

public class EmployeesDAO extends DAO{
	
	// 싱글톤
	
	private static EmployeesDAO empDao = null;
	
	private EmployeesDAO() {
		
	}
	
	public static EmployeesDAO getInstance() {
		if(empDao == null) {
			empDao = new EmployeesDAO();
		}
		return empDao;
	}
	
	// 전체 조회
	public List<Employees> getEmployeesList(){
		List<Employees> list = new ArrayList<>();
		Employees emp = null;
		
		try {
			conn();
			String sql = "select * from emp";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				emp = new Employees();
				emp.setEmployeeId(rs.getInt("employee_id"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	// 등록
	public int insertEmp(Employees emp) {
		
		int result = 0;
		try {
			conn();
			
			String sql = "intsert into emp (employee_id, last_name, email, hire_date,job_id "+ "values(?,?,?,sysdate,?)";
			
			stmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(4, emp.getJobId());
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	
	
	
	
	
}
