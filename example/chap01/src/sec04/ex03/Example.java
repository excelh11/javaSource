package sec04.ex03;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);

	        System.out.print("짝수인지 홀수인지 확인하고 싶은 숫자 개수를 입력하세요: ");
	        int count = scanner.nextInt();

	        System.out.println(count + "개의 숫자를 입력하세요:");

	        for (int i = 1; i <= count; i++) {
	            System.out.print("숫자 " + i + ": ");
	            int number = scanner.nextInt();

	            if (number % 2 == 0) {
	                System.out.println(number + "는 짝수입니다.");
	            } else {
	                System.out.println(number + "는 홀수입니다.");
	            }
	        }

	        scanner.close();
	}
	
}