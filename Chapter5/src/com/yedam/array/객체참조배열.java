package com.yedam.array;

public class 객체참조배열 {
	public static void main(String[] args) {
		
		// String 배열
		// Scanner 활용해서 index 바꿔주는거도 있음
		
		String[] strArray = new String[3];
		strArray[0] = "yedam";
		strArray[1] = "yedam";
		strArray[2] = new String("yedam");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]); 
		System.out.println(strArray[0].equals(strArray[2]));  // equals는 string에서 데이터 비교할때
		
		// 배열 복사
		int[] oldArray = {1,2,3};
		int[] newArray = new int[5];
		
		// 배운거로?하면
		for(int i=0; i<oldArray.length;i++) {
			newArray[i] = oldArray[i];
		}
		for(int i=0; i<newArray.length; i++) {
			System.out.println(newArray[i]);
		}         // .
		
		// 배열 복사
		int[] oldArray2 = {1,2,3,4,5,6,7};
		int[] newArray2 = new int[10];
		
		System.arraycopy(oldArray2, 0, newArray2, 0, oldArray2.length);  // 복사할배열 , 몇번부터 , 붙여놓을배열, 몇번부터, 몇개 복사할지
		for(int i=0; i<newArray2.length; i++) {
			System.out.println(newArray2[i]);
		}
		
		for(int temp : newArray2) {
			System.out.print(temp+"\t");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
