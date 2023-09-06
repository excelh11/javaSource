package sec10.ex01;

public class IndexOutOfBoundsEx {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};

        try {
            // 유효 범위를 벗어나는 인덱스에 접근
            int value = numbers[5];
            System.out.println("Value: " + value);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
