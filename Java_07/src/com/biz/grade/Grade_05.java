package com.biz.grade;

import java.util.Random;

public class Grade_05 {

	public static void main(String[] args) {

		Random random = new Random();

		int intKor1;
		int intKor2;
		int intKor3;
		int intKor4;
		int intKor5;
		int intKor6;
		int intKor7;
		int intKor8;
		int intKor9;
		int intKor10;

		intKor1 = random.nextInt(50) + 51;
		intKor2 = random.nextInt(50) + 51;
		intKor3 = random.nextInt(50) + 51;
		intKor4 = random.nextInt(50) + 51;
		intKor5 = random.nextInt(50) + 51;
		intKor6 = random.nextInt(50) + 51;
		intKor7 = random.nextInt(50) + 51;
		intKor8 = random.nextInt(50) + 51;
		intKor9 = random.nextInt(50) + 51;
		intKor10 = random.nextInt(50) + 51;

		int intSum = intKor1;
		intSum += intKor2;
		intSum += intKor3;
		intSum += intKor4;
		intSum += intKor5;
		intSum += intKor6;
		intSum += intKor7;
		intSum += intKor8;
		intSum += intKor9;
		intSum += intKor10;
		
		int intAvg = intSum /10 ;
		System.out.println("총점 :" + intSum);
		System.out.println("평균 :" + intAvg);
		

	}

}
