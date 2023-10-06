package sec15.ex01;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayEx2 {
    public static void main(String[] args) {
        byte[] array = {10, 20, 30};
        String filename = "test3.txt";

        try (FileOutputStream fos = new FileOutputStream(filename)) {
            for (byte b : array) {
                int value = b & 0xFF;// 바이트를 부호 없는 정수로 변환
                fos.write(Integer.toString(value).getBytes());
                fos.write("\n".getBytes()); // 각 숫자를 새 줄로 구분해서 저장
            }

            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}