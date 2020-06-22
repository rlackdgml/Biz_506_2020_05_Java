package naver;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverBoxOffice {

	public static void main(String[] args) throws IOException {
		String url = "https://movie.naver.com/movie/running/current.nhn";
		String title = ""; // 영화제목
		String score = ""; // 영화평점
		String bookRate = ""; // 영화 예매율
		String type = ""; // 영화 장르
		String movieTime = ""; // 영화 상영시간
		String openDt = ""; // 영화 개봉일
		String director = ""; // 영화 감독
		String actor = ""; // 영화 출연진
		String naverCode = ""; // 네이버 영화 코드

		Document doc = Jsoup.connect(url).get();
		Elements movieList = doc.select("div.lst_wrap > ul.lst_detail_t1 > li");
		for (Element movie : movieList) {
			bookRate = "0"; // 0값으로 초기화
			director = "";
			actor = "";
			// for문에 li를 하나씩 넣는다
			// 영화를 한껀 식 꺼내 넣는다
			title = movie.select("dt.tit > a").text();

			if (movie.select("span.num").size() == 2) {

				bookRate = movie.select("span.num").get(1).text();
			}

			score = movie.select("span.num").get(0).text();// 영화 평점
			type = movie.select("dd > span.link_txt").get(0).text(); // 영화 장르

			String temp = movie.select("dl.info_txt1 > dd").get(0).text();

			int beginTimeIndex = temp.indexOf("|");
			int endTimeIndex = temp.lastIndexOf("|");

			if (beginTimeIndex == endTimeIndex) {
				movieTime = temp.substring(0, endTimeIndex);

			} else {
				movieTime = temp.substring(beginTimeIndex + 2, endTimeIndex);
			}

			// System.out.println(movie.select("dt.tit_t2"));
			// System.out.println(movie.select("dt.tit_t3"));

			// 0 : 없음 1 : 있음
			int dCode = 0; // 감독유무 확인
			int aCode = 0; // 출연진 유무 확인

			if (!movie.select("dt.tit_t2").text().equals("")) {
				dCode = 1; // 감독있음!
			}
			if (!movie.select("dt.tit_t3").text().equals("")) {
				aCode = 1; // 출연진 있음!

			}
			if (dCode == 1 && aCode == 0) {

				director = movie.select("dd > span.link_txt").get(1).text();

			} else if (dCode == 0 && aCode == 1) {

				actor = movie.select("dd > span.link_txt").get(1).text();
			} else if (dCode == 1 && aCode == 1) {

				director = movie.select("dd > span.link_txt").get(1).text();
				actor = movie.select("dd > span.link_txt").get(2).text();
			}

			String naverHref = movie.select("dt.tit > a").attr("href"); // 네이버 영화 코드
			naverCode = naverHref.substring(naverHref.lastIndexOf("=") + 1); // 네이버 영화

			// 영화 개봉일자
			int openDtTxtIndex = temp.lastIndexOf("개봉");
			openDt = temp.substring(endTimeIndex + 2, openDtTxtIndex);

			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("■영화제목 :" + title);
			System.out.println("■영화평점 :" + score + "점");
			System.out.println("■예매율 :" + bookRate + "%");
			System.out.println("■장르 :" + type);
			System.out.println("■상영시간 :" + movieTime);
			System.out.println("■영화 개봉일 :" + openDt);
			System.out.println("■영화 감독 :" + director);
			System.out.println("■영화 출연진 :" + actor);
			System.out.println("■무비코드 :" + naverCode);

		}

	}

}
