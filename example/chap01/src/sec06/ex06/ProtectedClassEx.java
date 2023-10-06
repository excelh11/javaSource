package sec06.ex06;

public class ProtectedClassEx extends ProtectedClass {
    public void someMethod() {
        protectedField = 10; // 동일 패키지 내에서 접근 가능
        protectedMethod(); // 동일 패키지 내에서 접근 가능
        System.out.println(protectedField);
    }
   
    public static void main(String[] args) {
    	ProtectedClassEx pro = new ProtectedClassEx();
    	pro.someMethod();
}
}
