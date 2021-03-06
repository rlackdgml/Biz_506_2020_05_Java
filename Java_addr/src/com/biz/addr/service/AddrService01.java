package com.biz.addr.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.addr.domain.AddrVO;

public class AddrService01 {
	/*
	 * 현재 AddrService01 클래스를 선언하면서
	 * addrList 라는 필드변수를 선언 만 해둔 상태
	 * 선언만 된 필드변수 중에 객체형태의 변수는 
	 * 그변수에 값을 저장, 추가하려고 하면 NullpointerException 발생하면서
	 * 코드가 진행이 되지 않는다
	 * 
	 * 아래의 1~3의 방법으로 반드시 변수를 초기화 해주어야 한다.
	 * 1. 필드변수를 선언과 동시에 초기화 하기
	 *    메모리관리상 여러가지 문제를 일으킬수 있기때문에 가급적 사용하지 말자
	 * 2. 생성자를 이용하여 초기화 하기
	 * 3. 사용하기 직전에 초기화 하기
	 * 
	 * 객체형태의 변수란 클래스를 사용하여 선언된 변수들
	 * (int, float, bloolean, double, 등 기본 형태의 변수 이외의 형태로 선언된 변수)	
	 *  
	 */

	private List<AddrVO> addrList = new ArrayList<AddrVO>();// 1.필드변수를 선언과 동시에 초기화
	
	// 2. 생성자를 이용하여 필드변수 초기화 하기
	// 클래스의 기본 생성자를 임의로 제 작성하기
	// 누군가 AddreService01 클래스를 객채로 선언하고
	//      초기화를 하기 위해 생성자를 호출하면
	//      자동으로 addrList 필드변수가 초기화 되어
	//      이후의 코드에서 NullpointerException이 발생하는 것을 방지한다.
	
	public AddrService01() {
		this.addrList = new ArrayList<AddrVO>();
	}

	/*
	 * 5명의 주소를 생성하여 
	 * addrList 에 추가
	 */

	public void makeAddr() {
		
		// 3.사용하기 직전에 필드변수 초기화 하기
		//   필드변수를 사용하기 직전에 초기화 하는 코드는
		//   유지보수가 어려워지는 코드가 된다.
		addrList = new ArrayList<AddrVO>();
		
		// 1명의 주소를 저장할 VO 객체(인스턴스)
		// AddrVO 클래스를 사용하여
		// addrVO 객체(인스턴스)를 선언
		// 생성자 method() 를 호출하여 객체를 초기화(사용가능하도록)한다.
		AddrVO addrVO = new AddrVO();
		
		addrVO.setName("홍길동");
		addrVO.setTel("010-111-1111");
		addrVO.setAddr("서울특별시");
		addrVO.setAge(33);
		addrVO.setNet("친구");
		addrList.add(addrVO); // 새로 생성한 주소(vo)를 주소록(List)에 추가하기 

		// 또한명의 주소를 저장할 VO 객체 만들기
		// 이미 만들어진 addrVO를 재활용 (재 정의)한다.
		// 홍길동 주소를 담은 addrVO를 새롭게 재 정의하여
		// 저장공간을 비워주는 실행을 한다.
		addrVO = new AddrVO(); // 이전에 만들어진 객체(인스턴스)를 재활용하기 위해서는 반드시 다시 생성한다.

		addrVO.setName("이몽룡");
		addrVO.setTel("010-222-2222");
		addrVO.setAddr("대전광역시");
		addrVO.setAge(22);
		addrVO.setNet("후배");
		addrList.add(addrVO);

		addrVO = new AddrVO();

		addrVO.setName("성춘향");
		addrVO.setTel("010-333-3333");
		addrVO.setAddr("부산광역시");
		addrVO.setAge(20);
		addrVO.setNet("후배");
		addrList.add(addrVO);

		addrVO = new AddrVO();

		addrVO.setName("임꺽정");
		addrVO.setTel("010-444-4444");
		addrVO.setAddr("광주광역시");
		addrVO.setAge(31);
		addrVO.setNet("선배");
		addrList.add(addrVO);

		addrVO = new AddrVO();

		addrVO.setName("이순신");
		addrVO.setTel("010-555-5555");
		addrVO.setAddr("인천광역시");
		addrVO.setAge(35);
		addrVO.setNet("선배");
		addrList.add(addrVO);
		
		
		addrVO = new AddrVO("성춘향","010-333-3333","남원시",16,"이몽룡연인");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("성춘향","010-333-3333","남원시",16,"이몽룡연인");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("성춘향","010-333-3333","남원시",16,"이몽룡연인");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("성춘향","010-333-3333","남원시",16,"이몽룡연인");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("성춘향","010-333-3333","남원시",16,"이몽룡연인");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("장보고" , "010-444-44444");
		addrVO.setAge(30);
		addrList.add(addrVO);

	}

	public void addrList() {

		System.out.println("====================================================");
		System.out.println("주소록");
		System.out.println("----------------------------------------------------");
		System.out.println("이름\t전화번호\t주소\t나이\t관계");
		System.out.println("---------------------------------------------------");
		
		
		// i <5로 설정을 하게되면
		// 5명의 주소록을 표시할떄는 문제가 없으나
		// 만약 주소록 데이터의 개수가 변경되면 문제를 일으킨다
		// addList의 개수를 별도의 변수에 담고
		
		
		
		int addrSize = addrList.size();
		// 개수 만큼 반복문을 수행하도록 변경
		
	for (int i = 0; i < addrSize ; i++) {
		AddrVO vo = addrList.get(i);
		System.out.printf(vo.getName()+ "\t");
		System.out.printf(vo.getTel()+ "\t");
		System.out.printf(vo.getAddr()+ "\t");
		System.out.printf(vo.getAge()+ "\t");
		System.out.printf(vo.getNet()+ "\n");
		
		
	}

	}

}
