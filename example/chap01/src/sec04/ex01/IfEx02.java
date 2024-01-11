package sec04.ex01;

public class IfEx02 {

	public static void main(String[] args) {
		// 1부터 6까지의 무작위 주사위 값 생성
        int diceValue = (int) (Math.random() * 6) + 1;

        System.out.println("주사위의 값: " + diceValue);

        if (diceValue == 1) {
            System.out.println("일이 나왔습니다.");
        } else if (diceValue == 2) {
            System.out.println("이가 나왔습니다.");
        } else if (diceValue == 3) {
            System.out.println("삼이 나왔습니다.");
        } else if (diceValue == 4) {
            System.out.println("사가 나왔습니다.");
        } else if (diceValue == 5) {
            System.out.println("오가 나왔습니다.");
        } else {
            System.out.println("육이 나왔습니다.");
        }
		
	}

}
