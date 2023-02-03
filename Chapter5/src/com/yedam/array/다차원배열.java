package com.yedam.array;

import java.util.Arrays;

public class 다차원배열 {
	public static void main(String[] args) {
		
		// 2차원 배열 
		// 배열안에 2개의 배열이 있고(큰배열)
		// 그 밑에 3데이터가 3개씩 들어있다(작은배열)
		// { {1,2,3,} , {1,2,3} }
		int [][] score = new int[2][3];
		
		// 첫번째 배열의 반복문
		for(int i=0; i<score.length; i++) {
			// 두번째 배열의 반복문
			for(int j=0; j<score[i].length; j++) {
				System.out.println("score["+i+"]["+j+"]=" + score[i][j]);
			}
		}
		
		// 배열로 구구단
		int[][] array = new int[8][9];
		for(int i= 2; i<10; i++) {
			for(int j=1; j<10; j++) {
				
				// 0,0 | 0,1 | 0,2 | 0,3 ~~~
				// 2*1 | 2*2 | 2*3 | 2*4 ~~~ 로 바꿔야함
				array[i-2][j-1] = i * j;
			}
		}
		
		// 배열에 저장된 내용을 출력
		// array[2][3]
		for(int i=0; i<array.length; i++) {
			System.out.print((i+2) + "단 :");
			System.out.print(Arrays.toString(array[i]));
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
