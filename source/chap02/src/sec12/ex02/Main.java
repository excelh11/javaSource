package sec12.ex02;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " : " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // 스레드 실행을 위해 start() 메서드 호출
        thread1.start();
        thread2.start();
    }

}