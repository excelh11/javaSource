package sec04.ex01;

public class SwitchEx {

	public static void main(String[] args) {
		int diceValue = (int) (Math.random() * 6) + 1;

        System.out.println("주사위의 값: " + diceValue);

        switch (diceValue) {
            case 1:
                System.out.println("일이 나왔습니다.");
                break;
            case 2:
                System.out.println("이가 나왔습니다.");
                break;
            case 3:
                System.out.println("삼이 나왔습니다.");
                break;
            case 4:
                System.out.println("사가 나왔습니다.");
                break;
            case 5:
                System.out.println("오가 나왔습니다.");
                break;
            case 6:
                System.out.println("육이 나왔습니다.");
                break;
            default:
                System.out.println("없는 값입니다.");
        }
	}

}
