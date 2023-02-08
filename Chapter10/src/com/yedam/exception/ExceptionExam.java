package com.yedam.exception;

public class ExceptionExam {
	public static void main(String[] args) {
		
		// nullpointexception
		
//		String data = null;
//		System.out.println(data.toString());
//		
//		Example example = null;
//		System.out.println(example.toString());
		
		
		// ArrayIndexOutOfBoundsException
		// 배열의 범위를 벗어난 인덱스를 호출할때 발생
		
		// index 0 ~ 2
		int[] intAry = new int[3];
		
		intAry[0] = 1;
//		intAry[10] = 10;
		
//		for(int i=0; i<= intAry.length; i++) {
//			System.out.println(intAry[i]);
//		}
		
		
		// NumberFormatException
		// 숫자로 바꿀 수 없는 문자를 숫자로 바꾸려고 할때
		
		String str = "123";
		int val = Integer.parseInt(str);
		System.out.println(val);
		
		// 예외
//		String str2 = "자바";
//		val = Integer.parseInt(str2);
//		System.out.println(val);
		
//		String str3 = "";     // 비어있는 데이터
//		val = Integer.parseInt(str3);
//		System.out.println(val);
		
		
		// ClassCastException
		// 자동타입변환된 객체를 강제타입변환할때 발생
		
		Example exam = new Exam();
		Exam exam02 = (Exam)exam;
		
		// 예외
//		Example exam03 = new Exam();
//		Exam02 exam04 = (Exam) exam03;
//		
//		
//		if(exam03 instanceof Exam) {
//			Exam exam05 = (Exam) exam03; 
//		}
		
		// ClassNotFoundException 
		// Class 파일 찾지 못할때
		// 실행메소드 -> main문 못찾을떄 자주 발생
		
		
		// ArithmeticException 
		// ex 1/0 , 분모가 0일때 나오는오류
		// double a = 1 / 0;
		
		// OutofMemoryError
		// memory leak 
		// 메모리 부족할때 , 반복문 무한루프 등등..
		
		// IOExcepion  -> 입출력 오루
		// file reading/write
		
		// FileNotFoundException
		// java -> file reading -> 경로를 찾아서 file 읽음
		// 경로 찾아갔는데 file이 존재 하지않을때
		
		
		
		
	}
}
