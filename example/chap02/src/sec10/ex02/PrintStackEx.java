package sec10.ex02;

public class PrintStackEx {

	public static void main(String[] args) {
		 try {
	            // 예외가 발생할 수 있는 코드
	            int result = divide(10, 0);
	            System.out.println("나눈 결과: " + result);
	        } catch (ArithmeticException e) {
	            // 예외 처리
	            System.out.println("0으로 나눌 수 없습니다.");
	            e.printStackTrace();
	        }
	}
	public static int divide(int num1, int num2) {
	        return num1 / num2;
	}

}
