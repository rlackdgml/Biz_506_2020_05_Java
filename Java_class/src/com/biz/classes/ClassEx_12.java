package com.biz.classes;

import com.biz.classes.model.BankVO;

public class ClassEx_12 {
	public static void main(String[] args) {

		BankVO[] bankList = new BankVO[5];
		
			bankList[0] = new BankVO();
			bankList[1] = new BankVO();
			bankList[2] = new BankVO();
			bankList[3] = new BankVO();
			bankList[4] = new BankVO();
			
			bankList[0].setNum("001");
			bankList[1].setNum("002");
			bankList[2].setNum("003");
			bankList[3].setNum("004");
			bankList[4].setNum("005");
			
			bankList[0].setDate("6월 1일");
			bankList[1].setDate("6월 1일");
			bankList[2].setDate("6월 1일");
			bankList[3].setDate("6월 1일");
			bankList[4].setDate("6월 1일");
			for(int i = 0 ; i < bankList.length  ;  i++) {
				
			bankList[0].setInput(5000);
			bankList[2].setInput(5000);
			
			bankList[1].setOuput(1000);
	        bankList[3].setOuput(1000);
			bankList[4].setOuput(1000);
			
			
			
			
			
			
				
			
			
			
		}
		
		
		
		
	}
}
