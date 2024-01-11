package sec15.ex02;

import java.io.*;

public class PrintWriterEx {
	
    public static void main(String[] args) {
        String fileName = "print.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("Hello, PrintWriter!");
            writer.println(123);
            writer.println(3.14);
            writer.println("Java Programming");
            writer.printf("Formatted number: %d\n", 456);

            System.out.println("데이터가 성공적으로 작성되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
