package com.yedam.Map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
	public static void main(String[] args) {
		
		Map<String, String> map = new Hashtable<>();
		Scanner sc = new Scanner(System.in);
		
		// 임의의 아이디와 비밀번호
		map.put("sptring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		while(true) {
			System.out.println("아이디>");
			String id = sc.nextLine();
			System.out.println("비밀번호>");
			String passWord = sc.nextLine();
			
			// map이 가지고 있는 키(아이디) 확인
			// 아이디 확인
			if(map.containsKey(id)) {
				// key(id)를 활용해서 value(저장된 passWord)와
				// 입력한 passWord를 비교해서 같으면 로그인 다르면 실패
				if(map.get(id).equals(passWord)) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("비밀번호 미일치");
				}
			}else {
				System.out.println("아이디 불일치");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
