package sec07.ex03;

public class GameEx {

	public static void main(String[] args) {
		
	Warrior warrior = new Warrior("Aragorn", 10);
        Mage mage = new Mage("Gandalf", 15);
        
        warrior.attack();
        warrior.move(); 
        warrior.shieldBash();
        
        mage.attack();
        mage.move(); 
        mage.teleport();
        System.out.println("===================");
        
        
        GameCharacter ch = null;
        
        // 변수 자동 타입 변환 및 재정의된 메소드 호출
        ch = new Warrior("Aragorn", 10);
        ch.attack();
        
        ch = new Mage("Gandalf", 15);
        ch.attack();
        System.out.println("===================");
        
        // 메소드의 다형성
        powerful(new Warrior("Aragorn2", 20));
        powerful(new Mage("Gandalf2", 25));
        
	}

	public static void powerful(GameCharacter ch) {
			ch.attack();
	}
}
