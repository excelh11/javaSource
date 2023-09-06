package sec02.ex04;

public class OutStream {

	public static void main(String[] args) {
		String name = "John";
		int age = 30;
		double height = 170.5;
		
		System.out.print(name + age + height);
		System.out.println();

		System.out.printf("Name : %s ", name);		// 문자열
		System.out.printf("age : %d ", age);				// 정수
		System.out.printf("height : %.3f\n", height);	//실수, \n : 줄바꿈
		System.out.printf("My name is %-5s,I am %d years old, and my height is %.2f meters.\n", name, age, height);	//%-5s : 5자리 문자열 오른쪽 빈자리 공백 
		
		int value = 123;
		System.out.printf("%5d\n", value);		// 5자리 정수, 왼쪽 빈 자리 공백 __123
		System.out.printf("%-5d\n", value);		// 5자리 정수, 오른쪽 빈 자리 공백 123__
		System.out.printf("%05d\n", value);	// 5자리 정수, 왼쪽 빈자리 0으로 채움 00123
		
		Double dvalue = 12.123456; // 실수
		System.out.printf("%10.2f\n", dvalue);		// 총 10자리, 소수점 이하 2자리, 왼쪽 빈 자리 공백 __12.00
		System.out.printf("%-10.2f\n", dvalue);	// 총 10자리, 소수점 이하 2자리, 오른쪽 빈 자리 공백 12.12__
		System.out.printf("%010.2f\n", dvalue);	// 총 10자리, 빈자리 0으로 채움
		
		}
}
