package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.ScoreVO;

public class ScoreService02 {

	// 성적리스트를 저장하기 위한 객체
	List<ScoreVO> scoreList;

	// 키보드를 사용하여
	private Scanner scan;

	// 이과정을 생략하면
	public ScoreService02() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	// 한학생의 성적을 입력받아서 에 추가하는 메서드
	// 변경
	// 학생의 성적을 입력받는 과정에서 학번에 END라는 문자열을
	// 입력하게 되면 성적 입력을 중단하도록 변경
	public boolean inputScore() {
		ScoreVO scoreVO = new ScoreVO();

		System.out.print("학번>> ");
		String strNum = scan.nextLine();
		if (strNum.equals("END")) {
			return false;
		}

		System.out.print("국어 >> ");
		String strKor = scan.nextLine();
		int intKor = 0;
		try {
			intKor = Integer.valueOf(strKor);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("국어는 숫자만 가능!!");

		}
		if (!scoreVO.setKor(intKor)) {
			System.out.println("국어점수는 0~100까지만가능");
			System.out.println(" 국어점수는 임시로 0으로 세팅");
		}

		System.out.print("영어 >> ");
		String strEng = scan.nextLine();
		int intEng = 0;
		try {
			intEng = Integer.valueOf(strEng);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("영어는 숫자만 가능!!");
		}

		System.out.print("수학 >> ");
		String strMath = scan.nextLine();
		int intMath = 0;
		try {
			intMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("수학은 숫자만 가능!!");
		}

		// int형으로 변환된 점수를 에 일단 담기

		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);

		int intSum = intKor + intEng + intMath;
		// 총점 계산
		int sum = scoreVO.getKor();
		sum += scoreVO.getEng();
		sum += scoreVO.getMath();

		float Avg = (float) sum / 3;
		scoreVO.setSum(sum);
		scoreVO.setAvg(Avg);

		// 한학생의 성적 입력받아 scoreList에 담기 완료
		scoreList.add(scoreVO);

		return true;

	}

	public void scoreList() {

		System.out.println("============================================");
		System.out.println("성적일람표");
		System.out.println("============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------");

		// scoreList개수가 몇개인지 파악하여 변수에 저장
		int scoreSize = scoreList.size();

		for (int i = 0; i < scoreSize; i++) {
			// list에서 ScoreVO를 추출한다
			ScoreVO sVO = scoreList.get(i);
			System.out.print(sVO.getNum() + "\t");
			System.out.print(sVO.getKor() + "\t");
			System.out.print(sVO.getEng() + "\t");
			System.out.print(sVO.getMath() + "\t");
			System.out.print(sVO.getSum() + "\t");
			System.out.print(sVO.getAvg() + "\n");
		}

	}
}
