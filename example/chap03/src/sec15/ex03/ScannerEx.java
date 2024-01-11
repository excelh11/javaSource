package sec15.ex03;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine(); // 사용자로부터 한 줄의 문자열 입력 받기

        System.out.print("좋아하는 숫자를 입력하세요: ");
        int num = scanner.nextInt(); // 사용자로부터 정수 입력 받기

        System.out.println("Hello, " + name + "! 좋아하는 숫자는 " + num + " 입니다.");

        scanner.close(); // Scanner 사용이 끝난 후 닫아주는 것이 좋음
    }
	
}