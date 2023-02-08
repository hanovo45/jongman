package com.yedam.API;

import java.util.HashMap;

public class ObjectExample {
	public static void main(String[] args) {
		
		Member member = new Member("123");
		Member member2 = new Member("123");
		Member member3 = new Member("321");
		
		System.out.println(member.equals(member2));
		System.out.println(member.equals(member3));
		System.out.println(member == member2);
	
		// 데이터를 저장 -> 세트로 데이터를 저장
		// 데이터를 찾을 key를 가지고 hashMap에 접근하면
		// key에 매칭되어 있는 데이터를 가지고 나오는 형태
		HashMap<key, String> hashMap = new HashMap<>();
		
		// hashCode -> 객체를 구별하는 고유의 정수 값.
		// hashCode 같다 = 같은 메모리 주소
		// new key(1) -> 100번
		hashMap.put(new key(1),"홍길동");
		// new key(1) -> 150번
		
		String value = hashMap.get(new key(1));
		
		System.out.println(value);
		
		HashMap<Member, String> hashMap02 = new HashMap<>();
		hashMap02.put(new Member("열쇠"), "김씨");
		
		String str = hashMap02.get(new Member("열쇠"));
		System.out.println(str);
		
		
		
		
		
		
		
	}	
}
