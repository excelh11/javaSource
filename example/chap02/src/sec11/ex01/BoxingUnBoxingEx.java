package sec11.ex01;

public class BoxingUnBoxingEx {

	public static void main(String[] args) {
		
		// 박싱
		Integer number = new Integer(10); // int 값을 감싸는 Integer 객체 생성(deprecated since version 9)
		Integer num = Integer.valueOf(10); // Wrapper클래스의 정적 메서드 valueOf()를 사용

		// 언박싱
		int value = num.intValue(); // Integer 객체를 int 값으로 변환

		// 언박싱 후 다양하게 변환
		String strValue = num.toString(); // Integer 객체를 문자열로 변환
		int parsedValue = Integer.parseInt("20"); // 문자열을 int 값으로 변환

		System.out.println(num); 
		System.out.println(value); 
		System.out.println(strValue); 
		System.out.println(parsedValue);
	}

}
