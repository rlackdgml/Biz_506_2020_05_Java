package com.biz.grade;

import java.util.Random;

public class Grade_01 {

	public static void main(String[] args) {

		int stdCount = 20;

		int[] intkor = new int[stdCount];
		int[] inteng = new int[stdCount];
		int[] intmath = new int[stdCount];
		int[] intmusic = new int[stdCount];
		int[] intart = new int[stdCount];

		Random rnd = new Random();
		for (int i = 0; i < stdCount; i++) {
			intkor[i] = rnd.nextInt(50) + 51;
			inteng[i] = rnd.nextInt(50) + 51;
			intmath[i] = rnd.nextInt(50) + 51;
			intmusic[i] = rnd.nextInt(50) + 51;
			intart[i] = rnd.nextInt(50) + 51;

		}
		
		int[]stdsum = new int[stdCount];
		int[] stdavg = new int[stdCount];

		for (int i = 0; i < stdCount; i++) {
			stdsum[i] = intkor[i];
			stdsum[i] += inteng[i];
			stdsum[i] += intmath[i];
			stdsum[i] += intmusic[i];
			stdsum[i] += intart[i];

			stdavg[i] = stdsum[i] / 5;

		}
		int intkorsum = 0;
		int intengsum = 0;
		int intmathsum = 0;
		int intmusicsum = 0;
		int intartsum = 0;

		for (int i = 0; i < stdCount; i++) {

			intkorsum += intkor[i];
			intengsum += inteng[i];
			intmathsum += intmath[i];
			intmusicsum += intmusic[i];
			intartsum += intart[i];

		}
		System.out.println("==================================================");
		System.out.println("학생 성적 알림표");
		System.out.println("===================================================");
		System.out.println("학번\t 국어\t 영어\t 수학\t 음악\t 미술\t 총점\t 평균\t");
		System.out.println("===================================");
		for (int i = 0; i < stdCount; i++) {
			System.out.printf("%d\t %d\t %d\t %d\t %d\t %d\t %d\t %d\t\n", (i + 1), intkor[i], inteng[i], intmath[i],
					intmusic[i], intart[i], stdsum[i], stdavg[i]);

			// printf에서 format 기호
			// %d : (deciaml) 정수 ,십진수 등을 표현하는 기호
			// %s : (string) 문자열을 표현하는 기호
			// \t : tab(8칸) 만큼 빈칸을 만들어라
			// \n : ente를 누른것처럼 줄바꿈을 하여라

		}
		System.out.println("====================================");
		int inttotalsum ;
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\t %d\t \n", 
				"총점", 
				intkorsum, intengsum, intmathsum,
				intmusicsum, intartsum );

	}
	
	

}
