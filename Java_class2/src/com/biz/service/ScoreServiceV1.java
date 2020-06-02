package com.biz.service;

import com.biz.model.ScoreVO;

public class ScoreServiceV1 {

	public void scoreList(ScoreVO[] score) {
		LineService line = new LineService();
		System.out.println(line.do_line(50));
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.printf(line.single(50));
		System.out.println("주소록");

		int sum = 0;
		int avg = 0;

		// for() {} 내에서 선언된 섬 avg 변수는
		// for (){} 명령문이 종료되면 이후에 참조할수 없다.

		for (int i = 0; i < score.length; i++) {

			sum = score[i].getKor();
			sum += score[i].getEng();
			sum += score[i].getMath();
			avg = sum / 3;

			System.out.printf("%s\t%s\t%s\t%s\t%s\t%d\n", score[i].getName(),score[i].getKor(), score[i].getEng(), score[i].getMath(), sum,
					avg);

		}System.out.println(line.do_line(50 ));

	}

}
