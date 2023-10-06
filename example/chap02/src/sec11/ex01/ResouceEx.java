package sec11.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ResouceEx {

	public static void main(String[] args) {
		 // 현재 클래스의 클래스 로더를 사용하여 리소스 로드
        URL resourceUrl = Member.class.getResource("data.txt");
        if (resourceUrl != null) {
            System.out.println("Resource URL: " + resourceUrl);
            
            // 리소스 읽기
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(resourceUrl.openStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Resource not found.");
        }
	}

}
