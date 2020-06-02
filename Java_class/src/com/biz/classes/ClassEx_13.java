package com.biz.classes;

import com.biz.classes.model.BankVO;
import com.biz.classes.service.BankServiceV2;

public class ClassEx_13 {
	
	public static void main(String[] args) {
		
		BankVO[] bankList = new BankVO[5];
		for(int i = 0;   i<bankList.length ; i ++) {
			
		
		bankList[0] = new BankVO();
		bankList[1] = new BankVO();
		bankList[2] = new BankVO();
		bankList[3] = new BankVO();
		bankList[4] = new BankVO();
		
			bankList[0].setNum("001");
			bankList[1].setNum("001");
			bankList[2].setNum("001");
			bankList[3].setNum("001");
			bankList[4].setNum("001");
			
			bankList[0].setDate("2020-05-01");
			bankList[1].setDate("2020-05-02");
			bankList[2].setDate("2020-05-03");
			bankList[3].setDate("2020-05-04");
			bankList[4].setDate("2020-05-05");
			
			
				
				bankList[0].setInput(5000);
				bankList[2].setInput(5000);
				
				bankList[1].setOuput(1000);
		        bankList[3].setOuput(1000);
				bankList[4].setOuput(1000);
				// 변수들
				// primitive variable
				int num = 0; // inetger 형 변수 num를 선언하고 0으로 clear
				long num1 = 0L;			// long 형 변수 num1을 선언하고 0으로 clear	
				float num2 = 0.0f;
				double num3 = 0.0;
				boolean bYes = false;
				char cjar1 = 'c'; // charator형 변수 넘버를 선언하고 
			                       // 문자 c를 저장	
				// String(문자열) 형 변수는
				// 변수처럼 사용하지만 실제로는
				// 일반변수와 달리
				// string 클래스로 만든 String형 인스턴스 라고 해야한다
				String strName = "홍길동"; // 첫글자 대문자 클래스
				// String strName = new String(:"홍길동");
				String sreNation = new String();
				
				
				
				// bankservicev2 클래스를 사용해서
				// 뱅크서비스라는 변수를 선언
				// 뱅크서비스 변수를 "객체(object)" 인스턴스(instance)
				//라고한다
				BankServiceV2 bankService = new BankServiceV2();//뱅크서비스비이투 클래스로 만든 인스턴스이다
                // bankservice 인스턴스를 통해서
				// bankservice() method를 호출하면
				// bankservicev2 클래스 내에 정의된 
				// bankList() method 내의 코드들이 순서대로 실행된다.
				
				bankService.bankList();
				
				
				bankService.bankList(bankList);
			
			
		}
		
		
		
	}

}
