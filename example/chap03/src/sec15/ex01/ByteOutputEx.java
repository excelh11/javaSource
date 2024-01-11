package sec15.ex01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteOutputEx {
	
    public static void main(String[] args) {
        try {
            // 스트림 생성
            OutputStream outputStream = new FileOutputStream("test1.txt");

            // 데이터 출력
            String data = "Hello, OutputStream!";
            byte[] byteData = data.getBytes();
            outputStream.write(byteData);

            // 스트림 닫기
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
