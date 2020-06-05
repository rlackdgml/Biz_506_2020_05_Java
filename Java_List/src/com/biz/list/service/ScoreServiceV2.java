package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {

	int sum = 0;

	public void stSum(List<ScoreVO> scoreList) {

		for (int i = 0; i < scoreList.size(); i++) {
			ScoreVO sVO = scoreList.get(i);
			sum = sVO.getKor() + sVO.getEng() + sVO.getMath();

		}
		return;

	}

	int avg = 0;

	public void stAvg(List<ScoreVO> scoreList) {
		for (int i = 0; i < scoreList.size(); i++) {
			ScoreVO sVO = scoreList.get(i);
			avg = sVO.getKor() + sVO.getEng() + sVO.getMath() / 3;

		}
		return;

	}

	public void scoreList(List<ScoreVO> scores) {

		System.out.println("====================================");
		System.out.println("성적리스트");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t ");
		System.out.println("-------------------------------------");

		int scoreSize = scores.size();
		for (int i = 0; i < scoreSize; i++) {
			ScoreVO sVO = scores.get(i);
			System.out.print(sVO.getNum() + "\t");
			System.out.print(sVO.getKor() + "\t");
			System.out.print(sVO.getEng() + "\t");
			System.out.print(sVO.getMath() + "\t");
			System.out.print(sVO.getStsum() + "\t");
			System.out.print(sVO.getStAvg() + "\t");

			int sum = sVO.getKor();
			sum += sVO.getEng();
			sum += sVO.getMath();
			sum += sVO.getStsum();
			sum += sVO.getStsum();

			System.out.println(sum);

		}
		System.out.println("============================================================");
		int kor = 0;
		int eng = 0;
		int math = 0;
		int music = 0;
		int stSum = 0;
		int stAvg = 0;
		
		for (int i = 0; i < scores.size(); i++) {
			
			ScoreVO sVO = scores.get(i);
			
			kor += sVO.getKor();
			eng += sVO.getEng();
			math += sVO.getMath();
			stSum += sVO.getStsum();
			stAvg+= sVO.getStAvg();
	

			

	}System.out.println("=============================================");
	System.out.printf("총점\t%d\t%d\t%d\t%d\t%d\t%d\n", kor, eng, math, music, stSum, stAvg);
	System.out.printf("평균\t%d\t%d\t%d\t%d\t%d\t%d\n ", kor / scores.size(), eng / scores.size(),
			math / scores.size(), music / scores.size(), stSum / scores.size(), stAvg / scores.size());


}

	
	}

