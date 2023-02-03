package com.yedam.array;

public class 최대값과최소값의인덱스구하기 {
	public static void main(String[] args) {
		
		// 최대값 또는 최소값이 위치하는 인덱스 구하기
		int[] array = {30, 10, 30, 20, 40, 50 ,22,6,2,31,1};
		int max= 0;
		int index = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
				index = i;
			}
		}
		System.out.println(max);
//		index=i;
		System.out.println("최대값일 때 인덱스 번호는 "+index);
		
		
		int min = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		System.out.println(min);
//		index=i;
		System.out.println("최소값일 때 인덱스 번호는 "+index);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
