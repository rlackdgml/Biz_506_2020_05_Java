package com.biz.hello;

import java.util.Random;

public class Var_17 {

	public static void main(String[] args) {
		/*
		 * 변수 이름 짓기
		 * 변수 이름 첫글자 영문소문자
		 * 변수이름은 이름만으로 하는일을 유추할수 있게 짓는것이 좋다
		 * 변수 접두사 변수의 TYPE 명칭을 추가하여 작성
		 * 
		 */
		int intkorsocre;
		int intEngsocre;
		int intMathsocre;
		
		Random rnd = new Random();
		intkorsocre = rnd.nextInt(50) + 51;
		intEngsocre = rnd.nextInt(50) + 51;
		intMathsocre = rnd.nextInt(50)+ 51;
		
		
				
						
					
		int intsum = 0;
		int inAvg = 0;
		intsum = intkorsocre;
		intsum += intEngsocre;
		intsum += intMathsocre;
		
	// = intsum / 3;
		
		System.out.println("총점 : "+ intsum);
		//System.out.println("평균 :" + intAvg);
		
		
		
		
		
	}

}
