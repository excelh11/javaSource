package sec05.ex02;

public class ArrayMultiEx02 {

	public static void main(String[] args) {
		
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 2차원 정수형 배열

		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
		        System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println();
		}
	}

}
