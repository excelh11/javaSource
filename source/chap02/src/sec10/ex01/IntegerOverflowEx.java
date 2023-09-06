package sec10.ex01;

public class IntegerOverflowEx {

	public static void main(String[] args) {
		 try {
	            int result = Integer.MAX_VALUE + 1;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	}

}
