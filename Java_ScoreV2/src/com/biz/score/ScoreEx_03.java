package com.biz.score;

import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImplV1;
import com.biz.score.service.ScoreServiceImplV2;

public class ScoreEx_03 {

	public static void main(String[] args) {

		ScoreService sService = new ScoreServiceImplV1();    // 인터 객체 = new 생성자 인터페이스는 같고 생성자가 틀려도 교환해서 바꿔쓸수있다.
		while(true) {
			if(!sService.inputScore()) {
				break;
			}
		}
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
	}

}
