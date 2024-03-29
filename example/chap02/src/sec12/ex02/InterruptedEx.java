package sec12.ex02;

public class InterruptedEx {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
            	 System.out.println("스레드 실행 " + i);
                if (Thread.interrupted()) {
                    System.out.println("스레드가 중단되었습니다.");
                    return;
                }
               
                try {
                    Thread.sleep(1000); // 1초간 스레드 일시 정지
                } catch (InterruptedException e) {
                    System.out.println("스레드가 중단되었습니다.");
                    return;
                }
            }
        });

        thread.start(); 

        try {
            Thread.sleep(2000); // 2초 후 메인 스레드에서 interrupt() 호출
            thread.interrupt(); // 스레드 깨우기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}