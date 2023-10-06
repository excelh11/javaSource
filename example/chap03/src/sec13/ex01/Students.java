package sec13.ex01;

class Students {
    private String name;
    private int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // equals() 메서드 오버라이딩
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Students person = (Students) obj;
        return age == person.age && name.equals(person.name);
    }

    // hashCode() 메서드 오버라이딩
    @Override
    public int hashCode() {
        int result = name.hashCode() + age;
        return result;
    }

    // Getter 메서드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
