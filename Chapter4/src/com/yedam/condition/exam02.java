package com.yedam.condition;

import java.util.Scanner;

public class exam02 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("성적입력>");
	// 입력한  문자열 변수에 저장
	String point = sc.nextLine();
	// 문자열을 int형으로 형 변환하는 과정
	int scores = Integer.parseInt(point);
	
	String pass = "";
	// 1)
	// 90이상 a
	// 80 ~ 89 b
	// 70 ~ 79 c
	// 60 ~ 69 d
	// 2)
	// 100점도 a학점 추가 -> 한줄
	
	if(scores >= 90) {
		pass = "A";
	}else if(scores >=80) {
		pass = "B";
	}else if(scores >= 70) {
		pass = "C";
	}else {
		pass = "D";
	}
	System.out.println("학점 : " + pass + "입니다");
	
	// switch문 부등호 사용 못함
	//   / (나누기 연산자) 
	//      99~90 / 10 = 9 , 89 ~ 80 / 10 = 8
	
	switch(scores / 10) {
	case 10 :    // 
	case 9:
		pass = "A";
		break;
	case 8:
		pass = "B";
		break;
	case 7:
		pass = "C";
		break;
	default :
		pass = "D";
		break;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
