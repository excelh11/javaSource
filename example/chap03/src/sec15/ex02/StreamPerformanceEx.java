package sec15.ex02;

import java.io.*;

public class StreamPerformanceEx {

    public static void main(String[] args) {
        String sourceFileName = "sky.jpg";
        String targetFileName = "sky1.jpg";

        long startTime, endTime;

        try {
            // BufferedInputStream과 BufferedOutputStream 사용
            startTime = System.nanoTime();
            copyUsingBufferedStreams(sourceFileName, targetFileName);
            endTime = System.nanoTime();
            System.out.println("버퍼 스트림을 사용하는 데 걸리는 시간: " + (endTime - startTime) + " nanoseconds");

            // FileInputStream과 FileOutputStream 사용
            startTime = System.nanoTime();
            copyUsingRegularStreams(sourceFileName, "sky2.jpg");
            endTime = System.nanoTime();
            System.out.println("일반 스트림을 사용하는 데 걸리는 시간: " + (endTime - startTime) + " nanoseconds");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyUsingBufferedStreams(String source, String target) throws IOException {
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(target))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }
    }

    public static void copyUsingRegularStreams(String source, String target) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(source);
             FileOutputStream outputStream = new FileOutputStream(target)) {
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }
        }
    }
}

