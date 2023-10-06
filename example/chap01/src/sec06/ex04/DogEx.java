package sec06.ex04;

public class DogEx {

	public static void main(String[] args) {
		Dog dog1 = new Dog(); // 기본 생성자 호출
		Dog dog2 = new Dog("dodo"); // 이름만 받는 생성자 호출
		Dog dog3 = new Dog("dudu", 3); // 이름과 나이를 받는 생성자 호출
	        
	        System.out.println("dog1 - Name: " + dog1.getName() + ", Age: " + dog1.getAge());
	        System.out.println("dog2 - Name: " + dog2.getName() + ", Age: " + dog2.getAge());
	        System.out.println("dog3 - Name: " + dog3.getName() + ", Age: " + dog3.getAge());
	}

}


