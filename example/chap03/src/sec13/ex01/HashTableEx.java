package sec13.ex01;

import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {
		 // Hashtable 생성 (키: 문자열, 값: 정수)
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // 객체를 사용하여 동기화
        Object lock = new Object();

        // 데이터 추가하는 스레드 생성
        Thread addThread = new Thread(() -> {
            synchronized (lock) {
                for (int i = 1; i <= 5; i++) {
                    while (hashtable.containsKey("key" + i)) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    hashtable.put("key" + i, i);
                    System.out.println("추가: key" + i + " -> " + i);
                    lock.notifyAll();
                }
            }
        });

        // 데이터 조회하는 스레드 생성
        Thread getThread = new Thread(() -> {
            synchronized (lock) {
                for (int i = 1; i <= 5; i++) {
                    while (!hashtable.containsKey("key" + i)) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    int value = hashtable.get("key" + i);
                    System.out.println("조회: key" + i + " -> " + value);
                    lock.notifyAll();
                }
            }
        });

        // 스레드 시작
        getThread.start();
        addThread.start();

        // 메인 스레드가 두 스레드의 작업을 기다림
        try {
            addThread.join();
            getThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }
}
