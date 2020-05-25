package com.biz.hello;

import java.util.Random;

public class Var_16 {

	public static void main(String[] args) {
		Random rnd = new Random();

		int intkor, intEng, intMath;

		intkor = rnd.nextInt(50) + 51;
		intEng = rnd.nextInt(50) + 51;
		intMath = rnd.nextInt(50) + 51;

		int sum = intkor + intEng + intMath;
		int avg = sum / 3;

		System.out.println("총점" + sum);
		System.out.println("평균" + avg);
	}

}
