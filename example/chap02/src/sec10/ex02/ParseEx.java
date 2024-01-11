package sec10.ex02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseEx {
    	public static void main(String[] args) {
	    	String dateString = "2023-12A-31";
	        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        try {
	            Date date = dateFormat.parse(dateString);
	            System.out.println("날짜 파싱 성공");
	            System.out.println("파싱된 날짜: " + date);
	        } catch (ParseException e) {
	        	System.out.println("날짜 파싱 중 예외 발생: " + e.getMessage());
	            e.printStackTrace();
	        }
    	}
}