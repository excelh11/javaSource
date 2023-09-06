package sec08.ex02;

public class FruitEx {

	public static void main(String[] args) {
			Fruit fruit1 = new Apple(); // 묵시적 형변환
	        Fruit fruit2 = new Banana(); // 묵시적 형변환

	        fruit1.eat(); 
	        fruit2.eat();

	        // fruit1.peel(); // 에러: Fruit 인터페이스에 peel() 메소드가 없음

	        if (fruit1 instanceof Apple) {
	            Apple apple = (Apple) fruit1; // 명시적 형변환
	            apple.peel(); 
	        }

	        if (fruit2 instanceof Banana) {
	            Banana banana = (Banana) fruit2; // 명시적 형변환
	            banana.peel(); 
	        }
	}

}
