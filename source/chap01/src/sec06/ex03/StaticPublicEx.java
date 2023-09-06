package sec06.ex03;

public class StaticPublicEx {
	public static int publicStaticVariable = 10;
    private static int privateStaticVariable = 20;
    public int publicInstanceVariable = 30;
    private int privateInstanceVariable = 40;

    public static void publicStaticMethod() {
        System.out.println("This is a public static method.");
    }

    private static void privateStaticMethod() {
        System.out.println("This is a private static method.");
    }

    public void publicInstanceMethod() {
        System.out.println("This is a public instance method.");
    }

    private void privateInstanceMethod() {
        System.out.println("This is a private instance method.");
    }

    public static void main(String[] args) {
        // 클래스 멤버에 접근하기
        System.out.println(publicStaticVariable); // 출력: 10
        System.out.println(privateStaticVariable); // 출력: 20
        publicStaticMethod(); // 출력: This is a public static method.
        privateStaticMethod(); // 출력: This is a private static method.

        // 인스턴스 생성
        StaticPublicEx instance = new StaticPublicEx();
        // 인스턴스 멤버에 접근하기
        System.out.println(instance.publicInstanceVariable); // 출력: 30
        System.out.println(instance.privateInstanceVariable); // 출력: 40
        instance.publicInstanceMethod(); // 출력: This is a public instance method.
        instance.privateInstanceMethod(); // 출력: This is a private instance method.
    }
}
