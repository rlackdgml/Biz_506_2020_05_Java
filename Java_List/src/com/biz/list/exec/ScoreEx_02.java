package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.ScoreVO;
import com.biz.list.service.ScoreServiceV1;
import com.biz.list.service.ScoreServiceV2;

public class ScoreEx_02 {
	
	

	public static void main(String[] args) {
		
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		Random rnd = new Random();
		
		ScoreVO scoreVO ;
		for(int i = 0 ; i < 10 ; i++) {
			// vo 인스턴스를 초기화, 다시생성하라
			scoreVO = new ScoreVO(); 
			
			//(필드변수에)값을 세팅하고
			scoreVO.setNum("" + (i+1));
			scoreVO.setKor(rnd.nextInt(50)+51);
			scoreVO.setMath(rnd.nextInt(50)+51);
			scoreVO.setEng(rnd.nextInt(50)+51);
			
			//리스트에 추가
			
			scoreList.add(scoreVO);
			
			
		
		}
		ScoreServiceV1 sService = new ScoreServiceV1();
		sService.scoreList(scoreList);
		ScoreServiceV2 sService1 = new ScoreServiceV2();
		sService.scoreList(scoreList);
		
	
		
		
	}

}
