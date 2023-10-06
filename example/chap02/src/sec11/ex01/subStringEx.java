package sec11.ex01;

public class subStringEx {

	public static void main(String[] args) {
		        String originalString = "Hello, World!";
		        
		        // 부분 문자열 추출
		        String substring1 = originalString.substring(7);
		        String substring2 = originalString.substring(0, 5);
		        
		        // 추출한 부분 문자열 출력
		        System.out.println(substring1);
		        System.out.println(substring2);
		    }
}
