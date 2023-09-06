package sec10.ex01;

public class ArithmeticEx {

		 public static void main(String[] args) {
		        int dividend = 10;
		        int divisor = 0;

		        try {
		            int quotient = dividend / divisor;
		            System.out.println("몫 : " + quotient);
		        } catch (ArithmeticException e) {
		            System.out.println("에러 : " + e.getMessage());
		        }
		    }
	}
