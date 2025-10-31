package sec15.ex01;
import java.io.FileInputStream;
import java.io.IOException;
public class InputReadOffLenEx {

	public static void main(String[] args) {
		
		String fileName = "test1.txt";

		try (FileInputStream inputStream = new FileInputStream(fileName)) {
		    byte[] buffer = new byte[5]; // 읽어올 최대 길이를 5로 설정
		    int bytesRead = inputStream.read(buffer, 0, 5); // 최대 5바이트 읽어옴

		    if (bytesRead != -1) {
		        String content = new String(buffer, 0, bytesRead);
		        System.out.println(content); // "Hello" 출력
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}
    }
}
