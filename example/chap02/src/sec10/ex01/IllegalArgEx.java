package sec10.ex01;

public class IllegalArgEx {

	public static void main(String[] args) {
		try {
	        Rectangle rectangle = new Rectangle(-5, 10);
	        int area = rectangle.calculateArea();
	        System.out.println("Area: " + area);
	    } catch (IllegalArgumentException e) {
	        System.out.println("잘못된 인수 출력: " + e.getMessage());
	    }
	}

}

