package sec09.ex03;

public class MathUtils {
	 public static void performCalculation(int x, int y, Calculator calculator) {
	        int result = calculator.calculate(x, y);
	        System.out.println("Result: " + result);
	 }
}
