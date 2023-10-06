package sec08.ex01;

class Bird2 implements Animal2, Flyable {
    private String name;
    
    public Bird2(String name) {
        this.name = name;
    }
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
    
    public void fly() {
        if (name.equals("Sparrow")) {
            System.out.println(name + " can fly.");
        } else {
            System.out.println(name + " cannot fly.");
        }
    }
}