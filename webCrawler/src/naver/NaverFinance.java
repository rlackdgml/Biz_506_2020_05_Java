package naver;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverFinance {
	static String base = "https://finance.naver.com/item/frgn.nhn?code=005930&page=1";

	// base 가 일반메서드면 static 안붙여도됨 메인메서드면 static붙여야함
	// static 메서드에는 static 변수만 사용가능
	public static void main(String[] args) throws IOException {
		// base 사이트로 가서 전체 페이지의 소스코드를 가져옴

		Document doc = Jsoup.connect(base).get();

		Elements line = doc.select("table.type2 > tbody > tr");
		// 복수형
		System.out.println(line.size());

		int count = 0;
		for (Element element : line) { // 향상된 for문 foreach 문
			
			Elements tds = element.select("td");
			if (tds.size() == 9) {
				System.out.println("============================");
				String regdate1 = tds.get(0).text();
				String regdate2= tds.get(1).text();
				String regdate3 = tds.get(2).text();
				String regdate4 = tds.get(3).text();
				String regdate5 = tds.get(4).text();
				String regdate6 = tds.get(5).text();
				String regdate7 = tds.get(6).text();
				String regdate8 = tds.get(7).text();
				String regdate9 = tds.get(8).text();
				
				System.out.println("날짜 :" + regdate1);
				System.out.println("종가 :" + regdate2);
				System.out.println("전일비 :" + regdate3);
				System.out.println("등락률 :"  + regdate4);
				System.out.println("거래량 :" + regdate5);
				System.out.println("기관(순매매량) :" + regdate6);
				System.out.println("외국인(순매매량) :" + regdate7);
				System.out.println("외국인(보유주수) :" + regdate8);
				System.out.println("외국인(보유율) :" + regdate9);
				
				System.out.println("============================");
				System.out.println("날짜 :" + tds.get(0).text());
				System.out.println("종가 :" + tds.get(1).text());
				System.out.println("전일비 :" + tds.get(2).text());
				System.out.println("등락률 :" + tds.get(3).text());
				System.out.println("거래량 :" + tds.get(4).text());
				System.out.println("기관(순매매량) :" + tds.get(5).text());
				System.out.println("외국인(순매매량) :" + tds.get(6).text());
				System.out.println("외국인(보유주수) :" + tds.get(7).text());
				System.out.println("외국인(보유율) :" + tds.get(8).text());
				
				
				


			}

		}

	}

}