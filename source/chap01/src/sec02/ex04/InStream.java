package sec02.ex04;
//입력스트림의 Scanner는 java.util 패키지에 있어 import를 해줘야 해당 클래스에서 사용가능합니다.
import java.util.Scanner;	

public class InStream {

	public static void main(String[] args) {
		// System.in 은 Scanner를 생성자로 전달되어 사용자가 입력을 읽어 들일 수 있게 됩니다.
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        
        // nextLine() : enter키가 입력되기 전까지 대기 상태가 되며 enter키가 입력되면 입력된 내용을 문자열로 읽습니다.
        String inputString = scan.nextLine();
        System.out.println("You entered: " + inputString); // 키보드로 입력된 내용을 출력합니다. 
	}

}
