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
			avg = sum / 3;

		}
		return;

	}

	public void socreList(List<ScoreVO> scoreList) {
		
		System.out.println("====================================");
		System.out.println("성적리스트");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t ");
		System.out.println("-------------------------------------");
		
		int scoreSize = scoreList.size();
		for(int i = 0 ;i < scoreSize; i++) {
			ScoreVO sVO1 = scoreList.get(i);
			System.out.print(sVO1.getNum() + "\t");
			System.out.print(sVO1.getKor() + "\t");
			System.out.print(sVO1.getEng() + "\t");
			System.out.print(sVO1.getMath() + "\t");
			
			int sum = sVO1.getKor();
			sum += sVO1.getEng();
			sum += sVO1.getMath();
			
			System.out.println(sum);
			
		}
		System.out.println("==========================================================");
		
	}
}
