package sec14.ex01;
import java.util.function.Function;
public class MethodEx {

		public static void main(String[] args) {
	        Function<String, Integer> parseInt = Integer::parseInt;
	        
	        int result = parseInt.apply("123");
	        System.out.println(result);
	    }
}
