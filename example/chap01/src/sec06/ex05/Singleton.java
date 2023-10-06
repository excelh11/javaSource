package sec06.ex05;

public class Singleton {
    private static Singleton instance;
    
    private Singleton() {
        // private 생성자
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

