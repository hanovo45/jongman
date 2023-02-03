package com.yedam.array;

import java.util.Scanner;

public class 배열에for문 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 한 학생의 국영수 성적을 보관하는 배열
		
		// 배열 생성
		
		int[] point = new int[3];
		
		// 국 영 수 순으로 입력
		
		System.out.println("국어 점수");
		point[0] = Integer.parseInt(sc.nextLine());
		System.out.println("영어 점수");
		point[1] = Integer.parseInt(sc.nextLine());
		System.out.println("수학 점수");
		point[2] = Integer.parseInt(sc.nextLine());
		
		// 점수의 총 합계
		
		int sum=0;
		// for문
		for(int i=0; i<point.length; i++) {
			sum += point[i];
		}
		System.out.println(sum);
		// 향상된 for문
		sum=0;
		for(int var : point) {
			sum += var;
		}
		System.out.println(sum);
		
		// 점수의 평균 ( 실수로 )
		
		System.out.println((double)sum/3);
		
		double avg = (double)sum/point.length;
		System.out.println(avg);
		
		// 최대값 구하기
		int max = 0;
		for(int i=0; i<point.length; i++) {
			if(point[i] > max) {
				max = point[i];
			}
		}
		System.out.println("최대값 : " + max);
		
		// 최소값 구하기
		
		int min = point[0];   //<<배열에서 인덱스번호 0이 제일 작은 값이라면 디폴트로 주어진 값이 [0]이라서 결국 최소값은 배열[0]으로 결과나옴.
		for(int i=0; i<point.length; i++) {
			if(point[i] < min) {
				min = point[i];
			}
		}
		System.out.println("최소값 : " + min);
		
		
		
		
		
		
		
	}
}
