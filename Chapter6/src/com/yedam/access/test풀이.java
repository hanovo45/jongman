package com.yedam.access;

import java.util.Scanner;

public class test풀이 {
	public static void main(String[] args) {
		
		// 1. 두개 변수를 사칙연산을 활용한 정수로 출력
		// 2. 비교연산자의 결과 제출( 논리 부정 연산자 )

		// 3. 주어진금액 -> 동전으로 바꾸엇을때 몇개필요한지
		// 2680투입, 500,100,50,10 높은금액부터 출력
		
		int[] coinUnit = new int[4];
		int money = 2680;
		System.out.println("money=" + money);
		for(int i=0; i<coinUnit.length; i++) {
			//출력예시 500원 5개, 100원 1개, 50원 1개, 10원 3개
			// 여기풀기
			if(money > 500) {
				// 몫이면서 500원짜리의 개수
				coinUnit[i] = money/500;  
				money = money - (coinUnit[i] * 500);
				System.out.println("500원 : " + coinUnit[i] + "개");
//				System.out.println(money);
			}else if(money > 100) {
				coinUnit[i] = money/100;
				money = money - (coinUnit[i] * 100);
				System.out.println("100원 : " + coinUnit[i] + "개");
//				System.out.println(money);
			}else if(money > 50) {
				coinUnit[i] = money/50;
				money = money - (coinUnit[i] * 50);
				System.out.println("50원 : " + coinUnit[i] + "개");
//				System.out.println(money);
			}else if(money > 10) {
				coinUnit[i] = money/10;
				money = money - (coinUnit[i] * 10);
				System.out.println("10원 : " + coinUnit[i] + "개");
//				System.out.println(money);
			}
		}
		
		
		// 4. 구구단을 단이랑 같거나 1작게 출력
		// 4단-> 4*1 ~ 4*3 or 4*4 , 8단-> 8*1 ~ 8*7 or 8*8
		for(int m=2; m<=9; m++) {
			System.out.println("***"+m+"단***");
			for(int n=1; n<=m; n++) {
				System.out.println(m+" * "+n+" = " + (m*n) + "\t");
			}
			System.out.println();
		}
		
		
		// 5. 1.주사위 크기 2.주사위 굴리기 3. 결과보기 4.가장많이 나온수 5.종료 
		
		// 메뉴1 주사위 크기 5~10을 받고 범위 벗어날 경우 범위 안내 메시지
		// 메뉴2 5가 나올떄까지 주사위 굴린 횟수
		// 메뉴3 메뉴2에서 각 주사위 수별로 몇번 나왔는지
		// 메뉴4 메뉴2에서 가장 많이 나온수 몇인지 구하고 출력
		// 		가장 많이 나온수가 여러개일 경우 가장 적은수 출력
		// 메뉴5 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		int[] dice = null;
		int size = 0;
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.주사위 크기 2.주사위 굴리기 3. 결과보기 4.가장많이 나온수 5.종료");
			System.out.println("메뉴 입력");
			String selectNo = sc.nextLine();
			
			switch(selectNo) {
			case "1":
				System.out.println("주사위 크기");
				size = Integer.parseInt(sc.nextLine());
				// 7입력 -> 배열크기(사이즈) = 7
				// 배열입장 -> 0~6 -> 주사위 비유 -> 1~7
				
				// if문 활용해서 경고창
				if(size <5 || size > 10) {
					System.out.println("5~10 사이의 수를 입력하세요");
				}
				break;
			case "2":
				// 주사위 크기 설정
				// 5가 나올때 까지 반복문을 진행 -> for문보다 while문이 편함
				// 랜덤값을 활용해서 숫자를 뽑아낸다.
				// 5가 등장하면 반복문을 종료.
				dice = new int[size];
				// 주사위를 몇번 굴렸는지 확인
				int count = 0;
				// 5가 나올떄가지반복하는 반복문
				while(true) {
					// 랜덤값 추출
					int random = (int)(Math.random() * dice.length) +1;     // size = dice.length
					// 각 숫자를 배열에 저장
					// 랜덤으로 나온 숫자 -> 배열에서 인덱스로 적용
					// 3-> 배열에서 인덱스2
					dice[random-1] = dice[random-1] +1;
					count++;
					// 숫자 5가 등장하면 반복문 종료(숫자를 그만 가지고와야한다)
					if(random ==5) {
						break;
					}
				}
				System.out.println("5가 나올때까지 주사위를 "+count+"번 굴렸습니다");
				break;
			case "3":
				for(int i=0; i<dice.length; i++) {
					System.out.println((i+1+"은 " +dice[i]+"번 나왔습니다"));
				}
				break;
			case "4":
				int max = dice[0];
				int index = 0;
				for(int i=0; i<dice.length; i++) {
					if(max<dice[i]) {
						max = dice[i];
						index = i;
					}
				}
				System.out.println("가장 많이 나온 수는 "+(index+1)+"입니다");
				break;
			case "5":
				System.out.println("프로그램 종료");
				run = false;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
