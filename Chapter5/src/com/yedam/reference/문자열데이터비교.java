package com.yedam.reference;

public class 문자열데이터비교 {
public static void main(String[] args) {
	
	// new 연산자 없는 String
	
	String strVal1 = "yedam";
	String strVal2 = "yedam";
	
	// == , equals
	// == 데이터를 비교하는게 아니라 , 데이터의 힙주소 
	
	if(strVal1 == strVal2) {
		System.out.println("strVal1과 strVal2는 메모리 주소같음");
	}else {
		System.out.println("strVal1과 strVal2는 메모리 주소다름");
	}
	
	// 문자열(String)간의 데이터를 비교
	if(strVal1.equals(strVal2)) {
		System.out.println("strVal1과 strVal2는 메모리 주소같음..");
	}else {
		System.out.println("strVal1과 strVal2는 메모리 주소다름..");
	}
	
	// new 연산자가 있는 String 객체비교
	// 객체 : 참조타입의 변수
	
	String strVal3 = new String("yedam");
	String strVal4 = new String("yedam");
	
	if(strVal3 == strVal4) {
		System.out.println("strVal3과 strValr4는 같은 메모리주소");
	}else {
		System.out.println("strVal3과 strValr4는 다른 메모리주소");
	}
	
	if(strVal3.equals(strVal4)) {
		System.out.println("strVal3과 strValr4는 같은 메모리주소..");
	}else {
		System.out.println("strVal3과 strValr4는 다른 메모리주소..");
	}
	
	// new 연산자 안쓴 String , new 연산자를 사용한 String 비교
	if(strVal1 == strVal3) {
		System.out.println("strVal1과 strVal3은 같은 메모리 주소3");
	}else {
		System.out.println("strVal1과 strVal3은 다른 메모리 주소3");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
