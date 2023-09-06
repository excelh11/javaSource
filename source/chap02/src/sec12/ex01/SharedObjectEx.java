package sec12.ex01;

public class SharedObjectEx {
	public static void main(String[] args) {
		SharedObject sharedObject = new SharedObject();

        // 첫 번째 스레드 정의
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
            	 synchronized (sharedObject) {
                    sharedObject.increment();
                    System.out.println("Thread 1: " + sharedObject.getValue());
            	 }                    
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 두 번째 스레드 정의
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
            	 synchronized (sharedObject) {
                    sharedObject.increment();
                    System.out.println("Thread 2: " + sharedObject.getValue());
            	 }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 두 개의 스레드 실행
        thread1.start();
        thread2.start();
        
     // 스레드가 모두 종료될 때까지 기다림
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 최종 결과 출력
        System.out.println("Final Value: " + sharedObject.getValue());
	}

}
