package sec15.ex03;

import java.io.*;

public class ReadFromEx {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter: ");

        try {
            String input = reader.readLine(); // 사용자 입력 읽기
            System.out.println("입력: " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
