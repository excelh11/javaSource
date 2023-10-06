package sec15.ex01;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadCharArrayOffsetEx {
    public static void main(String[] args) {
        String fileName = "test1.txt";

        try (Reader reader = new FileReader(fileName)) {
            char[] buffer = new char[100]; // 문자를 읽어올 버퍼 생성
            int offset = 5; // 읽은 문자열을 저장할 배열의 시작 오프셋
            int length = 10; // 읽을 문자의 길이
            int bytesRead;

            while ((bytesRead = reader.read(buffer, offset, length)) != -1) {
                System.out.println("Read " + bytesRead + " characters: " + new String(buffer, offset, bytesRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
