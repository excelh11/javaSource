package sec10.ex01;

public class ClassCastEx {

	public static void main(String[] args) {
		  Animal animal = new Dog();
	        
	        try {
	            if (animal instanceof Dog) {
	                Dog dog = (Dog) animal; // 형변환
	                System.out.println("형변환 성공: Dog 객체 생성");
	                dog.bark(); // Dog 클래스의 메소드 호출
	            } else {
	                throw new ClassCastException("형변환 실패: Dog 타입으로 변환할 수 없음");
	            }
	        } catch (ClassCastException e) {
	            System.out.println("예외 발생: " + e.getMessage());
	        }
	}

}
	class Animal {
	    // Animal 클래스 내용
	}

	class Dog extends Animal {
		 public void bark() {
		        System.out.println("멍멍!");
		    }
	}

	class Cat extends Animal {
	    // Cat 클래스 내용
	}