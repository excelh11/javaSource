package sec13.ex01;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // equals() 메서드 오버라이딩
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
        	Person person = (Person) obj;
        	return person.name.equals(name) && (person.age ==age);
        }else {
        	return false;
        }
    }

    // hashCode() 메서드 오버라이딩
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    // Getter 메서드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}