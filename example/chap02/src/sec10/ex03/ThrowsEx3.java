package sec10.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsEx3 {
    public static void main(String[] args){
        try {
            readFromFile("file.txt");
        } catch (IOException e) {
            System.out.println("오류가 발생했습니다 : " + e.getMessage());
        }
    }

    public static void readFromFile(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
