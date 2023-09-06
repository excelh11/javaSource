package sec05.ex03;

public class EnumEx {

	public static void main(String[] args) {
		Day today = Day.WEDNESDAY;
		if (today == Day.WEDNESDAY) {
            System.out.println("Today is Wednesday!");
        }
        
        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("평일입니다");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("주말입니다");
                break;
        }
	}

}
