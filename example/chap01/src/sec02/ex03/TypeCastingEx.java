package sec02.ex03;

public class TypeCastingEx {

	public static void main(String[] args) {
		char ch01 = 'A';
		char ch02 = 1;
		// char ch03 = ch01 + ch02; 에러
		int int1 = ch01 + ch02;
		System.out.println((char)int1);
		
		int x = 1;
		int y = 2;
		double result1 = (double) x /  (double) y;
		double result2 =x / y;
		System.out.println(result1);
		System.out.println(result2); // 값 제대로 안나옴.
	}

}
