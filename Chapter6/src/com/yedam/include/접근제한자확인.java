package com.yedam.include;

import com.yedam.access.접근제한자;

public class 접근제한자확인 extends 접근제한자 {
	public static void main(String[] args) {
		
		접근제한자 ac = new 접근제한자();
		
		ac.free = "public";
//		ac.parent = "parent";
//		ac.privacy = "privacy";
//		ac.basic = "basic";
		
		ac.instead();
//		ac.info();
//		ac.parent();
//		ac.basic();
		
		
		
		
		
		
		
		
		
	}
}
