package com.yedam.array;

import java.util.Scanner;

public class 교재202p {
	public static void main(String[] args) {
		
		// 202p
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			if(selectNo ==1) {
				
				System.out.println("학생수>");
				studentNum = Integer.parseInt(sc.nextLine());
				
			}else if(selectNo == 2) {
				
				// 1번 메뉴를 변경하고 싶을때를 대비해서
				
				scores = new int[studentNum];
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]>");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
//				System.out.println("점수입력");
//				scores[0] = Integer.parseInt(sc.nextLine());
//				System.out.println("점수입력");
//				scores[1] = Integer.parseInt(sc.nextLine());
//				System.out.println("점수입력");
//				scores[2] = Integer.parseInt(sc.nextLine());
				
			}else if(selectNo == 3) {
				
				// 배열에 담긴 데이터를 출력
//				int i = 0;
//				for(int var : scores) {
//					System.out.println("scores["+i+"]" + var);
//					i++;
//				}
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]" + scores[i]);
				}
			
				
			}else if(selectNo == 4) {
				
				// 최고값 , 평균
				int max= scores[0];
				int sum = 0;
//				double avg = 0;
				for(int i=0; i<scores.length; i++) {
					
					// 최고값 구하기
					if(scores[i] > max) {
						max = scores[i];
					}
					
					// 합계 구하기
					sum += scores[i];
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + (sum/(double)scores.length));
				
			}else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
		
	}
}
