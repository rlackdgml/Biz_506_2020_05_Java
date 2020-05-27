package com.biz.grade;

public class Array_03 {
	/*
	 * 1 ~ 100까지 범위의 수중 짝수의 개수는 몇 개인가 1 ~ 100까지 범위의 수중 3의 배수의 개수는 몇 개 인가
	 */

	public static void main(String[] args) {

		int num = 0;
		int sum = 0;

		for (int i = 0; i < 100; i++) {

			if (i % 2 == 0) {

				num++;

			}
		}
		System.out.println(num);

		int sum2 = 0;
		for (int j = 0; j < 100; j++) {

			if (j % 3 == 0) {
				sum++;

			}

		}
		System.out.println(sum2);

	}

}
