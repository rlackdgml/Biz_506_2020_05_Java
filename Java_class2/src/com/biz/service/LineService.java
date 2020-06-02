package com.biz.service;

public class LineService {
	
	/*
	 * 클래스에 method를 선언해두고
	 * 클래스를 인스턴스로 생성하여 매서드를 호출하여
	 * 복잡하거나 반복적인 코드를 간편하게 구현할수 있다.
	 */
	
		
	
	public static String single(int num) {

		// 문자열 변수를 선언하고
		// 값을 clear
		String line = "";
		for (int i = 0; i < num; i++) {
			line += "=";

		}
		return line;
	}
      public static String do_line (int num) {
    	  String line = "";
    	  
    	  
    	  for( int i = 0; i < num ;  i++) {
    		  line += "-";
    		  
      } return line;
      
	
	}

	
	}


