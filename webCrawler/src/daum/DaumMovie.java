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
		while (true) {
			String url = "https://movie.daum.net/moviedb/grade?movieId=134684&type=netizen&page=" + page;
			Document doc = Jsoup.connect(url).get();
			Elements replyList = doc.select("ul.list_review list_netizen >li");
			String nowPage = doc.select("input#page").attr("value");
			System.out.println(prePage + "," + nowPage);
			
			if(nowPage.equals(prePage)) {
				break;
			}else {
				prePage = nowPage;
			}
			
			String content = "";
			String writer = "";
			String score = "";
			String regdate = "";
			

			for (Element movie : replyList) {

				content = movie.select("p.desc_review").get(0).text();
				score = movie.select("em.emph_grade").get(0).text();
				writer = movie.select("em.link_profile").get(0).text();
				regdate = movie.select("span.info_append").get(1).text();
				
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("내용 :" + content);
				System.out.println("영화평점 :" + score);
				System.out.println("작성자 :" + writer);
				System.out.println("작성시간 :" + regdate);
				cnt++;

			}
			page++;

		}
		System.out.println(cnt);
	}

}
