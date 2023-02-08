package com.yedam.access;

import java.util.Scanner;

import com.yedam.oop.Student;

public class test {
	public static void main(String[] args) {
		
		// 문제1
		int x = 10;
		double y = 2.0;
		int z = (int) y;
		
		System.out.println(x+z);
		System.out.println(x-z);
		System.out.println(x*z);
		System.out.println(x/z);
		
		// 문제2
		
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result =((num1 >10) && (num2>10));
				System.out.println(result);
		result =((num1 > 10 || (num2 >10)));
		System.out.println(result);
		System.out.println(!result);
		
		// 문제3
		
		// 큰 금액부터 동전을 우선적으로 거슬러 줘야한다
		int[] coinUnit = new int[4];
		
		int money = 2680;
		
		
		System.out.println("money = " + money);
		for(int i=0; i < coinUnit.length; i++) {
//	    출력예시 500원 5개, 100원 1개, 50원 1개, 10원 3개
		}
		
		
		
		
		// 문제4
		
		for(int a = 2; a<= 9; a++) {
			for(int b= 1; b<=9; b++) {
				if(b==a) {
					break;
				}
				System.out.println(a + " x " +b+ " = "+ (a*b));
			}
		}
		
		
		
		
		// 문제5
		
		Number[] numAry = null;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료");
			System.out.println("입력");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo ==1) {
				
			}else if(selectNo ==2) {
				
			}else if(selectNo ==3) {
				
			}else if(selectNo==4) {
				
			}else if(selectNo==5) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
			
		}
			
		
		
		
		
		
		
		
		
		
		
	}
}
