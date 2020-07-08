package com.biz.bank.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.domain.AccountVO;

public class BankServiceImplV1 implements BankService {

	List<AccountVO> bankList;

	Scanner scan;

	public BankServiceImplV1() {

		bankList = new ArrayList<AccountVO>();
		scan = new Scanner(System.in);

	}

	public boolean inputBalance() {

		AccountVO accountVO = new AccountVO();

		System.out.print("오늘 날짜 입력");
		String strDate = scan.nextLine();
		if (strDate.equals("날짜 미등록")) {
			return false;
		}

		System.out.print("입금계좌번호 입력");
		String strNum = scan.nextLine();
		if (strNum.equals("입금계좌 입력 취소")) {

			return false;

		}

		System.out.print("입금 금액을 입력 하세요 >>");
		String strInput = scan.nextLine();
		int intInput = 0;
		try {
			intInput = Integer.valueOf(strInput);
		} catch (Exception e) {

			System.out.println("입금입력을 취소 합니다.");

		}

		accountVO.setNum(strNum);
		accountVO.setDate(strDate);
		accountVO.setInput(intInput);

		bankList.add(accountVO);

		return true;

	}

	public boolean outputBalance() {

		AccountVO accountVO = new AccountVO();

		System.out.print("오늘 날짜 입력");
		String strDate = scan.nextLine();
		if (strDate.equals("날짜 미등록")) {
			return false;
		}

		System.out.print("출금계좌번호 입력");
		String strNum = scan.nextLine();
		if (strNum.equals("출금계좌 입력 취소")) {
			return false;

		}

		System.out.print("출금 금액을 입력 하세요 >>");
		String strOutput = scan.nextLine();
		int intOutput = 0;
		try {
			intOutput = Integer.valueOf(strOutput);

		} catch (Exception e) {
			System.out.println("출금 금액 취소>>");

		}

		accountVO.setNum(strNum);
		accountVO.setDate(strDate);
		accountVO.setOutput(intOutput);

		bankList.add(accountVO);

		return true;

	}

	public void listBalance() {

		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("은행리스트");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("날짜\t계좌번호  입금\t출금");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

		int bankSize = bankList.size();

		for (int i = 0; i < bankSize; i++) {

			AccountVO bVO = bankList.get(i);

			System.out.print(bVO.getDate() + "\t");
			System.out.print(bVO.getNum() + "\t");
			System.out.print(bVO.getInput() + "\t");
			System.out.print(bVO.getOutput() + "\n");

		}
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

	}

}
