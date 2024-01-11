package sec08.ex01;

class Fish implements Animal2, Swimmable {
    private String name;
    
    public Fish(String name) {
        this.name = name;
    }
    
    public void eat() { // Animal2 메소드
        System.out.println(name + " is eating.");
    }
    
    public void swim() { // Swimmable 메소드
        if (name.equals("Salmon")) {
            System.out.println(name + " can swim.");
        } else {
            System.out.println(name + " cannot swim.");
        }
    }
}