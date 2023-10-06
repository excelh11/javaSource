package sec12.ex01;

public class CurrnetThreadEx {

	public static void main(String[] args) {
		 // 현재 실행 중인 스레드 객체 얻기
        Thread currentThread = Thread.currentThread();

        // 스레드의 이름과 우선순위 출력
        System.out.println("현재 스레드 이름: " + currentThread.getName());
        System.out.println("현재 우선순위 스레드: " + currentThread.getPriority());

        // 스레드 그룹 출력
        ThreadGroup threadGroup = currentThread.getThreadGroup();
        if (threadGroup != null) {
            System.out.println("스레드 그룹: " + threadGroup.getName());
        }

        // 스레드의 상태 출력
        System.out.println("스레드 상태: " + currentThread.getState());

        // 스레드 ID 출력
        System.out.println("스레드 ID: " + currentThread.getId());

        // 스레드 클래스 정보 출력
        System.out.println("스레드 클래스: " + currentThread.getClass().getName());
	}

}
