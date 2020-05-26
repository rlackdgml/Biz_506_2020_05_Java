package com.biz.grade;

public class Grade_07 {
	/*
	 * 100명 학생의 국어점수를 임의로 만들어서 변수에 담고
	 * 총점과 평균을 구하고 싶다.
	 * 
	 */
	
	public static void main(String[] args) {
		
		int intKor_01 = 0;
		intKor_01 = 99;
		
		int intKor_02 = 0;
		intKor_02 = 77;
		
		int[] intKorScore = new int[100] ;   // 배열 Array
		intKorScore[0] = 88;                           // (개수 - 1)
		
		intKorScore[88] = 100;                  // 어느 위치에 저장을 할 수를 저장
		
		System.out.println(intKorScore[0]);
		System.out.println(intKorScore[88]);
		
		
		
		
	
		
	}

}
