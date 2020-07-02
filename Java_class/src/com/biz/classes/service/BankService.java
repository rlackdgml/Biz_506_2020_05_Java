package com.biz.classes.service;

import com.biz.classes.model.BankVO;

public class BankService {
	
	public static void main(String[] args) {
		
		
		BankVO[] bankList = new BankVO[5];
		
		for(int i = 0;   i < bankList.length ; i ++) {
			
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
					
					bankList[0].setValance(5000);
					bankList[1].setValance(4000);
					bankList[2].setValance(9000);
					bankList[3].setValance(8000);
					bankList[4].setValance(7000);
		}
						
				
					
				
		
		
					 
	}
}
			
			
			
			
			
			
		
	
		


