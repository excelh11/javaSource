package sec04.ex03;

public class BreakEx {

	public static void main(String[] args) {
	     	int count = 0;
	        int limit = 5;

	        while (true) {
	            System.out.println("Count: " + count);
	            count++;

	            if (count >= limit) {
	                break; // count가 limit에 도달하면 반복문 종료
	            }
	        }

	        System.out.println("finished");
	}

}
