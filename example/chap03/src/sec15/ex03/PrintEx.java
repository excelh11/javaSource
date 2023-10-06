package sec15.ex03;

public class PrintEx {

	public static void main(String[] args) {
		  int number = 10;
	        String text = "Hello";

	        System.out.print("숫자는: ");
	        System.out.println(number); // "42" 출력
	        System.out.printf("%s, World! 숫자는 %d\n", text, number); // "Hello, World! The answer is 42" 출력
	    }
	}