package parsemovie;
import java.io.BufferedInputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ParseMovie { 
	String key = "30c7cba34a78181d36ef237ddf4f371f";
	String today  = "";
	String[][] arrBoxOffice = new String[10][4];
	 
	// 1. 파싱하고 싶은 URL 생성(일일박스오피스: 하루 전날)
	// URL = 기본URL + Key + 날짜
	public String makeURL() {
		// 오늘 날짜 구하기
		
		Calendar cal =Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		
		//System.out.println("포맷 전: "+ cal.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		today = sdf.format(cal.getTime());
		
		//System.out.println("포맷 후: " + today);
		
		String url = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/"
					+"searchDailyBoxOfficeList.json"
					+"?key=" + key
					+ "&targetDt=" + today;
				
		return url;
	}
	private String readUrl(String preUrl) throws Exception {
		BufferedInputStream reader = null;
		
		try {
			URL url = new URL(preUrl);
			reader = new BufferedInputStream(url.openStream()); // url을 bfI한테 줌
			StringBuffer buffer = new StringBuffer();
			int i;
			byte[] b = new byte[4096];
			while((i = reader.read(b)) != -1) { // 읽을게없으면 -1이 빠져나간다
				buffer.append(new String(b, 0 ,i)); //append 마지막에넣는것
			}
			return buffer.toString();
		}finally {
			if(reader != null) {
				reader.close();
			}
		}
	}
	
	
	public String[][] getBoxOffice(String url) throws Exception {
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject)parser.parse(readUrl(url));
		JSONObject json = (JSONObject)obj.get("boxOfficeResult");
		// array는 1~10위까지의 BoxOffice List 담김
		JSONArray array =(JSONArray)json.get("dailyBoxOfficeList");
		
		System.out.println(array.size());
		
		for(int i = 0; i < array.size(); i++) {
			JSONObject entity = (JSONObject)array.get(i);
			String rank = (String) entity.get("rank"); // 순위 
			String movieNm = (String) entity.get("movieNm"); // 영화이름
			String audiAcc = (String) entity.get("audiAcc"); //누적관객수
			String salesAcc = (String) entity.get("salesAcc"); //누적매출액
			arrBoxOffice[i][0] = rank;
			arrBoxOffice[i][1] = movieNm;
			arrBoxOffice[i][2] = audiAcc;
			arrBoxOffice[i][3] = salesAcc;
			
		}
		return arrBoxOffice;
	}
}