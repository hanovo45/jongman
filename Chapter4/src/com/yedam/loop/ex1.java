package com.yedam.loop;

public class ex1 {
	public static void main(String[] args) {
	
		// 반복문
		// 일정한 행동을 계속 반복
		// 반복을 할때 어떠한 규칙에 따라 행동 반복
		// 규칙 찾는게 중요
		
		// 1 ~ 5까지 누적의 합
		
//		int sum = 0;
////		sum = sum +1;
////		sum = sum +2;
////		sum = sum +3;
////		sum = sum +4;
////		sum = sum +5;
//	
//		// for문
//		for(int i = 1; i <=5; i++) {
//			sum = sum + i;
////			sum += i;
//		}
//		System.out.println("누적합 : " + sum);
	
		// 1 ~ 100 사이에서 짝수 구하는 반복문
		// 1 ~ 100 -> 1 ~ 100까지 반복
		// % 2 
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 0) {
//				System.out.print(i + "\t");
//			}
//		}
		
		// 1 ~ 100 사이에서 홀수 구하는 반복문
				// 1 ~ 100 -> 1 ~ 100까지 반복
				// % 2 
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 1) {
//				System.out.print(i + "\t");
//			}
//		}
		
		// 1 ~ 100 사이에서 2의 배수 또는(or) 3의 배수 찾기
		// 2의 배수 -> 어떤 값을 2로 나누엇을때 0인 애들
		// 2의 배수 -> 어떤 값을 3로 나누엇을때 0인 애들
		
//		for(int i=1; i <= 100; i++) {
//			if(i % 2 == 0 || i % 3 == 0) {
//				System.out.println("2 또는 3의 배수 :" + i);
//			}
//		}
		
		// 구구단 출력하기
		// 2 * i = x
//		for(int i = 1; i < 10; i++) {
//			System.out.println("2 X " + i + " = " + (2 * i));
//		}
		
		
		// 중첩 for문
		// 반복문 안에 반복문이 들어가는 형태
		
//		for() {
//			for() {
//				for() {
//				}
//			}
//		}
		// 2단 = 2x1 , 2x2 , 2x3
		// 3단 = 3x1 , 3x2 , 3x3
		// 4단 = 4x1 , 4x2 , 4x3
		// 2 ~ 9단까지 출력하는 반복문
		
		// i = 2 ~ 9
//		for(int i = 2; i <= 9; i++) {
//		// j = 1 ~ 9 
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + (i * j));
//			}
//		}
		
		// 구구단 단별로 나누기
		// 줄수를 의미하는 for문
//		for(int i = 1; i <= 9; i++) {
//			// 해당 줄수에서 한칸씩 늘어나는 for문
//			for(int j = 2; j < 5; j++) {
//				System.out.print(j + " * " + i + " = " + (j * i) + '\t');
//			}
//			System.out.println();
//		}
		
		// 별찍기
//		*****
//		*****
//		*****
//		*****
//		*****
		// 한칸씩 내려 갈때 쓰는 반복문
//		for(int i =0; i<5; i++) {
//			// 별 출력할때 쓰는 반복문
//			String star = "";
//			for(int j=0; j<5; j++) {
//				// +연산자를 활용해서 ***** 만듬
//				star = star + "*";
////				System.out.println("*");
//			}
//			System.out.println(star);
////			System.out.println();
//		}
		
		// * 1개씩 늘리기
		
//		for(int i=1; i<=5; i++) {
//			String star = "";
//			for(int j=0; i>j; j++) {
//				star = star + "*";
//		}
//			System.out.println(star);
//		}
//		
//		// ***** 에서 1개씩 빼기
		// ****
//		for(int i=5; i>=1; i--) {
//			String star = "";
//			for(int j=1; i>=j; j++) {
//				star = star + "*";
//		}
//			System.out.println(star);
//		}
		// ***** 에서 1개씩 빼기
		// ****
//		for(int i=1; i<=5; i++) {
//			String star = "";
//			for(int j=5; i<=j; j--) {
//				star = star + "*";
//			}
//			System.out.println(star);
//		}
		
		
		
			//i값   j값
//		    * 1  4  1
//		   ** 2  3  2
//		  *** 3  2  3 
//		 **** 4  1  4 
//		***** 5  0  5
		
			for(int i=5; i>0; i--) {
				for(int j=1; j<=5; j++) {
					if(i>j) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
			}
				System.out.println();
		}
		
				
//		for(int i=1; i<=5; i++) {
//			String star = "";
//			for(int j=1; j<=i; j++) {
//				star += "";
//			}
//			for(int k=4; k<=i; k--) {
//				 star += "*";
//			}
//			System.out.println(star);
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
}
