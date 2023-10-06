package sec03.ex01;

public class Trinomial {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;

		 // x가 y보다 크면 x, 그렇지 않으면 y를 max에 할당
		int max = (x > y) ? x : y; 
		System.out.println("최댓값: " + max);

		 // x가 짝수면 "짝수", 홀수면 "홀수"를 result에 할당
		String result = (x % 2 == 0) ? "짝수" : "홀수"; 
		System.out.println("결과: " + result);

		 // x가 음수면 -x, 그렇지 않으면 x의 절대값을 absoluteValue에 할당
		int absoluteValue = (x < 0) ? -x : x; 
		System.out.println("절대값: " + absoluteValue);

	}

}
