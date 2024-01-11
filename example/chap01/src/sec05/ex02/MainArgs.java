package sec05.ex02;

public class MainArgs {

	public static void main(String[] args) {
		// args 배열의 길이 확인
        int length = args.length;
        System.out.println("인자의 개수: " + length);
        
        // args 배열의 모든 요소 출력
        for (int i = 0; i < length; i++) {
            System.out.println("인자 #" + (i+1) + ": " + args[i]);
        }
	}

}
