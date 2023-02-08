package com.yedam.access;

public class 실행 {
	public static void main(String[] args) {
		
		접근제한자 ac = new 접근제한자();
		
		// public
		ac.free = "public";
		
		// protected
		ac.parent = "parent";
		
		// default
		ac.basic = "basic";
		
		// private
//		ac.privacy = "privacy";
		
		ac.instead();
//		ac.info();
		ac.parent();
		ac.basic();
		
		
		
		
	}
}
