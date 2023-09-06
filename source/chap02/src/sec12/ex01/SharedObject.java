package sec12.ex01;

public class SharedObject {
    private int value=0;

    public synchronized void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }
    
}