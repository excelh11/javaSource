package sec15.ex01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class ByteArrayEx1 {
    public static void main(String[] args) {
        byte[] array = {10, 20, 30};

        try (OutputStream outputStream = new FileOutputStream("test3.txt")) {
            for (byte b : array) {
                outputStream.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}