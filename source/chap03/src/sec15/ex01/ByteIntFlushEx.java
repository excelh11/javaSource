package sec15.ex01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteIntFlushEx {
    public static void main(String[] args) {
        try {
            // FileOutputStream을 생성하여 파일에 데이터 출력
            OutputStream outputStream = new FileOutputStream("test2.txt");

            int data1 = 'H'; // 문자 'H'에 해당하는 아스키 코드
            int data2 = 'e';
            int data3 = 'l';
            int data4 = 'o';

            // 바이트 데이터를 출력 버퍼에 쓴 후 flush()로 강제 출력
            outputStream.write(data1);
            outputStream.write(data2);
            outputStream.write(data3);
            outputStream.write(data4);
            outputStream.flush();

            // 스트림을 닫음
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

