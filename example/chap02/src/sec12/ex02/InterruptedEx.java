package sec12.ex02;

public class InterruptedEx {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 100; i++) { 
                System.out.println("스레드 실행 " + i);

                if (Thread.interrupted()) {
                    System.out.println("if 스레드가 중단되었습니다.");
                    return;
                }

                // 반복마다 살짝 지연 (CPU 점유 시간 확보)
                for (int j = 0; j < 100000000; j++) {
                    // 단순 연산 (시간 지연)
                }
            }
        });

        thread.start();

        try {
            Thread.sleep(1000); // 1초 뒤 interrupt
            thread.interrupt(); // 스레드 깨우기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
