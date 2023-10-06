package sec06.ex02;

public class Dog {
	// 해당 클래스 내에서만 사용하기 위해 private 선언
    private String name; // 이름 필드
    private int age; // 나이 필드
    
    // this는 블록{}으로 감싸고 있는 객체를 가리킴. 해당 객체의 이름과 나이
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
	public static void main(String[] args) {
		Dog dog = new Dog("happy", 3);
		dog.printInfo();
	}

}
