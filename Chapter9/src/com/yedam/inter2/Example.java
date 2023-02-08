package com.yedam.inter2;

public class Example {
	public static void main(String[] args) {
		
		implementsC imp1 = new implementsC();
		
		// interfaceA ~ C 까지 imp1을 활용해서 메소드 호출
		
		// 1. interfaceA -> A가 가지고 있는 메소드1만 실행
		InterfaceA ia = imp1;
		ia.method01();
		
		// 2. interfaceB -> B가 가지고 있는 메소드2만 실행
		InterfaceB ib = imp1;
		ib.method02();
		// 3. interfaceC -> A,B,C가 가지고 있는 모든 메소드실행
		InterfaceC ic = imp1;
		ic.method01();
		ic.method02();
		ic.method03();
		
		
		
		
		
	}
}
