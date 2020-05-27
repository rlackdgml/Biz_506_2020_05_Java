package com.biz.grade;

import java.util.Random;

public class Array_01 {
	/*
	 * 1. 20명 학생의 국어 영어 수학 음악점수를 저장하기 위한 배열선언 2. 각배열에 51 ~ 100 점의 점수를 생성하여 저장 3.
	 * 각학생의 점수총점 평균을 계산하고 4. 과목별 점수총점 평균을 계산하여 5. 성적 리스트를 Console 에 표시하시어
	 */

	public static void main(String[] args) {

		Random rnd = new Random();
		// 20개의 저장공간을 가진 변수를 선언
		//integer 형 배열 20개씩을 선언 : 20개의  저장공간을 가진 변수
		// intKor라는 배열을 20(개 의  저장 공간) 갖는 integer 형 배열을 생성

		int[] intKor = new int[20];
		int[] intEng = new int[20];
		int[] intMath = new int[20];
		int[] intmusic = new int[20];
		
		// 임의 숫자를 생성하기 위한 도구를 선언하기
		// Random 클래스를 이용해서 rnd 라는 변수(도구)를 선언하고
		// new Random() 초기화 코드를 사용해서 사용준비
		
		// 이 명령코드가 실행될때마다 임의 정수를 만들어낸다
		  rnd.nextInt();
		  //이 명령코드가 실행될때마다 0~99 까지의 임의 정수를 만들어낸다.
		  //rnd.nextint(100);
		  /*
		   * 위에서 생성한 4개의 배열에 각각 20개의 점수를 할당하기 위해
		   * 배열의 개수만큼 반복문을 실행하고,
		   * 반복문이 실행되면서 만들어지는 i 변수의 값을 각 배열의 index로 주입하여
		   * 배열[0] ~ 배열[19] 까지의 저장공간에 값을 할당하기 위해 시작하는 반복문 코드
		   * intkor[0] ~ intkor[19], inteng[0] ~ inteng[19] .....
		   * 이러한 위치가 지정된 변수에 임의 정수값을 생성하여 할당한다
		   * 성적처리를 테스트하기 위한 임의 점수를 만들어서 배열에 저장하는 코드
		   */

		for (int i = 0; i < 20; i++) {

			intKor[i] = rnd.nextInt(50) + 51;
			intEng[i] = rnd.nextInt(50) + 51;
			intMath[i] = rnd.nextInt(50) + 51;
			intmusic[i] = rnd.nextInt(50) + 51;

		}
		
		// 과목별로 총점을 계산하여 보관할 변수를 선언
		int intKorsum = 0;
		int intEngsum = 0;
		int intMathsum = 0;
		int intmusicsum = 0;

		for (int i = 0; i < 20; i++) {

			intKorsum += intKor[i];
			intEngsum += intEng[i];
			intMathsum += intMath[i];
			intmusicsum += intmusic[i];

		}
		//=======================================
		// 국어         영어       수학           음악           총점
		// --------------------------------------------------
		// intkor[0] + inteng[0] + intmath[0]  +   intmusic[0]  =   intstsum[0]
		// intkor[1] + inteng[1]  intmath[1]     intmusic[1]     intstsum[1]              //표(table)
		// intkor[2] + inteng[2]  intmath[2]     intmusic[2]     intstsum[2]
		// intkor[3] + inteng[3]  intmath[3]     intmusic[3]     intstsum[3]
								
		
		// 학생들의 과목별 총점을 계산하여 저장할 배열을 또 20개 선언 
		int[] intstsum = new int[20];
		for(int i = 0 ; i < 20 ; i++) {
			// 총점배열에 학생들의 성적총점을 계산하여 저장
			intstsum[i] = intKor[i] ;
			intstsum[i] += intEng[i] ;
			intstsum[i] += intMath[i] ;
			intstsum[i] += intmusic[i] ;
			
			
		}
		
		System.out.println("===============================================================");
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t 평균\t \n");
		System.out.println("========================================================");
		System.out.println("학생 성적리스트");
		System.out.println("-------------------------");
		
		

		for (int i = 0; i < 20; i++) {
			
			

			System.out.printf("%d\t %d\t %d\t %d\t %d\t %d\t \n", 
					i + 1, 
					intKor[i], 
					intEng[i],
					intMath[i], 
					intmusic[i],
					intKor[i] + intEng[i] + intMath[i] + intmusic[i]);
			
			
			
			System.out.println("--------------------------------------");
			System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t 평균\t \n");
		    System.out.printf(" %d\t %d\t %d\t %d\t %d\t %d\t   \n",
		    		intKor[i],intEng[i] , intMath[i] , intmusic[i],
		    		intstsum[i], intstsum[i] / 4 );
		    
	}
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t 평균\t \n");
		  
		
	}

}
