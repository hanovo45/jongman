package com.j.common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DAO {
	
	
	protected Connection conn = null;
	protected PreparedStatement pstmt = null;	
	protected Statement stmt = null;
	protected ResultSet rs = null;

	// 계정 접속
	Properties pro = new Properties();
	
	String driver = null;
	String url = null;
	String id = null;
	String pw = null;
	
	//DB 연결 메소드
	public void conn() {
		try {
			getProperties();
			Class.forName(driver);
			conn = DriverManager.getConnection(url,id,pw);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//DB 연결 해제
	public void disconn() {
		try {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// db 접속 정보 호출 메소드
	// 1. 프로그램안에 db관련 정보를 넣지 않기 위해서
	// 2. 프로그램 실행중 db가 변경이된다면 -> 원래 프로그램 껏다가 내용 수정후 켜야하는데
	//    메모장 같은곳에 내용을 불러와스 쓴다면 프로그램이 돌아가고 있는 도중에 메모장에 쓴
	//    내용을 불러가기 떄문에, 프로그램 종료하지않고 수정된 db관련 내용을 적용시킬수있다

	private void getProperties() {
		try {
			FileReader resource = new FileReader("src/config/db.properties");
			pro.load(resource);
			driver = pro.getProperty("driver");
			url = pro.getProperty("url");
			id = pro.getProperty("id");
			pw = pro.getProperty("pw");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
}
