package com.biz.score.exec;

import java.util.Random;

import com.biz.score.service.ScoreServiceV1;
import com.biz.score.service.ScoreServiceV2;
import com.biz.score.vo.ScoreVO;

public class ScoreEx_01 {

	public static void main(String[] args) {
		Random rnd = new Random();

		ScoreVO[] scores = new ScoreVO[10];

		for (int i = 0; i < scores.length; i++) {

			scores[i] = new ScoreVO();
		}
		for (int i = 0; i < scores.length; i++) {
			scores[i].setNum("" + (i+1));
			scores[i].setKor(rnd.nextInt(50) + 51);
			scores[i].setEng(rnd.nextInt(50) + 51);
			scores[i].setMath(rnd.nextInt(50) + 51);
			scores[i].setMusic(rnd.nextInt(50) + 51);

			

		}
		/*
		 * ScoreSservicev1 에 선언되어 있는 스코어vo[] 스코어스는
		 * 아직 선언만 되고 초기화 등이 전혀 이루어지지 않은 상태이다
		 * 때문에 스코어스 인스턴스 배열이 초기화 되거나
		 * 값이 저장되지 않으면
		 * 이후에 호출되는 method에서 nullpointerException이
		 * 발생하고 코드가 진행되지 않는다
		 */
		ScoreServiceV1 scoreService = new ScoreServiceV1();
		scoreService.setScoreList(scores);
		scoreService.scoreSum();
		scoreService.scoreAvg();
		scoreService.scoresList();
		/*
		 * scoreServiceV1에서는 스코어스배열을 중비하는 매서드
		 * setScore() 라고 별도로 작성해 두엇는데
		 * 사용하기 위해 작성을 하는 과정에서
		 * 셋스코어() 먼저 호출해서 스코어스를 전달해야 하는 것을
		 * 자주 잊게 되더라
		 * 그리하여 nullpointException 이 발생하는 경우가 많더라
		 * 
		 * 그래서 스코어서비스v2 에서는 
		 * 성적처리를 하는 과정에서 반드시 호출할 수 밖에 없는 
		 * 메서드들 중에
		 * 호출되는 순서로 봤을떄 항상 제일먼저 호출할 것으로 
		 * 생각되는 socresSum() method 에 매개변수를 전달하는
		 * 역할을 수행하도록 코드를 변경했다.
		 */
		ScoreServiceV2 sService2 = new ScoreServiceV2();
		sService2.scoreSum(scores);
		sService2.scoreAvg();
		sService2.scoresList();
		
		
		
		
		
		

	}
}