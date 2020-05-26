package com.biz.grade;

import java.util.Random;

public class Grade_12 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNum = new int[10];

		for (int i = 0; i < 10; i++) {

			intNum[i] = rnd.nextInt(50) + 51;
			int sum;

		}
		int intsum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			intsum += intNum[i] ;
			
		}

	} 
	


}
