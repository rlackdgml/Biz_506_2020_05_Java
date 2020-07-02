package daum;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DaumMovie {

	public static void main(String[] args) throws IOException {

		int page = 1;
		int cnt = 0;
		String prePage = "";
		String content = "";
		String writer = "";
		int score = 0;
		String regdate = "";

		while (true) {
			String url = "https://movie.daum.net/moviedb/grade?movieId=134684&type=netizen&page=" + page;
			Document doc = Jsoup.connect(url).get();
			Elements replyList = doc.select("div.review_info");

		
			if (replyList.size()== 0) {
				break;
			} 
			
			for (Element movie : replyList) {

				content = movie.select("p.desc_review").text();
				score = Integer.parseInt(movie.select("em.emph_grade").text());
				writer = movie.select("em.link_profile").text();
				regdate = movie.select("span.info_append").text().substring(0,10);

				System.out.println(
						"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("내용 :" + content);
				System.out.println("영화평점 :" + score);
				System.out.println("작성자 :" + writer);
				System.out.println("작성일자 :" + regdate);
				cnt++;

			}
			page++;

		}
		System.out.println("총" +cnt + "페이지 수집했습니다.");
	}

}
