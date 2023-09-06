package sec05.ex02;

public class ArrayEx01 {

	public static void main(String[] args) {
		int[] scores = {80, 90, 70, 85, 95}; // 성적을 저장하는 정수형 배열

		double average = 0;
		for (int i = 0; i < scores.length; i++) {
		    average += scores[i];
		}
		average /= scores.length;
		
		System.out.println(average);
	}

}
