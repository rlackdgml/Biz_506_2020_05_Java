package com.biz.grade;

import java.util.Random;

public class Grade_10 {

	public static void main(String[] args) {

		int[] intKorScore = new int[10];
		int[] intEngScore = new int[10];
		int[] intMathScore = new int[10];

		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {

			intKorScore[i] = rnd.nextInt(50) + 51;
			intEngScore[i] = rnd.nextInt(50) + 51;
			intMathScore[i] = rnd.nextInt(50) + 51;
		}

		int intKorScoreSum = 0;
		int intEngScoreSum = 0;
		int intMathScoreSum = 0;

		for (int i = 0; i < 10; i++) {

			intKorScoreSum = intKorScore[i];
			intEngScoreSum = intEngScore[i];
			intMathScoreSum = intMathScore[i];
		}
		System.out.println("========================");
		System.out.println("학생 성적리스트");
		System.out.println("-------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t");
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d\t %d\t %d\t %d\t %d\t\n" ,
			i+1,
			intKorScore[i],
			intEngScore[i],
			intMathScore[i],
			intKorScore[i] + intEngScore[i] +intMathScore[i] );
			

		} System.out.println("======================================");
		  System.out.println("\t%d \t%d \t%d \t%d) \t%d");
		   
		  
		  
		

	}

}
