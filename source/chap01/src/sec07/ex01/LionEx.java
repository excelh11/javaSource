package sec07.ex01;

class Zoo {
    public void makeSound() {
        System.out.println("동물원에서 소리가 납니다");
    }
}

class Lion extends Zoo {
    @Override
    public void makeSound() {
        System.out.println("There's a lion sound.");
    }
}

public class LionEx {
    public static void main(String[] args) {
    	Zoo zoo = new Zoo();
    	zoo.makeSound();

        Lion lion = new Lion();
        lion.makeSound(); 
    }
}
