package com.biz.score.service;

import com.biz.score.vo.ScoreVO;

public class ScoreServiceV2 {

	private ScoreVO[] scores;

	/*
	 * ScoreServicev1 클래스를 사용해서 어떤 연산을 수행하려고 할대 반드시 setscore() method 를 통해서 scores
	 * 값을 매개변수로 주입을 해주어야 한다. 그렇지 않으면 scores 인스턴스 필드변수가 아직 준비가 안된 상태이기 때문에 이후에 호출되는
	 * method() 들에서 nullpointerException이 발생을 한다
	 */

	public void scoreSum(ScoreVO[] scores) {
		this.scores = scores;

		for (int i = 0; i < scores.length; i++) {

			scores[i].setSum(scores[i].getKor() + scores[i].getEng() + scores[i].getMath() + scores[i].getMusic());

		}

	}

	public void scoreAvg() {
		for (int i = 0; i < scores.length; i++) {
			scores[i].setAvg(scores[i].getSum() / 4);
		}
	}

	public void scoresList() {
		System.out.println("=======================================");
		System.out.println("성적리스트");
		System.out.println("---------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println("---------------------------------------");

		for (int i = 0; i < scores.length; i++) {

			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\n", scores[i].getNum(), scores[i].getKor(),
					scores[i].getEng(), scores[i].getMath(), scores[i].getMusic(), scores[i].getSum(),
					scores[i].getAvg());
		}
		int kor = 0;
		int eng = 0;
		int math = 0;
		int music = 0;
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < scores.length; i++) {
			kor += scores[i].getKor();
			eng += scores[i].getEng();
			math += scores[i].getMath();
			music += scores[i].getMusic();
			sum += scores[i].getSum();
			avg += scores[i].getAvg();

		}
		System.out.println("=============================================");
		System.out.printf("총점\t%d\t%d\t%d\t%d\t%d\t%d\n", kor, eng, math, music, sum, avg);
		System.out.printf("평균\t%d\t%d\t%d\t%d\t%d\t%d\n ", kor / scores.length, eng / scores.length,
				math / scores.length, music / scores.length, sum / scores.length, avg / scores.length);

	}

}
