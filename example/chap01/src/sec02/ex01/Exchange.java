package sec02.ex01;

public class Exchange {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		// 변수 a와 b의 값을 교환
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a = " + a); // 결과: a = 20
		System.out.println("b = " + b); // 결과: b = 10

	}

}
