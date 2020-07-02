package naver;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverMovie {

	public static void main(String[] args) throws IOException {
		
		int page = 1;
		String prePage = "";
		int cnt = 0;
		
		while (true) {
			String url = "https://movie.naver.com/movie/bi/mi/pointWriteFormList.nhn?code=+189633&type=after&isActualPointWriteExecute=false&isMileageSubscriptionAlready=false&isMileageSubscriptionReject=false&page="+page;
			Document doc = Jsoup.connect(url).get();
			Elements movieList = doc.select("div.score_result > ul > li");
			String nowPage = doc.select("input#page").attr("value");
		//	System.out.println(prePage + "," + nowPage);
			
			if(nowPage.equals(prePage)) {
				break;
			}else {
				prePage = nowPage;
			}

			String content = "";
			int score = 0;
			String writer = "";
			String regdate = "";
			for (Element movie : movieList) {
				content = movie.select("div.score_reple > p > span").get(0).text();
				score = Integer.parseInt(movie.select("div.star_score > em").get(0).text());
				writer = movie.select("div.score_reple a > span").get(0).text();
				regdate = movie.select("div.score_reple em").get(1).text().substring(0,10);

				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("내용 :" + content);
				System.out.println("영화평점 :" + score);
				System.out.println("작성자 :" + writer);
				System.out.println("작성시간 :" + regdate);
				cnt++;

			}
			page++; // page += 1; 해도 됨 

		}
		System.out.println("총 :" + cnt + "건 수집했습니다." );

	}

}
