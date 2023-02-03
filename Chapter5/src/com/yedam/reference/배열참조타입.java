package com.yedam.reference;

public class 배열참조타입 {
public static void main(String[] args) {
	
	int intVal = 10;
	int[] array = {1,2,3};
	int[] array2 = {1,2,3};
	int[] array3 = null;
	int a;
	
	System.out.println(intVal);
	System.out.println(array);          	// 배열 , 문자열은 스택영역에 데이터 저장안하고 힙영역에 데이터가 있음 , 스택영역엔 힙주소있음
	System.out.println(array2);				// 스택영역안에 있는 array의 힙영역 주소 // 그안에 array 데이터있음
	System.out.println(array[0] == array2[0]);
	
//	System.out.println(array3.length);
	
	// memory leak -> 메모리 누수, 메모리 부족
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
