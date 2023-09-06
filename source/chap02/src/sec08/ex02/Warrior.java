package sec08.ex02;

class Warrior extends Character implements Attackable {
    void move() {
        System.out.println("전사가 이동합니다.");
    }

    public void attack() {
        System.out.println("전사가 공격합니다.");
    }
}