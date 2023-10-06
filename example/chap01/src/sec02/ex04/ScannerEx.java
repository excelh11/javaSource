package sec02.ex04;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Data;
		
		while(true) {
			Data = scan.nextLine();
			
			// equals() : 문자열(String)이 일치한지 비교
			if(Data.equals("q")) {	// Data에 들어있는 값과 q를 비교합니다. 일치하면 true
				break;
			}
		}
		System.out.println("종료되었습니다.");
	}

}
