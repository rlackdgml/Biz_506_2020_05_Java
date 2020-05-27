package com.biz.grade;

import java.util.Random;

public class Array_06 {

	public static void main(String[] args) {

		int[] intnum = new int[100];
		// Random 클래스를 사용해서
		// rnd 객체, rnd 인스턴스를 선언
		// rnd 객체 , rnd인스턴스를 사용할수 있도록 초기화 하는 코드
		// Random클래스의 생성자

		Random rnd = new Random();

		// (rnd)인스턴스(instance), 객체(object) : Random 클래스로 만든 rnd 변수
		// .nextInt(100); :Random 클래스 method라고 부른다.
		// rnd 객체의 nextInt() 매서드를 실행하라 라고 한다.
		// rnd 객체의 nextInt() 메서드를 호출하라 라고도 한다.
		rnd.nextInt(100);
		String strN = "홍길동 "; // 문자배열변수 strN
		String strM = new String(); // strN인스터스,strN객체 라고 부른다

		for (int i = 0; i < 100; i++) {
			
			
           // rnd 객체의 nextInt() 메서드를 실행하여(호출하여)
		   // 결과값을 배열 intNum의 i번쨰 위치에 저장(할당, 보관)하라	
		
			intnum[i] = rnd.nextInt(100) + 1;
			

		}
		// 배열에 저장된 요소들중 5개씩 덧셈을 수행할 변수를 선언
		int intsum = 0;

		for (int i = 0; i < 100; i++) {
			System.out.printf("%d\t ", intnum[i]);
			intsum += intnum[i];

			if ((i + 1) % 5 == 0) {
				System.out.printf("%d\t", intsum);
				System.out.println();
				intsum = 0;

			}

		}

	}

}
