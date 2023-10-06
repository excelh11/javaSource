package sec10.ex01;

public class NumberFormatEx {

	public static void main(String[] args) {
		
			String numberStr1 = "123";
			String numberStr2 = "123e";
			try {
			    int number1 = Integer.parseInt(numberStr1);
			    int number2 = Integer.parseInt(numberStr2);
			    System.out.println("숫자 변환 결과: " + number1);
			    System.out.println("숫자 변환 결과: " + number2);
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없는 문자열입니다.");
			    System.out.println("에러 메시지: " + e.getMessage());
			}	
	}

}
