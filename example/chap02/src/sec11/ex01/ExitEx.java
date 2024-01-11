package sec11.ex01;

public class ExitEx {

	public static void main(String[] args) {
		 try {
	            // 예외가 발생할 수 있는 코드
	            int result = divide(10, 0);
	            System.out.println("나눈 결과: " + result);
	            System.exit(0);
	        } catch (ArithmeticException e) {
	            // 예외 처리
	            System.out.println("0으로 나눌 수 없습니다.");
	            System.err.println("예외가 발생하여 프로그램을 비정상적으로 종료합니다.");
	            System.err.println("예외 정보: " + e.toString());
	            System.exit(1);
	        }
		 	finally {
	            // 마무리 작업 수행
	            System.out.println("프로그램 종료 전에 마무리 작업을 수행합니다.");
	        }
	}
	public static int divide(int num1, int num2) {
	     return num1 / num2;
	}

}
