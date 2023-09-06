package sec16.ex01;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface CustomAnnotation {
    String value() default ""; // default 값 설정
}

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

@CustomAnnotation(value = "Addition")
public class LambdaAnnotationEx {

    public static void performOperation(int a, int b, MathOperation operation) {
        int result = operation.operate(a, b);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        performOperation(5, 3, add); 
    }
}
