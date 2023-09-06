package sec02.ex01;
public class Scope01 {

	public static void main(String[] args) {
		 int x = 10;		// x변수 선언의 위치를 변경합니다.
		        if (true) {
		            // x = 10 출력
		            System.out.println("x = " + x);
		        }
		        // 에러: cannot be resolved to a variable 변수 x
		        System.out.println("x = " + x);
	}

}
