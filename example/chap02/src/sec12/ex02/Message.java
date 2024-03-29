package sec12.ex02;

public class Message {
	private String message;
    private boolean empty = true;

    // 메시지를 전송하는 메서드
    public synchronized void send(String msg) {
        while (!empty) {
            try {
                wait(); // 메시지가 비워질 때까지 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.message = msg;
        empty = false;
        notifyAll(); // 대기 중인 모든 스레드를 깨움
    }

    // 메시지를 수신하여 출력하는 메서드
    public synchronized void receive() {
        while (empty) {
            try {
                wait(); // 메시지가 전송될 때까지 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("수신된 메시지: " + message);
        empty = true;
        notifyAll(); // 대기 중인 모든 스레드를 깨움
    }
}