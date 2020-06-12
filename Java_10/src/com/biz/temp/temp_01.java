package com.biz.temp;

public class temp_01 {

	public static void main(String[] args) {

		int a = 30;
		int b = 15;
		int c = 20;
		int temp = 0;

		
		if (b < c) {
			temp = b;
			b = c;
			c = temp;

		}

		if (c < a) {
			temp = c;
			c = a;
			a = temp;
			
		}
		System.out.println(a + "<" + b + "<" + c);
		
	}

}

