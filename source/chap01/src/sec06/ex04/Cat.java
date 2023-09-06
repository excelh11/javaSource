package sec06.ex04;

public class Cat {
	private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // 중복 코드를 줄이기 위한 메서드
    public void setCatInfo(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }
}
