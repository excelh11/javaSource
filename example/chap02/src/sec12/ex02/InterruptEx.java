package sec12.ex02;

public class InterruptEx {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("스레드 실행 " + i);
                    Thread.sleep(1000); // 1초간 스레드 일시 정지
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException 발생");
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
