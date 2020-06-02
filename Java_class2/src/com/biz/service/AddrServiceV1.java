package com.biz.service;

import com.biz.model.AddressVO;

public class AddrServiceV1 {

	public void AddressList(AddressVO[] address) {
		
		System.out.println("--------------------------");
		System.out.println("주소록");
		System.out.println("=======================");
		
		System.out.println("이름\t전화번호\t주소\t나이");
		for (int i = 0; i < address.length; i++) {
			
			System.out.printf("%s\t%s\t%s\t%d\n",
					address[i].getName() ,
					address[i].getTel() ,
					address[i].getAddr() ,
					address[i].getAge() );
					
					

		}
		System.out.println(); 

	}

}
