package com.yedam.loop;

import java.util.Scanner;

public class while문2 {
public static void main(String[] args) {
	
	// 오락실
	// 투입한 금액만큼 반복문을 진행
	// while문
	// 투입한 금액으로 게임을 몇번 할수있을까?
	// ex 1000 = 2번 , 5000번 = 10번
	int money;
	Scanner sc = new Scanner(System.in);
	System.out.println("===insert Coin===");
	// 돈 투입
	money = Integer.parseInt(sc.nextLine());
	
	// money > 0 ( 투입금액이 500원미만일 경우 방지)
	while(money/500 > 0) {
		System.out.println((money/500) + "판 남음");
		System.out.println("1. 가위바위보 | 2. up & down | 3. 종료");
		// 야구게임 (4개의 무작위번호 맞추기) , 베스킨 만들기
		System.out.println("입력");
		int gameNo = Integer.parseInt(sc.nextLine());
		
		switch (gameNo) {
		case 1:
			System.out.println("가위바위보 실행");
			money -= 500;
			break;
		case 2:
			System.out.println("up, down 실행");
			money -= 500;
			break;
		case 3:
			System.out.println("종료");
			money = 0;
			// money/500 >0
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
