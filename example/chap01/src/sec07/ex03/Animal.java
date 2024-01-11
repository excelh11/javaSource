package sec07.ex03;

public abstract class Animal {
	protected String name;
    
	public Animal(String name) {
	    this.name = name;
	}
    
    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " is barking.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " is meowing.");
    }
}