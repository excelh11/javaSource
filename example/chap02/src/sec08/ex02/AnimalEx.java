package sec08.ex02;

public class AnimalEx {

	public static void main(String[] args) {
		AnimalSound animalSound = new AnimalSound();
	
		Dog dog = new Dog();
	        Cat cat = new Cat();
	
	       
	        // 묵시적 변환
	        // Animal animal = dog;
	        dog.eat();
	        animalSound.makeSound(dog);
	        animalSound.makeSound(cat);
	}

}

