package sec09.ex01;

public class StaticOuter {
	    private static String outerVariable = "Outer";

	    private static void outerMethod() {
	        System.out.println("Outer Method");
	    }

	    static class InnerClass {
	        private String innerVariable = "Inner";

	        private void innerMethod() {
	            System.out.println("Inner Method");
	        }

	        public void accessOuter() {
	            System.out.println(outerVariable);  // 외부 클래스의 static 멤버 변수에 접근
	            outerMethod();                      // 외부 클래스의 static 멤버 메서드 호출
	            innerMethod();
	            System.out.println(innerVariable);
	        }
	    }

	    public static void run() {
	        InnerClass inner = new InnerClass();    // 외부 클래스 내부에서 static 내부 클래스 인스턴스 생성
	        inner.accessOuter();                     	// 내부 클래스의 메서드를 통해 외부 클래스에 접근
	    }
}
