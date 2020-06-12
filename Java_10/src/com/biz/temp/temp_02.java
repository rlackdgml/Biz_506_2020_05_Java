package com.biz.temp;

public class temp_02 {

	public static void main(String[] args) {

		int a = 30;
		int b = 15;
		int c = 20;
		int temp = 0;

		for (int i = 0; i <= 15; i++) {
			if (i == 15) {
				a  =  i;
			
				
			}

		}
		for (int i = 0; i <= 30; i++) {
			if (c < i) {

				temp = i;
				i = c;
				c = temp;
			}

		}

		for (int i = 0; i <= 20; i++) {
			if (b < i) {
				temp = i;
				i = b;
				b = temp;
			}
		}

		System.out.println(a + "<" + b + "<" + c);
	}

}
