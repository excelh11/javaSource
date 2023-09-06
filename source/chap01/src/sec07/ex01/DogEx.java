package sec07.ex01;

//부모 클래스
class Animal {
 protected String name;
 
 public Animal(String name) {
     this.name = name;
 }
 
 public void eat() {
     System.out.println(name + " is eating.");
 }
 public void makeSound() {
     System.out.println("Animal makes a sound.");
 }
}

//자식 클래스
class Dog extends Animal {
 private String breed;
 
 public Dog(String name, String breed) {
     super(name);
     this.breed = breed;
 }
 
 public void bark() {
     System.out.println(name + " is barking.");
 }
 
 
 public void displayBreed() {
     System.out.println(name + " is a " + breed + ".");
 }
}

//메인 클래스
public class DogEx {
 public static void main(String[] args) {
     Dog dog = new Dog("맥스", "래브라도 리트리버");
     dog.displayBreed(); // 출력: 맥스 is a 래브라도 리트리버.
     dog.eat(); // 출력: 맥스 is eating.
     dog.bark(); // 출력: 맥스 is barking.
 }
}




